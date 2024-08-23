package test;

public class ByteConversionExample {
    public static void main(String[] args) {
        // 定义一个 byte 值 -1
        byte signedByte = -1;

        // 将 byte 值转换为无符号整数
        int unsignedValue = signedByte & 0xff;

        // 输出结果
        System.out.println("Signed byte value: " + signedByte);
        System.out.println("Unsigned integer value: " + unsignedValue);
    }
}
