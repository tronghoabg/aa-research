package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ehh implements egp {
    private final ajdz b = new ajdz();
    private final kwp c = new kwp((byte[]) null, (byte[]) null, (byte[]) null);
    private final aiyk a = new aiyb(new axo((afck) null, 2, (char[]) null));

    @Override // defpackage.egp
    public final Object a(afck afckVar) {
        return new Integer(this.c.j());
    }

    @Override // defpackage.egp
    public final Object b(afck afckVar) {
        return new Integer(((AtomicInteger) this.c.a).incrementAndGet());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v4, types: [ajdz] */
    @Override // defpackage.egp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.afec r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ehf
            if (r0 == 0) goto L13
            r0 = r8
            ehf r0 = (defpackage.ehf) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ehf r0 = new ehf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.d
            afcr r1 = defpackage.afcr.a
            int r2 = r0.f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            int r6 = r0.c
            int r6 = r0.b
            ajdz r6 = r0.g
            java.lang.Object r7 = r0.a
            defpackage.woy.dF(r8)     // Catch: java.lang.Throwable -> L33
            goto L6c
        L33:
            r7 = move-exception
            goto L70
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            int r6 = r0.b
            ajdz r6 = r0.g
            java.lang.Object r7 = r0.a
            defpackage.woy.dF(r8)
            goto L5a
        L47:
            defpackage.woy.dF(r8)
            ajdz r6 = r6.b
            r0.a = r7
            r0.g = r6
            r0.b = r5
            r0.f = r4
            java.lang.Object r8 = r6.b(r0)
            if (r8 == r1) goto L74
        L5a:
            r8 = 0
            r0.a = r8     // Catch: java.lang.Throwable -> L33
            r0.g = r6     // Catch: java.lang.Throwable -> L33
            r0.b = r5     // Catch: java.lang.Throwable -> L33
            r0.c = r5     // Catch: java.lang.Throwable -> L33
            r0.f = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L33
            if (r8 != r1) goto L6c
            goto L74
        L6c:
            r6.d()
            return r8
        L70:
            r6.d()
            throw r7
        L74:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehh.c(afec, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.egp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.afeg r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ehg
            if (r0 == 0) goto L13
            r0 = r8
            ehg r0 = (defpackage.ehg) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ehg r0 = new ehg
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f
            afcr r1 = defpackage.afcr.a
            int r2 = r0.h
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            int r6 = r0.c
            boolean r6 = r0.e
            boolean r6 = r0.d
            int r7 = r0.b
            ajdz r7 = r0.i
            java.lang.Object r0 = r0.a
            defpackage.woy.dF(r8)     // Catch: java.lang.Throwable -> L33
            goto L64
        L33:
            r8 = move-exception
            goto L70
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            defpackage.woy.dF(r8)
            ajdz r6 = r6.b
            boolean r8 = r6.c()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L6b
            r4 = 0
            r0.a = r4     // Catch: java.lang.Throwable -> L6b
            r0.i = r6     // Catch: java.lang.Throwable -> L6b
            r4 = 0
            r0.b = r4     // Catch: java.lang.Throwable -> L6b
            r0.d = r8     // Catch: java.lang.Throwable -> L6b
            r0.e = r8     // Catch: java.lang.Throwable -> L6b
            r0.c = r4     // Catch: java.lang.Throwable -> L6b
            r0.h = r3     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L6b
            if (r7 == r1) goto L6a
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L64:
            if (r6 == 0) goto L69
            r7.d()
        L69:
            return r8
        L6a:
            return r1
        L6b:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L70:
            if (r6 == 0) goto L75
            r7.d()
        L75:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehh.d(afeg, afck):java.lang.Object");
    }

    @Override // defpackage.egp
    public final aiyk e() {
        return this.a;
    }
}
