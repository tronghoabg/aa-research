package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class oyr implements defpackage.epl {
    private static final defpackage.yqm c = defpackage.yqm.c("GH.SecondaryDCM");
    public final rdb a = new defpackage.oyq(this, 0);
    public boolean b = true;
    private com.google.android.gms.car.display.CarDisplayId d = null;
    private defpackage.tho e = null;

    public oyr(defpackage.eqg eqgVar) {
        eqgVar.getLifecycle().c(this);
        defpackage.lhe.b().a(defpackage.mqg.NAVIGATION).eM(eqgVar, new defpackage.nuk(this, 17));
    }

    public static final boolean l(com.google.android.gms.car.display.CarDisplayUiFeatures carDisplayUiFeatures) {
        return !carDisplayUiFeatures.a(16);
    }

    private final void m(android.content.Intent intent) {
        intent.putExtra("com.google.android.gms.car.EXTRA_SHOW_TURN_CARD", this.b);
    }

    @Override // defpackage.epl
    public final void eG(defpackage.eqg eqgVar) {
        defpackage.tho thoVarK = k();
        this.e = thoVarK;
        if (thoVarK == null) {
            return;
        }
        com.google.android.gms.car.display.CarDisplayId carDisplayId = ((defpackage.ntb) thoVarK.i(defpackage.ntb.class)).o;
        this.d = carDisplayId;
        defpackage.mmj mmjVar = new defpackage.mmj(this, carDisplayId, 3);
        defpackage.zbe zbeVar = defpackage.zbe.CAR_DISPLAY_UI_FEATURES;
        defpackage.kgu.c(mmjVar, "GH.SecondaryDCM", zbeVar, defpackage.zbd.Lq, true, "Error getting initial values.", new java.lang.Object[0]);
        defpackage.kgu.d(new defpackage.mjh(this, this.d, 6, null), "GH.SecondaryDCM", zbeVar, defpackage.zbd.Lr, "Error registering listener.", new java.lang.Object[0]);
    }

    @Override // defpackage.epl
    public final void eT(defpackage.eqg eqgVar) {
        if (this.e == null) {
            return;
        }
        com.google.android.gms.car.display.CarDisplayId carDisplayId = this.d;
        carDisplayId.getClass();
        if (defpackage.kit.b().q()) {
            defpackage.kgu.d(new defpackage.mjh(this, carDisplayId, 5, null), "GH.SecondaryDCM", defpackage.zbe.CAR_DISPLAY_UI_FEATURES, defpackage.zbd.Ls, "Error unregistering listener.", new java.lang.Object[0]);
        }
    }

    public abstract android.content.Intent g();

    public abstract android.content.Intent h();

    protected abstract java.lang.String i();

    public final void j(android.content.Intent intent, android.content.Intent intent2) {
        m(intent);
        m(intent2);
        defpackage.tho thoVar = this.e;
        if (thoVar == null) {
            i();
            return;
        }
        defpackage.mpq mpqVar = (defpackage.mpq) thoVar.i(defpackage.mpq.class);
        i();
        try {
            mpqVar.a(intent);
        } catch (java.lang.IllegalArgumentException unused) {
            intent2.getComponent().getClass();
            ((defpackage.yqj) ((defpackage.yqj) c.g()).ai(6162)).R("Failed to start navigation intent: %s. Starting fallback intent: %s for %s", intent, intent2, i());
            mpqVar.a(intent2);
        }
    }

    protected abstract defpackage.tho k();

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
}
