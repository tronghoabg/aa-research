package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class orq extends defpackage.eqp {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.Bt.DeviceConnUpdate");
    final android.content.BroadcastReceiver h = new oro(this);
    private final android.content.Context i;

    public orq(android.content.Context context) {
        this.i = context;
    }

    public static defpackage.orq a() {
        return (defpackage.orq) defpackage.mkp.a.i(defpackage.orq.class);
    }

    @Override // defpackage.eqp
    protected final void c() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        defpackage.duw.e(this.i, this.h, intentFilter, null, 2);
    }

    @Override // defpackage.eqp
    protected final void d() {
        this.i.unregisterReceiver(this.h);
        p();
    }
}
