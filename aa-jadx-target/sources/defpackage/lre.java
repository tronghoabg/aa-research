package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lre implements defpackage.eqt, defpackage.epl {
    private android.content.ComponentName a;
    private boolean b;

    @Override // defpackage.epl
    public final void eT(defpackage.eqg eqgVar) {
        this.b = false;
    }

    @Override // defpackage.eqt
    public final /* synthetic */ void ea(java.lang.Object obj) {
        defpackage.lrd lrdVar = (defpackage.lrd) obj;
        android.content.ComponentName componentName = lrdVar.a;
        android.content.ComponentName componentName2 = lrdVar.b;
        defpackage.yqm yqmVar = defpackage.lrf.a;
        boolean z = this.b;
        this.b = true;
        android.content.ComponentName componentName3 = this.a;
        this.a = componentName2;
        if ((!j$.util.Objects.equals(componentName3, componentName2) && z) || componentName == null || j$.util.Objects.equals(componentName, this.a)) {
            return;
        }
        defpackage.yqm yqmVar2 = defpackage.lrf.a;
        defpackage.yqj yqjVar = (defpackage.yqj) yqmVar2.l().ai(4210);
        android.content.ComponentName componentName4 = this.a;
        defpackage.zke zkeVar = defpackage.zke.a;
        yqjVar.M("Writing default app from %s to newly playing %s", new defpackage.zkf(zkeVar, componentName4), new defpackage.zkf(zkeVar, componentName));
        defpackage.lhc.a().f(defpackage.mqg.MEDIA, componentName);
        if (!defpackage.lmp.a().e() || defpackage.lrf.a(componentName)) {
            return;
        }
        ((defpackage.yqj) yqmVar2.l().ai((char) 4211)).y("Writing default phone app to newly playing %s", new defpackage.zkf(zkeVar, componentName));
        defpackage.lhc.a().f(defpackage.mqg.PHONE_MEDIA, componentName);
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eU() {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eD(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eE(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eF(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eG(defpackage.eqg eqgVar) {
    }
}
