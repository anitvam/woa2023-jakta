mas { // BDI specification
    // Object-oriented style
    fun allPlayers(team: String) = Regex("""<span class="card-title">((\w+|\s)+)<\/span>""").findAll(
                                        URL("https://analytics.soccerment.com/en/team/$team").readText()
                                    ).map { it.groupValues[1] } // Monadic manipulation (functional)

    listOf("napoli", "milan", "juventus")
        .flatMap(::allPlayers) // Functional style (higher-order function)
        .forEach { 
        agent("$player playing for $team") { 
            ... /* BDI style */
        }
    }
}