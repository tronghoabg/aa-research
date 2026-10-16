package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tcg extends defpackage.eqp {
    private final android.content.Context a;
    private final android.content.IntentFilter h;
    private final android.content.BroadcastReceiver i = new defpackage.tcf(this);

    public tcg(android.content.Context context, android.content.IntentFilter intentFilter) {
        this.a = context.getApplicationContext();
        this.h = intentFilter;
    }

    @Override // defpackage.eqp
    protected final void c() {
        this.a.registerReceiver(this.i, this.h);
    }

    @Override // defpackage.eqp
    protected final void d() {
        this.a.unregisterReceiver(this.i);
    }
}
