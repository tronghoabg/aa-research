package defpackage;

/* loaded from: classes3.dex */
public final class unk implements upw {
    final String a;
    final unn b;
    final unm c;
    final upz d;
    final /* synthetic */ unp e;

    public unk(unp unpVar, String str, unn unnVar, unm unmVar, upz upzVar) {
        this.e = unpVar;
        this.a = str;
        this.b = unnVar;
        this.c = unmVar;
        this.d = upzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    @Override // defpackage.upw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.upy r9) {
        /*
            r8 = this;
            boolean r0 = r9.l()
            unp r1 = r8.e
            r2 = 1
            if (r0 == 0) goto L32
            uno r0 = r1.j
            java.util.concurrent.atomic.AtomicInteger r0 = r0.e
            r0.incrementAndGet()
            yob r0 = defpackage.unp.a
            yop r0 = r0.d()
            ynz r0 = (defpackage.ynz) r0
            r3 = 9450(0x24ea, float:1.3242E-41)
            yop r0 = r0.ai(r3)
            ynz r0 = (defpackage.ynz) r0
            java.lang.String r3 = r8.a
            java.lang.String r4 = "Received style table %s"
            r0.y(r4, r3)
            unj r0 = new unj
            r0.<init>(r8, r9, r2)
            zgt r8 = r1.c
            r8.execute(r0)
            return
        L32:
            uno r0 = r1.j
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f
            r0.incrementAndGet()
            int r9 = r9.a()
            r0 = 0
            if (r9 == 0) goto L64
            if (r9 == r2) goto L57
            r2 = 2
            if (r9 == r2) goto L4a
            java.lang.String r9 = "Resource fetching error"
            qbm r2 = defpackage.qbm.i
            goto L68
        L4a:
            java.lang.String r9 = r8.a
            upz r2 = r8.d
            boolean r9 = r1.n(r9, r2, r8)
            java.lang.String r2 = "Resource failed"
            qbm r3 = defpackage.qbm.h
            goto L6b
        L57:
            java.lang.String r9 = r8.a
            upz r2 = r8.d
            boolean r9 = r1.n(r9, r2, r8)
            java.lang.String r2 = "Resource server error"
            qbm r3 = defpackage.qbm.g
            goto L6b
        L64:
            java.lang.String r9 = "Resource unavailable"
            qbm r2 = defpackage.qbm.f
        L68:
            r3 = r2
            r2 = r9
            r9 = r0
        L6b:
            yob r4 = defpackage.unp.a
            yop r4 = r4.g()
            ynz r4 = (defpackage.ynz) r4
            r5 = 9449(0x24e9, float:1.3241E-41)
            yop r4 = r4.ai(r5)
            ynz r4 = (defpackage.ynz) r4
            java.lang.String r5 = r8.a
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r9)
            java.lang.String r7 = "Error %s occurred while loading style table %s.  Will keep trying: %s"
            r4.R(r7, r3, r5, r6)
            if (r9 != 0) goto L9f
            java.util.Map r9 = r1.h
            monitor-enter(r9)
            r9.remove(r5)     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L9c
            unp r9 = r8.e
            unj r1 = new unj
            r1.<init>(r8, r2, r0)
            zgt r9 = r9.c
            r9.execute(r1)
            goto L9f
        L9c:
            r8 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L9c
            throw r8
        L9f:
            unp r8 = r8.e
            ackk r8 = r8.b
            java.lang.Object r8 = r8.a()
            erb r8 = (defpackage.erb) r8
            qbu r9 = defpackage.qbo.g
            java.lang.Object r8 = r8.R(r9)
            qbf r8 = (defpackage.qbf) r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.unk.a(upy):void");
    }
}
