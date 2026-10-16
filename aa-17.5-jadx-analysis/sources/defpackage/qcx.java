package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.CrossProfileApps;
import android.os.Build;
import android.os.Bundle;
import android.os.UserHandle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class qcx {
    public static final Set a = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private static final BroadcastReceiver q = new qcv();
    private static final AtomicBoolean r = new AtomicBoolean(false);
    public final ScheduledExecutorService b;
    public final Context c;
    public final ComponentName d;
    public final boolean e;
    public final qdi f;
    public final qcn p;
    private final qcp s;
    private volatile CountDownLatch u;
    private final qco x;
    public final AtomicReference g = new AtomicReference();
    public final AtomicReference h = new AtomicReference();
    public final AtomicReference i = new AtomicReference();
    public final Set j = Collections.newSetFromMap(new WeakHashMap());
    public final Map k = new WeakHashMap();
    public final Set l = Collections.newSetFromMap(new ConcurrentHashMap());
    public final ConcurrentLinkedDeque m = new ConcurrentLinkedDeque();
    public final ServiceConnection n = new qcu(this);
    private final AtomicReference t = new AtomicReference();
    private long v = 500;
    public int o = 0;
    private int w = 0;

    public qcx(Context context, String str, qcn qcnVar, qco qcoVar, qcp qcpVar, ScheduledExecutorService scheduledExecutorService, qdi qdiVar) throws NoSuchMethodException, SecurityException {
        boolean z = false;
        this.c = context.getApplicationContext();
        if (qdiVar == null || qcnVar == null || scheduledExecutorService == null) {
            throw null;
        }
        this.p = qcnVar;
        this.x = qcoVar;
        this.s = qcpVar;
        this.d = new ComponentName(context.getPackageName(), str);
        if (qdh.a) {
            z = qdh.b;
        } else {
            try {
                Context.class.getMethod("bindServiceAsUser", Intent.class, ServiceConnection.class, Integer.TYPE, UserHandle.class);
                qdh.b = true;
                qdh.a = true;
                z = true;
            } catch (NoSuchMethodException e) {
                Log.e("ReflectionUtilities", "canUseReflectedApis is false", e);
                qdh.b = false;
                qdh.a = true;
            }
        }
        this.e = z;
        this.b = new qcy(scheduledExecutorService);
        this.f = qdiVar;
        a.add(this);
        if (r.getAndSet(true)) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MANAGED_PROFILE_UNLOCKED");
        intentFilter.addAction("android.intent.action.MANAGED_PROFILE_AVAILABLE");
        intentFilter.addAction("android.intent.action.MANAGED_PROFILE_UNAVAILABLE");
        this.c.registerReceiver(q, intentFilter);
    }

    static UserHandle a(Context context, qdi qdiVar) {
        List<UserHandle> targetUserProfiles = jw$$ExternalSyntheticApiModelOutline3.m(context.getSystemService(jw$$ExternalSyntheticApiModelOutline3.m$1())).getTargetUserProfiles();
        List arrayList = new ArrayList();
        UserManager userManager = (UserManager) context.getSystemService(UserManager.class);
        for (UserHandle userHandle : targetUserProfiles) {
            if (userManager.isUserRunning(userHandle) && !userManager.isQuietModeEnabled(userHandle) && (!qdiVar.c || userManager.isUserUnlocked(userHandle))) {
                arrayList.add(userHandle);
            }
        }
        if (Build.VERSION.SDK_INT >= 35) {
            final CrossProfileApps crossProfileAppsM = jw$$ExternalSyntheticApiModelOutline3.m(context.getSystemService(jw$$ExternalSyntheticApiModelOutline3.m$1()));
            Stream streamFilter = Collection.EL.stream(arrayList).filter(new Predicate() { // from class: qcr
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo56negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    UserHandle userHandle2 = (UserHandle) obj;
                    if (Build.VERSION.SDK_INT < 35) {
                        throw new UnsupportedOperationException("isPersonalOrWorkProfile is not supported on this SDK");
                    }
                    CrossProfileApps crossProfileApps = crossProfileAppsM;
                    return crossProfileApps.isManagedProfile(userHandle2) || !crossProfileApps.isProfile(userHandle2);
                }
            });
            int i = yfq.d;
            arrayList = (List) streamFilter.collect(ycm.a);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (UserHandle) Collections.min(arrayList, new czs((UserManager) context.getSystemService(UserManager.class), 7));
    }

    private final void q() {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.i.getAndSet(null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void b() {
        this.v = 500L;
        this.b.execute(new qct(this, 2));
    }

    public final void c() {
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.t.getAndSet(null);
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
            Log.i("CrossProfileSender", "Scheduling automatic disconnection");
            ScheduledFuture scheduledFutureSchedule = this.b.schedule(new flt(this, 11), 30L, TimeUnit.SECONDS);
            if (a.p(this.t, scheduledFutureSchedule)) {
                return;
            }
            Log.i("CrossProfileSender", "Already scheduled");
            scheduledFutureSchedule.cancel(true);
        }
    }

    public final void f(String str, Exception exc, boolean z) {
        q();
        if (exc == null) {
            Log.i("CrossProfileSender", "Binding attempt failed: ".concat(String.valueOf(str)));
            j(new qdl(str));
        } else {
            Log.i("CrossProfileSender", "Binding attempt failed: ".concat(String.valueOf(str)), exc);
            j(new qdl(str, exc));
        }
        if (z || this.j.isEmpty()) {
            l();
            return;
        }
        AtomicReference atomicReference = this.h;
        ScheduledFuture scheduledFuture = (ScheduledFuture) atomicReference.get();
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            long j = this.v;
            long j2 = j + j;
            this.v = j2;
            atomicReference.set(this.b.schedule(new qct(this, 2), j2, TimeUnit.MILLISECONDS));
        }
    }

    public final void g() {
        q();
        Log.i("CrossProfileSender", "Binding attempt succeeded");
    }

    final void h(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Connection holder cannot be null");
        }
        this.b.execute(new pfq(this, obj, 20, null));
    }

    public final void i(Object obj) {
        Map map = this.k;
        Set set = (Set) map.get(obj);
        if (set != null) {
            map.remove(obj);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                i(it.next());
            }
        }
        this.j.remove(obj);
        this.l.remove(obj);
    }

    public final void j(Throwable th) {
        for (qcw qcwVar : this.l) {
            h(qcwVar);
            qcz qczVar = qcwVar.c;
            Bundle bundle = new Bundle(Bundler.class.getClassLoader());
            bundle.putSerializable("throwable", th);
            qczVar.a(bundle);
        }
    }

    public final void k() {
        Log.i("CrossProfileSender", "tryMakeAsyncCalls");
        if (o()) {
            this.b.execute(new qct(this, 3));
        }
    }

    public final void l() {
        Log.i("CrossProfileSender", "Unbind");
        if (this.g.getAndSet(null) != null) {
            this.c.unbindService(this.n);
            d();
            c();
        }
        q();
        j(new qdl("No profile available"));
    }

    public final void m() {
        this.s.a();
        this.o = true == n() ? 2 : 1;
    }

    final boolean n() {
        return a(this.c, this.f) != null;
    }

    public final boolean o() {
        return this.g.get() != null;
    }

    public final void p(int i, Bundle bundle, qcz qczVar, Object obj) {
        if (!n()) {
            j(new qdl("Profile not available, isBindingPossible() returned false in callAsync()"));
        }
        this.b.execute(new ode(this, i, bundle, qczVar, obj, 3));
    }
}
