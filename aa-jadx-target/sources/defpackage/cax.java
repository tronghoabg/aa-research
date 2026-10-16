package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cax extends defpackage.cbd {
    public static final defpackage.cax a = new defpackage.cax();

    private cax() {
        super(1, 2);
    }

    @Override // defpackage.cbd
    protected final void a(defpackage.cbg cbgVar, defpackage.buq buqVar, defpackage.bzp bzpVar, defpackage.cdg cdgVar, defpackage.cbe cbeVar) {
        java.lang.Object objC = cbgVar.c(0);
        defpackage.bzh bzhVar = (defpackage.bzh) cbgVar.c(1);
        boolean z = objC instanceof defpackage.bxx;
        int iA = cbgVar.a(0);
        if (z) {
            cdgVar.g((defpackage.bxx) objC);
        }
        java.lang.Object objT = bzpVar.t(bzpVar.a(bzhVar), iA, objC);
        if (objT instanceof defpackage.bxx) {
            cdgVar.e((defpackage.bxx) objT);
        } else if (objT instanceof defpackage.bxl) {
            ((defpackage.bxl) objT).b();
        }
    }
}
