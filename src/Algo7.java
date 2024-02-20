import java.util.*;

void main(String[] args) {
    printLongestLine(new int[]{2, 2},
            new int[]{2, 3}, new int[]{2, 1}, new int[]{3, 3}, new int[]{4, 4}, new int[]{1, 3}, new int[] {1,1});
    printLongestLine(new int[]{0, 0},
            new int[]{1, 3}, new int[]{1, 2}, new int[]{2, 4}, new int[]{2, 2},
            new int[]{3, 1}, new int[]{4, 0});
}

void printLongestLine(int[]... coordinatePairs) {
    double maxLength = 0;
    int[] longestLine = new int[4];

    for (int i = 0; i < coordinatePairs.length; i++) {
        int[] p1 = coordinatePairs[i];
        for (int j = i + 1; j < coordinatePairs.length; j++) {
            int[] p2 = coordinatePairs[j];
            double distance = distanceBetweenPoints(p1[0], p1[1], p2[0], p2[1]);
            if (distance > maxLength) {
                maxLength = distance;
                longestLine[0] = p1[0];
                longestLine[1] = p1[1];
                longestLine[2] = p2[0];
                longestLine[3] = p2[1];
            }
        }

    }

    System.out.println("Longest line:");
    System.out.println(STR."(\{longestLine[0]}, \{longestLine[1]}) to (\{longestLine[2]}, \{longestLine[3]})");
}

double distanceBetweenPoints(int x1, int y1, int x2, int y2) {
    return (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
}


