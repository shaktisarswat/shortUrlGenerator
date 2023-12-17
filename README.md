# shortUrlGenerator

Build XURL from scratch

* Created a concrete class which implements a short URL interface class provided. It contains all the methods that can be used to create long URL to short URL mappings.
* Implemented a method to take a long URL as input, generate a random 9 character short URL and return it. Also maintain this mapping using a hash map for quick retrieval.
* Implemented a method to take a long URL and a custom short URL as input and register that mapping. 
* Error handling to make sure each long URL maps to only one short URL and vice versa.
* Implemented a method to lookup short URL for a given long URL, from the mapping created.
* Implemented a method to delete the mapping based on a long URL.
* Implemented a counter to keep track of the hit count for each long URL - which tells us how many times a particular long URL has been looked up.
* Tested these methods using JUnit FrameWork.

Skills used
Core Java, Interfaces, Debugging, JUnit
