/**
 * @author Samuel Rich Adiela
 */
public class BackNavigationStringMatchingAlgorithm {

    public static int bsma(String text, String pattern) {
        if (text.isBlank() || pattern.isBlank()) {
            return -1;
        }
        int n = pattern.length();
        int i = text.length() - 1;

        while (i >= 0) {
            if (text.charAt(i) == pattern.charAt(n - 1) && (i - (n - 1)) >= 0) {
                int m = 1;
                while (m < (n - 1)) {
                    if (text.charAt(i - (n - m)) != pattern.charAt(m - 1)) {
                        break; // Exit loop if characters don't match
                    }
                    m++;
                }
                if (m == n - 1) {
                    return i - (n - 1); // Match found, return starting index
                }
            }
            i--;
        }
        return -1; // No match found
    }
}
