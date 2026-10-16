package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cah extends defpackage.cbd {
    public static final defpackage.cah a = new defpackage.cah();

    private cah() {
        super(1, 2);
    }

    @Override // defpackage.cbd
    protected final void a(defpackage.cbg cbgVar, defpackage.buq buqVar, defpackage.bzp bzpVar, defpackage.cdg cdgVar, defpackage.cbe cbeVar) {
        java.lang.Object objInvoke = ((defpackage.afer) cbgVar.c(0)).invoke();
        defpackage.bzh bzhVar = (defpackage.bzh) cbgVar.c(1);
        int iA = cbgVar.a(0);
        bzpVar.P(bzpVar.a(bzhVar), objInvoke);
        buqVar.j(iA, objInvoke);
        buqVar.d(objInvoke);
    }

    @Override // defpackage.cbd
    protected final defpackage.bzh b(defpackage.cbg cbgVar) {
        return (defpackage.bzh) cbgVar.c(1);
    }
}
