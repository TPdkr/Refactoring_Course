package jetbrains.refactoring.course.extracting

import java.io.File
import java.io.FileNotFoundException

fun wordCount(fileName: String): Int {
    val file = File(fileName)
    fileValidate(file)
    var wordCount = 0
    file.forEachLine { line ->
        wordCount += line.split("\\s+".toRegex()).count()
    }
    return wordCount
}

private fun fileValidate(file: File) {
    if (!file.exists() || !file.isFile) {
        throw FileNotFoundException()
    }
}

fun copyFile(srcName: String, destName: String) {
    val file = File(srcName)
    fileValidate(file)
    val to = File(destName)
    if (!file.exists() || !file.isFile) {
        throw FileNotFoundException()
    }
    file.copyTo(to)
}
