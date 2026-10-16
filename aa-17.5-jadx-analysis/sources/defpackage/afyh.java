package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class afyh {
    private afyh() {
    }

    public static boolean A(CharSequence charSequence, char c) {
        charSequence.getClass();
        return D(charSequence, c, 0) >= 0;
    }

    public static boolean B(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && afuq.b(charSequence.charAt(i(charSequence)), c, false);
    }

    public static boolean C(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence instanceof String ? ((String) charSequence).endsWith((String) charSequence2) : w(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), false);
    }

    public static int D(CharSequence charSequence, char c, int i) {
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (!afuq.b(cArr[0], charSequence.charAt(i), false)) {
            if (i == length) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public static /* synthetic */ int E(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = charSequence.length() - 1;
        }
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (i >= 0) {
            if (afuq.b(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static /* synthetic */ int F(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = i(charSequence);
        }
        charSequence.getClass();
        return ((String) charSequence).lastIndexOf(str, i);
    }

    public static String G(String str, int i) {
        CharSequence charSequenceSubSequence;
        str.getClass();
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            if (length > 0) {
                int i2 = 1;
                while (true) {
                    sb.append('0');
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    public static String H(String str) {
        return afrg.u(afrg.q(new afbb(str, 6), new xrr(7)), "\n");
    }

    public static String I(String str, char c, char c2) {
        str.getClass();
        String strReplace = str.replace(c, c2);
        strReplace.getClass();
        return strReplace;
    }

    public static String J(String str, String str2, String str3) {
        str.getClass();
        int iJ = j(str, str2, 0, false);
        if (iJ < 0) {
            return str;
        }
        int length = str2.length();
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i = 0;
        do {
            sb.append((CharSequence) str, i, iJ);
            sb.append(str3);
            i = iJ + length;
            if (iJ >= str.length()) {
                break;
            }
            iJ = j(str, str2, i, false);
        } while (iJ > 0);
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    public static List K(CharSequence charSequence, char[] cArr, int i) {
        charSequence.getClass();
        return U(charSequence, String.valueOf(cArr[0]), i);
    }

    public static List L(CharSequence charSequence, String[] strArr, int i) {
        charSequence.getClass();
        String str = strArr[0];
        if (str.length() > 0) {
            return U(charSequence, str, i);
        }
        airu<afha> airuVar = new airu(new aisg(charSequence, i, new tbk(woy.cD(strArr), 6)), 0);
        ArrayList arrayList = new ArrayList(woy.bp(airuVar, 10));
        for (afha afhaVar : airuVar) {
            afhaVar.getClass();
            arrayList.add(charSequence.subSequence(afhaVar.f().intValue(), afhaVar.e().intValue() + 1).toString());
        }
        return arrayList;
    }

    public static boolean M(CharSequence charSequence, char c) {
        return charSequence.length() > 0 && afuq.b(charSequence.charAt(0), c, false);
    }

    public static String N(String str, String str2) {
        int iD = D(str, '$', 0);
        if (iD == -1) {
            return str2;
        }
        String strSubstring = str.substring(iD + 1, str.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static String O(String str, String str2) {
        str.getClass();
        str2.getClass();
        int iF = F(str, ".", 0, 6);
        if (iF == -1) {
            return str2;
        }
        String strSubstring = str.substring(iF + 1, str.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static Long P(String str) {
        int i;
        int length = str.length();
        if (length == 0) {
            return null;
        }
        boolean z = false;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (cCharAt < '0') {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt != '+') {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                z = true;
            }
        } else {
            i = 0;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 == -256204778801521550L) {
                    j3 = -922337203685477580L;
                    if (j2 < -922337203685477580L) {
                    }
                }
                return null;
            }
            long j4 = j2 * 10;
            long j5 = iDigit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }

    public static String Q(String str) throws IOException {
        String str2;
        if (v("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listT = t(str);
        listT.size();
        afec afecVarT = T();
        int iBh = woy.bh(listT);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : listT) {
            int i2 = i + 1;
            if (i < 0) {
                woy.bo();
            }
            String str3 = (String) obj;
            String strSubstring = null;
            if ((i == 0 || i == iBh) && v(str3)) {
                str3 = null;
            } else {
                int length = str3.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        i3 = -1;
                        break;
                    }
                    if (!afuq.a(str3.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && h(str3, "|", i3, false)) {
                    str3.getClass();
                    strSubstring = str3.substring(i3 + 1);
                    strSubstring.getClass();
                }
                if (strSubstring != null && (str2 = (String) afecVarT.invoke(strSubstring)) != null) {
                    str3 = str2;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(str.length());
        woy.ct(arrayList, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    public static boolean R(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static int S(int i) {
        if (i == 99) {
            return 100;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            default:
                return 0;
        }
    }

    private static afec T() {
        return "".length() == 0 ? new airt(2) : new xrr(8, (byte[]) null);
    }

    private static List U(CharSequence charSequence, String str, int i) {
        int iJ = j(charSequence, str, 0, false);
        if (iJ != -1) {
            if (i != 1) {
                boolean z = i > 0;
                ArrayList arrayList = new ArrayList(z ? i : 10);
                int length = 0;
                do {
                    arrayList.add(charSequence.subSequence(length, iJ).toString());
                    length = str.length() + iJ;
                    if (z && arrayList.size() == i - 1) {
                        break;
                    }
                    iJ = j(charSequence, str, length, false);
                } while (iJ != -1);
                arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
                return arrayList;
            }
        }
        return woy.bg(charSequence.toString());
    }

    public static String a(String str) throws IOException {
        int length;
        List listT = t(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listT) {
            if (!v((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(woy.bp(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!afuq.a(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList2.add(Integer.valueOf(length));
        }
        Integer num = (Integer) woy.bB(arrayList2);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listT.size();
        afec afecVarT = T();
        int iBh = woy.bh(listT);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listT) {
            int i = length + 1;
            if (length < 0) {
                woy.bo();
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iBh) && v(str3)) {
                str3 = null;
            } else {
                str3.getClass();
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(a.bn(iIntValue, "Requested character count ", " is less than zero."));
                }
                String strSubstring = str3.substring(afpt.f(iIntValue, str3.length()));
                strSubstring.getClass();
                String str4 = (String) afecVarT.invoke(strSubstring);
                if (str4 != null) {
                    str3 = str4;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        woy.ct(arrayList3, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0136, code lost:
    
        if (r3 <= r2) goto L118;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011a A[Catch: NumberFormatException -> 0x0174, PHI: r5
  0x011a: PHI (r5v5 int) = (r5v4 int), (r5v7 int) binds: [B:69:0x00be, B:105:0x0118] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {NumberFormatException -> 0x0174, blocks: (B:138:0x0169, B:72:0x00c3, B:74:0x00cc, B:76:0x00d1, B:78:0x00d7, B:80:0x00dc, B:82:0x00e5, B:89:0x00f4, B:98:0x0108, B:100:0x010e, B:92:0x00fb, B:106:0x011a, B:121:0x013c, B:123:0x0142, B:129:0x014f, B:131:0x0158, B:134:0x015f, B:125:0x0148), top: B:145:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Double b(java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afyh.b(java.lang.String):java.lang.Double");
    }

    public static Integer c(String str) {
        boolean z;
        int i;
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        int i3 = -2147483647;
        if (cCharAt < '0') {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i3 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i4 = -59652323;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (i2 < i4) {
                if (i4 == -59652323) {
                    i4 = -214748364;
                    if (i2 < -214748364) {
                    }
                }
                return null;
            }
            int i5 = i2 * 10;
            if (i5 < i3 + iDigit) {
                return null;
            }
            i2 = i5 - iDigit;
            i++;
        }
        return z ? Integer.valueOf(i2) : Integer.valueOf(-i2);
    }

    public static String d(CharSequence charSequence, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(a.bn(i, "Count 'n' must be non-negative, but was ", "."));
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i != 1) {
            int length = charSequence.length();
            if (length == 0) {
                charSequence = "";
            } else if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                if (i > 0) {
                    while (true) {
                        sb.append(charSequence);
                        if (i2 == i) {
                            break;
                        }
                        i2++;
                    }
                }
                charSequence = sb.toString();
            } else {
                char cCharAt = charSequence.charAt(0);
                char[] cArr = new char[i];
                for (int i3 = 0; i3 < i; i3++) {
                    cArr[i3] = cCharAt;
                }
                charSequence = new String(cArr);
            }
        }
        return (String) charSequence;
    }

    public static boolean e(String str, String str2, boolean z) {
        str.getClass();
        if (!z) {
            return str.endsWith(str2);
        }
        return f(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static boolean f(String str, int i, String str2, int i2, int i3, boolean z) {
        str.getClass();
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(true, i, str2, i2, i3);
    }

    public static boolean g(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.startsWith(str2) : f(str, 0, str2, 0, str2.length(), true);
    }

    public static boolean h(String str, String str2, int i, boolean z) {
        str.getClass();
        return !z ? str.startsWith(str2, i) : f(str, i, str2, 0, str2.length(), true);
    }

    public static int i(CharSequence charSequence) {
        charSequence.getClass();
        return charSequence.length() - 1;
    }

    public static int j(CharSequence charSequence, String str, int i, boolean z) {
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        int i2 = i < 0 ? 0 : i;
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        afha afhaVar = new afha(i2, length);
        if (charSequence instanceof String) {
            int i3 = afhaVar.a;
            int i4 = afhaVar.b;
            int i5 = afhaVar.c;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                return -1;
            }
            int i6 = i3;
            while (!f(str, 0, (String) charSequence, i6, str.length(), z)) {
                if (i6 == i4) {
                    return -1;
                }
                i6 += i5;
            }
            return i6;
        }
        int i7 = afhaVar.a;
        int i8 = afhaVar.b;
        int i9 = afhaVar.c;
        if ((i9 <= 0 || i7 > i8) && (i9 >= 0 || i8 > i7)) {
            return -1;
        }
        int i10 = i7;
        while (!w(str, 0, charSequence, i10, str.length(), z)) {
            if (i10 == i8) {
                return -1;
            }
            i10 += i9;
        }
        return i10;
    }

    public static CharSequence k(CharSequence charSequence) {
        charSequence.getClass();
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zA = afuq.a(charSequence.charAt(true != z ? i : length));
            if (z) {
                if (!zA) {
                    break;
                }
                length--;
            } else if (zA) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static CharSequence l(CharSequence charSequence) {
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!afuq.a(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    public static String m(String str, CharSequence charSequence) {
        str.getClass();
        charSequence.getClass();
        if (!g(str, (String) charSequence, false)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static String n(String str, CharSequence charSequence) {
        if (!C(str, charSequence)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static String o(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int iJ = j(str, str2, 0, false);
        if (iJ == -1) {
            return str3;
        }
        String strSubstring = str.substring(iJ + str2.length(), str.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static String p(String str, char c, String str2) {
        str.getClass();
        str2.getClass();
        int iE = E(str, c, 0, 6);
        if (iE == -1) {
            return str2;
        }
        String strSubstring = str.substring(iE + 1, str.length());
        strSubstring.getClass();
        return strSubstring;
    }

    public static String q(String str, char c, String str2) {
        str.getClass();
        str2.getClass();
        int iD = D(str, c, 0);
        if (iD == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iD);
        strSubstring.getClass();
        return strSubstring;
    }

    public static String r(String str, String str2, String str3) {
        str.getClass();
        str3.getClass();
        int iJ = j(str, str2, 0, false);
        if (iJ == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iJ);
        strSubstring.getClass();
        return strSubstring;
    }

    public static String s(String str, char c, String str2) {
        str.getClass();
        int iE = E(str, c, 0, 6);
        if (iE == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iE);
        strSubstring.getClass();
        return strSubstring;
    }

    public static List t(CharSequence charSequence) {
        return afrg.j(new afbb(charSequence, 6));
    }

    public static boolean u(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        return j(charSequence, (String) charSequence2, 0, z) >= 0;
    }

    public static boolean v(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!afuq.a(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean w(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!afuq.b(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static char x(CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() != 0) {
            return charSequence.charAt(charSequence.length() - 1);
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static CharSequence y(CharSequence charSequence, int i) {
        charSequence.getClass();
        return charSequence.subSequence(0, afpt.f(i, charSequence.length()));
    }

    public static String z(String str, int i) {
        str.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.bn(i, "Requested character count ", " is less than zero."));
        }
        String strSubstring = str.substring(0, afpt.f(i, str.length()));
        strSubstring.getClass();
        return strSubstring;
    }

    public /* synthetic */ afyh(afeu afeuVar) {
        this();
    }
}
