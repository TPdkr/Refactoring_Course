package jetbrains.refactoring.course.patterns

fun main(args: Array<String>) {
    val transportName = args[0]
    val transFactory= TransportationServiceFactory()
    val transport =transFactory.getTransportation(transportName)
    val driveMessage = transport.drive()
    println(driveMessage)
}
