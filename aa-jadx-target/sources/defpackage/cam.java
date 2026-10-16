package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cam extends defpackage.cbd {
    public static final defpackage.cam a = new defpackage.cam();

    private cam() {
        super(1, 1);
    }

    @Override // defpackage.cbd
    protected final void a(defpackage.cbg cbgVar, defpackage.buq buqVar, defpackage.bzp bzpVar, defpackage.cdg cdgVar, defpackage.cbe cbeVar) {
        defpackage.bzh bzhVar = (defpackage.bzh) cbgVar.c(0);
        int iA = cbgVar.a(0);
        buqVar.h();
        buqVar.i(iA, bzpVar.s(bzpVar.a(bzhVar)));
    }

    @Override // defpackage.cbd
    protected final defpackage.bzh b(defpackage.cbg cbgVar) {
        return (defpackage.bzh) cbgVar.c(0);
    }
}
