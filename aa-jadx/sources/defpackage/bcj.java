package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bcj extends defpackage.cge implements defpackage.dda, defpackage.cxc {
    public final defpackage.anj a;
    private boolean b;

    public bcj(defpackage.anj anjVar) {
        this.a = anjVar;
    }

    public static final defpackage.cjj b(defpackage.bcj bcjVar, defpackage.ctc ctcVar, defpackage.afer aferVar) {
        java.lang.Object objInvoke;
        if (bcjVar.A && bcjVar.b) {
            defpackage.ctc ctcVarP = defpackage.cjv.p(bcjVar);
            if (true != ctcVar.t()) {
                ctcVar = null;
            }
            if (ctcVar != null && (objInvoke = aferVar.invoke()) != null) {
                return ((defpackage.cjj) objInvoke).f(ctcVarP.o(ctcVar, false).c());
            }
        }
        return null;
    }

    @Override // defpackage.dda
    public final java.lang.Object d(defpackage.ctc ctcVar, defpackage.afer aferVar, defpackage.afdk afdkVar) {
        java.lang.Object objA = defpackage.ahoi.a(new defpackage.bci(this, ctcVar, aferVar, new defpackage.axl(this, ctcVar, aferVar, 3), null), afdkVar);
        return objA == defpackage.afdr.a ? objA : defpackage.afbk.a;
    }

    @Override // defpackage.cxc
    public final void f(defpackage.ctc ctcVar) {
        this.b = true;
    }

    @Override // defpackage.cge
    public final boolean x() {
        return false;
    }

    @Override // defpackage.cyb
    public final /* synthetic */ void dB(long j) {
    }
}
