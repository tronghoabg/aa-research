package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class bmu extends defpackage.afee implements defpackage.affg {
    int a;
    final /* synthetic */ defpackage.aeb b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ defpackage.bmv e;
    final /* synthetic */ defpackage.asi f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmu(defpackage.aeb aebVar, float f, boolean z, defpackage.bmv bmvVar, defpackage.asi asiVar, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.b = aebVar;
        this.c = f;
        this.d = z;
        this.e = bmvVar;
        this.f = asiVar;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        return new defpackage.bmu(this.b, this.c, this.d, this.e, this.f, afdkVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r7.e(r1, r6) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (btc.a(r7, r3, r1, r2, r6) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        return r0;
     */
    @Override // defpackage.afdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hf(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            afdr r0 = defpackage.afdr.a
            int r1 = r6.a
            r2 = 1
            defpackage.afga.cz(r7)
            if (r1 == 0) goto Lb
            goto L72
        Lb:
            aeb r7 = r6.b
            java.lang.Object r1 = r7.c()
            dlr r1 = (defpackage.dlr) r1
            float r1 = r1.a
            float r3 = r6.c
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 == 0) goto L72
            boolean r1 = r6.d
            if (r1 != 0) goto L2f
            dlr r1 = new dlr
            r1.<init>(r3)
            r6.a = r2
            java.lang.Object r6 = r7.e(r1, r6)
            if (r6 != r0) goto L72
            goto L71
        L2f:
            java.lang.Object r1 = r7.c()
            dlr r1 = (defpackage.dlr) r1
            float r1 = r1.a
            bmv r2 = r6.e
            float r4 = r2.a
            int r4 = java.lang.Float.compare(r1, r4)
            if (r4 != 0) goto L49
            asn r1 = new asn
            r4 = 0
            r1.<init>(r4)
            goto L66
        L49:
            float r4 = r2.c
            int r4 = java.lang.Float.compare(r1, r4)
            if (r4 != 0) goto L57
            asf r1 = new asf
            r1.<init>()
            goto L66
        L57:
            float r2 = r2.b
            int r1 = java.lang.Float.compare(r1, r2)
            if (r1 != 0) goto L65
            asd r1 = new asd
            r1.<init>()
            goto L66
        L65:
            r1 = 0
        L66:
            asi r2 = r6.f
            r4 = 2
            r6.a = r4
            java.lang.Object r6 = btc.a(r7, r3, r1, r2, r6)
            if (r6 != r0) goto L72
        L71:
            return r0
        L72:
            afbk r6 = defpackage.afbk.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmu.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.bmu) b((aiuw) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
