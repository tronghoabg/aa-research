package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cae extends defpackage.cbd {
    public static final defpackage.cae a = new defpackage.cae();

    private cae() {
        super(0, 1);
    }

    @Override // defpackage.cbd
    protected final void a(defpackage.cbg cbgVar, defpackage.buq buqVar, defpackage.bzp bzpVar, defpackage.cdg cdgVar, defpackage.cbe cbeVar) {
        defpackage.bzc bzcVar;
        defpackage.bxl bxlVar = (defpackage.bxl) cbgVar.c(0);
        defpackage.aau aauVar = cdgVar.j;
        if (aauVar == null || ((defpackage.cdb) aauVar.a(bxlVar)) == null) {
            return;
        }
        java.util.ArrayList arrayList = cdgVar.f;
        if (arrayList != null && (bzcVar = (defpackage.bzc) arrayList.remove(arrayList.size() - 1)) != null) {
            cdgVar.c = bzcVar;
        }
        aauVar.i(bxlVar);
    }
}
