
class Solution {
    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        String[] belowTwenty = {
            "", "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen",
            "Nineteen"
        };

        String[] tens = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };

        String[] thousands = {
            "", "Thousand", "Million", "Billion"
        };

        StringBuilder result = new StringBuilder();
        int group = 0;

        while (num > 0) {
            int part = num % 1000;

            if (part != 0) {
                String words = convert(part, belowTwenty, tens);
                result.insert(0, words + " " + thousands[group] + " ");
            }

            num /= 1000;
            group++;
        }

        return result.toString().trim().replaceAll("\\s+", " ");
    }

    private String convert(int num, String[] belowTwenty, String[] tens) {
        StringBuilder result = new StringBuilder();

        if (num >= 100) {
            result.append(belowTwenty[num / 100])
                  .append(" Hundred ");
            num %= 100;
        }

        if (num >= 20) {
            result.append(tens[num / 10]).append(" ");
            num %= 10;
        }

        if (num > 0) {
            result.append(belowTwenty[num]).append(" ");
        }

        return result.toString().trim();
    }
}
