package functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.google.common.base.Strings.isNullOrEmpty;

public class SecondLongestCaracterChain {

    public int caracterChecker(String str) {

        if (isNullOrEmpty(str)) {
            return 0;
        }

        if (str.length() > 105) {
            throw new RuntimeException("string length must be less then 106 characters");
        }

        if (str.length() == 1) {
            return 1;
        }

        List<String> strings = new ArrayList<>();

        int startPosition = 0;
        int endPosition = 0;
        String stringPart = "";

        do {

            if (endPosition >= str.length()) {
                strings.add(stringPart);
                break;
            }
            if (str.charAt(startPosition) == str.charAt(endPosition)) {
                stringPart += str.charAt(endPosition);
                endPosition++;
            } else {
                strings.add(stringPart);
                stringPart = "";
                startPosition = endPosition;
            }

        } while (true);

        if (strings.size() == 1) {
            return strings.get(0).length();
        }

        List<StringPositionWithCount> stringPositionWithCounts = new ArrayList<>();

        for (int i = 0; i < strings.size(); i++) {
            stringPositionWithCounts.add(new StringPositionWithCount(i, strings.get(i).length()));
        }

        Collections.sort(stringPositionWithCounts);

        return stringPositionWithCounts.get(1).count;
    }

    private class StringPositionWithCount implements Comparable<StringPositionWithCount> {
        int position;
        int count;

        public StringPositionWithCount(int position, int count) {
            this.position = position;
            this.count = count;
        }

        @Override
        public int compareTo(StringPositionWithCount o) {
            if (count <= o.count) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}

