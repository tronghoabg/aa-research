package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bcl implements defpackage.affh {
    final /* synthetic */ defpackage.akl a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ defpackage.ddw d;
    final /* synthetic */ defpackage.afer e;

    public bcl(defpackage.akl aklVar, boolean z, boolean z2, defpackage.ddw ddwVar, defpackage.afer aferVar) {
        this.a = aklVar;
        this.b = z;
        this.c = z2;
        this.d = ddwVar;
        this.e = aferVar;
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
        defpackage.cgf cgfVarA = defpackage.akn.a(defpackage.cgf.e, askVar, this.a).a(new defpackage.bck(this.b, askVar, null, this.c, this.d, this.e));
        bveVar.o();
        return cgfVarA;
    }
}
