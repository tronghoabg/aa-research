package defpackage;

/* loaded from: classes.dex */
public final class tp {
    public Object a;
    public Object b;
    public Object c = new ahp(this, 15);
    public Object d;

    public final long a(long j, long j2, int i) {
        cpt cptVarC = c();
        if (cptVarC != null) {
            return cptVarC.a(j, j2, i);
        }
        return 0L;
    }

    public final long b(long j, int i) {
        cpt cptVarC = c();
        if (cptVarC != null) {
            return cptVarC.b(j, i);
        }
        return 0L;
    }

    public final cpt c() {
        Object obj = this.b;
        if (obj != null) {
            return ((cpz) obj).f();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (r0 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (r0 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r8, long r10, defpackage.afck r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.cpu
            if (r0 == 0) goto L13
            r0 = r12
            cpu r0 = (defpackage.cpu) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cpu r0 = new cpu
            r0.<init>(r7, r12)
        L18:
            r12 = r0
            java.lang.Object r0 = r12.a
            afcr r1 = defpackage.afcr.a
            int r2 = r12.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.woy.dF(r0)
            goto L63
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.woy.dF(r0)
            goto L50
        L37:
            defpackage.woy.dF(r0)
            cpt r0 = r7.c()
            r5 = 0
            if (r0 != 0) goto L55
            java.lang.Object r7 = r7.a
            if (r7 == 0) goto L69
            r12.b = r4
            cpz r7 = (defpackage.cpz) r7
            java.lang.Object r0 = r7.c(r8, r10, r12)
            if (r0 == r1) goto L68
        L50:
            dlv r0 = (defpackage.dlv) r0
            long r5 = r0.a
            goto L69
        L55:
            cpt r7 = r7.c()
            if (r7 == 0) goto L69
            r12.b = r3
            java.lang.Object r0 = r7.c(r8, r10, r12)
            if (r0 == r1) goto L68
        L63:
            dlv r0 = (defpackage.dlv) r0
            long r5 = r0.a
            goto L69
        L68:
            return r1
        L69:
            dlv r7 = new dlv
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tp.d(long, long, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r5, defpackage.afck r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.cpv
            if (r0 == 0) goto L13
            r0 = r7
            cpv r0 = (defpackage.cpv) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            cpv r0 = new cpv
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.woy.dF(r7)
            goto L40
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.woy.dF(r7)
            cpt r4 = r4.c()
            if (r4 == 0) goto L46
            r0.b = r3
            java.lang.Object r7 = r4.d(r5, r0)
            if (r7 == r1) goto L45
        L40:
            dlv r7 = (defpackage.dlv) r7
            long r4 = r7.a
            goto L48
        L45:
            return r1
        L46:
            r4 = 0
        L48:
            dlv r6 = new dlv
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tp.e(long, afck):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afdr, java.lang.Object] */
    public final aitx f() {
        aitx aitxVar = (aitx) this.c.invoke();
        return aitxVar == null ? cqa.b : aitxVar;
    }
}
