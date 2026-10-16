package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* loaded from: classes2.dex */
abstract class ez {
    private BroadcastReceiver a;
    final /* synthetic */ fe c;

    public ez(fe feVar) {
        this.c = feVar;
    }

    public abstract IntentFilter a();

    public abstract void b();

    final void c() {
        BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            try {
                this.c.k.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    final void d() {
        c();
        IntentFilter intentFilterA = a();
        if (intentFilterA.countActions() == 0) {
            return;
        }
        if (this.a == null) {
            this.a = new ey(this);
        }
        fe feVar = this.c;
        feVar.k.registerReceiver(this.a, intentFilterA);
    }
}
