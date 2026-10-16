package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tcq extends defpackage.afee implements defpackage.affg {
    java.lang.Object a;
    int b;
    final /* synthetic */ j$.time.Duration c;
    final /* synthetic */ defpackage.gkc d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcq(defpackage.gkc gkcVar, j$.time.Duration duration, defpackage.afdk afdkVar) {
        super(2, afdkVar);
        this.d = gkcVar;
        this.c = duration;
    }

    @Override // defpackage.afdy
    public final defpackage.afdk b(java.lang.Object obj, defpackage.afdk afdkVar) {
        defpackage.tcq tcqVar = new defpackage.tcq(this.d, this.c, afdkVar);
        tcqVar.e = obj;
        return tcqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r9.o(r1, r8) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
    
        if (r1.o(r9, r8) == r0) goto L26;
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
            int r1 = r8.b
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 == r5) goto L25
            if (r1 == r4) goto L19
            if (r1 == r3) goto L11
            goto L25
        L11:
            java.lang.Object r1 = r8.e
            tc r1 = (defpackage.tc) r1
            defpackage.afga.cz(r9)
            goto L71
        L19:
            java.lang.Object r1 = r8.a
            java.lang.Object r4 = r8.e
            tc r4 = (defpackage.tc) r4
            defpackage.afga.cz(r9)
            r9 = r1
            r1 = r4
            goto L63
        L25:
            defpackage.afga.cz(r9)
            goto L7f
        L29:
            defpackage.afga.cz(r9)
            java.lang.Object r9 = r8.e
            tc r9 = (defpackage.tc) r9
            gkc r1 = r8.d
            j$.time.Duration r6 = r8.c
            j$.time.Duration r1 = r1.t()
            j$.time.Duration r1 = r6.minus(r1)
            r1.getClass()
            j$.time.Duration r6 = j$.time.Duration.ZERO
            int r6 = r1.compareTo(r6)
            if (r6 > 0) goto L52
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r8.b = r5
            java.lang.Object r8 = r9.o(r1, r8)
            if (r8 != r0) goto L7f
            goto L82
        L52:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r8.e = r9
            r8.a = r1
            r8.b = r4
            java.lang.Object r4 = r9.o(r5, r8)
            if (r4 == r0) goto L82
            r7 = r1
            r1 = r9
            r9 = r7
        L63:
            r8.e = r1
            r8.a = r2
            r8.b = r3
            j$.time.Duration r9 = (j$.time.Duration) r9
            java.lang.Object r9 = defpackage.ysr.cH(r9, r8)
            if (r9 == r0) goto L82
        L71:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r8.e = r2
            r2 = 4
            r8.b = r2
            java.lang.Object r8 = r1.o(r9, r8)
            if (r8 != r0) goto L7f
            goto L82
        L7f:
            afbk r8 = defpackage.afbk.a
            return r8
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tcq.hf(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.affg
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.tcq) b((defpackage.tc) obj, (defpackage.afdk) obj2)).hf(defpackage.afbk.a);
    }
}
