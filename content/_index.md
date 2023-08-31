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
<br>

Several languages include more than one paradigm to support development:

<br>


| Language | Object-Oriented Paradigm | Functional Paradigm |
| :---:  | :---: | :---: |
| OCaml | {{< tick >}} {{< /tick >}} | {{< tick >}} {{< /tick >}} |
| Java  | {{< tick >}} {{< /tick >}} | {{< tick >}} {{< /tick >}} |
| Scala | {{< tick >}} {{< /tick >}} | {{< tick >}} {{< /tick >}} |
| C#    | {{< tick >}} {{< /tick >}} | {{< tick >}} {{< /tick >}} |
| Ruby  | {{< tick >}} {{< /tick >}} | {{< tick >}} {{< /tick >}} |
| Kotlin| {{< tick >}} {{< /tick >}} | {{< tick >}} {{< /tick >}} |


---

However, Agent-Oriented Programming Paradigm is not showing:

<br>

| Language | Object-Oriented Paradigm | Functional Paradigm | *Agent-Oriented Paradigm* |
| :---:  | :---: | :---: | :---: |
| OCaml | {{< tick >}} {{< /tick >}} | {{< tick >}} {{< /tick >}} | {{< cross >}} {{< /cross >}} |
| Java  | {{< tick >}} {{< /tick >}} | {{< tick >}} {{< /tick >}} | {{< cross >}} {{< /cross >}} |
| Scala | {{< tick >}} {{< /tick >}} | {{< tick >}} {{< /tick >}} | {{< cross >}} {{< /cross >}} |
| C#    | {{< tick >}} {{< /tick >}} | {{< tick >}} {{< /tick >}} | {{< cross >}} {{< /cross >}} |
| Ruby  | {{< tick >}} {{< /tick >}} | {{< tick >}} {{< /tick >}} | {{< cross >}} {{< /cross >}} |
| Kotlin| {{< tick >}} {{< /tick >}} | {{< tick >}} {{< /tick >}} | {{< cross >}} {{< /cross >}} |

{{% /section %}}


---

There are no active proposals for mainstream languages' native support to AOP paradigm

<br>
<br>

# WHY?

---

# AOP Libraries

<br>
<br>

{{% multicol %}} {{< col class="col-75">}}

Built for mainstream languages, <br>
they do not give a rich syntax to describe entities intuitively.

{{< /col >}}

{{< col class="col-25">}}

{{< fragment >}}
## {{% arrow %}} **custom languages**
{{< /fragment >}}

{{< /col >}} {{% /multicol %}}

---

# AOP Custom Languages
* {{% frag class="green" c="Great ergonomy while modelling AOP entities"%}}
* {{% frag class="red" c="Higher learning curve" %}}
* {{% frag class="red" c="Needs a continuous development to work properly" %}}
* {{% frag class="red" c="Do not inherit the valid tooling of a mainstream language (IDEs, code suggestions, syntax highlighters, linters...)" %}}
* {{% frag class="red" c="Do not support multi-paradigm programming, they tipycally provide only AOP abstractions" %}}

---

# A middle road: <br> JaKtA, an internal DSL

<!-- ![](images/ergonomy.png) -->

{{< figure src="images/ergonomy.png" width="60%" >}}

---

# JaKtA: <br> <u>Ja</u>son-like <u>K</u>o<u>t</u>lin <u>A</u>gents
<br>

Internal DSL implemented in Kotlin

* {{% frag c="Native tools maintained by the community" %}}
* {{% frag c="Multi-paradigm support" %}}
* {{% frag c="Higher learning curve, leveraging a mainstream language" %}}
* {{% frag c="Good ergonomy" %}}

---

# Why kotlin?
<br>

{{% multicol %}}{{% col %}}
* {{% frag c="Direct support to internal DSL creation" %}}
* {{% frag c="Language with a continuously growing community" %}}
* {{% frag c="Direct support to multiplatform software development" %}}
* {{% frag c="Multi-paradigm support" %}}
{{% /col %}}
{{< col class="text-center">}}
{{% fragment %}}

* This
{{< figure src="images/android-kotlin.png" width="90%" >}}

{{% /fragment %}}
{{% /col %}}{{% /multicol %}}


---
# Jakta architecture

{{< figure src="images/jacop_modules.svg" width="50%" >}}

---

# Jakta DSL
<br>

<div class="flex">
<div>
  {{< gist anitvam 2de7d5a5daef373a32e9bb8179b01590 >}}
<div>
</div>

---

# JakTa JVM based
<br>

{{< figure src="images/tictactoe-android.png" width="50%" >}}

---

# Future work 
<br>

* {{% fragment %}}
{{% multicol %}}{{% col class="col-25" %}}
**Multiplatform targeting**
{{% /col %}}{{% col class="col-75"%}}
{{< figure src="images/jakta-mp.png" >}}
{{% /col %}}{{% /multicol %}}
{{% /fragment %}}
* {{% frag c="**Pluggable concurrency model**, that clearly separates BDI definition and threading"%}}
* {{% frag c="**Improvement of the DSL syntax** to thin the layer between AOP and other paradigms"%}}

---

# try jakta
<br>

[github.com/jakta-bdi/jakta-examples](https://github.com/jakta-bdi/jakta-examples)

{{< figure src="images/qr-code.svg" width="20%" >}}
