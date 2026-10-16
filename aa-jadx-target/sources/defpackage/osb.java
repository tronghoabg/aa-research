package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class osb extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.osc a;

    public osb(defpackage.osc oscVar) {
        this.a = oscVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        android.content.Context applicationContext = context.getApplicationContext();
        if (intent.getIntExtra("wifi_state", -1) == 1) {
            defpackage.osc oscVar = this.a;
            if (oscVar.d.compareAndSet(true, false)) {
                applicationContext.unregisterReceiver(this);
                oscVar.c.removeCallbacksAndMessages(this);
                ((android.net.wifi.WifiManager) applicationContext.getSystemService(android.net.wifi.WifiManager.class)).setWifiEnabled(true);
            }
        }
    }
}
