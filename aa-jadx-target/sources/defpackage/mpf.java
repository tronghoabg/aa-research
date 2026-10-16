package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mpf implements defpackage.lhn {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.PhoneStateMonitor");
    private final android.content.BroadcastReceiver b = new mpe();

    @Override // defpackage.lhn
    public final void d() {
        defpackage.mkp.a.c.unregisterReceiver(this.b);
    }

    @Override // defpackage.lhn
    public final void eQ() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        defpackage.duw.e(defpackage.mkp.a.c, this.b, intentFilter, null, 2);
    }
}
