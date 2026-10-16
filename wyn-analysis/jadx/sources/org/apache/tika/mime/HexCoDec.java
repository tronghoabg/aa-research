package org.apache.tika.mime;

import org.apache.tika.fork.ForkServer;

/* loaded from: classes5.dex */
public class HexCoDec {
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static byte[] decode(String str) {
        return decode(str.toCharArray());
    }

    public static char[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    private static int hexCharToNibble(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 >= 'A' && c10 <= 'F') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Not a hex char - '" + c10 + "'");
    }

    public static byte[] decode(char[] cArr) {
        return decode(cArr, 0, cArr.length);
    }

    public static char[] encode(byte[] bArr, int i5, int i10) {
        char[] cArr = new char[i10 * 2];
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i5 + 1;
            byte b5 = bArr[i5];
            int i14 = b5 & ForkServer.ERROR;
            int i15 = i12 + 1;
            char[] cArr2 = HEX_CHARS;
            cArr[i12] = cArr2[i14 >> 4];
            i12 += 2;
            cArr[i15] = cArr2[b5 & 15];
            i11++;
            i5 = i13;
        }
        return cArr;
    }

    public static byte[] decode(char[] cArr, int i5, int i10) {
        if ((i10 & 1) == 0) {
            int i11 = i10 / 2;
            byte[] bArr = new byte[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = i5 + 1;
                int iHexCharToNibble = hexCharToNibble(cArr[i5]) * 16;
                i5 += 2;
                bArr[i12] = (byte) (iHexCharToNibble + hexCharToNibble(cArr[i13]));
            }
            return bArr;
        }
        throw new IllegalArgumentException("Length must be even");
    }
}
