/*Assignment 3: The DNA Sequence Analyzer
Topic: String & StringBuilder
Objective: Efficiently manipulate long sequences of text.
•	Task: Write a program that takes a DNA string (e.g., "ATGCCT") and performs the following:
1.	Count Occurrences: Count how many times 'A', 'T', 'G', and 'C' appear.
2.	Reverse Complement: Reverse the string and replace A with T, T with A, G with C, and C with G.
•	•  Logic: Use StringBuilder for the reversal and replacement to avoid creating multiple immutable String objects in memory.
•	•  Comparison: Compare the performance of String concatenation vs StringBuilder.append() for a sequence of 10,000 characters.
 */
public class third {
    public static void main(String[] args) {

        String DNASequence = "ATGCGTACGTTAGC";
        int A = 0, T = 0, C = 0, G = 0;

        for (int i = 0; i < DNASequence.length(); i++) {
            char nucleotide = DNASequence.charAt(i);

            switch (nucleotide) {
                case 'A':
                    A++;
                    break;
                case 'T':
                    T++;
                    break;
                case 'C':
                    C++;
                    break;
                case 'G':
                    G++;
                    break;
                default:
                    System.out.println("Invalid Nucleotide");
            }
        }

        System.out.println("DNA Sequence Analysis:");
        System.out.println("Adenine Count: " + A);
        System.out.println("Thymine Count: " + T);
        System.out.println("Cytosine Count: " + C);
        System.out.println("Guanine Count: " + G);

        String reversedSequence = new StringBuilder(DNASequence)
                .reverse()
                .toString()
                .replace('A', 'T')
                .replace('T', 'A')
                .replace('C', 'G')
                .replace('G', 'C');

        System.out.println("Original DNA Sequence: " + DNASequence);
        System.out.println("Reversed Complementary Sequence: " + reversedSequence);

        String randomSequence = "GCTAGCTAGCTA";

        long startTime1 = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 1000; i++) {
            s = s + randomSequence;
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time taken to concatenate: " +
                (endTime1 - startTime1) + " milliseconds");

        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append(randomSequence);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Time taken to append with StringBuilder: " +
                (endTime2 - startTime2) + " milliseconds");
    }
}
