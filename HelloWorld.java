public class HelloWorld
{
    static String randomString = "String to print";

    static final double PINUM = 3.141529;

    public static void main(String[] args)
    {
        byte bigByte = 127;
        short bigShort = 32767;
        int bigInt = 10000000;
        long bigLong = 92000000000L;
        float bigFloat = 1.22F;
        double bigDouble = 3.412412424;

        System.out.println(Float.MAX_VALUE);

        String byteString = Byte.toString(bigByte);

        String intString = Integer.toString(bigInt);

        int doubleToInt = (int) bigDouble;

        int stringToInt = Integer.parseInt(intString);

        System.out.println(stringToInt);

    }
}