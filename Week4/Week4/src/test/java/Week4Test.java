import org.junit.Assert;
import org.junit.Test;

public class Week4Test {
    @Test
    public void testMax2Int1() {
        int expectedResult = 5;
        int actualResult = Week4.max2Int(-100, 5);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMax2Int2() {
        Assert.assertEquals(10, Week4.max2Int(10, -20));
    }

    @Test
    public void testMax2Int3() {
        Assert.assertEquals(0, Week4.max2Int(0, 0));
    }

    @Test
    public void testMax2Int4() {
        Assert.assertEquals(999, Week4.max2Int(999, -999));
    }

    @Test
    public void testMax2Int5() {
        Assert.assertEquals(123456, Week4.max2Int(123456, 123));
    }

    // ----------- minArray -----------
    @Test
    public void testMinArray1() {
        int[] arr = {5, 3, 9, 1, 7};
        Assert.assertEquals(1, Week4.minArray(arr));
    }

    @Test
    public void testMinArray2() {
        int[] arr = {-5, -3, -9, -1, -7};
        Assert.assertEquals(-9, Week4.minArray(arr));
    }

    @Test
    public void testMinArray3() {
        int[] arr = {100};
        Assert.assertEquals(100, Week4.minArray(arr));
    }

    @Test
    public void testMinArray4() {
        int[] arr = {0, 0, 0, 0};
        Assert.assertEquals(0, Week4.minArray(arr));
    }

    @Test
    public void testMinArray5() {
        int[] arr = {10, 20, 5, 30, -100, 50};
        Assert.assertEquals(-100, Week4.minArray(arr));
    }

    // ----------- calculateBMI -----------
    @Test
    public void testCalculateBMI1() {
        Assert.assertEquals("Thiếu cân", Week4.calculateBMI(40, 1.70));
    }

    @Test
    public void testCalculateBMI2() {
        Assert.assertEquals("Bình thường", Week4.calculateBMI(60, 1.70));
    }

    @Test
    public void testCalculateBMI3() {
        Assert.assertEquals("Thừa cân", Week4.calculateBMI(75, 1.70));
    }

    @Test
    public void testCalculateBMI4() {
        Assert.assertEquals("Béo phì", Week4.calculateBMI(95, 1.70));
    }

    @Test
    public void testCalculateBMI5() {
        Assert.assertEquals("Bình thường", Week4.calculateBMI(50, 1.60));
    }
}
