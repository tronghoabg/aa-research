package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class elj extends elg {
    @Override // defpackage.elg
    public final int a(String str, byte[] bArr, int i, int i2) {
        long j;
        long j2;
        int i3;
        char cCharAt;
        int i4 = i2;
        int length = str.length();
        if (length <= i4) {
            long j3 = i;
            if (bArr.length - i4 >= i) {
                int i5 = 0;
                long j4 = j3;
                while (true) {
                    j = 1;
                    if (i5 >= length || (cCharAt = str.charAt(i5)) >= 128) {
                        break;
                    }
                    elf.k(bArr, j4, (byte) cCharAt);
                    i5++;
                    j4 = 1 + j4;
                }
                if (i5 == length) {
                    return (int) j4;
                }
                while (i5 < length) {
                    long j5 = i4 + j3;
                    char cCharAt2 = str.charAt(i5);
                    if (cCharAt2 >= 128 || j4 >= j5) {
                        j2 = j;
                        if (cCharAt2 < 2048 && j4 <= (-2) + j5) {
                            long j6 = j4 + j2;
                            elf.k(bArr, j4, (byte) ((cCharAt2 >>> 6) | 960));
                            j4 += 2;
                            elf.k(bArr, j6, (byte) ((cCharAt2 & '?') | 128));
                        } else {
                            if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || j4 > j5 - 3) {
                                if (j4 > j5 - 4) {
                                    if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i3 = i5 + 1) != length && Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                                        throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                                    }
                                    throw new eli(i5, length);
                                }
                                int i6 = i5 + 1;
                                if (i6 != length) {
                                    char cCharAt3 = str.charAt(i6);
                                    if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                        elf.k(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                        elf.k(bArr, j4 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j7 = j4 + 3;
                                        elf.k(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                        j4 += 4;
                                        elf.k(bArr, j7, (byte) ((codePoint & 63) | 128));
                                        i5 = i6;
                                    } else {
                                        i5 = i6;
                                    }
                                }
                                throw new eli(i5 - 1, length);
                            }
                            elf.k(bArr, j4, (byte) ((cCharAt2 >>> '\f') | 480));
                            long j8 = j4 + 2;
                            elf.k(bArr, j4 + j2, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                            j4 += 3;
                            elf.k(bArr, j8, (byte) ((cCharAt2 & '?') | 128));
                        }
                    } else {
                        elf.k(bArr, j4, (byte) cCharAt2);
                        j2 = j;
                        j4 += j;
                    }
                    i5++;
                    i4 = i2;
                    j = j2;
                }
                return (int) j4;
            }
        }
        throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
    }

    @Override // defpackage.elg
    public final String b(byte[] bArr, int i, int i2) throws ejp {
        Charset charset = ejn.a;
        String str = new String(bArr, i, i2, charset);
        if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
            throw new ejp("Protocol message had invalid UTF-8.");
        }
        return str;
    }
}
