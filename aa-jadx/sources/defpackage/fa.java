package defpackage;

/* JADX INFO: loaded from: classes2.dex */
abstract class fa {
    private android.content.BroadcastReceiver a;
    final /* synthetic */ defpackage.ff c;

    public fa(defpackage.ff ffVar) {
        this.c = ffVar;
    }

    public abstract android.content.IntentFilter a();

    public abstract void b();

    final void c() {
        android.content.BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            try {
                this.c.k.unregisterReceiver(broadcastReceiver);
            } catch (java.lang.IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    final void d() {
        c();
        android.content.IntentFilter intentFilterA = a();
        if (intentFilterA.countActions() == 0) {
            return;
        }
        if (this.a == null) {
            this.a = new defpackage.ez(this);
        }
        defpackage.ff ffVar = this.c;
        ffVar.k.registerReceiver(this.a, intentFilterA);
    }
}
