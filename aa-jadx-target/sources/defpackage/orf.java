package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class orf extends defpackage.eqp {
    public final ore a = new ore(this);
    private final android.content.Context h;
    private final ora i;

    public orf(android.content.Context context, ora oraVar) {
        this.h = context;
        this.i = oraVar;
    }

    @Override // defpackage.eqp
    protected final void c() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        android.content.Context context = this.h;
        defpackage.duw.e(context, this.a, intentFilter, null, 2);
        ord ordVar = new ord(this, 1);
        android.bluetooth.BluetoothAdapter defaultAdapter = android.bluetooth.BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.isEnabled()) {
            defaultAdapter.getProfileProxy(context, new orh(this.i, defaultAdapter, context, ordVar), 1);
            return;
        }
        int i = defpackage.ygw.d;
        defpackage.ygw ygwVar = defpackage.ymx.a;
        ordVar.a(new ork());
    }

    @Override // defpackage.eqp
    protected final void d() {
        this.h.unregisterReceiver(this.a);
    }
}
