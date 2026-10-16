package nd;

import F6.r;
import Q3.h;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import md.AbstractC3538f;
import md.C3535c;
import md.EnumC3545m;
import md.S;
import v9.n;

/* renamed from: nd.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3616b extends S {

    /* renamed from: a, reason: collision with root package name */
    public final S f41013a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f41014b;

    /* renamed from: c, reason: collision with root package name */
    public final ConnectivityManager f41015c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f41016d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public Runnable f41017e;

    public C3616b(S s10, Context context) {
        this.f41013a = s10;
        this.f41014b = context;
        if (context == null) {
            this.f41015c = null;
            return;
        }
        this.f41015c = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            o();
        } catch (SecurityException e7) {
            Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e7);
        }
    }

    @Override // md.AbstractC3536d
    public final String g() {
        return this.f41013a.g();
    }

    @Override // md.AbstractC3536d
    public final AbstractC3538f h(r rVar, C3535c c3535c) {
        return this.f41013a.h(rVar, c3535c);
    }

    @Override // md.S
    public final boolean i(long j8) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return this.f41013a.i(j8);
    }

    @Override // md.S
    public final void j() {
        this.f41013a.j();
    }

    @Override // md.S
    public final EnumC3545m k() {
        return this.f41013a.k();
    }

    @Override // md.S
    public final void l(EnumC3545m enumC3545m, n nVar) {
        this.f41013a.l(enumC3545m, nVar);
    }

    @Override // md.S
    public final S m() {
        synchronized (this.f41016d) {
            try {
                Runnable runnable = this.f41017e;
                if (runnable != null) {
                    runnable.run();
                    this.f41017e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f41013a.m();
    }

    @Override // md.S
    public final S n() {
        synchronized (this.f41016d) {
            try {
                Runnable runnable = this.f41017e;
                if (runnable != null) {
                    runnable.run();
                    this.f41017e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f41013a.n();
    }

    public final void o() {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < 24 || (connectivityManager = this.f41015c) == null) {
            C3615a c3615a = new C3615a(this, 0);
            this.f41014b.registerReceiver(c3615a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f41017e = new L7.b(this, false, c3615a, 22);
        } else {
            h hVar = new h(this, 3);
            connectivityManager.registerDefaultNetworkCallback(hVar);
            this.f41017e = new L7.b(this, false, hVar, 21);
        }
    }
}
