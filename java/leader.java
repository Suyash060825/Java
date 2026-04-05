package Softskills;
public class leader {
    public static void main(String[] args) {
        int A[] = {2, 4, 7, 8, 4};
        boolean found = false;
        for (int i = 0; i < A.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] > A[i]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                System.out.println(A[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No leader is present");
        }
    }
}