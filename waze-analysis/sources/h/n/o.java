package h.n;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.credentials.provider.CredentialEntry;
import androidx.media3.common.C;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.navigate.location_preview.an;
import h.g.b.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.z;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final /* synthetic */ class o {
    public static String A(String str, char c2, String str2) {
        x.f(str, "<this>");
        x.f(str2, "missingDelimiterValue");
        int iW = W(str, c2, 0, 6);
        if (iW == -1) {
            return str2;
        }
        String strSubstring = str.substring(iW + 1, str.length());
        x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String B(String str, String str2, String str3) {
        x.f(str, "<this>");
        x.f(str2, TtmlNode.RUBY_DELIMITER);
        x.f(str3, "missingDelimiterValue");
        int iX = X(str, str2, 0, false, 6);
        if (iX == -1) {
            return str3;
        }
        String strSubstring = str.substring(iX + str2.length(), str.length());
        x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String C(String str, char c2, String str2) {
        x.f(str, "<this>");
        x.f(str2, "missingDelimiterValue");
        int iY = Y(str, c2, 0, 6);
        if (iY == -1) {
            return str2;
        }
        String strSubstring = str.substring(iY + 1, str.length());
        x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static List D(CharSequence charSequence) {
        x.f(charSequence, "<this>");
        return h.m.k.j(E(charSequence));
    }

    public static h.m.h E(CharSequence charSequence) {
        x.f(charSequence, "<this>");
        return new n(charSequence);
    }

    public static boolean F(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        x.f(charSequence, "<this>");
        x.f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (X(charSequence, (String) charSequence2, 0, z, 2) >= 0) {
                return true;
            }
        } else if (V(charSequence, charSequence2, 0, charSequence.length(), z) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean G(CharSequence charSequence) {
        x.f(charSequence, "<this>");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (!h.m.k.w(charSequence.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean H(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z) {
        x.f(charSequence, "<this>");
        x.f(charSequence2, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > charSequence2.length() - i4) {
            return false;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (!h.m.k.x(charSequence.charAt(i2 + i5), charSequence2.charAt(i3 + i5), z)) {
                return false;
            }
        }
        return true;
    }

    public static char I(CharSequence charSequence) {
        x.f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(r(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static CharSequence J(CharSequence charSequence, int i2) {
        x.f(charSequence, "<this>");
        return charSequence.subSequence(0, h.k.n.i(i2, charSequence.length()));
    }

    public static Character K(CharSequence charSequence, int i2) {
        x.f(charSequence, "<this>");
        if (i2 < 0 || i2 >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i2));
    }

    public static Character L(CharSequence charSequence) {
        x.f(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(charSequence.length() - 1));
    }

    public static String M(String str, int i2) {
        x.f(str, "<this>");
        if (i2 >= 0) {
            String strSubstring = str.substring(h.k.n.i(i2, str.length()));
            x.e(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException("Requested character count " + i2 + " is less than zero.");
    }

    public static String N(String str, int i2) {
        x.f(str, "<this>");
        String strSubstring = str.substring(0, h.k.n.i(i2, str.length()));
        x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean O(CharSequence charSequence, char c2) {
        x.f(charSequence, "<this>");
        return W(charSequence, c2, 0, 2) >= 0;
    }

    public static boolean Q(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return m((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!h.m.k.x(charSequence.charAt(i2), charSequence2.charAt(i2), true)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean R(CharSequence charSequence, char c2) {
        x.f(charSequence, "<this>");
        return charSequence.length() > 0 && h.m.k.x(charSequence.charAt(r(charSequence)), c2, false);
    }

    public static /* synthetic */ boolean S(CharSequence charSequence, CharSequence charSequence2) {
        x.f(charSequence, "<this>");
        x.f(charSequence2, "suffix");
        return ((charSequence instanceof String) && (charSequence2 instanceof String)) ? l((String) charSequence, (String) charSequence2, false) : H(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), false);
    }

    static /* synthetic */ int V(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z) {
        return aq(charSequence, charSequence2, i2, i3, z, false);
    }

    public static /* synthetic */ int W(CharSequence charSequence, char c2, int i2, int i3) {
        x.f(charSequence, "<this>");
        boolean z = charSequence instanceof String;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if (z) {
            return ((String) charSequence).indexOf(c2, i2);
        }
        char[] cArr = {c2};
        x.f(charSequence, "<this>");
        x.f(cArr, "chars");
        int iH = h.k.n.h(i2, 0);
        int iR = r(charSequence);
        if (iH > iR) {
            return -1;
        }
        while (!h.m.k.x(cArr[0], charSequence.charAt(iH), false)) {
            if (iH == iR) {
                return -1;
            }
            iH++;
        }
        return iH;
    }

    public static /* synthetic */ int X(CharSequence charSequence, String str, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return s(charSequence, str, i2, z & ((i3 & 4) == 0));
    }

    public static /* synthetic */ int Y(CharSequence charSequence, char c2, int i2, int i3) {
        if ((i3 & 2) != 0) {
            x.f(charSequence, "<this>");
            i2 = charSequence.length() - 1;
        }
        x.f(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c2, i2);
        }
        char[] cArr = {c2};
        x.f(charSequence, "<this>");
        x.f(cArr, "chars");
        x.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (i2 > length) {
            i2 = length;
        }
        while (i2 >= 0) {
            if (h.m.k.x(cArr[0], charSequence.charAt(i2), false)) {
                return i2;
            }
            i2--;
        }
        return -1;
    }

    public static void Z(String str) {
        x.f(str, "input");
        throw new NumberFormatException("Invalid number format: '" + str + "'");
    }

    public static String aa(String str, int i2) {
        StringBuilder sbSubSequence;
        x.f(str, "<this>");
        String str2 = str;
        x.f(str2, "<this>");
        if (i2 <= str2.length()) {
            sbSubSequence = str2.subSequence(0, str2.length());
        } else {
            StringBuilder sb = new StringBuilder(i2);
            sb.append((CharSequence) str2);
            int length = i2 - str2.length();
            if (length > 0) {
                int i3 = 1;
                while (true) {
                    sb.append(' ');
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
            sbSubSequence = sb;
        }
        return sbSubSequence.toString();
    }

    public static String ab(String str) {
        x.f(str, "<this>");
        x.f("    ", "indent");
        return h.m.k.u(h.m.k.o(E(str), new com.waze.uid.b(9)), "\n");
    }

    public static String ac(String str, String str2, String str3) {
        x.f(str, "<this>");
        x.f(str2, "oldValue");
        x.f(str3, "newValue");
        String str4 = str;
        int iS = s(str4, str2, 0, false);
        if (iS < 0) {
            return str;
        }
        int length = str2.length();
        int iH = h.k.n.h(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str4, i2, iS);
            sb.append(str3);
            i2 = iS + length;
            if (iS >= str.length()) {
                break;
            }
            iS = s(str4, str2, iS + iH, false);
        } while (iS > 0);
        sb.append((CharSequence) str4, i2, str.length());
        String string = sb.toString();
        x.e(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String ad(String str, char c2, char c3) {
        x.f(str, "<this>");
        String strReplace = str.replace(c2, c3);
        x.e(strReplace, "replace(...)");
        return strReplace;
    }

    public static /* synthetic */ List ae(CharSequence charSequence, char[] cArr) {
        x.f(charSequence, "<this>");
        x.f(cArr, "delimiters");
        return as(charSequence, String.valueOf(cArr[0]), 0);
    }

    public static /* synthetic */ List af(CharSequence charSequence, String[] strArr, int i2, int i3) {
        x.f(charSequence, "<this>");
        x.f(strArr, "delimiters");
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return as(charSequence, str, i2);
            }
        }
        c cVar = new c(charSequence, i2, new an(h.a.c.i(strArr), 7));
        x.f(cVar, "<this>");
        h.m.m<h.k.j> mVar = new h.m.m(cVar);
        ArrayList arrayList = new ArrayList(h.a.i.q(mVar, 10));
        for (h.k.j jVar : mVar) {
            x.f(charSequence, "<this>");
            x.f(jVar, "range");
            arrayList.add(charSequence.subSequence(jVar.getStart().intValue(), jVar.getEndInclusive().intValue() + 1).toString());
        }
        return arrayList;
    }

    public static /* synthetic */ boolean ag(String str, String str2, int i2) {
        return p(str, str2, i2, false);
    }

    public static /* synthetic */ boolean ah(String str, String str2) {
        return o(str, str2, false);
    }

    public static /* synthetic */ String ai(String str, char c2) {
        x.f(str, "<this>");
        x.f(str, "missingDelimiterValue");
        int iW = W(str, c2, 0, 6);
        if (iW == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iW);
        x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String aj(String str) {
        x.f(str, "<this>");
        x.f(str, "missingDelimiterValue");
        int iY = Y(str, '.', 0, 6);
        if (iY == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iY);
        x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static void ak(CharSequence charSequence, Collection collection) {
        x.f(charSequence, "<this>");
        x.f(collection, "destination");
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            collection.add(Character.valueOf(charSequence.charAt(i2)));
        }
    }

    public static /* synthetic */ String al(String str) throws IOException {
        x.f(str, "<this>");
        x.f("|", "marginPrefix");
        x.f(str, "<this>");
        x.f("", "newIndent");
        x.f("|", "marginPrefix");
        if (G("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List listD = D(str);
        int length = str.length();
        listD.size();
        h.g.a.l lVarAr = ar();
        int iE = h.a.i.e(listD);
        ArrayList arrayList = new ArrayList();
        Iterator it = listD.iterator();
        int i2 = 0;
        while (true) {
            String strSubstring = null;
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(length);
                h.a.i.aV(arrayList, sb, "\n", null, 124);
                return sb.toString();
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.a.i.p();
            }
            String str2 = (String) next;
            if ((i2 != 0 && i2 != iE) || !G(str2)) {
                String str3 = str2;
                int length2 = str3.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i4 = -1;
                        break;
                    }
                    if (!h.m.k.w(str3.charAt(i4))) {
                        break;
                    }
                    i4++;
                }
                if (i4 != -1 && ag(str2, "|", i4)) {
                    x.d(str2, "null cannot be cast to non-null type java.lang.String");
                    strSubstring = str2.substring(i4 + 1);
                    x.e(strSubstring, "substring(...)");
                }
                if (strSubstring == null || (strSubstring = (String) lVarAr.invoke(strSubstring)) == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList.add(strSubstring);
            }
            i2 = i3;
        }
    }

    public static /* synthetic */ int am(CharSequence charSequence, String str) {
        int iR = r(charSequence);
        x.f(charSequence, "<this>");
        x.f(str, TypedValues.Custom.S_STRING);
        return !(charSequence instanceof String) ? aq(charSequence, str, iR, 0, false, true) : ((String) charSequence).lastIndexOf(str, iR);
    }

    public static final /* synthetic */ g an(Matcher matcher, int i2, CharSequence charSequence) {
        if (matcher.find(i2)) {
            return new j(matcher, charSequence);
        }
        return null;
    }

    public static final String ao(String str) {
        x.f(str, "literal");
        String strQuote = Pattern.quote(str);
        x.e(strQuote, "quote(...)");
        return strQuote;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean ap(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h.n.o.ap(java.lang.String):boolean");
    }

    private static int aq(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2) {
        h.k.j jVar = !z2 ? new h.k.j(h.k.n.h(i2, 0), h.k.n.i(i3, charSequence.length())) : new h.k.h(h.k.n.i(i2, r(charSequence)), h.k.n.h(i3, 0), -1);
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iA = jVar.a();
            int iB = jVar.b();
            int iC = jVar.c();
            if ((iC > 0 && iA <= iB) || (iC < 0 && iB <= iA)) {
                int i4 = iA;
                while (true) {
                    String str = (String) charSequence2;
                    if (!n(str, 0, (String) charSequence, i4, str.length(), z)) {
                        if (i4 == iB) {
                            break;
                        }
                        i4 += iC;
                    } else {
                        return i4;
                    }
                }
            }
        } else {
            int iA2 = jVar.a();
            int iB2 = jVar.b();
            int iC2 = jVar.c();
            if ((iC2 > 0 && iA2 <= iB2) || (iC2 < 0 && iB2 <= iA2)) {
                int i5 = iA2;
                while (!H(charSequence2, 0, charSequence, i5, charSequence2.length(), z)) {
                    if (i5 != iB2) {
                        i5 += iC2;
                    }
                }
                return i5;
            }
        }
        return -1;
    }

    private static h.g.a.l ar() {
        return "".length() == 0 ? new z(1) : new com.waze.uid.b(10, (byte[]) null);
    }

    private static List as(CharSequence charSequence, String str, int i2) {
        int iS = s(charSequence, str, 0, false);
        if (iS != -1) {
            if (i2 != 1) {
                boolean z = i2 > 0;
                ArrayList arrayList = new ArrayList(z ? i2 : 10);
                int length = 0;
                do {
                    arrayList.add(charSequence.subSequence(length, iS).toString());
                    length = str.length() + iS;
                    if (z && arrayList.size() == i2 - 1) {
                        break;
                    }
                    iS = s(charSequence, str, length, false);
                } while (iS != -1);
                arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
                return arrayList;
            }
        }
        return h.a.i.d(charSequence.toString());
    }

    public static final void b(Appendable appendable, Object obj, h.g.a.l lVar) throws IOException {
        x.f(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }

    public static String c(String str) throws IOException {
        int length;
        String strM;
        x.f(str, "<this>");
        x.f(str, "<this>");
        x.f("", "newIndent");
        List listD = D(str);
        List list = listD;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!G((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(h.a.i.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            String str3 = str2;
            int length2 = str3.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!h.m.k.w(str3.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList3.add(Integer.valueOf(length));
        }
        Integer num = (Integer) h.a.i.K(arrayList3);
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listD.size();
        h.g.a.l lVarAr = ar();
        int iE = h.a.i.e(listD);
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = list.iterator();
        while (true) {
            String str4 = null;
            if (!it2.hasNext()) {
                StringBuilder sb = new StringBuilder(length3);
                h.a.i.aV(arrayList4, sb, "\n", null, 124);
                return sb.toString();
            }
            Object next = it2.next();
            int i2 = length + 1;
            if (length < 0) {
                h.a.i.p();
            }
            String str5 = (String) next;
            if (((length != 0 && length != iE) || !G(str5)) && ((strM = M(str5, iIntValue)) == null || (str4 = (String) lVarAr.invoke(strM)) == null)) {
                str4 = str5;
            }
            if (str4 != null) {
                arrayList4.add(str4);
            }
            length = i2;
        }
    }

    public static Double d(String str) {
        x.f(str, "<this>");
        try {
            if (ap(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static Float e(String str) {
        x.f(str, "<this>");
        try {
            if (ap(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static Integer f(String str) {
        x.f(str, "<this>");
        return g(str, 10);
    }

    public static Integer g(String str, int i2) {
        boolean z;
        int i3;
        int i4;
        x.f(str, "<this>");
        h.m.k.y(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char cCharAt = str.charAt(0);
        int iA = x.a(cCharAt, 48);
        int i6 = C.RATE_UNSET_INT;
        if (iA < 0) {
            i3 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i6 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i3 = 0;
        }
        int i7 = -59652323;
        while (i3 < length) {
            int iDigit = Character.digit((int) str.charAt(i3), i2);
            if (iDigit < 0) {
                return null;
            }
            if ((i5 < i7 && (i7 != -59652323 || i5 < (i7 = i6 / i2))) || (i4 = i5 * i2) < i6 + iDigit) {
                return null;
            }
            i5 = i4 - iDigit;
            i3++;
        }
        return z ? Integer.valueOf(i5) : Integer.valueOf(-i5);
    }

    public static Long h(String str) {
        int i2;
        x.f(str, "<this>");
        x.f(str, "<this>");
        int i3 = 10;
        h.m.k.y(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        boolean z = false;
        char cCharAt = str.charAt(0);
        int iA = x.a(cCharAt, 48);
        long j2 = C.TIME_UNSET;
        if (iA < 0) {
            i2 = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt != '+') {
                if (cCharAt != '-') {
                    return null;
                }
                j2 = Long.MIN_VALUE;
                z = true;
            }
        } else {
            i2 = 0;
        }
        long j3 = 0;
        long j4 = -256204778801521550L;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i3);
            if (iDigit < 0) {
                return null;
            }
            if (j3 < j4) {
                if (j4 == -256204778801521550L) {
                    j4 = -922337203685477580L;
                    if (j3 < -922337203685477580L) {
                    }
                }
                return null;
            }
            long j5 = j3 * 10;
            int i4 = length;
            long j6 = iDigit;
            if (j5 < j2 + j6) {
                return null;
            }
            j3 = j5 - j6;
            i2++;
            length = i4;
            i3 = 10;
        }
        return z ? Long.valueOf(j3) : Long.valueOf(-j3);
    }

    public static String i(char[] cArr) {
        x.f(cArr, "<this>");
        return new String(cArr);
    }

    public static String j(CharSequence charSequence, int i2) {
        x.f(charSequence, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException("Count 'n' must be non-negative, but was " + i2 + ".");
        }
        if (i2 == 0) {
            return "";
        }
        int i3 = 1;
        if (i2 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb = new StringBuilder(charSequence.length() * i2);
            if (i2 > 0) {
                while (true) {
                    sb.append(charSequence);
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
            return sb.toString();
        }
        char cCharAt = charSequence.charAt(0);
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = cCharAt;
        }
        return new String(cArr);
    }

    public static boolean k(CharSequence charSequence, CharSequence charSequence2) {
        boolean z = charSequence instanceof String;
        if (z && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        if (z && (charSequence2 instanceof String)) {
            return x.n(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i2) != charSequence2.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean l(String str, String str2, boolean z) {
        x.f(str, "<this>");
        x.f(str2, "suffix");
        return !z ? str.endsWith(str2) : n(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static boolean m(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static boolean n(String str, int i2, String str2, int i3, int i4, boolean z) {
        x.f(str, "<this>");
        x.f(str2, "other");
        return !z ? str.regionMatches(i2, str2, i3, i4) : str.regionMatches(true, i2, str2, i3, i4);
    }

    public static boolean o(String str, String str2, boolean z) {
        x.f(str, "<this>");
        x.f(str2, "prefix");
        return !z ? str.startsWith(str2) : n(str, 0, str2, 0, str2.length(), true);
    }

    public static boolean p(String str, String str2, int i2, boolean z) {
        x.f(str, "<this>");
        x.f(str2, "prefix");
        return !z ? str.startsWith(str2, i2) : n(str, i2, str2, 0, str2.length(), true);
    }

    public static byte[] q(String str) {
        x.f(str, "<this>");
        byte[] bytes = str.getBytes(a.f48221b);
        x.e(bytes, "getBytes(...)");
        return bytes;
    }

    public static int r(CharSequence charSequence) {
        x.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static int s(CharSequence charSequence, String str, int i2, boolean z) {
        x.f(charSequence, "<this>");
        x.f(str, TypedValues.Custom.S_STRING);
        return (z || !(charSequence instanceof String)) ? V(charSequence, str, i2, charSequence.length(), z) : ((String) charSequence).indexOf(str, i2);
    }

    public static Boolean t(String str) {
        x.f(str, "<this>");
        if (x.n(str, CredentialEntry.TRUE_STRING)) {
            return true;
        }
        return !x.n(str, CredentialEntry.FALSE_STRING) ? null : false;
    }

    public static CharSequence u(CharSequence charSequence, int i2, int i3, CharSequence charSequence2) {
        x.f(charSequence, "<this>");
        x.f(charSequence2, "replacement");
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("End index (" + i3 + ") is less than start index (" + i2 + ").");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence, 0, i2);
        x.e(sb, "append(...)");
        sb.append(charSequence2);
        sb.append(charSequence, i3, charSequence.length());
        x.e(sb, "append(...)");
        return sb;
    }

    public static CharSequence v(CharSequence charSequence) {
        x.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean zW = h.m.k.w(charSequence.charAt(true != z ? i2 : length));
            if (z) {
                if (!zW) {
                    break;
                }
                length--;
            } else if (zW) {
                i2++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static String w(String str, int i2, char c2) {
        StringBuilder sbSubSequence;
        x.f(str, "<this>");
        String str2 = str;
        x.f(str2, "<this>");
        if (i2 <= str2.length()) {
            sbSubSequence = str2.subSequence(0, str2.length());
        } else {
            StringBuilder sb = new StringBuilder(i2);
            int length = i2 - str2.length();
            if (length > 0) {
                int i3 = 1;
                while (true) {
                    sb.append(c2);
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
            sb.append((CharSequence) str2);
            sbSubSequence = sb;
        }
        return sbSubSequence.toString();
    }

    public static String x(String str, CharSequence charSequence) {
        CharSequence charSequence2;
        boolean zH;
        x.f(str, "<this>");
        x.f(charSequence, "prefix");
        String str2 = str;
        x.f(str2, "<this>");
        x.f(charSequence, "prefix");
        if ((str2 instanceof String) && (charSequence instanceof String)) {
            zH = ah(str2, (String) charSequence);
            charSequence2 = charSequence;
        } else {
            charSequence2 = charSequence;
            zH = H(str2, 0, charSequence2, 0, charSequence.length(), false);
        }
        if (!zH) {
            return str;
        }
        String strSubstring = str.substring(charSequence2.length());
        x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String y(String str, CharSequence charSequence) {
        x.f(str, "<this>");
        x.f(charSequence, "suffix");
        if (!S(str, charSequence)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String z(String str, h.k.j jVar) {
        x.f(str, "<this>");
        x.f(jVar, "range");
        String strSubstring = str.substring(jVar.getStart().intValue(), jVar.getEndInclusive().intValue() + 1);
        x.e(strSubstring, "substring(...)");
        return strSubstring;
    }
}
