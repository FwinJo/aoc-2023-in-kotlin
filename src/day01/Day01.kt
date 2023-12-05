package day01

import println
import readInput

fun main() {
    fun part1(input: List<String>): Int {
        var result = 0
        for (line in input){
            var firstDigit = ""; var lastDigit = ""; var firstDown = false
            for (char in line) {
                if (char.isDigit()) {
                    if (!firstDown) {
                        firstDigit = char.toString()
                        firstDown = true
                    }
                    lastDigit = char.toString()
                }
            }
            result += (firstDigit+lastDigit).toInt()
        }
        return result
    }

    fun numList(input: List<String>): List<String> {
        val newInput = mutableListOf<String>()
        for (line in input) {
            var newLine: String = line.replace("twone", "twoone")
            newLine = newLine.replace("oneight", "oneeight")
            newLine = newLine.replace("eightwo", "eighttwo")
            newLine = newLine.replace("one", "1")
            newLine = newLine.replace("two", "2")
            newLine = newLine.replace("three", "3")
            newLine = newLine.replace("four", "4")
            newLine = newLine.replace("five", "5")
            newLine = newLine.replace("six", "6")
            newLine = newLine.replace("seven", "7")
            newLine = newLine.replace("eight", "8")
            newLine = newLine.replace("nine", "9")
            newInput += newLine
        }
        return newInput
    }

    fun part2(input: List<String>): Int {
        return part1(numList(input))
    }



    val input = readInput("day01/Day01")
    part1(input).println()
    part2(input).println()
}
