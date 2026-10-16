package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bzu extends defpackage.cbd {
    public static final defpackage.bzu a = new defpackage.bzu();

    private bzu() {
        super(0, 2);
    }

    @Override // defpackage.cbd
    protected final void a(defpackage.cbg cbgVar, defpackage.buq buqVar, defpackage.bzp bzpVar, defpackage.cdg cdgVar, defpackage.cbe cbeVar) {
        defpackage.bzh bzhVar = (defpackage.bzh) cbgVar.c(0);
        java.lang.Object objC = cbgVar.c(1);
        if (objC instanceof defpackage.bxx) {
            cdgVar.g((defpackage.bxx) objC);
        }
        if (bzpVar.m != 0) {
            defpackage.bvg.b("Can only append a slot if not current inserting");
        }
        int i = bzpVar.h;
        int i2 = bzpVar.i;
        int iA = bzpVar.a(bzhVar);
        int iC = bzpVar.c(bzpVar.b, bzpVar.g(iA + 1));
        bzpVar.h = iC;
        bzpVar.i = iC;
        bzpVar.C(1, iA);
        if (i >= iC) {
            i++;
            i2++;
        }
        bzpVar.c[iC] = objC;
        bzpVar.h = i;
        bzpVar.i = i2;
    }
}
