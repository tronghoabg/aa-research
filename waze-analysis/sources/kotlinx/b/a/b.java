package kotlinx.b.a;

import androidx.webkit.ProxyConfig;
import com.waze.strings.DisplayStrings;
import h.g.b.at;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import kotlinx.b.c.ai;
import kotlinx.b.c.aj;
import kotlinx.b.c.ar;
import kotlinx.b.c.as;
import kotlinx.b.c.av;
import kotlinx.b.c.ba;
import kotlinx.b.c.bb;
import kotlinx.b.c.bl;
import kotlinx.b.c.by;
import kotlinx.b.c.bz;
import kotlinx.b.c.ce;
import kotlinx.b.c.cf;
import kotlinx.b.c.cn;
import kotlinx.b.c.cq;
import kotlinx.b.c.ct;
import kotlinx.b.c.cw;
import okhttp3.ae;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b {
    public static final ae A(String str) {
        h.g.b.x.f(str, "<this>");
        try {
            return z(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final int B(String str) {
        h.g.b.x.f(str, "scheme");
        if (h.g.b.x.n(str, ProxyConfig.MATCH_HTTP)) {
            return 80;
        }
        if (h.g.b.x.n(str, ProxyConfig.MATCH_HTTPS)) {
            return DisplayStrings.DS_HEAVY;
        }
        return -1;
    }

    public static final okhttp3.ab C(String str) {
        h.g.b.x.f(str, "<this>");
        okhttp3.aa aaVar = new okhttp3.aa();
        aaVar.q(null, str);
        return aaVar.g();
    }

    public static /* synthetic */ String D(String str, int i2, int i3, boolean z, int i4) {
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        boolean z2 = true;
        if (1 == (i4 & 1)) {
            i2 = 0;
        }
        boolean z3 = z & ((i4 & 4) == 0);
        h.g.b.x.f(str, "<this>");
        int iCharCount = i2;
        while (iCharCount < i3) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%') {
                z2 = z3;
            } else if (cCharAt != '+' || !z3) {
                iCharCount++;
            }
            k.h hVar = new k.h();
            hVar.an(str, i2, iCharCount);
            while (iCharCount < i3) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt == 37) {
                    int i5 = iCharCount + 2;
                    if (i5 < i3) {
                        int iF = okhttp3.internal.b.f(str.charAt(iCharCount + 1));
                        int iF2 = okhttp3.internal.b.f(str.charAt(i5));
                        if (iF == -1 || iF2 == -1) {
                            iCodePointAt = 37;
                            hVar.ao(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            hVar.ae((iF << 4) + iF2);
                            iCharCount = Character.charCount(37) + i5;
                        }
                    } else {
                        iCodePointAt = 37;
                    }
                }
                if (iCodePointAt == 43 && z2) {
                    hVar.ae(32);
                    iCharCount++;
                } else {
                    hVar.ao(iCodePointAt);
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            return hVar.v();
        }
        String strSubstring = str.substring(i2, i3);
        h.g.b.x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final List E(String str) {
        h.g.b.x.f(str, "<this>");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            String str2 = str;
            int iW = h.n.o.W(str2, '&', i2, 4);
            if (iW == -1) {
                iW = str.length();
            }
            int iW2 = h.n.o.W(str2, '=', i2, 4);
            if (iW2 == -1 || iW2 > iW) {
                String strSubstring = str.substring(i2, iW);
                h.g.b.x.e(strSubstring, "substring(...)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i2, iW2);
                h.g.b.x.e(strSubstring2, "substring(...)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iW2 + 1, iW);
                h.g.b.x.e(strSubstring3, "substring(...)");
                arrayList.add(strSubstring3);
            }
            i2 = iW + 1;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0 A[LOOP:2: B:84:0x00ea->B:86:0x00f0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.String F(java.lang.String r17, int r18, int r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, boolean r24, int r25) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.b.a.b.F(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, int):java.lang.String");
    }

    private static final boolean G(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && okhttp3.internal.b.f(str.charAt(i2 + 1)) != -1 && okhttp3.internal.b.f(str.charAt(i4)) != -1;
    }

    public static final h.l.c a(q qVar) {
        h.g.b.x.f(qVar, "<this>");
        if (qVar instanceof c) {
            return ((c) qVar).f50906a;
        }
        if (qVar instanceof bz) {
            return a(((bz) qVar).l());
        }
        return null;
    }

    public static final q b(q qVar, h.l.c cVar) {
        h.g.b.x.f(qVar, "<this>");
        h.g.b.x.f(cVar, "context");
        return new c(qVar, cVar);
    }

    public static final kotlinx.b.b c(h.l.c cVar, kotlinx.b.b bVar) {
        h.g.b.x.f(cVar, "kClass");
        h.g.b.x.f(bVar, "elementSerializer");
        return new by(cVar, bVar);
    }

    public static final kotlinx.b.b d() {
        return kotlinx.b.c.g.f51077a;
    }

    public static final kotlinx.b.b e() {
        return kotlinx.b.c.p.f51089a;
    }

    public static final kotlinx.b.b f() {
        return kotlinx.b.c.ab.f50945a;
    }

    public static final kotlinx.b.b g() {
        return ai.f50960a;
    }

    public static final kotlinx.b.b h() {
        return ar.f50969a;
    }

    public static final kotlinx.b.b i(kotlinx.b.b bVar) {
        h.g.b.x.f(bVar, "elementSerializer");
        return new kotlinx.b.c.e(bVar);
    }

    public static final kotlinx.b.b j() {
        return ba.f50980a;
    }

    public static final kotlinx.b.b k(kotlinx.b.b bVar, kotlinx.b.b bVar2) {
        h.g.b.x.f(bVar, "keySerializer");
        h.g.b.x.f(bVar2, "valueSerializer");
        return new av(bVar, bVar2);
    }

    public static final kotlinx.b.b l(kotlinx.b.b bVar) {
        h.g.b.x.f(bVar, "<this>");
        return bVar.getDescriptor().k() ? bVar : new bl(bVar);
    }

    public static final kotlinx.b.b m(h.g.b.g gVar) {
        h.g.b.x.f(gVar, "<this>");
        return kotlinx.b.c.h.f51078a;
    }

    public static final kotlinx.b.b n(h.g.b.h hVar) {
        h.g.b.x.f(hVar, "<this>");
        return kotlinx.b.c.k.f51083a;
    }

    public static final kotlinx.b.b o(h.g.b.k kVar) {
        h.g.b.x.f(kVar, "<this>");
        return kotlinx.b.c.q.f51090a;
    }

    public static final kotlinx.b.b p(h.g.b.p pVar) {
        h.g.b.x.f(pVar, "<this>");
        return kotlinx.b.c.ac.f50946a;
    }

    public static final kotlinx.b.b q(h.g.b.q qVar) {
        h.g.b.x.f(qVar, "<this>");
        return aj.f50961a;
    }

    public static final kotlinx.b.b r(h.g.b.v vVar) {
        h.g.b.x.f(vVar, "<this>");
        return as.f50970a;
    }

    public static final kotlinx.b.b s(h.g.b.z zVar) {
        h.g.b.x.f(zVar, "<this>");
        return bb.f50981a;
    }

    public static final kotlinx.b.b t(h.g.b.as asVar) {
        h.g.b.x.f(asVar, "<this>");
        return ce.f51034a;
    }

    public static final kotlinx.b.b u(at atVar) {
        h.g.b.x.f(atVar, "<this>");
        return cf.f51036a;
    }

    public static final kotlinx.b.b v(e.c.b bVar) {
        h.g.b.x.f(bVar, "<this>");
        return cn.f51053a;
    }

    public static final kotlinx.b.b w(e.c.h hVar) {
        h.g.b.x.f(hVar, "<this>");
        return cq.f51058a;
    }

    public static final kotlinx.b.b x(e.c.l lVar) {
        h.g.b.x.f(lVar, "<this>");
        return ct.f51063a;
    }

    public static final kotlinx.b.b y(e.c.a.d dVar) {
        h.g.b.x.f(dVar, "<this>");
        return cw.f51068a;
    }

    public static final ae z(String str) {
        h.g.b.x.f(str, "<this>");
        String str2 = str;
        Matcher matcher = ae.f55831b.matcher(str2);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + "\"");
        }
        String strGroup = matcher.group(1);
        h.g.b.x.e(strGroup, "group(...)");
        Locale locale = Locale.US;
        h.g.b.x.e(locale, "US");
        String lowerCase = strGroup.toLowerCase(locale);
        h.g.b.x.e(lowerCase, "toLowerCase(...)");
        String strGroup2 = matcher.group(2);
        h.g.b.x.e(strGroup2, "group(...)");
        Locale locale2 = Locale.US;
        h.g.b.x.e(locale2, "US");
        h.g.b.x.e(strGroup2.toLowerCase(locale2), "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = ae.f55832c.matcher(str2);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                String strSubstring = str.substring(iEnd);
                h.g.b.x.e(strSubstring, "substring(...)");
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + strSubstring + "\" for: \"" + str + "\"");
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (h.n.o.ah(strGroup4, "'") && h.n.o.l(strGroup4, "'", false) && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    h.g.b.x.e(strGroup4, "substring(...)");
                }
                ArrayList arrayList2 = arrayList;
                arrayList2.add(strGroup3);
                arrayList2.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new ae(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
    }
}
