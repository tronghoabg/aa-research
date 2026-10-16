package defpackage;

/* loaded from: classes2.dex */
final class egb extends afde implements afec {
    Object a;
    int b;
    final /* synthetic */ afft c;
    final /* synthetic */ egd d;
    final /* synthetic */ Object e;
    final /* synthetic */ boolean f;
    final /* synthetic */ egh g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egb(afft afftVar, egd egdVar, egh eghVar, Object obj, boolean z, afck afckVar) {
        super(1, afckVar);
        this.c = afftVar;
        this.d = egdVar;
        this.g = eghVar;
        this.e = obj;
        this.f = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
    
        if (r5 == r0) goto L23;
     */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            afcr r0 = defpackage.afcr.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.woy.dF(r5)
            goto L51
        Ld:
            java.lang.Object r1 = r4.a
            defpackage.woy.dF(r5)
            goto L28
        L13:
            defpackage.woy.dF(r5)
            afft r1 = r4.c
            egd r5 = r4.d
            egp r5 = r5.c()
            r4.a = r1
            r4.b = r2
            java.lang.Object r5 = r5.b(r4)
            if (r5 == r0) goto L72
        L28:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            afft r1 = (defpackage.afft) r1
            r1.a = r5
            egh r5 = r4.g
            java.lang.Object r1 = r4.e
            r2 = 0
            r4.a = r2
            r3 = 2
            r4.b = r3
            r5.b()
            egn r3 = new egn
            r3.<init>(r5, r1, r2)
            java.io.File r5 = r5.a
            java.lang.Object r5 = defpackage.ebh.e(r5, r3, r4)
            if (r5 == r0) goto L4e
            afak r5 = defpackage.afak.a
        L4e:
            if (r5 != r0) goto L51
            goto L72
        L51:
            boolean r5 = r4.f
            if (r5 == 0) goto L6f
            egd r5 = r4.d
            java.lang.Object r0 = r4.e
            ees r1 = new ees
            if (r0 == 0) goto L62
            int r2 = r0.hashCode()
            goto L63
        L62:
            r2 = 0
        L63:
            kwp r5 = r5.g
            afft r4 = r4.c
            int r4 = r4.a
            r1.<init>(r0, r2, r4)
            r5.i(r1)
        L6f:
            afak r4 = defpackage.afak.a
            return r4
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egb.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new egb(this.c, this.d, this.g, this.e, this.f, (afck) obj).hT(afak.a);
    }
}
