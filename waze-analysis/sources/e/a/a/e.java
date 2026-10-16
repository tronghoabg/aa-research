package e.a.a;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.util.Log;
import e.a.bx;
import e.a.cq;
import e.a.h;
import e.a.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e extends bx {

    /* renamed from: a, reason: collision with root package name */
    private final bx f46227a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f46228b;

    /* renamed from: c, reason: collision with root package name */
    private final ConnectivityManager f46229c;

    e(bx bxVar, Context context) {
        this.f46227a = bxVar;
        this.f46228b = context;
        if (context == null) {
            this.f46229c = null;
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f46229c = connectivityManager;
        try {
            if (connectivityManager != null) {
                c cVar = new c(this);
                connectivityManager.registerDefaultNetworkCallback(cVar);
                new a(this, cVar);
            } else {
                d dVar = new d(this);
                context.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                new b(this, dVar);
            }
        } catch (SecurityException e2) {
            Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e2);
        }
    }

    @Override // e.a.i
    public final k a(cq cqVar, h hVar) {
        return this.f46227a.a(cqVar, hVar);
    }

    @Override // e.a.i
    public final String b() {
        return this.f46227a.b();
    }

    @Override // e.a.bx
    public final void d() {
        this.f46227a.d();
    }
}
