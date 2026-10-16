package com.fasterxml.jackson.core.io;

import androidx.collection.SieveCacheKt;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.fasterxml.jackson.core.io.schubfach.DoubleToDecimal;
import com.fasterxml.jackson.core.io.schubfach.FloatToDecimal;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NumberOutput {
    private static int BILLION = 1000000000;
    private static long BILLION_L = 1000000000;
    private static long MAX_INT_AS_LONG = 2147483647L;
    private static int MILLION = 1000000;
    private static long MIN_INT_AS_LONG = -2147483648L;
    static final String SMALLEST_INT = "-2147483648";
    static final String SMALLEST_LONG = "-9223372036854775808";
    private static final int[] TRIPLET_TO_CHARS = new int[1000];
    private static final String[] sSmallIntStrs;
    private static final String[] sSmallIntStrs2;

    static {
        int i2 = 0;
        for (int i3 = 0; i3 < 10; i3++) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = 0;
                while (i5 < 10) {
                    TRIPLET_TO_CHARS[i2] = ((i3 + 48) << 16) | ((i4 + 48) << 8) | (i5 + 48);
                    i5++;
                    i2++;
                }
            }
        }
        sSmallIntStrs = new String[]{"0", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, ExifInterface.GPS_MEASUREMENT_2D, ExifInterface.GPS_MEASUREMENT_3D, "4", "5", "6", "7", "8", "9", "10"};
        sSmallIntStrs2 = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    private static int _full3(int i2, char[] cArr, int i3) {
        int i4 = TRIPLET_TO_CHARS[i2];
        cArr[i3] = (char) (i4 >> 16);
        cArr[i3 + 1] = (char) ((i4 >> 8) & 127);
        cArr[i3 + 2] = (char) (i4 & 127);
        return i3 + 3;
    }

    private static int _leading3(int i2, char[] cArr, int i3) {
        int i4 = TRIPLET_TO_CHARS[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                cArr[i3] = (char) (i4 >> 16);
                i3++;
            }
            cArr[i3] = (char) ((i4 >> 8) & 127);
            i3++;
        }
        int i5 = i3 + 1;
        cArr[i3] = (char) (i4 & 127);
        return i5;
    }

    private static int _outputFullBillion(int i2, char[] cArr, int i3) {
        int[] iArr = TRIPLET_TO_CHARS;
        int iDivBy1000 = divBy1000(i2);
        int iDivBy10002 = divBy1000(iDivBy1000);
        int i4 = iArr[iDivBy10002];
        cArr[i3] = (char) (i4 >> 16);
        cArr[i3 + 1] = (char) ((i4 >> 8) & 127);
        cArr[i3 + 2] = (char) (i4 & 127);
        int i5 = iArr[iDivBy1000 - (iDivBy10002 * 1000)];
        cArr[i3 + 3] = (char) (i5 >> 16);
        cArr[i3 + 4] = (char) ((i5 >> 8) & 127);
        cArr[i3 + 5] = (char) (i5 & 127);
        int i6 = iArr[i2 - (iDivBy1000 * 1000)];
        cArr[i3 + 6] = (char) (i6 >> 16);
        cArr[i3 + 7] = (char) ((i6 >> 8) & 127);
        cArr[i3 + 8] = (char) (i6 & 127);
        return i3 + 9;
    }

    private static int _outputSmallestI(byte[] bArr, int i2) {
        int length = SMALLEST_INT.length();
        int i3 = 0;
        while (i3 < length) {
            bArr[i2] = (byte) SMALLEST_INT.charAt(i3);
            i3++;
            i2++;
        }
        return i2;
    }

    private static int _outputSmallestL(byte[] bArr, int i2) {
        int length = SMALLEST_LONG.length();
        int i3 = 0;
        while (i3 < length) {
            bArr[i2] = (byte) SMALLEST_LONG.charAt(i3);
            i3++;
            i2++;
        }
        return i2;
    }

    private static int _outputUptoBillion(int i2, char[] cArr, int i3) {
        if (i2 < MILLION) {
            if (i2 < 1000) {
                return _leading3(i2, cArr, i3);
            }
            int iDivBy1000 = divBy1000(i2);
            return _outputUptoMillion(cArr, i3, iDivBy1000, i2 - (iDivBy1000 * 1000));
        }
        int iDivBy10002 = divBy1000(i2);
        int i4 = iDivBy10002 * 1000;
        int iDivBy10003 = divBy1000(iDivBy10002);
        int i5 = iDivBy10003 * 1000;
        int i_leading3 = _leading3(iDivBy10003, cArr, i3);
        int[] iArr = TRIPLET_TO_CHARS;
        int i6 = iArr[iDivBy10002 - i5];
        cArr[i_leading3] = (char) (i6 >> 16);
        cArr[i_leading3 + 1] = (char) ((i6 >> 8) & 127);
        cArr[i_leading3 + 2] = (char) (i6 & 127);
        int i7 = iArr[i2 - i4];
        cArr[i_leading3 + 3] = (char) (i7 >> 16);
        cArr[i_leading3 + 4] = (char) ((i7 >> 8) & 127);
        cArr[i_leading3 + 5] = (char) (i7 & 127);
        return i_leading3 + 6;
    }

    private static int _outputUptoMillion(char[] cArr, int i2, int i3, int i4) {
        int[] iArr = TRIPLET_TO_CHARS;
        int i5 = iArr[i3];
        if (i3 > 9) {
            if (i3 > 99) {
                cArr[i2] = (char) (i5 >> 16);
                i2++;
            }
            cArr[i2] = (char) ((i5 >> 8) & 127);
            i2++;
        }
        cArr[i2] = (char) (i5 & 127);
        int i6 = iArr[i4];
        cArr[i2 + 1] = (char) (i6 >> 16);
        int i7 = i2 + 3;
        cArr[i2 + 2] = (char) ((i6 >> 8) & 127);
        int i8 = i2 + 4;
        cArr[i7] = (char) (i6 & 127);
        return i8;
    }

    static int divBy1000(int i2) {
        return (int) ((i2 * 274877907) >>> 38);
    }

    public static boolean notFinite(double d2) {
        return !NumberOutput$$ExternalSyntheticBackport0.m(d2);
    }

    public static int outputInt(int i2, byte[] bArr, int i3) {
        if (i2 < 0) {
            if (i2 == Integer.MIN_VALUE) {
                return _outputSmallestI(bArr, i3);
            }
            bArr[i3] = StylePropertiesKt.FontSynthesisId;
            i2 = -i2;
            i3++;
        }
        if (i2 < MILLION) {
            if (i2 >= 1000) {
                int iDivBy1000 = divBy1000(i2);
                return _full3(i2 - (iDivBy1000 * 1000), bArr, _leading3(iDivBy1000, bArr, i3));
            }
            if (i2 >= 10) {
                return _leading3(i2, bArr, i3);
            }
            int i4 = i3 + 1;
            bArr[i3] = (byte) (i2 + 48);
            return i4;
        }
        int i5 = BILLION;
        if (i2 < i5) {
            int iDivBy10002 = divBy1000(i2);
            int i6 = iDivBy10002 * 1000;
            int iDivBy10003 = divBy1000(iDivBy10002);
            return _full3(i2 - i6, bArr, _full3(iDivBy10002 - (iDivBy10003 * 1000), bArr, _leading3(iDivBy10003, bArr, i3)));
        }
        int i7 = i3 + 1;
        int i8 = i2 - i5;
        if (i8 >= i5) {
            bArr[i3] = 50;
            i8 -= i5;
        } else {
            bArr[i3] = StylePropertiesKt.LineBreakId;
        }
        return _outputFullBillion(i8, bArr, i7);
    }

    public static int outputLong(long j2, byte[] bArr, int i2) {
        int i_outputFullBillion;
        if (j2 < 0) {
            if (j2 > MIN_INT_AS_LONG) {
                return outputInt((int) j2, bArr, i2);
            }
            if (j2 == Long.MIN_VALUE) {
                return _outputSmallestL(bArr, i2);
            }
            bArr[i2] = StylePropertiesKt.FontSynthesisId;
            j2 = -j2;
            i2++;
        } else if (j2 <= MAX_INT_AS_LONG) {
            return outputInt((int) j2, bArr, i2);
        }
        long j3 = BILLION_L;
        long j4 = j2 / j3;
        long j5 = j4 * j3;
        if (j4 < j3) {
            i_outputFullBillion = _outputUptoBillion((int) j4, bArr, i2);
        } else {
            long j6 = j4 / j3;
            i_outputFullBillion = _outputFullBillion((int) (j4 - (j3 * j6)), bArr, _leading3((int) j6, bArr, i2));
        }
        return _outputFullBillion((int) (j2 - j5), bArr, i_outputFullBillion);
    }

    public static String toString(int i2) {
        String[] strArr = sSmallIntStrs;
        if (i2 < strArr.length) {
            if (i2 >= 0) {
                return strArr[i2];
            }
            String[] strArr2 = sSmallIntStrs2;
            int i3 = (-i2) - 1;
            if (i3 < strArr2.length) {
                return strArr2[i3];
            }
        }
        return Integer.toString(i2);
    }

    public static boolean notFinite(float f2) {
        return !NumberOutput$$ExternalSyntheticBackport1.m(f2);
    }

    private static int _outputSmallestI(char[] cArr, int i2) {
        String str = SMALLEST_INT;
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        return i2 + length;
    }

    private static int _outputSmallestL(char[] cArr, int i2) {
        String str = SMALLEST_LONG;
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        return i2 + length;
    }

    public static String toString(double d2, boolean z) {
        return z ? DoubleToDecimal.toString(d2) : Double.toString(d2);
    }

    public static String toString(float f2) {
        return toString(f2, false);
    }

    private static int _full3(int i2, byte[] bArr, int i3) {
        int i4 = TRIPLET_TO_CHARS[i2];
        bArr[i3] = (byte) (i4 >> 16);
        bArr[i3 + 1] = (byte) (i4 >> 8);
        bArr[i3 + 2] = (byte) i4;
        return i3 + 3;
    }

    public static String toString(float f2, boolean z) {
        return z ? FloatToDecimal.toString(f2) : Float.toString(f2);
    }

    public static String toString(double d2) {
        return toString(d2, false);
    }

    public static String toString(long j2) {
        if (j2 <= SieveCacheKt.NodeLinkMask && j2 >= SieveCacheKt.NodeMetaAndPreviousMask) {
            return toString((int) j2);
        }
        return Long.toString(j2);
    }

    private static int _leading3(int i2, byte[] bArr, int i3) {
        int i4 = TRIPLET_TO_CHARS[i2];
        if (i2 > 9) {
            if (i2 > 99) {
                bArr[i3] = (byte) (i4 >> 16);
                i3++;
            }
            bArr[i3] = (byte) (i4 >> 8);
            i3++;
        }
        int i5 = i3 + 1;
        bArr[i3] = (byte) i4;
        return i5;
    }

    private static int _outputUptoMillion(byte[] bArr, int i2, int i3, int i4) {
        int[] iArr = TRIPLET_TO_CHARS;
        int i5 = iArr[i3];
        if (i3 > 9) {
            if (i3 > 99) {
                bArr[i2] = (byte) (i5 >> 16);
                i2++;
            }
            bArr[i2] = (byte) (i5 >> 8);
            i2++;
        }
        bArr[i2] = (byte) i5;
        int i6 = iArr[i4];
        bArr[i2 + 1] = (byte) (i6 >> 16);
        int i7 = i2 + 3;
        bArr[i2 + 2] = (byte) (i6 >> 8);
        int i8 = i2 + 4;
        bArr[i7] = (byte) i6;
        return i8;
    }

    public static int outputLong(long j2, char[] cArr, int i2) {
        int i_outputFullBillion;
        if (j2 < 0) {
            if (j2 > MIN_INT_AS_LONG) {
                return outputInt((int) j2, cArr, i2);
            }
            if (j2 == Long.MIN_VALUE) {
                return _outputSmallestL(cArr, i2);
            }
            cArr[i2] = '-';
            j2 = -j2;
            i2++;
        } else if (j2 <= MAX_INT_AS_LONG) {
            return outputInt((int) j2, cArr, i2);
        }
        long j3 = BILLION_L;
        long j4 = j2 / j3;
        long j5 = j4 * j3;
        if (j4 < j3) {
            i_outputFullBillion = _outputUptoBillion((int) j4, cArr, i2);
        } else {
            long j6 = j4 / j3;
            i_outputFullBillion = _outputFullBillion((int) (j4 - (j3 * j6)), cArr, _leading3((int) j6, cArr, i2));
        }
        return _outputFullBillion((int) (j2 - j5), cArr, i_outputFullBillion);
    }

    private static int _outputFullBillion(int i2, byte[] bArr, int i3) {
        int[] iArr = TRIPLET_TO_CHARS;
        int iDivBy1000 = divBy1000(i2);
        int iDivBy10002 = divBy1000(iDivBy1000);
        int i4 = iArr[iDivBy10002];
        bArr[i3] = (byte) (i4 >> 16);
        bArr[i3 + 1] = (byte) (i4 >> 8);
        bArr[i3 + 2] = (byte) i4;
        int i5 = iArr[iDivBy1000 - (iDivBy10002 * 1000)];
        bArr[i3 + 3] = (byte) (i5 >> 16);
        bArr[i3 + 4] = (byte) (i5 >> 8);
        bArr[i3 + 5] = (byte) i5;
        int i6 = iArr[i2 - (iDivBy1000 * 1000)];
        bArr[i3 + 6] = (byte) (i6 >> 16);
        bArr[i3 + 7] = (byte) (i6 >> 8);
        bArr[i3 + 8] = (byte) i6;
        return i3 + 9;
    }

    private static int _outputUptoBillion(int i2, byte[] bArr, int i3) {
        if (i2 < MILLION) {
            if (i2 < 1000) {
                return _leading3(i2, bArr, i3);
            }
            int iDivBy1000 = divBy1000(i2);
            return _outputUptoMillion(bArr, i3, iDivBy1000, i2 - (iDivBy1000 * 1000));
        }
        int iDivBy10002 = divBy1000(i2);
        int i4 = iDivBy10002 * 1000;
        int iDivBy10003 = divBy1000(iDivBy10002);
        int i5 = iDivBy10003 * 1000;
        int i_leading3 = _leading3(iDivBy10003, bArr, i3);
        int[] iArr = TRIPLET_TO_CHARS;
        int i6 = iArr[iDivBy10002 - i5];
        bArr[i_leading3] = (byte) (i6 >> 16);
        bArr[i_leading3 + 1] = (byte) (i6 >> 8);
        bArr[i_leading3 + 2] = (byte) i6;
        int i7 = iArr[i2 - i4];
        bArr[i_leading3 + 3] = (byte) (i7 >> 16);
        bArr[i_leading3 + 4] = (byte) (i7 >> 8);
        bArr[i_leading3 + 5] = (byte) i7;
        return i_leading3 + 6;
    }

    public static int outputInt(int i2, char[] cArr, int i3) {
        if (i2 < 0) {
            if (i2 == Integer.MIN_VALUE) {
                return _outputSmallestI(cArr, i3);
            }
            cArr[i3] = '-';
            i2 = -i2;
            i3++;
        }
        if (i2 < MILLION) {
            if (i2 >= 1000) {
                int iDivBy1000 = divBy1000(i2);
                return _full3(i2 - (iDivBy1000 * 1000), cArr, _leading3(iDivBy1000, cArr, i3));
            }
            if (i2 < 10) {
                int i4 = i3 + 1;
                cArr[i3] = (char) (i2 + 48);
                return i4;
            }
            return _leading3(i2, cArr, i3);
        }
        int i5 = BILLION;
        if (i2 >= i5) {
            int i6 = i3 + 1;
            int i7 = i2 - i5;
            if (i7 >= i5) {
                cArr[i3] = '2';
                i7 -= i5;
            } else {
                cArr[i3] = '1';
            }
            return _outputFullBillion(i7, cArr, i6);
        }
        int iDivBy10002 = divBy1000(i2);
        int i8 = iDivBy10002 * 1000;
        int iDivBy10003 = divBy1000(iDivBy10002);
        return _full3(i2 - i8, cArr, _full3(iDivBy10002 - (iDivBy10003 * 1000), cArr, _leading3(iDivBy10003, cArr, i3)));
    }
}
