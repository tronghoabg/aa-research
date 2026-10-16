package defpackage;

/* loaded from: classes2.dex */
public final class fqm implements fqp {
    public final fqv a;
    public final ftc b;
    private final ajed c;

    public fqm(fqv fqvVar, ftc ftcVar, ajed ajedVar) {
        this.a = fqvVar;
        this.b = ftcVar;
        this.c = ajedVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fqp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.afck r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.fql
            if (r0 == 0) goto L13
            r0 = r7
            fql r0 = (defpackage.fql) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            fql r0 = new fql
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.a
            defpackage.woy.dF(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5e
        L2c:
            r7 = move-exception
            goto L6a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r2 = r0.a
            defpackage.woy.dF(r7)
            r7 = r2
            goto L4c
        L3d:
            defpackage.woy.dF(r7)
            ajed r7 = r6.c
            r0.a = r7
            r0.d = r4
            java.lang.Object r2 = r7.e(r0)
            if (r2 == r1) goto L70
        L4c:
            fqi r2 = new fqi     // Catch: java.lang.Throwable -> L66
            r2.<init>()     // Catch: java.lang.Throwable -> L66
            r0.a = r7     // Catch: java.lang.Throwable -> L66
            r0.d = r3     // Catch: java.lang.Throwable -> L66
            java.lang.Object r6 = defpackage.aijj.a(r2, r0)     // Catch: java.lang.Throwable -> L66
            if (r6 == r1) goto L70
            r5 = r7
            r7 = r6
            r6 = r5
        L5e:
            fqn r7 = (defpackage.fqn) r7     // Catch: java.lang.Throwable -> L2c
            ajed r6 = (defpackage.ajed) r6
            r6.h()
            return r7
        L66:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L6a:
            ajed r6 = (defpackage.ajed) r6
            r6.h()
            throw r7
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqm.a(afck):java.lang.Object");
    }
}
