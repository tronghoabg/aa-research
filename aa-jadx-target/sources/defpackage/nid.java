package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nid implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public nid(defpackage.beq beqVar, defpackage.blw blwVar, int i) {
        this.c = i;
        this.b = beqVar;
        this.a = blwVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [beq, java.lang.Object] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(defpackage.cri criVar, defpackage.afdk afdkVar) {
        if (this.c != 0) {
            java.lang.Object objA = ahoi.a(new defpackage.bdw(criVar, this.b, (defpackage.blw) this.a, null), afdkVar);
            return objA == defpackage.afdr.a ? objA : defpackage.afbk.a;
        }
        java.lang.Object objR = criVar.r(new nja((defpackage.bys) this.a, (defpackage.bwx) this.b, (defpackage.afdk) null, 1, (byte[]) null), afdkVar);
        return objR == defpackage.afdr.a ? objR : defpackage.afbk.a;
    }

    public nid(defpackage.bys bysVar, defpackage.bwx bwxVar, int i) {
        this.c = i;
        this.a = bysVar;
        this.b = bwxVar;
    }
}
