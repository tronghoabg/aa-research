package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mmj implements defpackage.kjd {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mmj(com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParams, msa msaVar, int i) {
        this.c = i;
        this.b = carWindowLayoutParams;
        this.a = msaVar;
    }

    @Override // defpackage.kjd
    public final java.lang.Object a() {
        int i = this.c;
        if (i == 0) {
            defpackage.yqm yqmVar = defpackage.mmk.a;
            defpackage.mkp.a.g();
            return defpackage.oml.y((defpackage.qsh) this.a, (java.lang.String) this.b, "");
        }
        if (i == 1) {
            kzr kzrVar = new kzr();
            defpackage.noy noyVarB = defpackage.nsu.b((com.google.android.gms.car.CarWindowLayoutParams) this.b, "com.google.android.projection.gearhead/AssistantScrim", kzrVar, defpackage.ler.c());
            noyVarB.e = this.a;
            noyVarB.f = 643;
            return noyVarB.a();
        }
        if (i != 2) {
            defpackage.mkp.a.g();
            boolean zL = defpackage.oyr.l(defpackage.oml.w(defpackage.kit.b().e(), (com.google.android.gms.car.display.CarDisplayId) this.b));
            ((defpackage.oyr) this.a).b = zL;
            return java.lang.Boolean.valueOf(zL);
        }
        java.lang.Object obj = this.a;
        java.lang.Object obj2 = this.b;
        defpackage.yqm yqmVar2 = msc.a;
        return defpackage.nsu.b((com.google.android.gms.car.CarWindowLayoutParams) obj2, "ClusterSliver", (android.support.v4.app.Fragment) obj, defpackage.ler.c()).a();
    }

    public /* synthetic */ mmj(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
