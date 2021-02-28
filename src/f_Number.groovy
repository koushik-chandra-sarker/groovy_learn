
/**
 *@Groovy supports different kinds of integral literals and decimal literals,
 *  backed by the usual Number types of Java.
 *@Integral literals
 *The integral literal types are the same as in Java:
 *      -byte
 *      -char
 *      -short
 *      -int
 *      -long
 *      -java.lang.BigInteger
 * */

// primitive types
byte  b = 1
char  c = 2
short s = 3
int   i = 4
long  l = 5

println(b)
println(c)
println(s)
println(i)
println(l)

// infinite precision
BigInteger bi =  65415454513213216465465113216546546516131351651
println(bi)

/**
 * @Numbers can also be represented in binary, octal, hexadecimal and decimal bases.
 * */

/**
 * @Binary literal
 *Binary numbers start with a 0b prefix:
 * */


int xInt = 0b10101111
assert xInt == 175 // assert keyword for testing

int xInt1 = 0b10101111
//assert xInt1 == 180 // throw am error, because xInt1 = 175

short xShort = 0b11001001
assert xShort == 201 as short

byte xByte = 0b11
assert xByte == 3 as byte

long xLong = 0b101101101101
assert xLong == 2925l

BigInteger xBigInteger = 0b111100100001
assert xBigInteger == 3873g

int xNegativeInt = -0b10101111
assert xNegativeInt == -175

/**
 * @Octal literal
 * Octal numbers are specified in the typical format of 0 followed by octal digits.
 */


int xInt2 = 077
assert xInt2 == 63

short xShort2 = 011
assert xShort2 == 9 as short

byte xByte2 = 032
assert xByte2 == 26 as byte

long xLong2 = 0246
assert xLong2 == 166l

BigInteger xBigInteger2 = 01111
assert xBigInteger2 == 585g

int xNegativeInt2 = -077
assert xNegativeInt2 == -63

/**
 * @Hexadecimal literal
 * Hexadecimal numbers are specified in the typical format of 0x followed by hex digits.
 * */

int xInt3 = 0x77
assert xInt3 == 119

short xShort3 = 0xaa
assert xShort3 == 170 as short

byte xByte3 = 0x3a
assert xByte3 == 58 as byte

long xLong3 = 0xffff
assert xLong3 == 65535l

BigInteger xBigInteger3 = 0xaaaa
assert xBigInteger3 == 43690g

Double xDouble3 = new Double('0x1.0p0')
assert xDouble3 == 1.0d

int xNegativeInt3 = -0x77
assert xNegativeInt3 == -119


/**
 * @Underscore in literals
 * */

long creditCardNumber = 1234_5678_9012_3456L
long socialSecurityNumbers = 999_99_9999L
double monetaryAmount = 12_345_132.12
long hexBytes = 0xFF_EC_DE_5E
long hexWords = 0xFFEC_DE5E
long maxLong = 0x7fff_ffff_ffff_ffffL
long alsoMaxLong = 9_223_372_036_854_775_807L
long bytes = 0b11010010_01101001_10010100_10010010
println(creditCardNumber)
println(socialSecurityNumbers)
println(monetaryAmount)
println(hexBytes)
println(hexWords)
println(maxLong)
println(alsoMaxLong)
println(bytes)