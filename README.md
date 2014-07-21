Reading
=======

Some of the items in the list are taken from: https://github.com/analytics/analytics/blob/master/notes/papers.md, others I have added along the way. 

# Reasonning about consistency

All of these relate to consistency reasoning within the context of a given store, but the concepts map upwards hoefully...

* [Replicated Data Types: Speciﬁcation, Veriﬁcation, Optimality](http://software.imdea.org/~gotsman/papers/distrmm-popl14.pdf)
* [Consistency Analysis in Bloom: a CALM and Collected Approach](http://db.cs.berkeley.edu/papers/cidr11-bloom.pdf)
* [CRDTs: Consistency without concurrency control](http://pagesperso-systeme.lip6.fr/Marc.Shapiro/papers/RR-6956.pdf)
* [A comprehensive study of Convergent and Commutative Replicated Data Types](http://hal.upmc.fr/docs/00/55/55/88/PDF/techreport.pdf)
* 

# Query processing

* [PIQL – Scale Independent Query Processing](http://www.eecs.berkeley.edu/~marmbrus/papers/piql.vldb12.pdf)
* Lingual research here...

# Machine Learning - Storage and computational foundations

* [Materialization Optimizations for Feature Selection Workloads](./papers/mod539-zhang.pdf)
* [LINVIEW: Incremental View Maintenance for Complex Analytical Queries](./papers/mod447-nikolic.pdf)
* [Opportunistic Physical Design for Big Data Analytics](papers/p851-lefevre.pdf)

# Hetrogeneous Data Store Integration

* [Semantic Integration of Heterogeneous Information Sources](http://www.mswi.uni-osnabrueck.de/rieger_2000_03.pdf)
* [RICES: Reasoning about Information Consistency across Enterprise Solutions](./papers/rices.doc)
* TODO: add more here

# Data cleaning, data management

* [Semantic-Integration Research in the Database Community](http://www.aaai.org/ojs/index.php/aimagazine/article/view/1801/1699), [Alternate link](./papers/1801-1797-1-PB.pdf)
* TODO: Add tope paper and related here

# Time, clocks and ordering

* [Time, clocks and odering of the events in a distributed system](http://web.stanford.edu/class/cs240/readings/lamport.pdf)

# Functional Pearls / Other programming

* [Applicative programming with eﬀects](http://strictlypositive.org/IdiomLite.pdf)
* [Reflection without remorse](http://homepages.cwi.nl/~ploeg/papers/zseq.pdf)

# UB-Trees

* [The Universal B-Tree for multidimensional indexing: General Concepts](http://citeseerx.ist.psu.edu/showciting?cid=13384)
* [The BUB-Tree (dealing with dead space)](http://www.cse.ust.hk/vldb2002/VLDB2002-proceedings/papers/S34P16.pdf) by Robert Fenk
* [Processing Relational OLAP Queries with UB-Trees and Multidimensional Hierarchical Clustering (2000)](http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.35.5820) by Markl and Bayer
* UB-Tree Indexing for Semantic Query Optimization of Range Queries by S. Housseno, A. Simonet and M. Simonet
* [Indexing Techniques in Data Warehousing Environment The UB-Tree Algorithm](http://www.aui.ma/personal/~H.Haddouti/UB_Tree_paper.pdf)

# Space-Filling
* [Skjellum provides a nice way to make a Morton order that works even for non-integral numbers of bits](http://people.cs.vt.edu/~asandu/Public/Qual2005/Q2005_skjellum.pdf)
* [Adaptive query processing in point-transformation schemes](http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.59.6190&rep=rep1&type=pdf) by B. Yu covers a way we can incrementally refine compution of overlapping ranges in Morton order.
* [Efficient Range Query Using Multiple Hilbert Curves](http://cdn.intechopen.com/pdfs/16532/InTech-Efficient_range_query_using_multiple_hilbert_curves.pdf) shows that we can answer queries in fewer ranges if we store multiple copies of the data using different space filling curves or with rotations and shifts. This may point to a replication strategy. As with storing multiple copies for a column store using different orderings to get both fault tolerance, the same thing apply to space filling storage of the data.
* [Cache-Oblivious Dense and Sparse Matrix Multiplication Based on Peano Curves](https://para08.idi.ntnu.no/docs/submission_155.pdf)
* [Performance of Multi-Dimensional Space-Filling Curves](http://docs.lib.purdue.edu/cgi/viewcontent.cgi?article=2545&context=cstech) by Mokbel, Aref and Kamel gives a number of general invariants over all space filling curves.

# Order Preserving Codes
* The identity transformation
* [Shor's explanation of the Hu-Tucker algorithm](http://www-math.mit.edu/~shor/PAM/hu-tucker_algorithm.html)
* [Golomb coding](http://en.wikipedia.org/wiki/Golomb_coding)
* [Arithmetic coding](http://en.wikipedia.org/wiki/Arithmetic_coding)
* [Range coding](http://en.wikipedia.org/wiki/Range_encoding)
* [Order Preserving Key Compression](http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.86.3306&rep=rep1&type=pdf) describes ALM coding and references the ZIL coding. ALM coding violates the prefix property of Huffman and Hu-Tucker locally, but only needs the next symbol worth of lookahead to resolve the ambiguity.
* [Dictionary-based Order-preserving String Compression
for Main Memory Column Stores](http://www.cs.uni-paderborn.de/fileadmin/Informatik/AG-Boettcher/Lehre/WS_09_10/pro-sem-ws09/Dictionary-based_Order-preserving_String_Compression_for_Main_Memory_Column_Stores.pdf)
* [Query Optimization In Compressed Database Systems](http://userpages.umbc.edu/~zhchen/papers/sigmod01-camera.pdf)
* Sometimes we don't care about ordering. If we have categorical information, we could use Huffman directly on that dimension.
* [How to Wring a Table Dry: Entropy Compression of Relations and Querying of Compressed Relations](http://tomx.inf.elte.hu/twiki/pub/Tudas_Labor/2012Summer/how_to_wring_a_table_dry_-_vldb2006-p858-raman.pdf)
* [Binary Ordered Compression for Unicode](http://en.wikipedia.org/wiki/Binary_Ordered_Compression_for_Unicode) provides an lexicographically order preserving compression scheme for unicode text, so long as you do not use the reset code! BOCU-1 is covered by US Patent #6,737,994, but is royalty-free. It may serve as a default unicode text column format in the absence of more coding information.
* [An Alternative to Arithmetic Coding with Local Decodability](http://people.csail.mit.edu/mip/papers/trits/paper.pdf)

# Other Order-Preserving Structures:
* [Order Preserving Encryption for Numeric Data](http://rsrikant.com/papers/sigmod04.pdf) by Agrawal, Kiernan Srikant, and Xu covers how to make an order-preserving encryption scheme that permits standard database indexing, robust against inspection, but not against prior domain information about ranges of values or the ability to encrypt or decrypt known data.
* [An Ideal-Security Protocol for Order-Preserving Encoding](http://eprint.iacr.org/2013/129.pdf) by Popa, Li, and Zeldovich covers a way to improve on the previous paper to leak nothing other than order by using "mutable cipher-text". This is currently realized in their [cryptdb](http://css.csail.mit.edu/cryptdb/) project.
* [Fast string sorting using order-preserving compression](http://dl.acm.org/citation.cfm?id=1180611)

## Fat binary search and monotone minimal perfect hashing
* [Order Preserving Minimal Perfect Hash Functions and Information Retrieval](http://eprints.cs.vt.edu/archive/00000248/01/TR-91-01.pdf) by Fox, Chen, Daoud, and Heath max present a way to create still-order preserving hashing functions for categorical data with known categories.
* [Fast Prefix Search in Little Space with Application](http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.174.9262&rep=rep1&type=pdf) [(slides)](http://www.itu.dk/people/pagh/papers/prefix-slides.pdf) describes a nice trade-off that permits 'weak' rank over prefix queries provided at least one key matches the prefix in the dataset and provides a nice way to balance returning all of the records that match a given query when mixed in with the other storage tools at our disposal.
* [F. C. Botelho and N. Ziviani. External perfect hashing for very large key sets. In CIKM, pages 653–662, 2007.](http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.88.2974&rep=rep1&type=pdf) provides a suite of techniques that are used to good effect in
* [Theory and Practise of Monotone Minimal Perfect Hashing](http://www.itu.dk/people/pagh/papers/jea.pdf), which provides a good template for how to put monotone minimal perfect hashing to use.

# Formal Concept Analysis

* [The Wikipedia Article](http://en.wikipedia.org/wiki/Formal_concept_analysis) is okay, it includes a link to this
* [FCA Homepage](http://www.fcahome.org.uk/fca.html)

# Incremental Computation
* [Differential Dataflow](http://www.cidrdb.org/cidr2013/Papers/CIDR13_Paper111.pdf)
* [Project Naiad](http://research.microsoft.com/en-us/projects/naiad/)

# Weighted Datalog and Generalized Annotated Programs
* [Dyna: Extending Datalog for Modern AI](http://www.cs.jhu.edu/~nwf/datalog20-paper.pdf)
* [A Flexible Solver for Finite Arithmetic Circuits](http://cs.jhu.edu/~jason/papers/filardo+eisner.iclp12.pdf)

# Stable Models
* [Extending and Implementing the Stable Model Semantics](http://arxiv.org/pdf/cs/0005010.pdf)
* [Safe Database Queries with Arithmetic Operations](http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.48.4845&rep=rep1&type=pdf)

# Top-Down Evaluation
* [Efficient Top-Down Computation of Queries Under the Well-Founded Semantics](http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.38.6142&rep=rep1&type=pdf)

# Tabling
* [OLD Resolution with Tabulation](http://sato-www.cs.titech.ac.jp/reference/Sato-ICLP86.pdf)
* [A Thread In Time Saves Tabling Time](http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.54.9454&rep=rep1&type=pdf)
* [More Efficient Datalog Queries: Subsumptive Tabling Beats Magic Sets](http://www.logicblox.com/publications/2011/sigmod11-tekle.pdf)

# *-Semirings and C-Semirings/ω-continuous semirings
```
[21:27] nwf:	 Paper dump:
[21:27] nwf:	 http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.71.7650 is a decent overview, though a little dated
[21:28] nwf:	 http://dl.acm.org/citation.cfm?id=973230 ties a lot of this in to NLP parsing, if you're curious
[21:28] nwf:	 http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.56.704 I have just skimmed and has some nice examples
[21:30] nwf:	 http://dl.acm.org/citation.cfm?doid=322261.322272 has some more graph-based examples
```
* [Weighted Datalog and Levels of Trust](http://dl.acm.org/citation.cfm?id=1371966)

# Provenance semirings and x-fast trees
* [Provenance Semirings](http://db.cis.upenn.edu/DL/07/pods07.pdf)
* [Provenance query evaluation: what's so special about it?](http://dl.acm.org/citation.cfm?id=1646040)

# Consistency and distribution

* [Distributed Algorithms in NoSQL Databases](http://highlyscalable.wordpress.com/2012/09/18/distributed-algorithms-in-nosql-databases/)

# Latch-free architecture

* [High-Performance Concurrency Control Mechanisms for Main-Memory Databases](http://vldb.org/pvldb/vol5/p298_per-akelarson_vldb2012.pdf)

# Persistence and Versioning

* [Fully Persistent B-Trees](http://cs.au.dk/~gerth/pub/soda12.html)
* [Confluently Persistent Tries for Efficient Version Control](http://erikdemaine.org/papers/ConfluentTries_Algorithmica/paper.pdf) by Demaine, Langerman and Price is particularly interesting to me, because they provide O(log log n) movement time fully persistent hash table.
* [Stratiﬁed B-trees and Versioned Dictionaries](http://static.usenix.org/event/hotstorage11/tech/final_files/Twigg.pdf) describes a technique for versioning that is consistent with the rest of the machinery in `analytics`.

# Cache-Obliviousness
* [Cache-Oblivious Algorithms](http://supertech.csail.mit.edu/papers/Prokop99.pdf) was Prokop's M.S. thesis and more or less started this whole field.
* [Cache-Oblivious Sorting](http://cs.au.dk/~gerth/pub/encyclopedia08.html)
* [Ordered Files and Cache-Oblivious Priority Queues *video*](http://www.youtube.com/watch?v=jAh_bC4hYlc)
* [A density control algorithm for doing insertions and deletions in a sequentially ordered file in a good worst-case time](http://www.sciencedirect.com/science/article/pii/089054019290034D). This provides the O((log^2 N)/B) _worst case_ bound for ordered file maintanence. Note that to do so it uses a "calibrator tree" which corresponds directly with the total number of children under a given branch. This could be-expressed like (or as part of) a Haar sketch.
* [Cache-Oblivious Parallel Algorithms](http://multicoretheory.wordpress.com/2011/05/11/cache-oblivious-parallel-algorithms/) gives a decent overview of cache-oblivious parallel architecture and Blelloch et al.'s parallel cache complexity bounds.
* [Exponential Structures for Efﬁcient Cache-Oblivious Algorithms](http://www.daimi.au.dk/~large/ioS05/BCR.pdf) by Bender, Cole and Raman

## Packed Memory Arrays
* [Insertion Sort is /O(n log n)/](http://www.cs.sunysb.edu/~bender/newpub/BenderFaMo06-librarysort.pdf) by Bender, Farach-Colton and Mostiero.
* [An Adaptive Packed Memory Array](http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.63.1533) by Bender and Hu provides a PMA that for many access patterns offers faster /O(log n)/ amortized inserts.
* [Partially De-amortized Packed Memory Array](http://dhruvbird.com/pdpma.pdf) [(alt)](http://www.academia.edu/1766080/A_partially_deamortized_packed_memory_array) goes half-way to the Willard bounds with a lot less implementation effort.

## Encoding functions with static support, Monotone Minimal Perfect Hashing and Bloomier Filters
* [Predecessor search with distance-sensitive query time](http://arxiv.org/pdf/1209.5441.pdf) covers Z-Fast Trees (and unlike [the original](http://link.springer.com/chapter/10.1007%2F978-3-642-16321-0_15?LI=true#page-1) isn't behind a Springer pay-wall).
* [Boldi's slides from BISS2012](http://boldi.di.unimi.it/Corsi/BISS2012/mmph.pdf) give a good motivation for the fat binary search used in z-fast tries.
* [Bloomier Filters: A second look](http://arxiv.org/abs/0807.0928)

## Cache-Oblivious Databases

* [Cache-Oblivious Databases: Limitations and Opportunities](http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.144.9113&rep=rep1&type=pdf) by He and Luo provides lots of hard numbers comparing COB+ trees with other structures, etc.
* [Cache-Oblivious Streaming B-Trees](http://supertech.csail.mit.edu/papers/sbtree.pdf)
* [Streaming B-Trees for Filesystem Grand Challenges](http://institutes.lanl.gov/hec-fsio/workshops/2007/presentations/day1/Farach-Colton_sbtree-nsf07.pdf)
* [Cache-Oblivious Query Processing](http://www-db.cs.wisc.edu/cidr/cidr2007/papers/cidr07p05.pdf) by He and Luo

## String Dictionaries

* Cache-Oblivious String Dictionaries ([slides](http://www.cs.au.dk/~gerth/slides/bertinoro06.pdf)) ([paper](http://www.cs.au.dk/~gerth/papers/soda06.pdf)) by Brodal and Fagerberg use giraffe trees for fixed dictionaries.
* [Fast Compressed Tries through Path Decompositions](http://siam.omnibooksonline.com/2012ALENEX/data/papers/018.pdf) by Grossi and Ottaviano talks about [centroid trees](http://mathworld.wolfram.com/CentroidPoint.html), which are used in many dictionary structures including
* [Cache-Oblivious String B-Trees](http://www.cs.stonybrook.edu/~bender/pub/PODS06-BFK.pdf) by Bender, Farach-Colton and Kuszmaul used centroid trees as part of their COSB-tree
* [Compressed String Dictionaries](http://arxiv.org/pdf/1101.5506v1.pdf) by Brisaboa, Cánovas, Martínez-Prieto and Navarro uses a BWT-based transformation to get an efficient compressed string dictionary.
* [Offline Dictionary-Based Compression](http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.31.5097&rep=rep1&type=pdf) by Larsson and Moffat covers RE-PAIR, which has very slow encoding, but reasonable decoding performance.
* [On Searching Compressed String Collections Cache-Obliviously](http://ita.ucsd.edu/workshop/08/files/paper/paper_283.pdf) by Ferragina, Grossi, Gupta, Shah and Vitter talks about "distribution aware" search in section 5 and uses the centroid path decomposition of a tree. They also use the exact form of rear-coding we reinvented.

# Logging and Metrics

* [The log-structured merge tree](http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.44.2782&rep=rep1&type=pdf) by O'Neil, Cheng, Gawlick and O'Neil provides
 great throughput for inserts in exchange for high read latency for write-mostly workloads.

# Compressed Search

We could store full-text-indices on some columns as a BWT transformed version of the leave chunk, then perform compressed-search techniques on top to permit efficient operations on them without paying for full decompression.

At ~4 meg leaves this actually fits pretty well with bzip2 window sizes.

* [Searching BWT compressed text with the Boyer-Moore algorithm and binary search](http://citeseerx.ist.psu.edu/viewdoc/summary?doi=10.1.1.106.9296) by Bell, Powell, Mukherjee and Adjeroh. Note: since our text fragments end with a given block, the concern about chunking BWT searches from the paper do not apply.
* [A Comparison of BWT Approaches to String Pattern Matching](http://vlsi.cs.ucf.edu/nsf/files/reportVer05driver.pdf) by Firth, Bell, Mukherjee and Adjeroh
* [The SBC-Tree: An Index for Run-Length Compressed Sequences](http://www.ittc.ku.edu/~jsv/Papers/EHS08.SBCtree.pdf)
* [Compressed Text Indexing and Range Searching](http://www.cs.purdue.edu/research/technical_reports/2006/TR%2006-021.pdf)
* [Opportunistic Data Structures with Applications](http://people.unipmn.it/manzini/papers/focs00draft.pdf) by Ferragina and Manzini describes how to work with 'compressed suffix arrays' for sublinear space overhead on compressible texts.

# Wavelet Trees and Succinct Data Structures
* [The Myriad Virtues of Wavelet Trees](http://people.unipmn.it/manzini/papers/icalp06.pdf) by Ferragina, Giancarlo, and Manzini
* [Wavelet Trees for All](http://www.dcc.uchile.cl/~gnavarro/ps/cpm12.pdf) by Navarro is an amazingly good overview of the uses of rank/select.
* [Geometric Burrows-Wheeler Transform: Linking Range Searching and Text Indexing](http://www.ittc.ku.edu/~jsv/Papers/CHS08.geometricbw.pdf) builds on wavelet trees and lets us use the algorithms from
* Space-efficient Suffix Trees by Munro, Raman and Rao (2001).
* [Kernel-based Similarity Search in Massive Graph Databases with Wavelet Trees](http://siam.omnibooksonline.com/2011datamining/data/papers/168.pdf) talks a bit about rank-select structures.
* [Broadword Implementation of Rank/Select Queries](http://sux.dsi.unimi.it/paper.pdf) by Vigna
* [Succincter](http://people.csail.mit.edu/mip/papers/succinct/succinct.pdf) by Mihai Pătraşcu
* [Dynamic Entropy Compressed Sequences and Full-Text Indices](http://www.cs.ucr.edu/~stelo/cpm/cpm06/25-makinen.pdf) by Mäkinen and Navarro
* [Succinct Dictionary Matching With No Slowdown](http://arxiv.org/pdf/1001.2860.pdf)
* [The Pizza & Chili Corpus](http://pizzachili.dcc.uchile.cl/indexes.html) provides implementations for many succinct structures.
* [X86-optimized Rank-Select Dictionaries for Bit Sequences](http://www.slideshare.net/maropu0804/a-x86optimized-rankselect-dictionary-for-bit-sequences)
* [Taiju Succint Trie c++ lib and references](http://code.google.com/p/taiju/)

# Compressed Computation

* [Computable Compressed Matrices](http://arxiv.org/pdf/1303.0270v1.pdf)

# Batched buffer management

* [The Buffer Tree: A Technique for Designing Batched External Data Structures](http://www.cs.cmu.edu/~guyb/realworld/slidesF10/buffertree.pdf)
* [MemC3: Compact and Concurrent MemCache with Dumber Caching and Smarter Hashing](http://www.cs.cmu.edu/~binfan/papers/nsdi13_memc3.pdf) uses smarter hashing to get a nice write-focused memcached variant.
* [High Performance Cache Replacement Using Re-Reference Interval Prediction (RRIP)](http://www.jaleels.org/ajaleel/publications/isca2010-rrip.pdf) by Jaleel, Theobald, Steely and Emer provides a nice replacement for LRU policies for an explicit buffer cache with low overhead.
* [Decoupled Dynamic Cache Segmentation](http://faculty.cse.tamu.edu/djimenez/pdfs/hpca2012_dist.pdf) by Khan, Wang and Jiminéz is resistant to both scanning and thrashing, but is also "decoupled" from the choice of replacement policy.

# Succinct Tree Representations
* [Fully-Functional Succinct Trees](http://www.dcc.uchile.cl/~gnavarro/ps/soda10.pdf) provide a nice leg-up from DFUDS and LOUDS in terms of additional functionality.

# Scheduling and Work-Stealing

* [The data locality of work stealing](http://citeseer.ist.psu.edu/viewdoc/summary?doi=10.1.1.129.9162) by Acar and Blelloch introduced the affinity scheduler now used by Intel's TBB.
* [Dynamic circular work-stealing deque](http://citeseerx.ist.psu.edu/showciting?cid=3884551) by Chase and Lev described a novel circular work-stealing deque. However, my attempts to get it to work in Haskell have been fraught with difficulty.
* [A Dynamic-Sized Nonblocking Work Stealing Deque](http://citeseerx.ist.psu.edu/showciting?cid=3884551) by Hendler et al.

# Data Sets (for future demo / benchmarking)
* [Flights Data Set](http://stat-computing.org/dataexpo/2009/the-data.html) might be a good benchmark

# Bloom Filters
* [Don’t Thrash: How to Cache your Hash on Flash](http://static.usenix.org/event/fast11/posters_files/Bender.pdf) provides the notion of a Quotient Filter


