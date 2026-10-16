package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nfz extends defpackage.eqp {
    private final defpackage.nfy a = new defpackage.nfy(this);

    @Override // defpackage.eqp
    protected final void c() {
        m(java.lang.Boolean.valueOf(defpackage.lvs.S(defpackage.mkp.a.c)));
        defpackage.mkp.a.c.registerReceiver(this.a, new android.content.IntentFilter("android.net.wifi.WIFI_AP_STATE_CHANGED"));
    }

    @Override // defpackage.eqp
    protected final void d() {
        defpackage.mkp.a.c.unregisterReceiver(this.a);
    }
}
