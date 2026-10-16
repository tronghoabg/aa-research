package kd;

import A7.AbstractC0279p0;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: kd.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3308d {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.ads.nativead.l f39646a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f39647b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f39648c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f39649d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final ReferenceQueue f39650e = new ReferenceQueue();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f39651f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Handler f39652g;

    /* renamed from: h, reason: collision with root package name */
    public final RunnableC3307c f39653h;

    /* renamed from: i, reason: collision with root package name */
    public long f39654i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f39655j;
    public final long k;

    public C3308d(com.google.android.gms.ads.nativead.l lVar) {
        this.f39646a = lVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f39652g = handler;
        RunnableC3307c runnableC3307c = new RunnableC3307c(this, 0);
        this.f39653h = runnableC3307c;
        this.f39654i = 65536L;
        this.k = 3000L;
        handler.postDelayed(runnableC3307c, 3000L);
    }

    public final void a(long j8, Object instance) {
        AbstractC3340k.e(instance, "instance");
        f();
        c(j8, instance);
    }

    public final long b(Object instance) {
        AbstractC3340k.e(instance, "instance");
        f();
        if (!d(instance)) {
            long j8 = this.f39654i;
            this.f39654i = 1 + j8;
            c(j8, instance);
            return j8;
        }
        throw new IllegalArgumentException(("Instance of " + instance.getClass() + " has already been added.").toString());
    }

    public final void c(long j8, Object obj) {
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "Identifier must be >= 0: ").toString());
        }
        HashMap map = this.f39648c;
        if (map.containsKey(Long.valueOf(j8))) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "Identifier has already been added: ").toString());
        }
        WeakReference weakReference = new WeakReference(obj, this.f39650e);
        this.f39647b.put(obj, Long.valueOf(j8));
        map.put(Long.valueOf(j8), weakReference);
        this.f39651f.put(weakReference, Long.valueOf(j8));
        this.f39649d.put(Long.valueOf(j8), obj);
    }

    public final boolean d(Object obj) {
        f();
        return this.f39647b.containsKey(obj);
    }

    public final Object e(long j8) {
        f();
        WeakReference weakReference = (WeakReference) this.f39648c.get(Long.valueOf(j8));
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void f() {
        if (this.f39655j) {
            Log.w("PigeonInstanceManager", "The manager was used after calls to the PigeonFinalizationListener has been stopped.");
        }
    }
}
