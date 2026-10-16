package Jd;

import A7.AbstractC0279p0;
import Cd.s0;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.List;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import vf.AbstractC4345a;

/* loaded from: classes5.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final List f6017a = AbstractC3935e.C("");

    public static final int a(int i5, int i10, String str) {
        boolean z2 = false;
        while (i5 < i10) {
            char cCharAt = str.charAt(i5);
            if (cCharAt != ':') {
                if (cCharAt == '[') {
                    z2 = true;
                } else if (cCharAt == ']') {
                    z2 = false;
                }
            } else if (!z2) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public static final void b(B b5, String urlString) {
        AbstractC3340k.e(b5, "<this>");
        AbstractC3340k.e(urlString, "urlString");
        if (Bf.k.y0(urlString)) {
            return;
        }
        try {
            c(b5, urlString);
        } catch (Throwable th) {
            throw new s0("Fail to parse url: ".concat(urlString), th, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.List] */
    public static final void c(B b5, String urlString) throws NumberFormatException {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        List listH0;
        int iIntValue;
        int i15;
        int i16 = 1;
        AbstractC3340k.e(b5, "<this>");
        AbstractC3340k.e(urlString, "urlString");
        int length = urlString.length();
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                i17 = -1;
                break;
            } else if (!tg.b.I(urlString.charAt(i17))) {
                break;
            } else {
                i17++;
            }
        }
        int length2 = urlString.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i18 = length2 - 1;
                if (!tg.b.I(urlString.charAt(length2))) {
                    break;
                } else if (i18 < 0) {
                    break;
                } else {
                    length2 = i18;
                }
            }
            length2 = -1;
        } else {
            length2 = -1;
        }
        int i19 = length2 + 1;
        char cCharAt = urlString.charAt(i17);
        char c10 = 'A';
        if (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')) {
            i5 = i17;
            i10 = i5;
        } else {
            i10 = -1;
            i5 = i17;
        }
        while (true) {
            i11 = i16;
            if (i5 >= i19) {
                break;
            }
            char cCharAt2 = urlString.charAt(i5);
            if (cCharAt2 == ':') {
                if (i10 != -1) {
                    throw new IllegalArgumentException(AbstractC3256n.g(i10, "Illegal character in scheme at position "));
                }
                i12 = i5 - i17;
            } else {
                if (cCharAt2 == '#' || cCharAt2 == '/' || cCharAt2 == '?') {
                    break;
                }
                if (i10 == -1 && (('a' > cCharAt2 || cCharAt2 >= '{') && (('A' > cCharAt2 || cCharAt2 >= '[') && (('0' > cCharAt2 || cCharAt2 >= ':') && cCharAt2 != '.' && cCharAt2 != '+' && cCharAt2 != '-')))) {
                    i10 = i5;
                }
                i5++;
                i16 = i11;
            }
        }
        i12 = -1;
        if (i12 > 0) {
            String strSubstring = urlString.substring(i17, i17 + i12);
            AbstractC3340k.d(strSubstring, "substring(...)");
            D d3 = D.f6018c;
            int length3 = strSubstring.length();
            int i20 = 0;
            while (true) {
                if (i20 >= length3) {
                    i20 = -1;
                    break;
                }
                char cCharAt3 = strSubstring.charAt(i20);
                if ((('A' > cCharAt3 || cCharAt3 >= '[') ? (cCharAt3 < 0 || cCharAt3 >= 128) ? Character.toLowerCase(cCharAt3) : cCharAt3 : (char) (cCharAt3 + ' ')) != cCharAt3) {
                    break;
                } else {
                    i20++;
                }
            }
            if (i20 != -1) {
                StringBuilder sb2 = new StringBuilder(strSubstring.length());
                sb2.append((CharSequence) strSubstring, 0, i20);
                int iS0 = Bf.k.s0(strSubstring);
                if (i20 <= iS0) {
                    while (true) {
                        char cCharAt4 = strSubstring.charAt(i20);
                        if (c10 <= cCharAt4 && cCharAt4 < '[') {
                            cCharAt4 = (char) (cCharAt4 + ' ');
                        } else if (cCharAt4 < 0 || cCharAt4 >= 128) {
                            cCharAt4 = Character.toLowerCase(cCharAt4);
                        }
                        sb2.append(cCharAt4);
                        if (i20 == iS0) {
                            break;
                        }
                        i20++;
                        c10 = 'A';
                    }
                }
                strSubstring = sb2.toString();
            }
            D d5 = (D) D.f6019d.get(strSubstring);
            if (d5 == null) {
                d5 = new D(strSubstring, 0);
            }
            b5.f6010d = d5;
            i17 += i12 + 1;
        }
        if (AbstractC3340k.a(b5.c().f6020a, JsonStorageKeyNames.DATA_KEY)) {
            String strSubstring2 = urlString.substring(i17, i19);
            AbstractC3340k.d(strSubstring2, "substring(...)");
            b5.f6007a = strSubstring2;
            return;
        }
        int i21 = 0;
        while (true) {
            i13 = i17 + i21;
            if (i13 >= i19 || urlString.charAt(i13) != '/') {
                break;
            } else {
                i21++;
            }
        }
        if (AbstractC3340k.a(b5.c().f6020a, "file")) {
            if (i21 == i11) {
                b5.f6007a = "";
                String strSubstring3 = urlString.substring(i13, i19);
                AbstractC3340k.d(strSubstring3, "substring(...)");
                AbstractC4345a.L(b5, strSubstring3);
                return;
            }
            if (i21 != 2) {
                if (i21 != 3) {
                    throw new IllegalArgumentException("Invalid file url: ".concat(urlString));
                }
                b5.f6007a = "";
                String strSubstring4 = urlString.substring(i13, i19);
                AbstractC3340k.d(strSubstring4, "substring(...)");
                AbstractC4345a.L(b5, "/".concat(strSubstring4));
                return;
            }
            int iV0 = Bf.k.v0(urlString, '/', i13, 4);
            if (iV0 == -1 || iV0 == i19) {
                String strSubstring5 = urlString.substring(i13, i19);
                AbstractC3340k.d(strSubstring5, "substring(...)");
                b5.f6007a = strSubstring5;
                return;
            } else {
                String strSubstring6 = urlString.substring(i13, iV0);
                AbstractC3340k.d(strSubstring6, "substring(...)");
                b5.f6007a = strSubstring6;
                String strSubstring7 = urlString.substring(iV0, i19);
                AbstractC3340k.d(strSubstring7, "substring(...)");
                AbstractC4345a.L(b5, strSubstring7);
                return;
            }
        }
        if (AbstractC3340k.a(b5.c().f6020a, "mailto")) {
            if (i21 != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int iW0 = Bf.k.w0(urlString, "@", i13, false, 4);
            if (iW0 == -1) {
                throw new IllegalArgumentException(AbstractC0279p0.l("Invalid mailto url: ", urlString, ", it should contain '@'."));
            }
            String strSubstring8 = urlString.substring(i13, iW0);
            AbstractC3340k.d(strSubstring8, "substring(...)");
            String strC = AbstractC0668b.c(strSubstring8);
            b5.f6011e = strC != null ? AbstractC0668b.e(strC, false) : null;
            String strSubstring9 = urlString.substring(iW0 + 1, i19);
            AbstractC3340k.d(strSubstring9, "substring(...)");
            b5.f6007a = strSubstring9;
            return;
        }
        if (AbstractC3340k.a(b5.c().f6020a, "about")) {
            if (i21 != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strSubstring10 = urlString.substring(i13, i19);
            AbstractC3340k.d(strSubstring10, "substring(...)");
            b5.f6007a = strSubstring10;
            return;
        }
        if (AbstractC3340k.a(b5.c().f6020a, "tel")) {
            if (i21 != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strSubstring11 = urlString.substring(i13, i19);
            AbstractC3340k.d(strSubstring11, "substring(...)");
            b5.f6007a = strSubstring11;
            return;
        }
        if (i21 >= 2) {
            while (true) {
                char[] cArr = new char[5];
                int i22 = 0;
                for (int i23 = 5; i22 < i23; i23 = 5) {
                    cArr[i22] = "@/\\?#".charAt(i22);
                    i22++;
                }
                int iX0 = Bf.k.x0(urlString, cArr, i13, false);
                Integer numValueOf = Integer.valueOf(iX0);
                if (iX0 <= 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : i19;
                if (iIntValue >= i19 || urlString.charAt(iIntValue) != '@') {
                    break;
                }
                int iA = a(i13, iIntValue, urlString);
                if (iA != -1) {
                    String strSubstring12 = urlString.substring(i13, iA);
                    AbstractC3340k.d(strSubstring12, "substring(...)");
                    b5.f6011e = strSubstring12;
                    String strSubstring13 = urlString.substring(iA + 1, iIntValue);
                    AbstractC3340k.d(strSubstring13, "substring(...)");
                    b5.f6012f = strSubstring13;
                } else {
                    String strSubstring14 = urlString.substring(i13, iIntValue);
                    AbstractC3340k.d(strSubstring14, "substring(...)");
                    b5.f6011e = strSubstring14;
                }
                i13 = iIntValue + 1;
            }
            int iA2 = a(i13, iIntValue, urlString);
            Integer numValueOf2 = Integer.valueOf(iA2);
            if (iA2 <= 0) {
                numValueOf2 = null;
            }
            int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : iIntValue;
            String strSubstring15 = urlString.substring(i13, iIntValue2);
            AbstractC3340k.d(strSubstring15, "substring(...)");
            b5.f6007a = strSubstring15;
            int i24 = iIntValue2 + 1;
            if (i24 < iIntValue) {
                String strSubstring16 = urlString.substring(i24, iIntValue);
                AbstractC3340k.d(strSubstring16, "substring(...)");
                i15 = Integer.parseInt(strSubstring16);
            } else {
                i15 = 0;
            }
            b5.d(i15);
            i13 = iIntValue;
        }
        ff.v vVar = ff.v.f35432a;
        ?? r72 = f6017a;
        if (i13 >= i19) {
            if (urlString.charAt(length2) == '/') {
                vVar = r72;
            }
            AbstractC3340k.e(vVar, "<set-?>");
            b5.f6014h = vVar;
            return;
        }
        b5.f6014h = i21 == 0 ? ff.o.m0(b5.f6014h) : vVar;
        char[] cArr2 = new char[2];
        for (int i25 = 0; i25 < 2; i25++) {
            cArr2[i25] = "?#".charAt(i25);
        }
        int iX02 = Bf.k.x0(urlString, cArr2, i13, false);
        Integer numValueOf3 = Integer.valueOf(iX02);
        if (iX02 <= 0) {
            numValueOf3 = null;
        }
        int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : i19;
        if (iIntValue3 > i13) {
            String strSubstring17 = urlString.substring(i13, iIntValue3);
            AbstractC3340k.d(strSubstring17, "substring(...)");
            List list = (b5.f6014h.size() == 1 && ((CharSequence) ff.o.q0(b5.f6014h)).length() == 0) ? vVar : b5.f6014h;
            if (strSubstring17.equals("/")) {
                listH0 = r72;
                i14 = 1;
            } else {
                i14 = 1;
                listH0 = Bf.k.H0(strSubstring17, new char[]{'/'});
            }
            if (i21 == i14) {
                vVar = r72;
            }
            b5.f6014h = ff.o.E0(ff.o.E0(listH0, vVar), list);
            i13 = iIntValue3;
        }
        if (i13 < i19 && urlString.charAt(i13) == '?') {
            int i26 = i13 + 1;
            if (i26 == i19) {
                b5.f6008b = true;
                i13 = i19;
            } else {
                int iV02 = Bf.k.v0(urlString, '#', i26, 4);
                Integer numValueOf4 = iV02 > 0 ? Integer.valueOf(iV02) : null;
                int iIntValue4 = numValueOf4 != null ? numValueOf4.intValue() : i19;
                String strSubstring18 = urlString.substring(i26, iIntValue4);
                AbstractC3340k.d(strSubstring18, "substring(...)");
                tg.b.L(strSubstring18).d(new Bf.s(b5, 5));
                i13 = iIntValue4;
            }
        }
        if (i13 >= i19 || urlString.charAt(i13) != '#') {
            return;
        }
        String strSubstring19 = urlString.substring(i13 + 1, i19);
        AbstractC3340k.d(strSubstring19, "substring(...)");
        b5.f6013g = strSubstring19;
    }
}
