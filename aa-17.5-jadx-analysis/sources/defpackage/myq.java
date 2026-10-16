package defpackage;

/* loaded from: classes2.dex */
final class myq extends afde implements afec {
    int a;
    final /* synthetic */ bbt b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myq(bbt bbtVar, int i, int i2, int i3, boolean z, afck afckVar) {
        super(1, afckVar);
        this.b = bbtVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r8.y(r1, new defpackage.aft(1.0f, 1500.0f, null), r7) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (r8.y(r5, new defpackage.aft(1.0f, 1500.0f, null), r7) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        return r0;
     */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r7.a
            r2 = 1
            defpackage.woy.dF(r8)
            if (r1 == 0) goto Lb
            goto L4c
        Lb:
            bbt r8 = r7.b
            int r1 = r7.c
            int r3 = r8.j()
            int r3 = defpackage.mcd.n(r3, r1)
            int r4 = r7.d
            if (r4 != r3) goto L4c
            int r5 = r7.e
            if (r3 == r5) goto L4c
            yph r3 = defpackage.myv.a
            yop r3 = r3.l()
            java.lang.String r6 = "Swiping to suggestions for player at index: %d"
            r3.w(r6, r4)
            yzy r3 = defpackage.yzy.Hm
            r4 = 0
            defpackage.mwc.a(r3, r4)
            boolean r3 = r7.f
            if (r3 == 0) goto L42
            int r1 = defpackage.mcd.m(r8, r1)
            int r1 = r1 + r5
            r7.a = r2
            java.lang.Object r7 = defpackage.bbt.z(r8, r1, r7)
            if (r7 != r0) goto L4c
            goto L4b
        L42:
            r1 = 2
            r7.a = r1
            java.lang.Object r7 = defpackage.bbt.z(r8, r5, r7)
            if (r7 != r0) goto L4c
        L4b:
            return r0
        L4c:
            afak r7 = defpackage.afak.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myq.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new myq(this.b, this.c, this.d, this.e, this.f, (afck) obj).hT(afak.a);
    }
}
