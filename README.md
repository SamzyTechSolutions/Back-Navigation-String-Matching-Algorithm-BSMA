# Back-Navigation String Matching Algorithm (BSMA)

## Abstract
This repository contains the implementation of the Back-Navigation String Matching Algorithm (BSMA) for efficient string matching in large documents.

## Authors
- Adiela Rich Samuel
#### Co-Authors
- Matthias Daniel
- Oriji Ikechi

## Publication
Research Gate · Nov 2, 2018: [BACK-NAVIGATION STRING MATCHING ALGORITHM (BSMA)](https://www.researchgate.net/publication/328785969_BACK-NAVIGATION_STRING_MATCHING_ALGORITHM_BSMA)

Journal of Computer Science (JCS) · Nov 2, 2018
DOI: [https://doi.org/10.31357/jcs.v3i1.3439](https://doi.org/10.31357/jcs.v3i1.3439)

## Introduction
The BSMA is designed for large document sorting, introducing a backward pattern matching from the last character to the first, improving efficiency compared to existing algorithms.

## Efficiency Perspective

### BSMA vs Traditional (Naïve or Brute-force approach) String Comparison

#### BSMA
- **Advantages**:
   - **Early Termination**: BSMA matches the pattern from the end to the beginning within the text, allowing for early termination upon mismatch conditions. This can reduce the number of comparisons significantly.
   - **Optimized Search**: When the pattern length (`m`) is short relative to the text length (`n`), BSMA's approach of back-navigation often outperforms traditional linear comparisons.

- **Considerations**:
   - BSMA's worst-case time complexity is `O(n * m)`, but its efficiency can be notably higher in scenarios where early terminations occur frequently.

#### Traditional (Naïve or Brute-force approach) String Comparison
- **Advantages**:
   - **Simplicity**: Linear comparison methods are straightforward to implement and understand.
   - **Suitability**: Effective for scenarios where patterns are longer or when all characters in the pattern need to be compared sequentially.

- **Considerations**:
   - Traditional methods may have a worst-case time complexity of `O((n - m + 1) * m)`, which can be less efficient than BSMA in certain pattern matching tasks.

### Best Case for BSMA

- **Time Complexity**:
   - Best case: `O(n)`, when the pattern matches at the beginning of the text or early in the search process.

- **Space Complexity**:
   - Best case: `O(1)`, as BSMA does not require additional space proportional to the input size beyond the pattern and text.

## Implementation
The main class for the algorithm is `BackNavigationStringMatchingAlgorithm.java` located in `src/main/java`.

## Usage

### Prerequisites

- Java 17
- Maven

### Running the Algorithm

1. Clone the repository:
    ```sh
    git clone https://github.com/SamzyTechSolutions/BackNavigationStringMatchingAlgorithm-BSMA.git
    cd BackNavigationStringMatchingAlgorithm-BSMA
    ```

2. Compile the code:
    ```sh
    mvn compile
    ```

3. Run the tests:
    ```sh
    mvn test
    ```

### Example

The algorithm can be used as follows in your Java code:
```java
public class Main {
    public static void main(String[] args) {
        String text = "THIS IS A TEST STRING";
        String pattern = "TEST";

        int position = BackNavigationStringMatchingAlgorithm.bsma(text, pattern);

        if (position != -1) {
            System.out.println("Pattern found starting at index " + position);
        } else {
            System.out.println("Pattern not found in the text.");
        }
    }
}
