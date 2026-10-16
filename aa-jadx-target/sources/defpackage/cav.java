package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cav extends defpackage.cbd {
    public static final defpackage.cav a = new defpackage.cav();

    private cav() {
        super(0, 1);
    }

    @Override // defpackage.cbd
    protected final void a(defpackage.cbg cbgVar, defpackage.buq buqVar, defpackage.bzp bzpVar, defpackage.cdg cdgVar, defpackage.cbe cbeVar) {
        defpackage.bxl bxlVar = (defpackage.bxl) cbgVar.c(0);
        defpackage.aau aauVar = cdgVar.j;
        defpackage.cdb cdbVar = aauVar != null ? (defpackage.cdb) aauVar.a(bxlVar) : null;
        if (cdbVar != null) {
            java.util.ArrayList arrayList = cdgVar.f;
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                cdgVar.f = arrayList;
            }
            arrayList.add(cdgVar.c);
            cdgVar.c = cdbVar.a;
        }
    }
}
