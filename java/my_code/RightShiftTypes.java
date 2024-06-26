public class RightShiftTypes
{
    public static void main(String arg[])
    {
        /* For positive number, >> and >>> works same */
        System.out.println(20 >> 2);
        System.out.println(20 >>> 2);

        /* For negative number, >>> changes parity bit (MSB) to 0 */
        System.out.println(-20 >> 2);
        System.out.println(-20 >>> 2);
    }
}