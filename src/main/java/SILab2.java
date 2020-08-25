public class SILab2 {
    static boolean checkPrime(int n) {	//	A
        if (n < 0) {		
            throw new RuntimeException("Number should not be negative");	//	B
        }
        int m = n / 2;		//	C
        if (n == 0 || n == 1) {		
            return false;	//		D
        } else {
            for (int i = 2; i <= m; i++) {		//	E	F
                if (n % i == 0) {	
                    return true;		//	G
                }
            }
            return false;		//	H
        }
    }
}