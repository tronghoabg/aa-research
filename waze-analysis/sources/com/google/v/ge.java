package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ge {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f12996a = 100;

    static final /* bridge */ /* synthetic */ void b(Object obj, int i2, v vVar) {
        ((gf) obj).i(go.c(i2, 2), vVar);
    }

    static final /* bridge */ /* synthetic */ void c(Object obj, int i2, long j2) {
        ((gf) obj).i(go.c(i2, 0), Long.valueOf(j2));
    }

    static final gf d(Object obj) {
        return ((du) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void e(Object obj, gf gfVar) {
        ((du) obj).unknownFields = gfVar;
    }

    static final gf f(Object obj) {
        gf gfVarD = d(obj);
        if (gfVarD != gf.c()) {
            return gfVarD;
        }
        gf gfVarE = gf.e();
        e(obj, gfVarE);
        return gfVarE;
    }

    static final void g(Object obj) {
        d(obj).g();
    }

    final boolean a(Object obj, aa aaVar, int i2) throws eu {
        int iD = aaVar.d();
        int iA = go.a(iD);
        int iB = go.b(iD);
        if (iB == 0) {
            c(obj, iA, aaVar.l());
            return true;
        }
        if (iB == 1) {
            ((gf) obj).i(go.c(iA, 1), Long.valueOf(aaVar.k()));
            return true;
        }
        if (iB == 2) {
            b(obj, iA, aaVar.p());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                if (i2 != 0) {
                    return false;
                }
                throw new eu("Protocol message end-group tag did not match expected tag.");
            }
            if (iB != 5) {
                throw new et();
            }
            ((gf) obj).i(go.c(iA, 5), Integer.valueOf(aaVar.f()));
            return true;
        }
        int iC = go.c(iA, 4);
        int i3 = i2 + 1;
        gf gfVarE = gf.e();
        if (i3 >= f12996a) {
            throw new eu("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (aaVar.c() != Integer.MAX_VALUE && a(gfVarE, aaVar, i3)) {
        }
        if (iC != aaVar.d()) {
            throw new eu("Protocol message end-group tag did not match expected tag.");
        }
        gfVarE.g();
        ((gf) obj).i(go.c(iA, 3), gfVarE);
        return true;
    }
}
