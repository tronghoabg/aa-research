package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class jnw implements java.lang.Runnable {
    final /* synthetic */ android.content.Context a;
    final /* synthetic */ android.content.Intent b;
    final /* synthetic */ defpackage.zif c;
    final /* synthetic */ defpackage.jnx d;

    public jnw(defpackage.jnx jnxVar, android.content.Context context, android.content.Intent intent, defpackage.zif zifVar) {
        this.a = context;
        this.b = intent;
        this.c = zifVar;
        this.d = jnxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.a;
        android.content.Intent intent = this.b;
        android.content.ServiceConnection serviceConnection = this.d.d;
        if (context.bindService(intent, serviceConnection, 65)) {
            return;
        }
        defpackage.jnx.a(this.c, "Failed to bind to CarChimeraService in Gearhead.");
        context.unbindService(serviceConnection);
    }
}
