package k4;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import ef.C2515C;
import f4.C2558e;
import g4.InterfaceC2703d;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class j implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39274a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f39275b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2703d f39276c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f39277d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f39278e;

    public j(X3.k kVar, Context context) {
        InterfaceC2703d bVar;
        this.f39274a = context;
        this.f39275b = new WeakReference(kVar);
        kVar.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) Y0.e.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager == null || Y0.e.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            bVar = new ae.b();
        } else {
            try {
                bVar = new Dd.c(connectivityManager, this);
            } catch (Exception unused) {
                bVar = new ae.b();
            }
        }
        this.f39276c = bVar;
        this.f39277d = bVar.k();
        this.f39278e = new AtomicBoolean(false);
    }

    public final void a() {
        if (this.f39278e.getAndSet(true)) {
            return;
        }
        this.f39274a.unregisterComponentCallbacks(this);
        this.f39276c.shutdown();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        if (((X3.k) this.f39275b.get()) == null) {
            a();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i5) {
        C2515C c2515c;
        X3.k kVar = (X3.k) this.f39275b.get();
        if (kVar != null) {
            C2558e c2558e = (C2558e) kVar.f16113c.getValue();
            if (c2558e != null) {
                c2558e.f34813a.b(i5);
                c2558e.f34814b.b(i5);
            }
            c2515c = C2515C.f34653a;
        } else {
            c2515c = null;
        }
        if (c2515c == null) {
            a();
        }
    }
}
