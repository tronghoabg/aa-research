package Bf;

import ff.AbstractC2651f;
import ff.C2648c;
import java.util.Comparator;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class r extends q {
    public static String Z(char[] cArr, int i5, int i10) {
        C2648c c2648c = AbstractC2651f.Companion;
        int length = cArr.length;
        c2648c.getClass();
        C2648c.a(i5, i10, length);
        return new String(cArr, i5, i10 - i5);
    }

    public static String a0(byte[] bArr) {
        AbstractC3340k.e(bArr, "<this>");
        return new String(bArr, a.f1670a);
    }

    public static boolean b0(String str, String suffix, boolean z2) {
        AbstractC3340k.e(str, "<this>");
        AbstractC3340k.e(suffix, "suffix");
        return !z2 ? str.endsWith(suffix) : f0(true, str.length() - suffix.length(), str, 0, suffix, suffix.length());
    }

    public static boolean c0(String str, String str2, boolean z2) {
        return str == null ? str2 == null : !z2 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static void d0() {
        Comparator CASE_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        AbstractC3340k.d(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
    }

    public static final void e0(String str) {
        throw new NumberFormatException(AbstractC3256n.f('\'', "Invalid number format: '", str));
    }

    public static boolean f0(boolean z2, int i5, String str, int i10, String other, int i11) {
        AbstractC3340k.e(str, "<this>");
        AbstractC3340k.e(other, "other");
        return !z2 ? str.regionMatches(i5, other, i10, i11) : str.regionMatches(z2, i5, other, i10, i11);
    }

    public static String g0(String str, int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i5 + '.').toString());
        }
        if (i5 == 0) {
            return "";
        }
        int i10 = 1;
        if (i5 == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i5];
            for (int i11 = 0; i11 < i5; i11++) {
                cArr[i11] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb2 = new StringBuilder(str.length() * i5);
        if (1 <= i5) {
            while (true) {
                sb2.append((CharSequence) str);
                if (i10 == i5) {
                    break;
                }
                i10++;
            }
        }
        String string = sb2.toString();
        AbstractC3340k.b(string);
        return string;
    }

    public static String h0(String str, String oldValue, String newValue, boolean z2) {
        AbstractC3340k.e(str, "<this>");
        AbstractC3340k.e(oldValue, "oldValue");
        AbstractC3340k.e(newValue, "newValue");
        int i5 = 0;
        int iT0 = k.t0(str, oldValue, 0, z2);
        if (iT0 < 0) {
            return str;
        }
        int length = oldValue.length();
        int i10 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i5, iT0);
            sb2.append(newValue);
            i5 = iT0 + length;
            if (iT0 >= str.length()) {
                break;
            }
            iT0 = k.t0(str, oldValue, iT0 + i10, z2);
        } while (iT0 > 0);
        sb2.append((CharSequence) str, i5, str.length());
        String string = sb2.toString();
        AbstractC3340k.d(string, "toString(...)");
        return string;
    }

    public static String i0(String str, char c10, char c11) {
        AbstractC3340k.e(str, "<this>");
        String strReplace = str.replace(c10, c11);
        AbstractC3340k.d(strReplace, "replace(...)");
        return strReplace;
    }

    public static boolean j0(int i5, String str, boolean z2, String str2) {
        AbstractC3340k.e(str, "<this>");
        return !z2 ? str.startsWith(str2, i5) : f0(z2, i5, str, 0, str2, str2.length());
    }

    public static boolean k0(String str, String prefix, boolean z2) {
        AbstractC3340k.e(str, "<this>");
        AbstractC3340k.e(prefix, "prefix");
        return !z2 ? str.startsWith(prefix) : f0(z2, 0, str, 0, prefix, prefix.length());
    }

    public static Integer l0(String str) {
        boolean z2;
        int i5;
        int i10;
        AbstractC3340k.e(str, "<this>");
        tg.b.t(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char cCharAt = str.charAt(0);
        int i12 = -2147483647;
        if (AbstractC3340k.g(cCharAt, 48) < 0) {
            i5 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z2 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i12 = Integer.MIN_VALUE;
                z2 = true;
            }
        } else {
            z2 = false;
            i5 = 0;
        }
        int i13 = -59652323;
        while (i5 < length) {
            int iDigit = Character.digit((int) str.charAt(i5), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i11 < i13 && (i13 != -59652323 || i11 < (i13 = i12 / 10))) || (i10 = i11 * 10) < i12 + iDigit) {
                return null;
            }
            i11 = i10 - iDigit;
            i5++;
        }
        return z2 ? Integer.valueOf(i11) : Integer.valueOf(-i11);
    }

    public static Long m0(String str) {
        boolean z2;
        AbstractC3340k.e(str, "<this>");
        tg.b.t(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char cCharAt = str.charAt(0);
        long j8 = -9223372036854775807L;
        if (AbstractC3340k.g(cCharAt, 48) < 0) {
            z2 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z2 = false;
                i5 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j8 = Long.MIN_VALUE;
                i5 = 1;
            }
        } else {
            z2 = false;
        }
        long j10 = 0;
        long j11 = -256204778801521550L;
        while (i5 < length) {
            int iDigit = Character.digit((int) str.charAt(i5), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j10 < j11) {
                if (j11 != -256204778801521550L) {
                    return null;
                }
                j11 = j8 / 10;
                if (j10 < j11) {
                    return null;
                }
            }
            long j12 = j10 * 10;
            long j13 = iDigit;
            if (j12 < j8 + j13) {
                return null;
            }
            j10 = j12 - j13;
            i5++;
        }
        return z2 ? Long.valueOf(j10) : Long.valueOf(-j10);
    }
}
