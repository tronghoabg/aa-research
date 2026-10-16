package com.fasterxml.jackson.core.io;

import com.waze.strings.DisplayStrings;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class CharTypes {
    protected static final byte[] HB;
    protected static final byte[] HBlower;
    protected static final char[] HC;
    protected static final char[] HClower = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    protected static final int[] sHexValues;
    protected static final int[] sInputCodes;
    protected static final int[] sInputCodesComment;
    protected static final int[] sInputCodesJsNames;
    protected static final int[] sInputCodesUTF8;
    protected static final int[] sInputCodesUtf8JsNames;
    protected static final int[] sInputCodesWS;
    protected static final int[] sOutputEscapes128;
    protected static final int[] sOutputEscapes128WithSlash;

    static {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        HC = cArr;
        int length = cArr.length;
        HB = new byte[length];
        HBlower = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            HB[i2] = (byte) HC[i2];
            HBlower[i2] = (byte) HClower[i2];
        }
        int[] iArr = new int[256];
        for (int i3 = 0; i3 < 32; i3++) {
            iArr[i3] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        sInputCodes = iArr;
        int length2 = iArr.length;
        int[] iArr2 = new int[length2];
        System.arraycopy(iArr, 0, iArr2, 0, length2);
        for (int i4 = 128; i4 < 256; i4++) {
            iArr2[i4] = (i4 & 224) == 192 ? 2 : (i4 & 240) == 224 ? 3 : (i4 & DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_1) == 240 ? 4 : -1;
        }
        sInputCodesUTF8 = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i5 = 33; i5 < 256; i5++) {
            if (Character.isJavaIdentifierPart((char) i5)) {
                iArr3[i5] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        sInputCodesJsNames = iArr3;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        sInputCodesUtf8JsNames = iArr4;
        int[] iArr5 = new int[256];
        int[] iArr6 = sInputCodesUTF8;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        sInputCodesComment = iArr5;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        sInputCodesWS = iArr7;
        int[] iArr8 = new int[128];
        for (int i6 = 0; i6 < 32; i6++) {
            iArr8[i6] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        sOutputEscapes128 = iArr8;
        int[] iArrCopyOf = Arrays.copyOf(iArr8, iArr8.length);
        sOutputEscapes128WithSlash = iArrCopyOf;
        iArrCopyOf[47] = 47;
        int[] iArr9 = new int[256];
        sHexValues = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i7 = 0; i7 < 10; i7++) {
            sHexValues[i7 + 48] = i7;
        }
        for (int i8 = 0; i8 < 6; i8++) {
            int i9 = i8 + 10;
            int[] iArr10 = sHexValues;
            iArr10[i8 + 97] = i9;
            iArr10[i8 + 65] = i9;
        }
    }

    public static void appendQuoted(StringBuilder sb, String str) {
        int[] iArr = sOutputEscapes128;
        int length = iArr.length;
        int length2 = str.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= length || iArr[cCharAt] == 0) {
                sb.append(cCharAt);
            } else {
                sb.append('\\');
                int i3 = iArr[cCharAt];
                if (i3 < 0) {
                    sb.append("u00");
                    char[] cArr = HC;
                    sb.append(cArr[cCharAt >> 4]);
                    sb.append(cArr[cCharAt & 15]);
                } else {
                    sb.append((char) i3);
                }
            }
        }
    }

    public static int charToHex(int i2) {
        return sHexValues[i2 & 255];
    }

    public static byte[] copyHexBytes(boolean z) {
        return (byte[]) (z ? HB.clone() : HBlower.clone());
    }

    public static char[] copyHexChars(boolean z) {
        return (char[]) (z ? HC.clone() : HClower.clone());
    }

    public static int[] get7BitOutputEscapes(int i2, boolean z) {
        return i2 == 34 ? z ? sOutputEscapes128WithSlash : sOutputEscapes128 : AltEscapes.instance.escapesFor(i2, z);
    }

    public static int[] getInputCodeComment() {
        return sInputCodesComment;
    }

    public static int[] getInputCodeLatin1() {
        return sInputCodes;
    }

    public static int[] getInputCodeLatin1JsNames() {
        return sInputCodesJsNames;
    }

    public static int[] getInputCodeUtf8() {
        return sInputCodesUTF8;
    }

    public static int[] getInputCodeUtf8JsNames() {
        return sInputCodesUtf8JsNames;
    }

    public static char hexToChar(int i2) {
        return HC[i2];
    }

    public static int[] get7BitOutputEscapes() {
        return sOutputEscapes128;
    }

    /* compiled from: WazeSource */
    class AltEscapes {
        public static final AltEscapes instance = new AltEscapes();
        private int[][] _altEscapes = new int[128][];
        private int[][] _altEscapesWithSlash = new int[128][];

        private AltEscapes() {
        }

        public int[] escapesFor(int i2) {
            int[] iArrCopyOf = this._altEscapes[i2];
            if (iArrCopyOf == null) {
                iArrCopyOf = Arrays.copyOf(CharTypes.sOutputEscapes128, 128);
                if (iArrCopyOf[i2] == 0) {
                    iArrCopyOf[i2] = -1;
                }
                this._altEscapes[i2] = iArrCopyOf;
            }
            return iArrCopyOf;
        }

        public int[] escapesFor(int i2, boolean z) {
            if (!z) {
                return escapesFor(i2);
            }
            int[] iArr = this._altEscapesWithSlash[i2];
            if (iArr != null) {
                return iArr;
            }
            int[] iArrEscapesFor = escapesFor(i2);
            iArrEscapesFor[47] = 47;
            this._altEscapesWithSlash[i2] = iArrEscapesFor;
            return iArrEscapesFor;
        }
    }
}
