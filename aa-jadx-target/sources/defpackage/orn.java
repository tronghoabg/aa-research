package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class orn extends defpackage.eqp {
    public final android.content.BroadcastReceiver a = new orm(this);
    private final android.content.Context h;

    public orn(android.content.Context context) {
        this.h = context;
    }

    public static defpackage.orn a() {
        return (defpackage.orn) defpackage.mkp.a.i(defpackage.orn.class);
    }

    @Override // defpackage.eqp
    protected final void c() {
        defpackage.duw.e(this.h, this.a, new android.content.IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), null, 2);
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            m(10);
        } else {
            m(12);
        }
    }

    @Override // defpackage.eqp
    protected final void d() {
        this.h.unregisterReceiver(this.a);
    }
}
