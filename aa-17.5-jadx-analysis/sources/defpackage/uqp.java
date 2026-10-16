package defpackage;

import j$.lang.Iterable$EL;

/* loaded from: classes3.dex */
public final class uqp {
    public final yfq a;
    public final yfq b;
    public final uqq c;
    public final /* synthetic */ uqt d;
    private final uru e;
    private final urr f;

    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public uqp(defpackage.uqt r22, defpackage.abbd r23, defpackage.urv r24, defpackage.uqq r25) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uqp.<init>(uqt, abbd, urv, uqq):void");
    }

    static /* synthetic */ abdl c(abdl abdlVar, trt trtVar) {
        abnr abnrVar = (abnr) abdlVar.K();
        abnh abnhVar = abhe.a;
        abdlVar.j(abnhVar);
        Object objJ = abdlVar.w.j(abnhVar.d);
        abnp abnpVarK = ((abhd) (objJ == null ? abnhVar.b : abnhVar.c(objJ))).K();
        long j = trtVar.a;
        abnpVarK.t();
        abhd abhdVar = (abhd) abnpVarK.b;
        abhdVar.b |= 1;
        abhdVar.c = j;
        abnrVar.bc(abnhVar, (abhd) abnpVarK.q());
        return (abdl) abnrVar.q();
    }

    final void a() {
        this.c.b();
        Iterable$EL.forEach(this.a, new qio(this, 6));
        Iterable$EL.forEach(this.b, new qio(this, 7));
        uru uruVar = this.e;
        if (uruVar != null) {
            uruVar.close();
        }
        urr urrVar = this.f;
        if (urrVar != null) {
            urrVar.close();
        }
    }

    final void b() {
        this.c.c();
        Iterable$EL.forEach(this.a, new qio(this, 10));
        Iterable$EL.forEach(this.b, new qio(this, 11));
    }
}
