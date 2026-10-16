package U3;

/* loaded from: classes.dex */
public final class j extends h {
    public final boolean i(Object obj) {
        if (obj == null) {
            obj = h.f12263g;
        }
        if (!h.f12262f.n(this, null, obj)) {
            return false;
        }
        h.b(this);
        return true;
    }

    public final boolean j(Throwable th) {
        if (!h.f12262f.n(this, null, new b(th))) {
            return false;
        }
        h.b(this);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(p8.p r6) {
        /*
            r5 = this;
            r6.getClass()
            java.lang.Object r0 = r5.f12264a
            r1 = 0
            if (r0 != 0) goto L44
            boolean r0 = r6.isDone()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            java.lang.Object r6 = U3.h.e(r6)
            xg.g r0 = U3.h.f12262f
            boolean r6 = r0.n(r5, r3, r6)
            if (r6 == 0) goto L4f
            U3.h.b(r5)
            return r2
        L20:
            U3.e r0 = new U3.e
            r0.<init>(r5, r6)
            xg.g r4 = U3.h.f12262f
            boolean r3 = r4.n(r5, r3, r0)
            if (r3 == 0) goto L42
            U3.i r1 = U3.i.f12267a     // Catch: java.lang.Throwable -> L33
            r6.addListener(r0, r1)     // Catch: java.lang.Throwable -> L33
            return r2
        L33:
            r6 = move-exception
            U3.b r1 = new U3.b     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            U3.b r1 = U3.b.f12244b
        L3c:
            xg.g r6 = U3.h.f12262f
            r6.n(r5, r0, r1)
            return r2
        L42:
            java.lang.Object r0 = r5.f12264a
        L44:
            boolean r2 = r0 instanceof U3.a
            if (r2 == 0) goto L4f
            U3.a r0 = (U3.a) r0
            boolean r0 = r0.f12242a
            r6.cancel(r0)
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U3.j.k(p8.p):boolean");
    }
}
