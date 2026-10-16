package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mdn implements defpackage.lhn {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.BatteryMonitor");
    private final android.content.Context c;
    private final defpackage.mdm d = new defpackage.mdm();
    private boolean e;

    public mdn(android.content.Context context) {
        this.c = context;
    }

    @Override // defpackage.lhn
    public final void d() {
        if (this.e) {
            this.c.unregisterReceiver(this.d);
            this.e = false;
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        if (this.e) {
            ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 4782)).u("Already started, ignoring.");
            return;
        }
        defpackage.mdm mdmVar = this.d;
        android.content.Context context = this.c;
        defpackage.mdm.c(context);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        defpackage.duw.e(context, mdmVar, intentFilter, null, 2);
        this.e = true;
    }
}
