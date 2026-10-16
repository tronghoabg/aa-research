package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jyz implements defpackage.epl {
    private final android.content.Context a;
    private final android.content.BroadcastReceiver b;
    private final defpackage.epy c;

    public jyz(android.content.Context context, android.content.BroadcastReceiver broadcastReceiver, defpackage.epy epyVar) {
        this.a = context;
        this.b = broadcastReceiver;
        this.c = epyVar;
    }

    @Override // defpackage.epl
    public final void eG(defpackage.eqg eqgVar) {
        defpackage.duw.e(this.a, this.b, new android.content.IntentFilter("androidx.car.app.action.CarAppNotificationAction"), null, true != defpackage.acpd.Z() ? 2 : 4);
    }

    @Override // defpackage.epl
    public final void eT(defpackage.eqg eqgVar) {
        this.a.unregisterReceiver(this.b);
        this.c.d(this);
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
}
