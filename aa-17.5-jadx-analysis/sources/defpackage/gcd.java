package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class gcd implements afdr {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gcd(afec afecVar, boolean z, int i) {
        this.c = i;
        this.b = afecVar;
        this.a = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Type inference failed for: r8v18, types: [afec, java.lang.Object] */
    @Override // defpackage.afdr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() {
        /*
            r8 = this;
            int r0 = r8.c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L5f
            if (r0 == r1) goto L44
            r3 = 2
            if (r0 == r3) goto L2f
            boolean r3 = r8.a
            r4 = 3
            if (r0 == r4) goto L18
            tjt r0 = new tjt
            java.lang.Object r8 = r8.b
            r0.<init>(r8, r3)
            return r0
        L18:
            if (r3 == 0) goto L29
            java.lang.Object r8 = r8.b
            alh r8 = (defpackage.alh) r8
            int r0 = r8.c()
            int r8 = r8.b()
            if (r0 >= r8) goto L29
            goto L2a
        L29:
            r1 = r2
        L2a:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            return r8
        L2f:
            boolean r0 = r8.a
            if (r0 == 0) goto L3e
            java.lang.Object r8 = r8.b
            alh r8 = (defpackage.alh) r8
            int r8 = r8.c()
            if (r8 <= 0) goto L3e
            goto L3f
        L3e:
            r1 = r2
        L3f:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            return r8
        L44:
            boolean r0 = r8.a
            if (r0 == 0) goto L59
            java.lang.Object r8 = r8.b
            axr r8 = (defpackage.axr) r8
            int r0 = r8.b()
            if (r0 > 0) goto L5a
            int r8 = r8.c()
            if (r8 <= 0) goto L59
            goto L5a
        L59:
            r1 = r2
        L5a:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            return r8
        L5f:
            boolean r0 = r8.a
            if (r0 == 0) goto L99
            java.lang.Object r8 = r8.b
            axr r8 = (defpackage.axr) r8
            axj r0 = r8.l()
            java.util.List r0 = r0.j
            java.lang.Object r0 = defpackage.woy.bL(r0)
            axk r0 = (defpackage.axk) r0
            if (r0 != 0) goto L76
            goto L99
        L76:
            axj r3 = r8.l()
            int r3 = r3.m
            int r3 = r3 + (-1)
            int r4 = r0.a
            if (r4 < r3) goto L9a
            int r3 = r0.h
            int r0 = r0.i
            int r3 = r3 + r0
            axj r8 = r8.l()
            long r4 = r8.d()
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r8 = (int) r4
            if (r3 <= r8) goto L99
            goto L9a
        L99:
            r1 = r2
        L9a:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcd.invoke():java.lang.Object");
    }

    public /* synthetic */ gcd(boolean z, Object obj, int i) {
        this.c = i;
        this.a = z;
        this.b = obj;
    }
}
