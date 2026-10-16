package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ajn implements defpackage.affh {
    final /* synthetic */ defpackage.akl a;
    final /* synthetic */ boolean b;
    final /* synthetic */ defpackage.ddw c;
    final /* synthetic */ defpackage.afer d;

    public ajn(defpackage.akl aklVar, boolean z, defpackage.ddw ddwVar, defpackage.afer aferVar) {
        this.a = aklVar;
        this.b = z;
        this.c = ddwVar;
        this.d = aferVar;
    }

    @Override // defpackage.affh
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.bve bveVar = (defpackage.bve) obj2;
        ((java.lang.Number) obj3).intValue();
        bveVar.v(-1525724089);
        java.lang.Object objG = bveVar.g();
        if (objG == defpackage.bvd.a) {
            objG = new defpackage.asl();
            bveVar.x(objG);
        }
        defpackage.ask askVar = (defpackage.ask) objG;
        defpackage.cgf cgfVarA = defpackage.akn.a(defpackage.cgf.e, askVar, this.a).a(new defpackage.ajm(askVar, null, false, this.b, null, this.c, this.d));
        bveVar.o();
        return cgfVarA;
    }
}
