package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qdv {
    public static final java.util.Set a = j$.util.DesugarCollections.synchronizedSet(java.util.Collections.newSetFromMap(new java.util.WeakHashMap()));
    private static final android.content.BroadcastReceiver q = new qdt();
    private static final java.util.concurrent.atomic.AtomicBoolean r = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final java.util.concurrent.ScheduledExecutorService b;
    public final android.content.Context c;
    public final android.content.ComponentName d;
    public final boolean e;
    public final defpackage.qef f;
    public final defpackage.qdl p;
    private final defpackage.qdo s;
    private volatile java.util.concurrent.CountDownLatch u;
    private final defpackage.qdn x;
    public final java.util.concurrent.atomic.AtomicReference g = new java.util.concurrent.atomic.AtomicReference();
    public final java.util.concurrent.atomic.AtomicReference h = new java.util.concurrent.atomic.AtomicReference();
    public final java.util.concurrent.atomic.AtomicReference i = new java.util.concurrent.atomic.AtomicReference();
    public final java.util.Set j = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
    public final java.util.Map k = new java.util.WeakHashMap();
    public final java.util.Set l = java.util.Collections.newSetFromMap(new j$.util.concurrent.ConcurrentHashMap());
    public final java.util.concurrent.ConcurrentLinkedDeque m = new java.util.concurrent.ConcurrentLinkedDeque();
    public final android.content.ServiceConnection n = new defpackage.qds(this);
    private final java.util.concurrent.atomic.AtomicReference t = new java.util.concurrent.atomic.AtomicReference();
    private long v = 500;
    public int o = 0;
    private int w = 0;

    public qdv(android.content.Context context, java.lang.String str, defpackage.qdl qdlVar, defpackage.qdn qdnVar, defpackage.qdo qdoVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.qef qefVar) {
        boolean z = false;
        this.c = context.getApplicationContext();
        if (qefVar == null || qdlVar == null || scheduledExecutorService == null) {
            throw null;
        }
        this.p = qdlVar;
        this.x = qdnVar;
        this.s = qdoVar;
        this.d = new android.content.ComponentName(context.getPackageName(), str);
        if (defpackage.qee.a) {
            z = defpackage.qee.b;
        } else {
            try {
                android.content.Context.class.getMethod("bindServiceAsUser", android.content.Intent.class, android.content.ServiceConnection.class, java.lang.Integer.TYPE, android.os.UserHandle.class);
                defpackage.qee.b = true;
                defpackage.qee.a = true;
                z = true;
            } catch (java.lang.NoSuchMethodException e) {
                android.util.Log.e("ReflectionUtilities", "canUseReflectedApis is false", e);
                defpackage.qee.b = false;
                defpackage.qee.a = true;
            }
        }
        this.e = z;
        this.b = new defpackage.adwu(scheduledExecutorService, 1, null);
        this.f = qefVar;
        a.add(this);
        if (r.getAndSet(true)) {
            return;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.MANAGED_PROFILE_UNLOCKED");
        intentFilter.addAction("android.intent.action.MANAGED_PROFILE_AVAILABLE");
        intentFilter.addAction("android.intent.action.MANAGED_PROFILE_UNAVAILABLE");
        this.c.registerReceiver(q, intentFilter);
    }

    public static android.os.UserHandle a(android.content.Context context, defpackage.qef qefVar) {
        java.util.List<android.os.UserHandle> listM = jx$.ExternalSyntheticApiModelOutline3.m(jx$.ExternalSyntheticApiModelOutline3.m(context.getSystemService(jx$.ExternalSyntheticApiModelOutline3.m$1())));
        java.util.List arrayList = new java.util.ArrayList();
        android.os.UserManager userManager = (android.os.UserManager) context.getSystemService(android.os.UserManager.class);
        for (android.os.UserHandle userHandle : listM) {
            if (userManager.isUserRunning(userHandle) && !a$.ExternalSyntheticApiModelOutline2.m(userManager, userHandle) && (!qefVar.c || ll$.ExternalSyntheticApiModelOutline0.m(userManager, userHandle))) {
                arrayList.add(userHandle);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(arrayList).filter(new qdq(jx$.ExternalSyntheticApiModelOutline3.m(context.getSystemService(jx$.ExternalSyntheticApiModelOutline3.m$1()))));
            int i = defpackage.ygw.d;
            arrayList = (java.util.List) streamFilter.collect(defpackage.yds.a);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (android.os.UserHandle) java.util.Collections.min(arrayList, new defpackage.dab((android.os.UserManager) context.getSystemService(android.os.UserManager.class), 7));
    }

    private final void q() {
        java.util.concurrent.ScheduledFuture scheduledFuture = (java.util.concurrent.ScheduledFuture) this.i.getAndSet(null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void b() {
        this.v = 500L;
        this.b.execute(new pyi(this, 11));
    }

    public final void c() {
        java.util.concurrent.ScheduledFuture scheduledFuture = (java.util.concurrent.ScheduledFuture) this.t.getAndSet(null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void d() {
        if (o() && this.w != 2) {
            this.x.c();
            this.w = 2;
        } else {
            if (o() || this.w == 1) {
                return;
            }
            this.x.c();
            this.w = 1;
        }
    }

    public final void e() {
        if (this.j.isEmpty() && o()) {
            android.util.Log.i("CrossProfileSender", "Scheduling automatic disconnection");
            java.util.concurrent.ScheduledFuture scheduledFutureSchedule = this.b.schedule(new defpackage.fma(this, 11), 30L, java.util.concurrent.TimeUnit.SECONDS);
            if (defpackage.a.o(this.t, scheduledFutureSchedule)) {
                return;
            }
            android.util.Log.i("CrossProfileSender", "Already scheduled");
            scheduledFutureSchedule.cancel(true);
        }
    }

    public final void f(java.lang.String str, java.lang.Exception exc, boolean z) {
        q();
        if (exc == null) {
            android.util.Log.i("CrossProfileSender", "Binding attempt failed: ".concat(java.lang.String.valueOf(str)));
            j(new qei(str));
        } else {
            android.util.Log.i("CrossProfileSender", "Binding attempt failed: ".concat(java.lang.String.valueOf(str)), exc);
            j(new qei(str, exc));
        }
        if (z || this.j.isEmpty()) {
            l();
            return;
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = this.h;
        java.util.concurrent.ScheduledFuture scheduledFuture = (java.util.concurrent.ScheduledFuture) atomicReference.get();
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            long j = this.v;
            long j2 = j + j;
            this.v = j2;
            atomicReference.set(this.b.schedule((java.lang.Runnable) new pyi(this, 11), j2, java.util.concurrent.TimeUnit.MILLISECONDS));
        }
    }

    public final void g() {
        q();
        android.util.Log.i("CrossProfileSender", "Binding attempt succeeded");
    }

    public final void h(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("Connection holder cannot be null");
        }
        this.b.execute(new defpackage.qbr(this, obj, 2, (byte[]) null));
    }

    public final void i(java.lang.Object obj) {
        java.util.Map map = this.k;
        java.util.Set set = (java.util.Set) map.get(obj);
        if (set != null) {
            map.remove(obj);
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                i(it.next());
            }
        }
        this.j.remove(obj);
        this.l.remove(obj);
    }

    public final void j(java.lang.Throwable th) {
        for (qdu qduVar : this.l) {
            h(qduVar);
            qdw qdwVar = qduVar.c;
            android.os.Bundle bundle = new android.os.Bundle(com.google.android.enterprise.connectedapps.internal.Bundler.class.getClassLoader());
            bundle.putSerializable("throwable", th);
            qdwVar.a(bundle);
        }
    }

    public final void k() {
        android.util.Log.i("CrossProfileSender", "tryMakeAsyncCalls");
        if (o()) {
            this.b.execute(new pyi(this, 12));
        }
    }

    public final void l() {
        android.util.Log.i("CrossProfileSender", "Unbind");
        if (this.g.getAndSet(null) != null) {
            this.c.unbindService(this.n);
            d();
            c();
        }
        q();
        j(new qei("No profile available"));
    }

    public final void m() {
        this.s.a();
        this.o = true == n() ? 2 : 1;
    }

    public final boolean n() {
        return a(this.c, this.f) != null;
    }

    public final boolean o() {
        return this.g.get() != null;
    }

    public final void p(int i, android.os.Bundle bundle, qdw qdwVar, java.lang.Object obj) {
        if (!n()) {
            j(new qei("Profile not available, isBindingPossible() returned false in callAsync()"));
        }
        this.b.execute(new ody(this, i, bundle, qdwVar, obj, 3));
    }
}
