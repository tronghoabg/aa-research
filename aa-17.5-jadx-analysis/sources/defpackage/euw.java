package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class euw {
    public final String c;
    public final String d;
    public final String e;
    public String f;
    public boolean g;
    public final aezr h;
    public final aezr i;
    public String j;
    public boolean k;
    private final List p;
    private final aezr q;
    private final aezr r;
    private final aezr s;
    private final aezr t;
    private final aezr u;
    private final aezr v;
    private static final aisp l = new aisp("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final aisp a = new aisp("\\{(.+?)\\}");
    private static final aisp m = new aisp("http[s]?://");
    private static final aisp n = new aisp(".*");
    private static final aisp o = new aisp("([^/]*?|)");
    public static final aisp b = new aisp("^[^?#]+\\?([^#]*).*");

    public euw(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        ArrayList arrayList = new ArrayList();
        this.p = arrayList;
        this.q = woy.dG(new epp(this, 6));
        this.r = woy.dG(new epp(this, 7));
        this.s = woy.dH(3, new epp(this, 8));
        this.t = woy.dH(3, new epp(this, 9));
        this.u = woy.dH(3, new epp(this, 10));
        this.h = woy.dH(3, new epp(this, 11));
        this.i = woy.dG(new epp(this, 12));
        this.v = woy.dG(new epp(this, 13));
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!l.e(str)) {
                sb.append(m.a());
            }
            aisj aisjVarG = new aisp("(\\?|#|$)").g(str);
            if (aisjVarG != null) {
                boolean z = false;
                String strSubstring = str.substring(0, aisjVarG.b().a);
                strSubstring.getClass();
                j(strSubstring, arrayList, sb);
                if (!n.e(sb) && !o.e(sb)) {
                    z = true;
                }
                this.k = z;
                sb.append("($|(\\?(.)*)|(#(.)*))");
            }
            this.f = k(sb.toString());
        }
        if (str3 == null) {
            return;
        }
        if (!new aisp("^[\\s\\S]+/[\\s\\S]+$").f(str3)) {
            throw new IllegalArgumentException("The given mimeType " + str3 + " does not match to required \"type/subtype\" format");
        }
        euv euvVar = new euv(str3);
        this.j = afyh.J("^(" + euvVar.a + "|[*]+)/(" + euvVar.b + "|[*]+)$", "*|[*]", "[\\s\\S]");
    }

    public static final void i(Bundle bundle, String str, String str2, euo euoVar) {
        if (euoVar == null) {
            fbh.c(bundle, str, str2);
            return;
        }
        str.getClass();
        evm evmVar = euoVar.a;
        evmVar.f(bundle, str, evmVar.c(str2));
    }

    public static final void j(String str, List list, StringBuilder sb) {
        int i = 0;
        for (aisj aisjVarG = a.g(str); aisjVarG != null; aisjVarG = aisjVarG.c()) {
            aisi aisiVarB = ((aism) aisjVarG).b.b(1);
            aisiVarB.getClass();
            list.add(aisiVarB.a);
            if (aisjVarG.b().a > i) {
                String strSubstring = str.substring(i, aisjVarG.b().a);
                strSubstring.getClass();
                sb.append(afus.a(strSubstring));
            }
            sb.append(o.a());
            i = aisjVarG.b().b + 1;
        }
        if (i < str.length()) {
            String strSubstring2 = str.substring(i);
            strSubstring2.getClass();
            sb.append(afus.a(strSubstring2));
        }
    }

    public static final String k(String str) {
        return (afyh.u(str, "\\Q", false) && afyh.u(str, "\\E", false)) ? afyh.J(str, ".*", "\\E.*\\Q") : afyh.u(str, "\\.\\*", false) ? afyh.J(str, "\\.\\*", ".*") : str;
    }

    private final Map l() {
        return (Map) this.s.a();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Iterable, java.lang.Object] */
    public final List a() {
        Collection collectionValues = l().values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            woy.cq(arrayList, ((gib) it.next()).a);
        }
        return woy.bY(woy.bY(this.p, arrayList), b());
    }

    public final List b() {
        return (List) this.u.a();
    }

    public final aezu c() {
        return (aezu) this.t.a();
    }

    public final aisp d() {
        return (aisp) this.v.a();
    }

    public final aisp e() {
        return (aisp) this.q.a();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof euw)) {
            euw euwVar = (euw) obj;
            if (affa.f(this.c, euwVar.c) && affa.f(this.d, euwVar.d) && affa.f(this.e, euwVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(aisj aisjVar, Bundle bundle, Map map) {
        List list = this.p;
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                woy.bo();
            }
            String str = (String) obj;
            aisi aisiVarB = ((aism) aisjVar).b.b(i2);
            String strK = aisiVarB != null ? ebk.k(aisiVarB.a) : null;
            euo euoVar = (euo) map.get(str);
            if (strK == null) {
                strK = "";
            }
            try {
                i(bundle, str, strK, euoVar);
                arrayList.add(afak.a);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Iterable, java.lang.Object] */
    public final boolean g(Uri uri, Bundle bundle, Map map) {
        Object objValueOf;
        boolean z;
        String query;
        for (Map.Entry entry : l().entrySet()) {
            String str = (String) entry.getKey();
            gib gibVar = (gib) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.g && (query = uri.getQuery()) != null && !affa.f(query, uri.toString())) {
                queryParameters = woy.bg(query);
            }
            boolean z2 = false;
            Bundle bundleZ = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
            ?? r9 = gibVar.a;
            for (String str2 : r9) {
                euo euoVar = (euo) map.get(str2);
                evm evmVar = euoVar != null ? euoVar.a : null;
                if ((evmVar instanceof eud) && !euoVar.c) {
                    eud eudVar = (eud) evmVar;
                    eudVar.f(bundleZ, str2, eudVar.a());
                }
            }
            for (String str3 : queryParameters) {
                Object obj = gibVar.b;
                aisj aisjVarD = obj != null ? new aisp((String) obj).d(str3) : null;
                if (aisjVarD == null) {
                    return z2;
                }
                ArrayList arrayList = new ArrayList(woy.bp(r9, 10));
                ?? r14 = z2;
                for (Object obj2 : r9) {
                    int i = r14 + 1;
                    if (r14 < 0) {
                        woy.bo();
                    }
                    String str4 = (String) obj2;
                    aisi aisiVarB = ((aism) aisjVarD).b.b(i);
                    String str5 = aisiVarB != null ? aisiVarB.a : null;
                    euo euoVar2 = (euo) map.get(str4);
                    try {
                        boolean zF = fbb.f(bundleZ, str4);
                        if (str5 == null) {
                            str5 = "";
                        }
                        if (zF) {
                            if (fbb.f(bundleZ, str4)) {
                                if (euoVar2 != null) {
                                    evm evmVar2 = euoVar2.a;
                                    Object objB = evmVar2.b(bundleZ, str4);
                                    str4.getClass();
                                    if (!fbb.f(bundleZ, str4)) {
                                        throw new IllegalArgumentException("There is no previous value in this savedState.");
                                    }
                                    evmVar2.f(bundleZ, str4, evmVar2.d(str5, objB));
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            objValueOf = Boolean.valueOf(z);
                        } else {
                            i(bundleZ, str4, str5, euoVar2);
                            objValueOf = afak.a;
                        }
                    } catch (IllegalArgumentException unused) {
                        objValueOf = afak.a;
                    }
                    arrayList.add(objValueOf);
                    r14 = i;
                    z2 = false;
                }
            }
            bundle.putAll(bundleZ);
        }
        return true;
    }

    public final boolean h() {
        return ((Boolean) this.r.a()).booleanValue();
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.d;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = iHashCode * 31;
        String str3 = this.e;
        return ((i + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }
}
