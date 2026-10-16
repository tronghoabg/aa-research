package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cba extends defpackage.cbd {
    public static final defpackage.cba a = new defpackage.cba();

    private cba() {
        super(1, 1);
    }

    @Override // defpackage.cbd
    protected final void a(defpackage.cbg cbgVar, defpackage.buq buqVar, defpackage.bzp bzpVar, defpackage.cdg cdgVar, defpackage.cbe cbeVar) {
        java.lang.Object objC = cbgVar.c(0);
        boolean z = objC instanceof defpackage.bxx;
        int iA = cbgVar.a(0);
        if (z) {
            cdgVar.g((defpackage.bxx) objC);
        }
        java.lang.Object objT = bzpVar.t(bzpVar.o, iA, objC);
        if (objT instanceof defpackage.bxx) {
            cdgVar.e((defpackage.bxx) objT);
        } else if (objT instanceof defpackage.bxl) {
            ((defpackage.bxl) objT).b();
        }
    }
}
