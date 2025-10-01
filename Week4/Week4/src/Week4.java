public class Week4 {

    /**
     * abcd.
     */
    public static int max2Int(int a, int b) {
        return (a >= b) ? a : b;
    }

    /**
     * abcd.
     */
    public static int minArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * abcd.
     */
    public static String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        bmi = Math.round(bmi * 10.0) / 10.0;

        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi <= 22.9) {
            return "Bình thường";
        } else if (bmi <= 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }

    /**
     * abcd.
     */
    public static void main(String[] args) {
        // Test nhanh
        System.out.println("Max: " + max2Int(10, 20));
        System.out.println("Min: " + minArray(new int[]{5, 2, 9, -1, 3}));
        System.out.println("BMI: " + calculateBMI(60, 1.7));
    }
}
