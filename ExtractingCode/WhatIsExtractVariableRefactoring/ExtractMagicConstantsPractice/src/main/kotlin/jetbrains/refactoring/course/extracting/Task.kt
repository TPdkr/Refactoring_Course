package jetbrains.refactoring.course.extracting
const val speedOfLight= 299792458.0
private const val plankConst = 6.62607015e-34

fun calculatePhotonEnergy(waveLength: Double): Double {

    val frequency = speedOfLight / waveLength
    return plankConst * frequency
}

fun calculatePhotonMass(energy: Double): Double {
    return energy / (speedOfLight * speedOfLight)
}

private const val waveLength = 0.5e-6


fun main() {
    val photonEnergy = calculatePhotonEnergy(waveLength)
    val photonMass = calculatePhotonMass(photonEnergy)

    println("Photon energy: $photonEnergy Joules")
    println("Photon mass: $photonMass kg")
}
