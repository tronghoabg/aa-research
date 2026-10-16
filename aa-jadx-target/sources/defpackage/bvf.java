package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bvf implements defpackage.bxm {
    final /* synthetic */ defpackage.bws a;
    final /* synthetic */ defpackage.bvk b;

    public bvf(defpackage.bvk bvkVar, defpackage.bws bwsVar) {
        this.b = bvkVar;
        this.a = bwsVar;
    }

    @Override // defpackage.bxm
    public final int c(defpackage.bxl bxlVar, java.lang.Object obj) {
        defpackage.bvk bvkVar = this.b;
        if (true != (bvkVar instanceof defpackage.bxm)) {
            bvkVar = null;
        }
        int iC = bvkVar != null ? bvkVar.c(bxlVar, obj) : 1;
        if (iC != 1) {
            return iC;
        }
        defpackage.bws bwsVar = this.a;
        bwsVar.d = defpackage.afga.aT(bwsVar.d, new defpackage.afau(bxlVar, obj));
        return 2;
    }

    @Override // defpackage.bxm
    public final void b() {
    }

    @Override // defpackage.bxm
    public final void a(java.lang.Object obj) {
    }
}
