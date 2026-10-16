package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bzv extends defpackage.cbd {
    public static final defpackage.bzv a = new defpackage.bzv();

    private bzv() {
        super(0, 2);
    }

    @Override // defpackage.cbd
    protected final void a(defpackage.cbg cbgVar, defpackage.buq buqVar, defpackage.bzp bzpVar, defpackage.cdg cdgVar, defpackage.cbe cbeVar) {
        defpackage.cda cdaVar = (defpackage.cda) cbgVar.c(1);
        int i = cdaVar != null ? cdaVar.a : 0;
        defpackage.khb khbVar = (defpackage.khb) cbgVar.c(0);
        if (i > 0) {
            buqVar = new defpackage.bxa(buqVar, i);
        }
        khbVar.l(buqVar, bzpVar, cdgVar, cbeVar != null ? new defpackage.cbf(cbeVar, bzpVar) : null);
    }
}
