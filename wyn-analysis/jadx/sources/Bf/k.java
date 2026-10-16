package Bf;

import A7.AbstractC0279p0;
import Af.t;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;

/* loaded from: classes5.dex */
public abstract class k extends r {
    public static int A0(int i5, String str, String string) {
        int iS0 = (i5 & 2) != 0 ? s0(str) : 0;
        AbstractC3340k.e(str, "<this>");
        AbstractC3340k.e(string, "string");
        return str.lastIndexOf(string, iS0);
    }

    public static int B0(CharSequence charSequence, char c10, int i5, int i10) {
        if ((i10 & 2) != 0) {
            i5 = s0(charSequence);
        }
        AbstractC3340k.e(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c10, i5);
        }
        char[] cArr = {c10};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(ff.m.D0(cArr), i5);
        }
        int iS0 = s0(charSequence);
        if (i5 > iS0) {
            i5 = iS0;
        }
        while (-1 < i5) {
            if (tg.b.x(cArr[0], charSequence.charAt(i5), false)) {
                return i5;
            }
            i5--;
        }
        return -1;
    }

    public static String C0(int i5, String str) {
        CharSequence charSequenceSubSequence;
        AbstractC3340k.e(str, "<this>");
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.i(i5, "Desired length ", " is less than zero."));
        }
        if (i5 <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i5);
            sb2.append((CharSequence) str);
            int length = i5 - str.length();
            int i10 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(' ');
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean D0(CharSequence charSequence, int i5, CharSequence other, int i10, int i11, boolean z2) {
        AbstractC3340k.e(charSequence, "<this>");
        AbstractC3340k.e(other, "other");
        if (i10 < 0 || i5 < 0 || i5 > charSequence.length() - i11 || i10 > other.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!tg.b.x(charSequence.charAt(i5 + i12), other.charAt(i10 + i12), z2)) {
                return false;
            }
        }
        return true;
    }

    public static String E0(String str, String prefix) {
        AbstractC3340k.e(str, "<this>");
        AbstractC3340k.e(prefix, "prefix");
        if (!J0(str, prefix, false)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        AbstractC3340k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String F0(String str, String str2) {
        AbstractC3340k.e(str, "<this>");
        if (!r0(str2, str)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        AbstractC3340k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final List G0(String str, CharSequence charSequence) {
        int iT0 = t0(charSequence, str, 0, false);
        if (iT0 == -1) {
            return AbstractC3935e.C(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iT0).toString());
            length = str.length() + iT0;
            iT0 = t0(charSequence, str, length, false);
        } while (iT0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List H0(CharSequence charSequence, char[] cArr) {
        AbstractC3340k.e(charSequence, "<this>");
        if (cArr.length == 1) {
            return G0(String.valueOf(cArr[0]), charSequence);
        }
        Af.j<zf.g> jVar = new Af.j(charSequence, new s(cArr, 0));
        ArrayList arrayList = new ArrayList(ff.p.a0(new t(jVar, 0), 10));
        for (zf.g range : jVar) {
            AbstractC3340k.e(range, "range");
            arrayList.add(charSequence.subSequence(range.f48500a, range.f48501b + 1).toString());
        }
        return arrayList;
    }

    public static List I0(CharSequence charSequence, String[] strArr) {
        AbstractC3340k.e(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return G0(str, charSequence);
            }
        }
        Af.j<zf.g> jVar = new Af.j(charSequence, new s(ff.m.c0(strArr), 1));
        ArrayList arrayList = new ArrayList(ff.p.a0(new t(jVar, 0), 10));
        for (zf.g range : jVar) {
            AbstractC3340k.e(range, "range");
            arrayList.add(charSequence.subSequence(range.f48500a, range.f48501b + 1).toString());
        }
        return arrayList;
    }

    public static boolean J0(String str, String prefix, boolean z2) {
        AbstractC3340k.e(str, "<this>");
        AbstractC3340k.e(prefix, "prefix");
        return !z2 ? r.k0(str, prefix, false) : D0(str, 0, prefix, 0, prefix.length(), z2);
    }

    public static boolean K0(String str, char c10) {
        AbstractC3340k.e(str, "<this>");
        return str.length() > 0 && tg.b.x(str.charAt(0), c10, false);
    }

    public static String L0(char c10, String str, String str2) {
        int iV0 = v0(str, c10, 0, 6);
        if (iV0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iV0 + 1, str.length());
        AbstractC3340k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String M0(String str, String delimiter, String str2) {
        AbstractC3340k.e(delimiter, "delimiter");
        int iW0 = w0(str, delimiter, 0, false, 6);
        if (iW0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(delimiter.length() + iW0, str.length());
        AbstractC3340k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String N0(char c10, String str, String str2) {
        int iB0 = B0(str, c10, 0, 6);
        if (iB0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iB0 + 1, str.length());
        AbstractC3340k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String O0(String missingDelimiterValue, String str) {
        AbstractC3340k.e(missingDelimiterValue, "<this>");
        AbstractC3340k.e(missingDelimiterValue, "missingDelimiterValue");
        int iA0 = A0(6, missingDelimiterValue, str);
        if (iA0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(str.length() + iA0, missingDelimiterValue.length());
        AbstractC3340k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String P0(String missingDelimiterValue, char c10) {
        AbstractC3340k.e(missingDelimiterValue, "<this>");
        AbstractC3340k.e(missingDelimiterValue, "missingDelimiterValue");
        int iV0 = v0(missingDelimiterValue, c10, 0, 6);
        if (iV0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iV0);
        AbstractC3340k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String Q0(String missingDelimiterValue, String str) {
        AbstractC3340k.e(missingDelimiterValue, "<this>");
        AbstractC3340k.e(missingDelimiterValue, "missingDelimiterValue");
        int iW0 = w0(missingDelimiterValue, str, 0, false, 6);
        if (iW0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iW0);
        AbstractC3340k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String R0(String str, String str2, String missingDelimiterValue) {
        AbstractC3340k.e(str, "<this>");
        AbstractC3340k.e(missingDelimiterValue, "missingDelimiterValue");
        int iA0 = A0(6, str, str2);
        if (iA0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iA0);
        AbstractC3340k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String S0(String missingDelimiterValue, char c10) {
        AbstractC3340k.e(missingDelimiterValue, "<this>");
        AbstractC3340k.e(missingDelimiterValue, "missingDelimiterValue");
        int iB0 = B0(missingDelimiterValue, c10, 0, 6);
        if (iB0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iB0);
        AbstractC3340k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String T0(int i5, String str) {
        AbstractC3340k.e(str, "<this>");
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.i(i5, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i5 > length) {
            i5 = length;
        }
        String strSubstring = str.substring(0, i5);
        AbstractC3340k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static Boolean U0(String str) {
        AbstractC3340k.e(str, "<this>");
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static CharSequence V0(String str) {
        AbstractC3340k.e(str, "<this>");
        int length = str.length() - 1;
        int i5 = 0;
        boolean z2 = false;
        while (i5 <= length) {
            boolean zI = tg.b.I(str.charAt(!z2 ? i5 : length));
            if (z2) {
                if (!zI) {
                    break;
                }
                length--;
            } else if (zI) {
                i5++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i5, length + 1);
    }

    public static String W0(String str, char... cArr) {
        AbstractC3340k.e(str, "<this>");
        int length = str.length() - 1;
        int i5 = 0;
        boolean z2 = false;
        while (i5 <= length) {
            char cCharAt = str.charAt(!z2 ? i5 : length);
            int length2 = cArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length2) {
                    i10 = -1;
                    break;
                }
                if (cCharAt == cArr[i10]) {
                    break;
                }
                i10++;
            }
            boolean z10 = i10 >= 0;
            if (z2) {
                if (!z10) {
                    break;
                }
                length--;
            } else if (z10) {
                i5++;
            } else {
                z2 = true;
            }
        }
        return str.subSequence(i5, length + 1).toString();
    }

    public static boolean n0(CharSequence charSequence, CharSequence other, boolean z2) {
        AbstractC3340k.e(charSequence, "<this>");
        AbstractC3340k.e(other, "other");
        if (other instanceof String) {
            if (w0(charSequence, (String) other, 0, z2, 2) >= 0) {
                return true;
            }
        } else if (u0(charSequence, other, 0, charSequence.length(), z2, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean o0(CharSequence charSequence, char c10) {
        AbstractC3340k.e(charSequence, "<this>");
        return v0(charSequence, c10, 0, 2) >= 0;
    }

    public static String p0(int i5, String str) {
        AbstractC3340k.e(str, "<this>");
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.i(i5, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i5 > length) {
            i5 = length;
        }
        String strSubstring = str.substring(i5);
        AbstractC3340k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static boolean q0(String str, char c10) {
        AbstractC3340k.e(str, "<this>");
        return str.length() > 0 && tg.b.x(str.charAt(s0(str)), c10, false);
    }

    public static boolean r0(String str, CharSequence charSequence) {
        AbstractC3340k.e(charSequence, "<this>");
        return charSequence instanceof String ? r.b0((String) charSequence, str, false) : D0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static int s0(CharSequence charSequence) {
        AbstractC3340k.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int t0(CharSequence charSequence, String string, int i5, boolean z2) {
        AbstractC3340k.e(charSequence, "<this>");
        AbstractC3340k.e(string, "string");
        return (z2 || !(charSequence instanceof String)) ? u0(charSequence, string, i5, charSequence.length(), z2, false) : ((String) charSequence).indexOf(string, i5);
    }

    public static final int u0(CharSequence charSequence, CharSequence charSequence2, int i5, int i10, boolean z2, boolean z10) {
        zf.e eVar;
        CharSequence charSequence3 = charSequence2;
        int i11 = i5;
        int i12 = i10;
        if (z10) {
            int iS0 = s0(charSequence);
            if (i11 > iS0) {
                i11 = iS0;
            }
            if (i12 < 0) {
                i12 = 0;
            }
            eVar = new zf.e(i11, i12, -1);
        } else {
            if (i11 < 0) {
                i11 = 0;
            }
            int length = charSequence.length();
            if (i12 > length) {
                i12 = length;
            }
            eVar = new zf.g(i11, i12, 1);
        }
        boolean z11 = charSequence instanceof String;
        int i13 = eVar.f48502c;
        int i14 = eVar.f48501b;
        int i15 = eVar.f48500a;
        if (z11 && (charSequence3 instanceof String)) {
            if ((i13 > 0 && i15 <= i14) || (i13 < 0 && i14 <= i15)) {
                int i16 = i15;
                while (true) {
                    String str = (String) charSequence3;
                    if (!r.f0(z2, 0, str, i16, (String) charSequence, str.length())) {
                        if (i16 == i14) {
                            break;
                        }
                        i16 += i13;
                    } else {
                        return i16;
                    }
                }
            }
        } else if ((i13 > 0 && i15 <= i14) || (i13 < 0 && i14 <= i15)) {
            int i17 = i15;
            while (!D0(charSequence3, 0, charSequence, i17, charSequence3.length(), z2)) {
                if (i17 != i14) {
                    i17 += i13;
                    charSequence3 = charSequence2;
                }
            }
            return i17;
        }
        return -1;
    }

    public static int v0(CharSequence charSequence, char c10, int i5, int i10) {
        if ((i10 & 2) != 0) {
            i5 = 0;
        }
        AbstractC3340k.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? x0(charSequence, new char[]{c10}, i5, false) : ((String) charSequence).indexOf(c10, i5);
    }

    public static /* synthetic */ int w0(CharSequence charSequence, String str, int i5, boolean z2, int i10) {
        if ((i10 & 2) != 0) {
            i5 = 0;
        }
        if ((i10 & 4) != 0) {
            z2 = false;
        }
        return t0(charSequence, str, i5, z2);
    }

    public static final int x0(CharSequence charSequence, char[] cArr, int i5, boolean z2) {
        AbstractC3340k.e(charSequence, "<this>");
        if (!z2 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ff.m.D0(cArr), i5);
        }
        if (i5 < 0) {
            i5 = 0;
        }
        int iS0 = s0(charSequence);
        if (i5 > iS0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i5);
            for (char c10 : cArr) {
                if (tg.b.x(c10, cCharAt, z2)) {
                    return i5;
                }
            }
            if (i5 == iS0) {
                return -1;
            }
            i5++;
        }
    }

    public static boolean y0(CharSequence charSequence) {
        AbstractC3340k.e(charSequence, "<this>");
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            if (!tg.b.I(charSequence.charAt(i5))) {
                return false;
            }
        }
        return true;
    }

    public static char z0(CharSequence charSequence) {
        AbstractC3340k.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(s0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
