Recently, many languages directly support more than one paradigm, some languages natively, and others with the addition of specific libraries.
Regarding the OOP and the Functional one, ... languages support them natively; instead, ... add support to the specific paradigm using specific libraries, for example ...

However, there are not active proposals to directly support AOP and, more specifically BDI AOP, inside major mainstream languages. We tried to identify why.
We believe that current AOP libraries proposals have low ergonomy, meaning that BDI AOP programmers find difficulties to represent system entities. 
Even if they come with a large set of tooling and an easier learning curve, thanks to the mainstream language on which they rely on.
To overcome the ergonomy problem, a custom language offer can represent easily the BDI entities, but lacks in tooling and learning curve. 
In fact, a custom language needs a custom implementation of all the useful tooling used by programmers, which needs to be maintained (and this is a time-consuming task for researchers).
Regarding the learning curve, this is steep because non-experienced users need to learn all the primitives to make an efficient use of the language.
Most important, custom BDI AOP languages are not meant to support multi-paradigm languages.

we propose JaKtA: a middle rooad between an library and a custom language, exploiting Kotlin internal DSL.
the main reasons which brought us to create this framework are: 
- support to native language tools 
- ergonomy

We chose Kotin for its direct support for the creation of internal DSLs and because is a mainstream language with a great and expanding community and its support to develop native applications that target all the main available platforms.
The proposed DSL for the BDI AOP language is the following: 
... which shows a blending with OOP, FP, and BDI AOP.


Exploting Kotlin, we're also capable to run the application on many devices transparently: for example...
This multi-dimensional tictactoe example make use of Kotlin standard library to generate dinamically the grid, with cannot be dinamic. 
Actually, we tried to implement the same system in another existing BDI language and we had to use code-generation to make the same running example.

JaKtA architecture is composed of three main modules: The domain specific language is build upon the BDI model, this means that it can be designed from scratch without intaching the BDI entities definition.
The BDI model itself rely of the concurrency management module, which separates entities modelling form their actual execution. 
This last module make it possible to describe a BDI system and then chose different way to execute it on the machine, depending on its constraints. 

Regarding future work...
