package defpackage;

/* loaded from: classes2.dex */
public final class ddc {
    public final int a;
    public float b;
    private final afeg c;

    public ddc(int i, afeg afegVar) {
        this.a = i;
        this.c = afegVar;
    }

    public final int a(int i) {
        return afpt.g(i - afgi.k(this.b), 0, this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(float r5, defpackage.afck r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ddb
            if (r0 == 0) goto L13
            r0 = r6
            ddb r0 = (defpackage.ddb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ddb r0 = new ddb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.woy.dF(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.woy.dF(r6)
            afeg r6 = r4.c
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r0.c = r3
            java.lang.Object r6 = r6.invoke(r2, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.b
            float r6 = r6 + r5
            r4.b = r6
            afak r4 = defpackage.afak.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddc.b(float, afck):java.lang.Object");
    }

    public final Object c(float f, afck afckVar) throws Throwable {
        Object objB = b(f - this.b, afckVar);
        return objB == afcr.a ? objB : afak.a;
    }
}
