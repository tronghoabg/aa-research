package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ntr extends defpackage.eqp {
    private final android.content.BroadcastReceiver a = new defpackage.ntq(this);
    private final android.content.Context h;

    public ntr(android.content.Context context) {
        this.h = context;
    }

    public final void a(android.content.Context context) {
        m(java.lang.Boolean.valueOf(android.provider.Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) == 1));
    }

    @Override // defpackage.eqp
    protected final void c() {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.AIRPLANE_MODE");
        android.content.Context context = this.h;
        defpackage.duw.e(context, this.a, intentFilter, null, 2);
        a(context);
    }

    @Override // defpackage.eqp
    protected final void d() {
        this.h.unregisterReceiver(this.a);
    }
}
