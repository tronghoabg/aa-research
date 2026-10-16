package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cap extends defpackage.cbd {
    public static final defpackage.cap a = new defpackage.cap();

    private cap() {
        super(0, 1);
    }

    @Override // defpackage.cbd
    protected final void a(defpackage.cbg cbgVar, defpackage.buq buqVar, defpackage.bzp bzpVar, defpackage.cdg cdgVar, defpackage.cbe cbeVar) {
        defpackage.bxl bxlVar = (defpackage.bxl) cbgVar.c(0);
        java.util.Set set = cdgVar.a;
        if (set == null) {
            return;
        }
        defpackage.cdb cdbVar = new defpackage.cdb(set);
        defpackage.aau aauVar = cdgVar.j;
        if (aauVar == null) {
            long[] jArr = defpackage.aav.a;
            aauVar = new defpackage.aau(6);
            cdgVar.j = aauVar;
        }
        aauVar.m(bxlVar, cdbVar);
        cdgVar.c.n(new defpackage.bwh(cdbVar, -1));
    }
}
