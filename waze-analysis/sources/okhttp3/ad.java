package okhttp3;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ad implements s {

    /* renamed from: b, reason: collision with root package name */
    private final CookieHandler f55829b;

    public ad(CookieHandler cookieHandler) {
        h.g.b.x.f(cookieHandler, "cookieHandler");
        this.f55829b = cookieHandler;
    }

    @Override // okhttp3.s
    public final List a(ab abVar) throws IOException {
        h.g.b.x.f(abVar, "url");
        try {
            Map<String, List<String>> map = this.f55829b.get(abVar.i(), h.a.r.j());
            h.g.b.x.c(map);
            ArrayList arrayList = null;
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (h.n.o.m("Cookie", key, true) || h.n.o.m("Cookie2", key, true)) {
                    h.g.b.x.c(value);
                    if (!value.isEmpty()) {
                        for (String str : value) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            h.g.b.x.c(str);
                            ArrayList arrayList2 = new ArrayList();
                            int length = str.length();
                            int i2 = 0;
                            while (i2 < length) {
                                int iB = okhttp3.internal.b.b(str, ";,", i2, length);
                                int iA = okhttp3.internal.b.a(str, '=', i2, iB);
                                String strL = okhttp3.internal.b.l(str, i2, iA);
                                if (!h.n.o.ah(strL, "$")) {
                                    String strL2 = iA < iB ? okhttp3.internal.b.l(str, iA + 1, iB) : "";
                                    if (h.n.o.ah(strL2, "\"") && h.n.o.l(strL2, "\"", false)) {
                                        strL2 = strL2.substring(1, strL2.length() - 1);
                                        h.g.b.x.e(strL2, "substring(...)");
                                    }
                                    arrayList2.add(new p().b(strL).c(strL2).a(abVar.f()).d());
                                }
                                i2 = iB + 1;
                            }
                            arrayList.addAll(arrayList2);
                        }
                    }
                }
            }
            if (arrayList == null) {
                return h.a.i.h();
            }
            List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
            h.g.b.x.c(listUnmodifiableList);
            return listUnmodifiableList;
        } catch (IOException e2) {
            okhttp3.internal.g.g gVar = okhttp3.internal.g.g.f56287a;
            ab abVarP = abVar.p("/...");
            h.g.b.x.c(abVarP);
            Objects.toString(abVarP);
            gVar.m("Loading cookies failed for ".concat(String.valueOf(abVarP)), 5, e2);
            return h.a.i.h();
        }
    }

    @Override // okhttp3.s
    public final void b(ab abVar, List list) throws IOException {
        h.g.b.x.f(abVar, "url");
        h.g.b.x.f(list, "cookies");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            h.g.b.x.f(qVar, "cookie");
            arrayList.add(qVar.b(true));
        }
        try {
            this.f55829b.put(abVar.i(), h.a.r.e(new h.k("Set-Cookie", arrayList)));
        } catch (IOException e2) {
            okhttp3.internal.g.g gVar = okhttp3.internal.g.g.f56287a;
            ab abVarP = abVar.p("/...");
            h.g.b.x.c(abVarP);
            Objects.toString(abVarP);
            gVar.m("Saving cookies failed for ".concat(String.valueOf(abVarP)), 5, e2);
        }
    }
}
