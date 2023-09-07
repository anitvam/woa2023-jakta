+++
title = "JaKtA"
outputs = ["Reveal"]
+++

# JaKtA: BDI agent-oriented programming in pure Kotlin

<br>
<br>

Martina Baiardi, Samuele Burattini, Giovanni Ciatto, and Danilo Pianini

---

{{% section %}}

## Current trend: multi-paradigm languages
<br>

Several languages include more than one paradigm to support development:


| Language | Object-Oriented | Functional |
| :---:  | :---: | :---: |
| Scala | {{< tick >}} {{< /tick >}} | {{< tick >}} {{< /tick >}} |
| Kotlin| {{< tick >}} {{< /tick >}} | {{< tick >}} {{< /tick >}} |
| Caml | {{< tick >}} (OCaml) {{< /tick >}} | {{< tick >}} {{< /tick >}} |
| Java  | {{< tick >}} {{< /tick >}} | {{< maybe >}} (Java 8){{< /maybe >}} |
| C#    | {{< tick >}} {{< /tick >}} | {{< maybe >}} {{< /maybe >}} |
| Ruby  | {{< tick >}} {{< /tick >}} | {{< maybe >}} {{< /maybe >}} |
| Python| {{< tick >}} {{< /tick >}} | {{< maybe >}} {{< /maybe >}} |
| JavaScript| {{< maybe >}} {{< /maybe >}} | {{< maybe >}} {{< /maybe >}} |

---

However, Agent-Oriented Programming Paradigm is not included:

| Language | Object-Oriented | Functional | Agent-Oriented |
| :---:  | :---: | :---: | :---: |
| Scala | {{< tick >}} {{< /tick >}} | {{< tick >}} {{< /tick >}} | {{< cross >}} {{< /cross >}} |
| Kotlin| {{< tick >}} {{< /tick >}} | {{< tick >}} {{< /tick >}} | {{< cross >}} {{< /cross >}} |
| Caml | {{< tick >}} (OCaml) {{< /tick >}} | {{< tick >}} {{< /tick >}} | {{< cross >}} {{< /cross >}} |
| Java  | {{< tick >}} {{< /tick >}} | {{< maybe >}} (Java 8){{< /maybe >}} | {{< cross >}} {{< /cross >}} |
| C#    | {{< tick >}} {{< /tick >}} | {{< maybe >}} {{< /maybe >}} | {{< cross >}} {{< /cross >}} |
| Ruby  | {{< tick >}} {{< /tick >}} | {{< maybe >}} {{< /maybe >}} | {{< cross >}} {{< /cross >}} |
| Python| {{< tick >}} {{< /tick >}} | {{< maybe >}} {{< /maybe >}} | {{< cross >}} {{< /cross >}} |
| JavaScript| {{< maybe >}} {{< /maybe >}} | {{< maybe >}} {{< /maybe >}} | {{< cross >}} {{< /cross >}} |
{{% /section %}}


---

There are no active proposals for mainstream languages' native support to AOP paradigm
<br>

# WHY?

---

# AOP Libraries

<br>
<br>

{{% multicol %}} {{< col class="col-75">}}

* Built for mainstream languages
* Subject to the **syntactic restrictions** of their host language
  * True AOP feeling hard to achieve

{{< /col >}}

{{< col class="col-25">}}

{{< fragment >}}
## <i class="fa-solid fa-arrow-right"></i> **custom AOP languages**
{{< /fragment >}}

{{< /col >}} {{% /multicol %}}

---

# AOP Custom Languages
* <span class="green">Great ergonomy for AOP (made by purpose) </span>
* <span class="red">AOP-specific, not multi-paradigm </span>
* <span class="red">Steep learning curve</span>
* <span class="red">Require custom tooling (IDEs, code suggestions, syntax highlighters, linters...)</span>
* <span class="red">Small community</span>
* <span class="red">High maintenance cost!</span>

---

# A middle road: <br> hybrid approach

<!-- ![](images/ergonomy.png) -->

{{< figure src="images/ergonomy.png" width="60%" >}}

---

# JaKtA: <br> <u>Ja</u>son-like <u>K</u>o<u>t</u>lin <u>A</u>gents

Internal DSL implemented in Kotlin

* Multi-paradigm support: OOP + FP + AOP
* Gentler learning curve
  * Great learning resources for Kotlin
  * Significantly large community for help
* Reuses 100% of the existing Kotlin toolchain
  * Developed and maintained by the language authors and the community of Kotlin programmers
  * Maintenance is greatly reduced
* Good ergonomy

---

# Why kotlin?
<br>

{{% multicol %}}{{% col %}}
* Natively multi-paradigm (OOP + FP)
* Direct support to internal DSL creation
* First class support to multiplatform development
{{% /col %}}

{{< col class="text-center">}}

* Growing community
  * Strongly pushed by Google for Android
{{< figure src="images/android-kotlin.png" width="70%" >}}

{{% /col %}}{{% /multicol %}}


---
# Jakta architecture

{{< figure src="images/jacop_modules.svg" width="50%" >}}

---

## Jakta: multi-paradigm AOP/BDI+OOP+FP


```kotlin
mas {                                                   // BDI specification
  fun allPlayers(team: String) =
    Regex("""<a\s(\X*?)\sdata-cy="player">(.*)<\/a>""") // Object-oriented regex library
        .findAll(URL("https://www.besoccer.com/team/squad/$team").readText())
        .map { team to it.groupValues[2] }              // Lambda expression (Functional style)

  listOf("napoli", "milan", "internazionale")           // Kotlin standard library
      .flatMap(::allPlayers)                            // Higher-order function (Functional style)
      .forEach { (team, player) ->                      // Destructuring declaration
          agent(player) {
              beliefs { fact { squad(team) } }
              goals { achieve(start) }
              plans {
                  +achieve(start) onlyIf { squad(S).fromSelf } then {
                      execute(print("Hello! I play for", S))
                  }
              }
          }
      }
}.start()
```

<i class="fa-solid fa-file-code"></i> [SoccerMas.kt](https://github.com/jakta-bdi/jakta-examples/blob/main/src/main/kotlin/it/unibo/jakta/agents/examples/soccer/SoccersMas.kt)

---

# JakTa 
<br>

* JVM based
   * Android support 

   {{< figure src="images/tictactoe-android.png" width="50%" >}}

---

# Future work 

* {{% multicol %}}{{% col class="col-4" %}}
**Multiplatform targeting**
{{% /col %}}{{% col class="col-8"%}}
{{< figure src="images/jakta-mp.png" >}}
{{% /col %}}{{% /multicol %}}
* **Pluggable concurrency model**, that clearly separates BDI definition and threading
* **Improvement of the DSL syntax** to thin the layer between AOP and other paradigms

---

# try jakta
<br>

[github.com/jakta-bdi/jakta-examples](https://github.com/jakta-bdi/jakta-examples)

{{< figure src="images/qr-code.svg" width="20%" >}}
