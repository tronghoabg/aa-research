package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mud extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ defpackage.eqp d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mud(boolean z, boolean z2, defpackage.eqp eqpVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = z;
        this.c = z2;
        this.d = eqpVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.mud mudVar = new defpackage.mud(this.b, this.c, this.d, afdkVar);
        mudVar.e = obj;
        return mudVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r1.o(r5, r4) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r1.o(r5, r4) == r0) goto L21;
     */
    @Override // defpackage.afdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hf(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            afdr r0 = defpackage.afdr.a
            int r1 = r4.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 == r2) goto Ld
            goto L15
        Ld:
            java.lang.Object r1 = r4.e
            tc r1 = (defpackage.tc) r1
            defpackage.afga.cz(r5)
            goto L39
        L15:
            defpackage.afga.cz(r5)
            goto L61
        L19:
            defpackage.afga.cz(r5)
            java.lang.Object r5 = r4.e
            r1 = r5
            tc r1 = (defpackage.tc) r1
            boolean r5 = r4.b
            if (r5 != 0) goto L4f
            boolean r5 = r4.c
            if (r5 == 0) goto L2a
            goto L4f
        L2a:
            r5 = 5
            j$.time.Duration r5 = defpackage.ysr.cE(r5)
            r4.e = r1
            r4.a = r2
            java.lang.Object r5 = defpackage.ysr.cH(r5, r4)
            if (r5 == r0) goto L60
        L39:
            eqp r5 = r4.d
            java.lang.Object r5 = r5.e()
            r5.getClass()
            r2 = 0
            r4.e = r2
            r2 = 3
            r4.a = r2
            java.lang.Object r4 = r1.o(r5, r4)
            if (r4 != r0) goto L61
            goto L60
        L4f:
            eqp r5 = r4.d
            java.lang.Object r5 = r5.e()
            r5.getClass()
            r4.a = r3
            java.lang.Object r4 = r1.o(r5, r4)
            if (r4 != r0) goto L61
        L60:
            return r0
        L61:
            afbk r4 = defpackage.afbk.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mud.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.mud) b((defpackage.tc) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
