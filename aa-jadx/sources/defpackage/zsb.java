package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zsb extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.zsc a;
    private volatile boolean b;

    public zsb(defpackage.zsc zscVar) {
        this.a = zscVar;
    }

    public final void a(android.content.Context context) {
        defpackage.zsx.a.a();
        this.b = true;
        context.registerReceiver(this, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (defpackage.zsj.b(context) && this.b) {
            defpackage.zsc zscVar = this.a;
            zscVar.j.b(zscVar);
            context.unregisterReceiver(this);
            this.b = false;
        }
    }
}
