---
title: Test
author: Author Name
header: This is fancy
footer: So is this
geometry: margin=1in
abstract: This is a pandoc test . . . 

---


Typesetting Sandbox
================

This markdown is compliant with [pandoc markdown](http://johnmacfarlane.net/pandoc/README.html#pandocs-markdown). In order to render the it correctly you need to install and use pandoc, here is a working example of the command to render this page: `pandoc -f markdown+tex_math_dollars+yaml_metadata_block -t html5 -s --mathjax notes.md > test.html`

And here is an example of a working math formula:

$$\frac{df(x)}{dt}=lim_{x \to 0}{\frac{f(x+h)-f(x)}{h}}$$

Here is another example: $A \circ B$

Here is a test of a category diagram using AMScd:

$$\require{AMScd}
\begin{CD}
A @>a>> B\\
@VVbV @VVcV\\
C @>d>> D
\end{CD}$$

And another example: 

$$\require{AMScd}
\begin{CD}
A \cdot B
\end{CD}$$

And here is an example using dclic:

$$\usepackage{pictex,dcpic}
\begindc
\obj(10,15){$A$}
\obj(40,15){$A$}
\obj(25,15){$B$}
\mor(10,15)(25,15){$f$}
\mor(25,15)(40,15){$g$}
\cmor((10,11)(11,7)(15,6)(25,6)(35,6)(39,7)(40,11)) \pup(25,3){$id_A$}
\obj(55,15){$B$}
\obj(85,15){$B$}
\obj(70,15){$A$}
\mor(55,15)(70,15){$g$}
\mor(70,15)(85,15){$f$}
\cmor((55,11)(56,7)(60,6)(70,6)(80,6)(84,7)(85,11)) \pup(70,3){$id_B$}
\enddc
$$

Other useful links for mathjax are:

* [Tex Info](http://docs.mathjax.org/en/latest/tex.html)
* [amscd Tex extension guide](http://www.jmilne.org/not/Mamscd.pdf)
* [DCpic, Commutative Diagrams in a (La)TEX](http://www.ntg.nl/eurotex/dcpic.pdf)
* [Play with Latex Math](https://latex.codecogs.com/)
* [Free Online Editor](http://www.sciweavers.org/free-online-latex-equation-editor)






Category Theory
=============
  
  * The associative property is closely related to the commutative property. The associative property of an expression containing two or more occurrences of the same operator states that the order operations are performed in does not affect the final result, as long as the order of terms doesn't change. In contrast, the commutative property states that the order of the terms does not affect the final result.
  * Most commutative operations encountered in practice are also associative. However, commutativity does not imply associativity. A counterexample is the function: $f(x,y)=(x+y)/2$ which is clearly commutative (interchanging x and y does not affect the result), but it is not associative (since, for example, $f(1, f(2, 3)) = 1.75$ but $f(f(1, 2), 3) = 2.25$)
  * Morphisms have a domain and codomain
  * 
