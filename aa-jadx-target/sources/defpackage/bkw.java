package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bkw extends defpackage.afed implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.bkb b;
    final /* synthetic */ defpackage.beq c;
    final /* synthetic */ defpackage.bwk d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkw(defpackage.bwk bwkVar, defpackage.bkb bkbVar, defpackage.beq beqVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.d = bwkVar;
        this.b = bkbVar;
        this.c = beqVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.bkw bkwVar = new defpackage.bkw(this.d, this.b, this.c, afdkVar);
        bkwVar.e = obj;
        return bkwVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005b  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (defpackage.bxi.C(r2, r3, r7, r6, r17) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (defpackage.bxi.A(r2, r4, r6, r17) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (defpackage.bxi.B(r2, r4, r6, r7, r17) == r1) goto L41;
     */
    /* JADX WARN: Type inference failed for: r14v1, types: [dck, java.lang.Object] */
    @Override // defpackage.afdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hf(java.lang.Object r18) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            afdr r1 = defpackage.afdr.a
            int r2 = r0.a
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L1c
            if (r2 == r5) goto L12
            defpackage.afga.cz(r18)
            goto Lad
        L12:
            java.lang.Object r2 = r0.e
            cru r2 = (defpackage.cru) r2
            defpackage.afga.cz(r18)
            r6 = r18
            goto L2d
        L1c:
            defpackage.afga.cz(r18)
            java.lang.Object r2 = r0.e
            cru r2 = (defpackage.cru) r2
            r0.e = r2
            r0.a = r5
            java.lang.Object r6 = defpackage.bxi.z(r2, r0)
            if (r6 == r1) goto Lb0
        L2d:
            bwk r7 = r0.d
            cqu r6 = (defpackage.cqu) r6
            java.util.List r8 = r6.a
            java.lang.Object r9 = r7.b
            r10 = 0
            java.lang.Object r11 = r8.get(r10)
            crd r11 = (defpackage.crd) r11
            if (r9 == 0) goto L5b
            long r12 = r11.b
            crd r9 = (defpackage.crd) r9
            long r14 = r9.b
            long r12 = r12 - r14
            java.lang.Object r14 = r7.c
            long r15 = r14.e()
            int r12 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r12 >= 0) goto L5b
            boolean r9 = defpackage.bxi.y(r14, r9, r11)
            if (r9 == 0) goto L5b
            int r9 = r7.a
            int r9 = r9 + r5
            r7.a = r9
            goto L5d
        L5b:
            r7.a = r5
        L5d:
            r7.b = r11
            boolean r9 = defpackage.blc.a(r6)
            r11 = 0
            if (r9 == 0) goto L8e
            int r3 = r6.c
            r3 = r3 & 33
            if (r3 == 0) goto Lad
            int r3 = r8.size()
        L70:
            if (r10 >= r3) goto L81
            java.lang.Object r5 = r8.get(r10)
            crd r5 = (defpackage.crd) r5
            boolean r5 = r5.c()
            if (r5 != 0) goto Lad
            int r10 = r10 + 1
            goto L70
        L81:
            bkb r3 = r0.b
            r0.e = r11
            r0.a = r4
            java.lang.Object r0 = defpackage.bxi.C(r2, r3, r7, r6, r0)
            if (r0 != r1) goto Lad
            goto Lb0
        L8e:
            beq r4 = r0.c
            if (r4 == 0) goto Lad
            int r7 = r7.a
            if (r7 != r5) goto La1
            r0.e = r11
            r0.a = r3
            java.lang.Object r0 = defpackage.bxi.A(r2, r4, r6, r0)
            if (r0 != r1) goto Lad
            goto Lb0
        La1:
            r0.e = r11
            r3 = 4
            r0.a = r3
            java.lang.Object r0 = defpackage.bxi.B(r2, r4, r6, r7, r0)
            if (r0 != r1) goto Lad
            goto Lb0
        Lad:
            afbk r0 = defpackage.afbk.a
            return r0
        Lb0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkw.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.bkw) b((defpackage.cru) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
