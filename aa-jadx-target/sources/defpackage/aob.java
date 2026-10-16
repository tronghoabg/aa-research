package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aob extends defpackage.afed implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.afer b;
    final /* synthetic */ defpackage.affh c;
    final /* synthetic */ defpackage.affg d;
    final /* synthetic */ defpackage.afer e;
    final /* synthetic */ defpackage.affc f;
    private /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aob(defpackage.afer aferVar, defpackage.affh affhVar, defpackage.affg affgVar, defpackage.afer aferVar2, defpackage.affc affcVar, defpackage.afdk afdkVar) {
        super(afdkVar);
        this.b = aferVar;
        this.c = affhVar;
        this.d = affgVar;
        this.e = aferVar2;
        this.f = affcVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.aob aobVar = new defpackage.aob(this.b, this.c, this.d, this.e, this.f, afdkVar);
        aobVar.g = obj;
        return aobVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (defpackage.ca.aU(r1, (defpackage.crd) r9, r3, r4, r5, r6, r8) == r0) goto L14;
     */
    @Override // defpackage.afdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hf(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            afdr r0 = defpackage.afdr.a
            int r1 = r8.a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.afga.cz(r9)
            goto L43
        Ld:
            java.lang.Object r1 = r8.g
            cru r1 = (defpackage.cru) r1
            defpackage.afga.cz(r9)
            goto L2a
        L15:
            defpackage.afga.cz(r9)
            java.lang.Object r9 = r8.g
            r1 = r9
            cru r1 = (defpackage.cru) r1
            cqv r9 = defpackage.cqv.a
            r8.g = r1
            r8.a = r2
            r2 = 0
            java.lang.Object r9 = defpackage.arc.a(r1, r2, r9, r8)
            if (r9 == r0) goto L46
        L2a:
            affh r3 = r8.c
            affg r4 = r8.d
            afer r5 = r8.e
            affc r6 = r8.f
            r2 = r9
            crd r2 = (defpackage.crd) r2
            r9 = 0
            r8.g = r9
            r9 = 2
            r8.a = r9
            r7 = r8
            java.lang.Object r8 = defpackage.ca.aU(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto L43
            goto L46
        L43:
            afbk r8 = defpackage.afbk.a
            return r8
        L46:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aob.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.aob) b((defpackage.cru) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
