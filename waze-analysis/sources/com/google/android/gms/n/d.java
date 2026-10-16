package com.google.android.gms.n;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.support.v4.app.ae;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.av;
import com.google.android.gms.common.util.h;
import com.google.android.gms.common.util.i;
import com.google.d.b.an;
import com.google.d.b.ar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    private static final long f5720b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile ScheduledExecutorService f5721c;

    /* renamed from: d, reason: collision with root package name */
    private static final Object f5722d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile c f5723e;

    /* renamed from: a, reason: collision with root package name */
    com.google.android.gms.k.c.a f5724a;

    /* renamed from: f, reason: collision with root package name */
    private final Object f5725f;

    /* renamed from: g, reason: collision with root package name */
    private final PowerManager.WakeLock f5726g;

    /* renamed from: h, reason: collision with root package name */
    private int f5727h;

    /* renamed from: i, reason: collision with root package name */
    private Future f5728i;

    /* renamed from: j, reason: collision with root package name */
    private long f5729j;

    /* renamed from: k, reason: collision with root package name */
    private final Set f5730k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f5731l;
    private int m;
    private WorkSource n;
    private final String o;
    private final Map p;
    private AtomicInteger q;
    private final ScheduledExecutorService r;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        f5720b = 31622400000L;
        f5721c = null;
        f5722d = new Object();
        f5723e = new a();
    }

    public d(Context context) {
        String packageName = context.getPackageName();
        this.f5725f = new Object();
        this.f5727h = 0;
        this.f5730k = new HashSet();
        this.f5731l = true;
        this.p = new HashMap();
        this.q = new AtomicInteger(0);
        av.n(context, "WakeLock: context must not be null");
        av.l("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f5724a = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.o = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.o = "*gcore*:wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        Object[] objArr = new Object[0];
        if (powerManager == null) {
            throw new ar(an.d("expected a non-null reference", objArr));
        }
        this.f5726g = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        if (i.b(context)) {
            packageName = h.b(packageName) ? context.getPackageName() : packageName;
            if (context != null && context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoA = com.google.android.gms.common.d.c.b(context).a(packageName, 0);
                    if (applicationInfoA == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i2 = applicationInfoA.uid;
                        workSource = new WorkSource();
                        i.a(workSource, i2, packageName);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            this.n = workSource;
            if (workSource != null) {
                g(this.f5726g, workSource);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceA = f5721c;
        if (scheduledExecutorServiceA == null) {
            synchronized (f5722d) {
                scheduledExecutorServiceA = f5721c;
                if (scheduledExecutorServiceA == null) {
                    scheduledExecutorServiceA = com.google.android.gms.k.e.b.d.a().a();
                    f5721c = scheduledExecutorServiceA;
                }
            }
        }
        this.r = scheduledExecutorServiceA;
    }

    public static /* synthetic */ void a(d dVar) {
        synchronized (dVar.f5725f) {
            if (dVar.d()) {
                f5723e.a("%s ** IS FORCE-RELEASED ON TIMEOUT **", dVar.o);
                dVar.f();
                if (dVar.d()) {
                    dVar.f5727h = 1;
                    dVar.i();
                }
            }
        }
    }

    private final void f() {
        Set set = this.f5730k;
        if (set.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        set.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    private static void g(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
            Log.wtf("WakeLock", e2.toString());
        }
    }

    private final void h() {
        if (this.f5731l) {
            TextUtils.isEmpty(null);
        }
    }

    private final void i() {
        synchronized (this.f5725f) {
            if (d()) {
                if (this.f5731l) {
                    int i2 = this.f5727h - 1;
                    this.f5727h = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.f5727h = 0;
                }
                f();
                Map map = this.p;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((b) it.next()).f5719a = 0;
                }
                map.clear();
                Future future = this.f5728i;
                if (future != null) {
                    future.cancel(false);
                    this.f5728i = null;
                    this.f5729j = 0L;
                }
                this.m = 0;
                PowerManager.WakeLock wakeLock = this.f5726g;
                if (wakeLock.isHeld()) {
                    try {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException e2) {
                            if (!e2.getClass().equals(RuntimeException.class)) {
                                throw e2;
                            }
                            Log.e("WakeLock", String.format("%s failed to release!", this.o), e2);
                            if (this.f5724a != null) {
                                this.f5724a = null;
                            }
                        }
                    } finally {
                        if (this.f5724a != null) {
                            this.f5724a = null;
                        }
                    }
                } else {
                    f5723e.a("%s should be held!", this.o);
                }
            }
        }
    }

    public final void b(long j2) {
        this.q.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f5720b), 1L);
        if (j2 > 0) {
            jMax = Math.min(j2, jMax);
        }
        synchronized (this.f5725f) {
            if (!d()) {
                this.f5724a = com.google.android.gms.k.c.a.a();
                this.f5726g.acquire();
                SystemClock.elapsedRealtime();
            }
            this.f5727h++;
            this.m++;
            h();
            Map map = this.p;
            b bVar = (b) map.get(null);
            if (bVar == null) {
                bVar = new b(null);
                map.put(null, bVar);
            }
            bVar.f5719a++;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
            if (j3 > this.f5729j) {
                this.f5729j = j3;
                Future future = this.f5728i;
                if (future != null) {
                    future.cancel(false);
                }
                this.f5728i = this.r.schedule(new ae(this, 12), jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void c() {
        if (this.q.decrementAndGet() < 0) {
            Log.w("WakeLock", String.format("%s release without a matched acquire!", this.o));
        }
        synchronized (this.f5725f) {
            h();
            Map map = this.p;
            if (map.containsKey(null)) {
                b bVar = (b) map.get(null);
                if (bVar != null) {
                    int i2 = bVar.f5719a - 1;
                    bVar.f5719a = i2;
                    if (i2 == 0) {
                        map.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", this.o + " counter does not exist");
            }
            i();
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (this.f5725f) {
            z = this.f5727h > 0;
        }
        return z;
    }

    public final void e() {
        synchronized (this.f5725f) {
            this.f5731l = true;
        }
    }
}
