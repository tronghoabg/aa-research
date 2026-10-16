package defpackage;

/* loaded from: classes.dex */
public final class aqs extends afde implements afeg {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqs(afco afcoVar, aiyk aiykVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.c = afcoVar;
        this.b = aiykVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aivh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [afco, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aiyk, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.e;
        if (i == 0) {
            aqs aqsVar = new aqs((aivh) this.b, (afeg) this.c, afckVar, 0);
            aqsVar.d = obj;
            return aqsVar;
        }
        if (i != 1) {
            aqs aqsVar2 = new aqs((afco) this.c, (aiyk) this.b, afckVar, 2);
            aqsVar2.d = obj;
            return aqsVar2;
        }
        aqs aqsVar3 = new aqs((afdr) this.c, (afeg) this.b, afckVar, 1);
        aqsVar3.d = obj;
        return aqsVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r6.hR(r1, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (defpackage.ahnc.a(r4, r3, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
    
        if (r8.invoke(r3, r7) == r0) goto L39;
     */
    /* JADX WARN: Type inference failed for: r4v1, types: [aivh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [afco, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [afeg, java.lang.Object] */
    @Override // defpackage.afcy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hT(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = r7.e
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L78
            if (r0 == r3) goto L43
            afcr r0 = defpackage.afcr.a
            int r4 = r7.a
            defpackage.woy.dF(r8)
            if (r4 == 0) goto L13
            goto L40
        L13:
            java.lang.Object r8 = r7.d
            bxd r8 = (defpackage.bxd) r8
            java.lang.Object r4 = r7.c
            afcp r5 = defpackage.afcp.a
            boolean r5 = defpackage.affa.f(r4, r5)
            java.lang.Object r6 = r7.b
            if (r5 == 0) goto L31
            byk r1 = new byk
            r1.<init>(r8, r3)
            r7.a = r3
            java.lang.Object r7 = r6.hR(r1, r7)
            if (r7 != r0) goto L40
            goto L3f
        L31:
            beh r3 = new beh
            r5 = 6
            r3.<init>(r6, r8, r2, r5)
            r7.a = r1
            java.lang.Object r7 = defpackage.ahnc.a(r4, r3, r7)
            if (r7 != r0) goto L40
        L3f:
            return r0
        L40:
            afak r7 = defpackage.afak.a
            return r7
        L43:
            afcr r0 = defpackage.afcr.a
            int r1 = r7.a
            if (r1 == 0) goto L4d
            defpackage.woy.dF(r8)
            goto L75
        L4d:
            defpackage.woy.dF(r8)
            java.lang.Object r8 = r7.d
            aitx r8 = (defpackage.aitx) r8
            affv r1 = new affv
            r1.<init>()
            java.lang.Object r4 = r7.c
            byl r5 = new byl
            r5.<init>(r4, r2)
            aiyb r2 = new aiyb
            r2.<init>(r5)
            java.lang.Object r4 = r7.b
            aml r5 = new aml
            r5.<init>(r1, r8, r4)
            r7.a = r3
            java.lang.Object r7 = r2.hR(r5, r7)
            if (r7 != r0) goto L75
            return r0
        L75:
            afak r7 = defpackage.afak.a
            return r7
        L78:
            afcr r0 = defpackage.afcr.a
            int r4 = r7.a
            if (r4 == 0) goto L8c
            if (r4 == r3) goto L84
            defpackage.woy.dF(r8)
            goto Lad
        L84:
            java.lang.Object r3 = r7.d
            aitx r3 = (defpackage.aitx) r3
            defpackage.woy.dF(r8)
            goto La0
        L8c:
            defpackage.woy.dF(r8)
            java.lang.Object r8 = r7.d
            aitx r8 = (defpackage.aitx) r8
            java.lang.Object r4 = r7.b
            r7.d = r8
            r7.a = r3
            java.lang.Object r3 = r4.n(r7)
            if (r3 == r0) goto Lb0
            r3 = r8
        La0:
            java.lang.Object r8 = r7.c
            r7.d = r2
            r7.a = r1
            java.lang.Object r7 = r8.invoke(r3, r7)
            if (r7 != r0) goto Lad
            goto Lb0
        Lad:
            afak r7 = defpackage.afak.a
            return r7
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqs.hT(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.e;
        if (i == 0) {
            return ((aqs) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 1) {
            return ((aqs) b((bxd) obj, (afck) obj2)).hT(afak.a);
        }
        return ((aqs) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqs(afdr afdrVar, afeg afegVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.c = afdrVar;
        this.b = afegVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqs(aivh aivhVar, afeg afegVar, afck afckVar, int i) {
        super(2, afckVar);
        this.e = i;
        this.b = aivhVar;
        this.c = afegVar;
    }
}
