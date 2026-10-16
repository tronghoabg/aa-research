package com.waze.search.v2;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class o {
    public /* synthetic */ o(byte[] bArr) {
    }

    private static n a(c cVar) {
        return new n(new com.waze.ui.ac.j(R.string.CATEGORY_SEARCH_OPEN_NOW_FILTER), cVar.h() == null ? m.f36603a : j.f36600a, bl.f36186a);
    }

    static /* synthetic */ n b(c cVar, int i2) {
        com.waze.ui.ac.j jVar = new com.waze.ui.ac.j(R.string.CATEGORY_SEARCH_AMENITIES_FILTER_TITLE);
        com.waze.search.au auVarG = cVar.g();
        int i3 = i2 & 4;
        int i4 = i2 & 2;
        return new n(jVar, new k(auVarG != null ? auVarG.p().size() : 0), new ba(i4 != 0, i3 != 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List d(com.waze.search.v2.p r8, boolean r9, java.lang.String r10, java.lang.String r11, com.waze.speech.k r12, com.waze.ev.n r13, com.waze.search.v2.c r14) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.search.v2.o.d(com.waze.search.v2.p, boolean, java.lang.String, java.lang.String, com.waze.speech.k, com.waze.ev.n, com.waze.search.v2.c):java.util.List");
    }

    public static void e(com.waze.settings.de deVar, int i2) {
        h.g.b.x.f(deVar, "page");
        if (deVar.d() != null) {
            com.waze.settings.tree.g gVarB = deVar.b();
            if ((gVarB != null ? gVarB.r() : null) == null) {
                return;
            }
            com.waze.settings.dy dyVar = com.waze.settings.dy.f37099b;
            if (i2 == 3) {
                dyVar = com.waze.settings.dy.f37102e;
                i2 = 3;
            }
            if (i2 == 20002) {
                dyVar = com.waze.settings.dy.f37103f;
            }
            com.waze.settings.eb ebVarA = com.waze.settings.eb.f37168a.a();
            ebVarA.c(ebVarA.a(deVar.d()), dyVar, null, null, null, null);
        }
    }

    public static void f(com.waze.settings.de deVar) {
        h.g.b.x.f(deVar, "page");
        com.waze.settings.tree.g gVarB = deVar.b();
        if ((gVarB != null ? gVarB.r() : null) == null) {
            return;
        }
        com.waze.settings.eb ebVarA = com.waze.settings.eb.f37168a.a();
        com.waze.settings.tree.g gVarB2 = deVar.b();
        ebVarA.c(ebVarA.a(gVarB2 != null ? gVarB2.r() : null), com.waze.settings.dy.f37098a, null, null, null, null);
    }

    public static void g(com.waze.settings.tree.f fVar, com.waze.settings.de deVar) {
        h.g.b.x.f(fVar, "setting");
        h.g.b.x.f(deVar, "page");
        if (fVar.r() != null) {
            com.waze.settings.tree.g gVarB = deVar.b();
            if ((gVarB != null ? gVarB.r() : null) == null) {
                return;
            }
            com.waze.settings.eb ebVarA = com.waze.settings.eb.f37168a.a();
            ebVarA.c(ebVarA.a(deVar.c()), com.waze.settings.dy.f37101d, fVar.r(), null, null, null);
        }
    }

    public static void h(com.waze.settings.tree.f fVar, String str, String str2, String str3) {
        h.g.b.x.f(fVar, "setting");
        if (fVar.r() == null || str == null) {
            return;
        }
        com.waze.settings.eb ebVarA = com.waze.settings.eb.f37168a.a();
        ebVarA.c(ebVarA.a(str), com.waze.settings.dy.f37100c, fVar.r(), str2, str3, str);
    }

    public static void i(com.waze.settings.tree.f fVar, com.waze.settings.de deVar, String str, String str2) {
        h.g.b.x.f(fVar, "setting");
        h.g.b.x.f(deVar, "page");
        com.waze.settings.tree.g gVarB = deVar.b();
        h(fVar, gVarB != null ? gVarB.r() : null, str, str2);
    }

    private static n j(c cVar) {
        return new n(new com.waze.ui.ac.j(R.string.CATEGORY_SEARCH_TOP_RATED_FILTER), cVar.l() == null ? m.f36603a : j.f36600a, bn.f36188a);
    }

    public final boolean c() {
        return (this instanceof com.waze.search.e.c) && ((com.waze.search.e.c) this).a();
    }

    private o() {
        throw null;
    }
}
