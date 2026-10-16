package com.waze.map.isolated;

import com.waze.navigate.ed;
import com.waze.navigate.ee;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class k {
    public k() {
    }

    public static h.k e(ee eeVar, boolean z) {
        String str;
        h.g.b.x.f(eeVar, "roadSign");
        h.k kVar = new h.k(null, h.a.i.h());
        String strA = z ? eeVar.a() : eeVar.b();
        if (true == h.n.o.G(strA)) {
            strA = null;
        }
        if (strA != null) {
            Pattern patternCompile = Pattern.compile("\\$RS-([0-9]+)");
            h.g.b.x.e(patternCompile, "compile(...)");
            Matcher matcher = patternCompile.matcher(strA);
            h.g.b.x.e(matcher, "matcher(...)");
            ArrayList arrayList = new ArrayList();
            int length = 0;
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                Integer numValueOf = strGroup != null ? Integer.valueOf(Integer.parseInt(strGroup)) : null;
                if (numValueOf != null && numValueOf.intValue() < eeVar.d().size()) {
                    ed edVar = (ed) eeVar.d().get(numValueOf.intValue());
                    int iStart = matcher.start() + length;
                    int iEnd = matcher.end() + length;
                    String strC = edVar.c();
                    if (strC.length() == 0) {
                        strC = " ";
                    }
                    String str2 = strC;
                    if (edVar.a().length() > 0) {
                        str = str2 + " " + edVar.a();
                    } else {
                        str = str2;
                    }
                    arrayList.add(new com.waze.navbar.r(iStart, str2.length() + iStart, numValueOf.intValue()));
                    strA = h.n.o.u(strA, iStart, iEnd, str).toString();
                    length += str.length() - (iEnd - iStart);
                }
            }
            return new h.k(strA, arrayList);
        }
        return kVar;
    }

    public final boolean c() {
        return (this instanceof com.waze.nav_connect.a.l) || (this instanceof com.waze.nav_connect.a.n);
    }

    public /* synthetic */ k(byte[] bArr, byte[] bArr2) {
    }
}
