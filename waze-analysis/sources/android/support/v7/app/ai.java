package android.support.v7.app;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
abstract class ai {

    /* renamed from: a, reason: collision with root package name */
    private BroadcastReceiver f511a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ an f512b;

    ai(an anVar) {
        this.f512b = anVar;
    }

    abstract int a();

    abstract IntentFilter b();

    abstract void c();

    final void d() {
        BroadcastReceiver broadcastReceiver = this.f511a;
        if (broadcastReceiver != null) {
            try {
                this.f512b.f530d.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.f511a = null;
        }
    }

    final void e() {
        d();
        IntentFilter intentFilterB = b();
        if (intentFilterB.countActions() == 0) {
            return;
        }
        if (this.f511a == null) {
            this.f511a = new ah(this);
        }
        an anVar = this.f512b;
        anVar.f530d.registerReceiver(this.f511a, intentFilterB);
    }
}
