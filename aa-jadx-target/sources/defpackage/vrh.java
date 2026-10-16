package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vrh implements android.app.Application.ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {
    public static final /* synthetic */ int c = 0;
    private final defpackage.vss j;
    public final java.util.List a = new java.util.concurrent.CopyOnWriteArrayList();
    private final java.util.concurrent.atomic.AtomicInteger d = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.atomic.AtomicInteger e = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.concurrent.atomic.AtomicInteger b = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.atomic.AtomicInteger f = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.atomic.AtomicInteger g = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.atomic.AtomicInteger h = new java.util.concurrent.atomic.AtomicInteger();
    private boolean i = false;

    public vrh(defpackage.vss vssVar) {
        this.j = vssVar;
    }

    private final void a() {
        if (!this.i && this.d.get() == 0) {
            defpackage.vss vssVar = this.j;
            if (!defpackage.vss.b()) {
                defpackage.ypu ypuVarH = vmf.a.h();
                java.lang.Object obj = vssVar.a;
                ((defpackage.ype) ((defpackage.ype) ypuVarH).ai((char) 9772)).y("Primes did not observe lifecycle events in the expected order. %s is not initializing in Application#onCreate", obj);
                if (!vssVar.a()) {
                    throw new java.lang.IllegalStateException(java.lang.String.format("Primes did not observe lifecycle events in the expected order. %s is not initializing in Application#onCreate", obj));
                }
            }
            this.i = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        this.d.incrementAndGet();
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.vrf) it.next()).h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        if (this.h.getAndIncrement() == 0) {
            a();
        }
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.vrf) it.next()).a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        if (this.f.getAndIncrement() == 0) {
            a();
        }
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.vrf) it.next()).b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        if (this.b.getAndIncrement() == 0) {
            a();
        }
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.vrf) it.next()).c(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.vrf) it.next()).i();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        if (this.e.getAndIncrement() == 0) {
            a();
        }
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.vrf) it.next()).d(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        if (this.g.getAndIncrement() == 0) {
            a();
        }
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.vrf) it.next()).e(activity);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.vrf) it.next()).f(i);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }
}
