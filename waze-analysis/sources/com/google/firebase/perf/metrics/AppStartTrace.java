package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.support.v4.app.ac;
import android.support.v7.app.p;
import android.view.View;
import androidx.credentials.provider.CredentialEntry;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.media3.exoplayer.video.MediaCodecVideoRenderer;
import com.google.firebase.j;
import com.google.firebase.perf.e.m;
import com.google.firebase.perf.f.al;
import com.google.firebase.perf.f.ao;
import com.google.firebase.perf.f.i;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, LifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    private static final m f10483a = new m();

    /* renamed from: b, reason: collision with root package name */
    private static final long f10484b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f10485c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile AppStartTrace f10486d;

    /* renamed from: e, reason: collision with root package name */
    private static ExecutorService f10487e;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.perf.d.f f10489g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f10490h;

    /* renamed from: i, reason: collision with root package name */
    private final al f10491i;

    /* renamed from: j, reason: collision with root package name */
    private Context f10492j;

    /* renamed from: l, reason: collision with root package name */
    private final m f10494l;
    private final m m;
    private com.google.firebase.perf.session.b w;

    /* renamed from: f, reason: collision with root package name */
    private boolean f10488f = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10493k = false;
    private m n = null;
    private m o = null;
    private m p = null;
    private m q = null;
    private m r = null;
    private m s = null;
    private m t = null;
    private m u = null;
    private m v = null;
    private boolean x = false;
    private int y = 0;
    private final a z = new a(this);
    private boolean A = false;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f10484b = 60000000L;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        f10485c = MediaCodecVideoRenderer.DEFAULT_EARLY_SCHEDULING_THRESHOLD_US;
    }

    AppStartTrace(com.google.firebase.perf.d.f fVar, com.google.firebase.perf.config.a aVar, ExecutorService executorService) {
        this.f10489g = fVar;
        this.f10490h = aVar;
        f10487e = executorService;
        al alVarNewBuilder = ao.newBuilder();
        alVarNewBuilder.k("_experiment_app_start_ttid");
        this.f10491i = alVarNewBuilder;
        this.f10494l = m.e(Process.getStartElapsedRealtime());
        j jVar = (j) com.google.firebase.e.b().f(j.class);
        this.m = jVar != null ? m.e(jVar.b()) : null;
    }

    public static AppStartTrace b() {
        if (f10486d == null) {
            com.google.firebase.perf.d.f fVarA = com.google.firebase.perf.d.f.a();
            if (f10486d == null) {
                synchronized (AppStartTrace.class) {
                    if (f10486d == null) {
                        f10486d = new AppStartTrace(fVarA, com.google.firebase.perf.config.a.o(), new ThreadPoolExecutor(0, 1, 10 + f10484b, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                }
            }
        }
        return f10486d;
    }

    public static /* synthetic */ void d(AppStartTrace appStartTrace) {
        if (appStartTrace.v != null) {
            return;
        }
        appStartTrace.v = new m();
        al alVar = appStartTrace.f10491i;
        al alVarNewBuilder = ao.newBuilder();
        alVarNewBuilder.k("_experiment_onDrawFoQ");
        alVarNewBuilder.i(appStartTrace.o().d());
        alVarNewBuilder.j(appStartTrace.o().c(appStartTrace.v));
        alVar.d(alVarNewBuilder.build());
        if (appStartTrace.f10494l != null) {
            al alVarNewBuilder2 = ao.newBuilder();
            alVarNewBuilder2.k("_experiment_procStart_to_classLoad");
            alVarNewBuilder2.i(appStartTrace.o().d());
            alVarNewBuilder2.j(appStartTrace.o().c(appStartTrace.n()));
            alVar.d(alVarNewBuilder2.build());
        }
        alVar.h(true != appStartTrace.A ? CredentialEntry.FALSE_STRING : CredentialEntry.TRUE_STRING);
        alVar.g("onDrawCount", appStartTrace.y);
        alVar.c(appStartTrace.w.c());
        appStartTrace.p(alVar);
    }

    public static /* synthetic */ void e(AppStartTrace appStartTrace) {
        if (appStartTrace.u != null) {
            return;
        }
        appStartTrace.u = new m();
        al alVar = appStartTrace.f10491i;
        al alVarNewBuilder = ao.newBuilder();
        alVarNewBuilder.k("_experiment_preDrawFoQ");
        alVarNewBuilder.i(appStartTrace.o().d());
        alVarNewBuilder.j(appStartTrace.o().c(appStartTrace.u));
        alVar.d(alVarNewBuilder.build());
        appStartTrace.p(alVar);
    }

    public static /* synthetic */ void f(AppStartTrace appStartTrace) {
        if (appStartTrace.t != null) {
            return;
        }
        appStartTrace.t = new m();
        al alVar = appStartTrace.f10491i;
        alVar.i(appStartTrace.o().d());
        alVar.j(appStartTrace.o().c(appStartTrace.t));
        appStartTrace.p(alVar);
    }

    public static /* synthetic */ void h(AppStartTrace appStartTrace) {
        al alVarNewBuilder = ao.newBuilder();
        alVarNewBuilder.k(com.google.firebase.perf.e.b.APP_START_TRACE_NAME.toString());
        alVarNewBuilder.i(appStartTrace.n().d());
        alVarNewBuilder.j(appStartTrace.n().c(appStartTrace.q));
        ArrayList arrayList = new ArrayList(3);
        al alVarNewBuilder2 = ao.newBuilder();
        alVarNewBuilder2.k(com.google.firebase.perf.e.b.ON_CREATE_TRACE_NAME.toString());
        alVarNewBuilder2.i(appStartTrace.n().d());
        alVarNewBuilder2.j(appStartTrace.n().c(appStartTrace.n));
        arrayList.add(alVarNewBuilder2.build());
        if (appStartTrace.p != null) {
            al alVarNewBuilder3 = ao.newBuilder();
            alVarNewBuilder3.k(com.google.firebase.perf.e.b.ON_START_TRACE_NAME.toString());
            alVarNewBuilder3.i(appStartTrace.n.d());
            alVarNewBuilder3.j(appStartTrace.n.c(appStartTrace.p));
            arrayList.add(alVarNewBuilder3.build());
            al alVarNewBuilder4 = ao.newBuilder();
            alVarNewBuilder4.k(com.google.firebase.perf.e.b.ON_RESUME_TRACE_NAME.toString());
            alVarNewBuilder4.i(appStartTrace.p.d());
            alVarNewBuilder4.j(appStartTrace.p.c(appStartTrace.q));
            arrayList.add(alVarNewBuilder4.build());
        }
        alVarNewBuilder.b(arrayList);
        alVarNewBuilder.c(appStartTrace.w.c());
        appStartTrace.f10489g.k((ao) alVarNewBuilder.build(), i.FOREGROUND_BACKGROUND);
    }

    public static boolean m(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String strValueOf = String.valueOf(packageName);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100) {
                if (!runningAppProcessInfo.processName.equals(packageName)) {
                    if (runningAppProcessInfo.processName.startsWith(strValueOf.concat(":"))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    private final m n() {
        m mVar = this.m;
        return mVar != null ? mVar : f10483a;
    }

    private final m o() {
        m mVar = this.f10494l;
        return mVar != null ? mVar : n();
    }

    private final void p(al alVar) {
        if (this.t == null || this.u == null || this.v == null) {
            return;
        }
        f10487e.execute(new ac(this, alVar, 14, null));
        l();
    }

    public static void setLauncherActivityOnCreateTime(String str) {
    }

    public static void setLauncherActivityOnResumeTime(String str) {
    }

    public static void setLauncherActivityOnStartTime(String str) {
    }

    public final synchronized void k(Context context) {
        if (!this.f10488f) {
            ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
                this.A = this.A || m(applicationContext);
                this.f10488f = true;
                this.f10492j = applicationContext;
            }
        }
    }

    public final synchronized void l() {
        if (this.f10488f) {
            ProcessLifecycleOwner.get().getLifecycle().removeObserver(this);
            ((Application) this.f10492j).unregisterActivityLifecycleCallbacks(this);
            this.f10488f = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.o != null) {
            if (Build.VERSION.SDK_INT < 34 || this.o.b() > f10485c) {
                this.x = true;
            }
            this.o = null;
        }
        if (!this.x && this.n == null) {
            this.A = this.A || m(this.f10492j);
            new WeakReference(activity);
            this.n = new m();
            if (o().c(this.n) > f10484b) {
                this.f10493k = true;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        View viewFindViewById;
        if (this.x || this.f10493k || !this.f10490h.t() || (viewFindViewById = activity.findViewById(R.id.content)) == null) {
            return;
        }
        viewFindViewById.getViewTreeObserver().removeOnDrawListener(this.z);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        View viewFindViewById;
        if (!this.x && !this.f10493k) {
            boolean zT = this.f10490h.t();
            if (zT && (viewFindViewById = activity.findViewById(R.id.content)) != null) {
                viewFindViewById.getViewTreeObserver().addOnDrawListener(this.z);
                com.google.firebase.perf.e.d.a(viewFindViewById, new p(this, 10));
                com.google.firebase.perf.e.g.a(viewFindViewById, new p(this, 11), new p(this, 12));
            }
            if (this.q == null) {
                new WeakReference(activity);
                this.q = new m();
                this.w = SessionManager.getInstance().perfSession();
                com.google.firebase.perf.c.a.a().b("onResume(): " + activity.getClass().getName() + ": " + n().c(this.q) + " microseconds");
                f10487e.execute(new p(this, 13));
                if (!zT) {
                    l();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.x && this.p == null && !this.f10493k) {
            this.p = new m();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.x || this.f10493k || this.s != null) {
            return;
        }
        this.s = new m();
        al alVar = this.f10491i;
        al alVarNewBuilder = ao.newBuilder();
        alVarNewBuilder.k("_experiment_firstBackgrounding");
        alVarNewBuilder.i(o().d());
        alVarNewBuilder.j(o().c(this.s));
        alVar.d(alVarNewBuilder.build());
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onAppEnteredForeground() {
        if (this.x || this.f10493k || this.r != null) {
            return;
        }
        this.r = new m();
        al alVar = this.f10491i;
        al alVarNewBuilder = ao.newBuilder();
        alVarNewBuilder.k("_experiment_firstForegrounding");
        alVarNewBuilder.i(o().d());
        alVarNewBuilder.j(o().c(this.r));
        alVar.d(alVarNewBuilder.build());
    }
}
