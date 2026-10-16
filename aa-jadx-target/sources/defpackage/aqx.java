package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aqx extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private /* synthetic */ java.lang.Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqx(defpackage.afdo afdoVar, aizj aizjVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.e = i;
        this.c = afdoVar;
        this.b = aizjVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aiwg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [afdo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aizj, java.lang.Object] */
    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        int i = this.e;
        if (i == 0) {
            defpackage.aqx aqxVar = new defpackage.aqx((aiwg) this.b, (defpackage.affg) this.c, afdkVar, 0);
            aqxVar.d = obj;
            return aqxVar;
        }
        if (i != 1) {
            defpackage.aqx aqxVar2 = new defpackage.aqx((defpackage.afdo) this.c, (aizj) this.b, afdkVar, 2);
            aqxVar2.d = obj;
            return aqxVar2;
        }
        defpackage.aqx aqxVar3 = new defpackage.aqx((defpackage.afer) this.c, (defpackage.affg) this.b, afdkVar, 1);
        aqxVar3.d = obj;
        return aqxVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r6.hd(r1, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (ahoc.a((defpackage.afdo) r4, r3, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
    
        if (r8.invoke(r3, r7) == r0) goto L39;
     */
    /* JADX WARN: Type inference failed for: r4v1, types: [aiwg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [affg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [afdo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [aizj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [affg, java.lang.Object] */
    @Override // defpackage.afdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hf(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = r7.e
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L78
            if (r0 == r3) goto L43
            afdr r0 = defpackage.afdr.a
            int r4 = r7.a
            defpackage.afga.cz(r8)
            if (r4 == 0) goto L13
            goto L40
        L13:
            java.lang.Object r8 = r7.d
            bxj r8 = (defpackage.bxj) r8
            java.lang.Object r4 = r7.c
            afdp r5 = defpackage.afdp.a
            boolean r5 = defpackage.afga.f(r4, r5)
            java.lang.Object r6 = r7.b
            if (r5 == 0) goto L31
            byq r1 = new byq
            r1.<init>(r8, r3)
            r7.a = r3
            java.lang.Object r7 = r6.hd(r1, r7)
            if (r7 != r0) goto L40
            goto L3f
        L31:
            bej r3 = new bej
            r5 = 6
            r3.<init>(r6, r8, r2, r5)
            r7.a = r1
            java.lang.Object r7 = ahoc.a(r4, r3, r7)
            if (r7 != r0) goto L40
        L3f:
            return r0
        L40:
            afbk r7 = defpackage.afbk.a
            return r7
        L43:
            afdr r0 = defpackage.afdr.a
            int r1 = r7.a
            if (r1 == 0) goto L4d
            defpackage.afga.cz(r8)
            goto L75
        L4d:
            defpackage.afga.cz(r8)
            java.lang.Object r8 = r7.d
            aiuw r8 = (aiuw) r8
            afgv r1 = new afgv
            r1.<init>()
            java.lang.Object r4 = r7.c
            byr r5 = new byr
            r5.<init>(r4, r2)
            aiza r2 = new aiza
            r2.<init>(r5)
            java.lang.Object r4 = r7.b
            amq r5 = new amq
            r5.<init>(r1, r8, r4)
            r7.a = r3
            java.lang.Object r7 = r2.hd(r5, r7)
            if (r7 != r0) goto L75
            return r0
        L75:
            afbk r7 = defpackage.afbk.a
            return r7
        L78:
            afdr r0 = defpackage.afdr.a
            int r4 = r7.a
            if (r4 == 0) goto L8c
            if (r4 == r3) goto L84
            defpackage.afga.cz(r8)
            goto Lad
        L84:
            java.lang.Object r3 = r7.d
            aiuw r3 = (aiuw) r3
            defpackage.afga.cz(r8)
            goto La0
        L8c:
            defpackage.afga.cz(r8)
            java.lang.Object r8 = r7.d
            aiuw r8 = (aiuw) r8
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
            afbk r7 = defpackage.afbk.a
            return r7
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqx.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.e;
        if (i == 0) {
            return ((defpackage.aqx) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        if (i != 1) {
            return ((defpackage.aqx) b((defpackage.bxj) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
        }
        return ((defpackage.aqx) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqx(defpackage.afer aferVar, defpackage.affg affgVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.e = i;
        this.c = aferVar;
        this.b = affgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqx(aiwg aiwgVar, defpackage.affg affgVar, defpackage.afdk afdkVar, int i) {
        super(2, afdkVar);
        this.e = i;
        this.b = aiwgVar;
        this.c = affgVar;
    }
}
