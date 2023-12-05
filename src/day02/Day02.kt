package day02

import println
import readInput

fun main() {
    fun part1(input: List<String>, ballConfig: List<String>): Int {
        var result = 0
        for (line in input) {
            var gameId = line.replace("Game ", "").take(3)
            gameId = gameId.replace(" ", "")
            gameId = gameId.replace(":", "")
            val games = line.slice(7 + gameId.length..<line.length).split(";")
            for (game in games) {
                val gameBalls = game.split(", ")
                for (ball in gameBalls) {
                    var balls = ball.replace(" red", "r")
                    balls = balls.replace(" green", "g")
                    balls = balls.replace(" blue", "b")
                    println(balls)
                }
            }
            result += gameId.toInt()
        }
        return result
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    val input = readInput("day02/Day02")
    val balls = listOf("12r", "13g", "14b")
    part1(input, balls).println()
    part2(input).println()
}