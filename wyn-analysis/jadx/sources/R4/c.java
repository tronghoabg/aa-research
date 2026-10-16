package R4;

import A7.V1;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import ba.C1521a;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10234a;

    /* renamed from: b, reason: collision with root package name */
    public final C1521a f10235b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10236c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10237d;

    /* renamed from: e, reason: collision with root package name */
    public final V1 f10238e = new V1(this, 7);

    public c(Context context, C1521a c1521a) {
        this.f10234a = context.getApplicationContext();
        this.f10235b = c1521a;
    }

    public static boolean c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        gc.b.k(connectivityManager, "Argument must not be null");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e7) {
            if (!Log.isLoggable("ConnectivityMonitor", 5)) {
                return true;
            }
            Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e7);
            return true;
        }
    }

    @Override // R4.e
    public final void a() {
        if (this.f10237d) {
            this.f10234a.unregisterReceiver(this.f10238e);
            this.f10237d = false;
        }
    }

    @Override // R4.e
    public final void b() {
        if (this.f10237d) {
            return;
        }
        Context context = this.f10234a;
        this.f10236c = c(context);
        try {
            context.registerReceiver(this.f10238e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f10237d = true;
        } catch (SecurityException e7) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e7);
            }
        }
    }

    @Override // R4.e
    public final void onDestroy() {
    }
}
