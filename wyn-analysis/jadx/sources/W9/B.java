package W9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class B extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public C f15289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f15290b;

    public B(C c10, C c11) {
        this.f15290b = c10;
        this.f15289a = c11;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        C c10 = this.f15290b;
        c10.f15294a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            C c10 = this.f15289a;
            if (c10 == null) {
                return;
            }
            if (c10.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                C c11 = this.f15289a;
                c11.f15297d.f15286f.schedule(c11, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f15289a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
