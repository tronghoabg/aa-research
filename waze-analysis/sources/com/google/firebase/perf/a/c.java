package com.google.firebase.perf.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.av;
import com.google.firebase.perf.e.j;
import com.google.firebase.perf.e.m;
import com.google.firebase.perf.f.al;
import com.google.firebase.perf.f.ao;
import com.google.firebase.perf.f.i;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10254a = com.google.firebase.perf.c.a.a();

    /* renamed from: b, reason: collision with root package name */
    private static volatile c f10255b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap f10256c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap f10257d;

    /* renamed from: e, reason: collision with root package name */
    private final WeakHashMap f10258e;

    /* renamed from: f, reason: collision with root package name */
    private final WeakHashMap f10259f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f10260g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f10261h;

    /* renamed from: i, reason: collision with root package name */
    private final Set f10262i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicInteger f10263j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.firebase.perf.d.f f10264k;

    /* renamed from: l, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f10265l;
    private final boolean m;
    private m n;
    private m o;
    private i p;
    private boolean q;
    private boolean r;
    private final com.google.firebase.perf.b s;

    c(com.google.firebase.perf.d.f fVar, com.google.firebase.perf.b bVar) throws ClassNotFoundException {
        boolean z;
        com.google.firebase.perf.config.a aVarO = com.google.firebase.perf.config.a.o();
        int i2 = f.f10272a;
        try {
            Class.forName("androidx.core.app.FrameMetricsAggregator");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        this.f10256c = new WeakHashMap();
        this.f10257d = new WeakHashMap();
        this.f10258e = new WeakHashMap();
        this.f10259f = new WeakHashMap();
        this.f10260g = new HashMap();
        this.f10261h = new HashSet();
        this.f10262i = new HashSet();
        this.f10263j = new AtomicInteger(0);
        this.p = i.BACKGROUND;
        this.q = false;
        this.r = true;
        this.f10264k = fVar;
        this.s = bVar;
        this.f10265l = aVarO;
        this.m = z;
    }

    public static c a() {
        if (f10255b == null) {
            synchronized (c.class) {
                if (f10255b == null) {
                    f10255b = new c(com.google.firebase.perf.d.f.a(), new com.google.firebase.perf.b());
                }
            }
        }
        return f10255b;
    }

    private final void j(String str, m mVar, m mVar2) {
        if (this.f10265l.u()) {
            al alVarNewBuilder = ao.newBuilder();
            alVarNewBuilder.k(str);
            alVarNewBuilder.i(mVar.d());
            alVarNewBuilder.j(mVar.c(mVar2));
            alVarNewBuilder.c(SessionManager.getInstance().perfSession().c());
            AtomicInteger atomicInteger = this.f10263j;
            Map map = this.f10260g;
            int andSet = atomicInteger.getAndSet(0);
            synchronized (map) {
                alVarNewBuilder.e(map);
                if (andSet != 0) {
                    alVarNewBuilder.g(com.google.firebase.perf.e.a.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                }
                map.clear();
            }
            this.f10264k.k(alVarNewBuilder.build(), i.FOREGROUND_BACKGROUND);
        }
    }

    private final void k(Activity activity) {
        if (this.m && this.f10265l.u()) {
            f fVar = new f(activity);
            this.f10257d.put(activity, fVar);
            if (activity instanceof av) {
                e eVar = new e(this.s, this.f10264k, this, fVar);
                this.f10258e.put(activity, eVar);
                ((av) activity).bv().bh(eVar);
            }
        }
    }

    private final void l(i iVar) {
        this.p = iVar;
        Set set = this.f10261h;
        synchronized (set) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                b bVar = (b) ((WeakReference) it.next()).get();
                if (bVar != null) {
                    bVar.onUpdateAppState(this.p);
                } else {
                    it.remove();
                }
            }
        }
    }

    public final i b() {
        return this.p;
    }

    public final void c(int i2) {
        this.f10263j.addAndGet(i2);
    }

    public final synchronized void d(Context context) {
        if (!this.q) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                this.q = true;
            }
        }
    }

    public final void e(a aVar) {
        Set set = this.f10262i;
        synchronized (set) {
            set.add(aVar);
        }
    }

    public final void f(WeakReference weakReference) {
        Set set = this.f10261h;
        synchronized (set) {
            set.add(weakReference);
        }
    }

    public final void g(WeakReference weakReference) {
        Set set = this.f10261h;
        synchronized (set) {
            set.remove(weakReference);
        }
    }

    public final boolean h() {
        return this.r;
    }

    public final void i(String str) {
        Map map = this.f10260g;
        synchronized (map) {
            Long l2 = (Long) map.get(str);
            if (l2 == null) {
                map.put(str, 1L);
            } else {
                map.put(str, Long.valueOf(l2.longValue() + 1));
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        k(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f10257d.remove(activity);
        WeakHashMap weakHashMap = this.f10258e;
        if (weakHashMap.containsKey(activity)) {
            ((av) activity).bv().bg((android.support.a.i) weakHashMap.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        WeakHashMap weakHashMap = this.f10256c;
        if (!weakHashMap.isEmpty()) {
            this.f10256c.put(activity, true);
            return;
        }
        this.n = new m();
        weakHashMap.put(activity, true);
        if (!this.r) {
            j(com.google.firebase.perf.e.b.BACKGROUND_TRACE_NAME.toString(), this.o, this.n);
            l(i.FOREGROUND);
            return;
        }
        l(i.FOREGROUND);
        Set<a> set = this.f10262i;
        synchronized (set) {
            for (a aVar : set) {
                if (aVar != null) {
                    aVar.a();
                }
            }
        }
        this.r = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (this.m && this.f10265l.u()) {
            WeakHashMap weakHashMap = this.f10257d;
            if (!weakHashMap.containsKey(activity)) {
                k(activity);
            }
            ((f) weakHashMap.get(activity)).c();
            String strValueOf = String.valueOf(activity.getClass().getSimpleName());
            Trace trace = new Trace("_st_".concat(strValueOf), this.f10264k, this);
            trace.start();
            this.f10259f.put(activity, trace);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        if (this.m) {
            WeakHashMap weakHashMap = this.f10259f;
            Trace trace = (Trace) weakHashMap.get(activity);
            if (trace != null) {
                weakHashMap.remove(activity);
                com.google.firebase.perf.e.f fVarA = ((f) this.f10257d.get(activity)).a();
                if (fVarA.e()) {
                    j.a(trace, (com.google.firebase.perf.metrics.e) fVarA.d());
                    trace.stop();
                } else {
                    f10254a.j("Failed to record frame data for %s.", activity.getClass().getSimpleName());
                }
            }
        }
        WeakHashMap weakHashMap2 = this.f10256c;
        if (weakHashMap2.containsKey(activity)) {
            weakHashMap2.remove(activity);
            if (weakHashMap2.isEmpty()) {
                this.o = new m();
                j(com.google.firebase.perf.e.b.FOREGROUND_TRACE_NAME.toString(), this.n, this.o);
                l(i.BACKGROUND);
            }
        }
    }
}
