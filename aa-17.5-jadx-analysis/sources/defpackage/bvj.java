package defpackage;

/* loaded from: classes.dex */
public final class bvj extends cex {
    public static final Object a = new Object();
    public long b;
    public int c;
    public aae d;
    public Object e;
    public int f;

    public bvj(long j) {
        super(j);
        aae aaeVar = aaf.a;
        aaeVar.getClass();
        this.d = aaeVar;
        this.e = a;
    }

    @Override // defpackage.cex
    public final cex a(long j) {
        return new bvj(j);
    }

    @Override // defpackage.cex
    public final void b(cex cexVar) {
        cexVar.getClass();
        bvj bvjVar = (bvj) cexVar;
        this.d = bvjVar.d;
        this.e = bvjVar.e;
        this.f = bvjVar.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1 A[Catch: all -> 0x0144, LOOP:3: B:30:0x0093->B:44:0x00d1, LOOP_END, TryCatch #0 {all -> 0x0144, blocks: (B:12:0x0027, B:15:0x0034, B:17:0x0043, B:18:0x0048, B:20:0x0053, B:22:0x005d, B:25:0x006d, B:27:0x0071, B:30:0x0093, B:32:0x00a2, B:34:0x00ac, B:36:0x00b2, B:37:0x00c2, B:48:0x00eb, B:44:0x00d1, B:47:0x00dd), top: B:74:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00da A[EDGE_INSN: B:84:0x00da->B:46:0x00da BREAK  A[LOOP:3: B:30:0x0093->B:44:0x00d1], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(defpackage.cec r32) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvj.c(cec):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(defpackage.cec r6) {
        /*
            r5 = this;
            java.lang.Object r0 = defpackage.cek.b
            monitor-enter(r0)
            long r1 = r5.b     // Catch: java.lang.Throwable -> L46
            long r3 = r6.v()     // Catch: java.lang.Throwable -> L46
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1a
            int r1 = r5.c     // Catch: java.lang.Throwable -> L46
            int r4 = r6.h()     // Catch: java.lang.Throwable -> L46
            if (r1 == r4) goto L18
            goto L1a
        L18:
            r1 = r2
            goto L1b
        L1a:
            r1 = r3
        L1b:
            monitor-exit(r0)
            java.lang.Object r0 = r5.e
            java.lang.Object r4 = defpackage.bvj.a
            if (r0 == r4) goto L2d
            if (r1 == 0) goto L2c
            int r0 = r5.f
            int r4 = r5.c(r6)
            if (r0 != r4) goto L2d
        L2c:
            r2 = r3
        L2d:
            if (r2 == 0) goto L45
            if (r1 == 0) goto L45
            java.lang.Object r0 = defpackage.cek.b
            monitor-enter(r0)
            long r3 = r6.v()     // Catch: java.lang.Throwable -> L42
            r5.b = r3     // Catch: java.lang.Throwable -> L42
            int r6 = r6.h()     // Catch: java.lang.Throwable -> L42
            r5.c = r6     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            return r2
        L42:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L45:
            return r2
        L46:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvj.d(cec):boolean");
    }
}
