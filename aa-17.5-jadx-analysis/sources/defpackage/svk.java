package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class svk {
    public static volatile spu f;
    private static final long g;
    private static volatile ScheduledExecutorService h;
    private static final Object i;
    ssm c;
    public final String d;
    private final PowerManager.WakeLock j;
    private Future k;
    private long l;
    private int o;
    private WorkSource p;
    private final ScheduledExecutorService r;
    public final Object a = new Object();
    public int b = 0;
    private final Set m = new HashSet();
    private boolean n = true;
    private final Map q = new HashMap();
    public AtomicInteger e = new AtomicInteger(0);

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        g = 31622400000L;
        h = null;
        i = new Object();
        f = new spu();
    }

    public svk(Context context, int i2, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (context == null) {
            throw new NullPointerException("WakeLock: context must not be null");
        }
        spu.au(str, "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.c = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.d = str;
        } else {
            this.d = "*gcore*:".concat(str);
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        wub.K(powerManager, new Object[0]);
        this.j = powerManager.newWakeLock(i2, str);
        if (spw.b(context)) {
            int i3 = spv.a;
            if (context.getPackageManager() != null) {
                try {
                    ApplicationInfo applicationInfoC = spz.a.a(context).c("com.google.android.gms", 0);
                    if (applicationInfoC == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat("com.google.android.gms"));
                    } else {
                        int i4 = applicationInfoC.uid;
                        workSource = new WorkSource();
                        spw.a(workSource, i4, "com.google.android.gms");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat("com.google.android.gms"));
                }
            }
            this.p = workSource;
            if (workSource != null) {
                h(this.j, workSource);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = h;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (i) {
                scheduledExecutorServiceUnconfigurableScheduledExecutorService = h;
                if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                    spu spuVar = ssr.a;
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new ssq(0)));
                    h = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                }
            }
        }
        this.r = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    private static void h(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    private final void i() {
        if (this.n) {
            TextUtils.isEmpty(null);
        }
    }

    public final void a() {
        Set set = this.m;
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

    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            z = this.b > 0;
        }
        return z;
    }

    public final void c() {
        this.e.incrementAndGet();
        d(30000L);
    }

    public final void d(long j) {
        long jMax = Math.max(Math.min(Long.MAX_VALUE, g), 1L);
        if (j > 0) {
            jMax = Math.min(j, jMax);
        }
        synchronized (this.a) {
            if (!b()) {
                this.c = ssm.a;
                this.j.acquire();
                SystemClock.elapsedRealtime();
            }
            int i2 = 1;
            this.b++;
            this.o++;
            i();
            Map map = this.q;
            mgj mgjVar = (mgj) map.get(null);
            if (mgjVar == null) {
                mgjVar = new mgj(null);
                map.put(null, mgjVar);
            }
            mgjVar.a++;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
            if (j2 > this.l) {
                this.l = j2;
                Future future = this.k;
                if (future != null) {
                    future.cancel(false);
                }
                this.k = this.r.schedule(new teg(this, i2), jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void e() {
        if (this.e.decrementAndGet() < 0) {
            Log.w("WakeLock", String.format("%s release without a matched acquire!", this.d));
        }
        synchronized (this.a) {
            i();
            Map map = this.q;
            if (map.containsKey(null)) {
                mgj mgjVar = (mgj) map.get(null);
                if (mgjVar != null) {
                    int i2 = mgjVar.a - 1;
                    mgjVar.a = i2;
                    if (i2 == 0) {
                        map.remove(null);
                    }
                }
            } else {
                Log.w("WakeLock", this.d + " counter does not exist");
            }
            f();
        }
    }

    public final void f() {
        synchronized (this.a) {
            if (b()) {
                if (this.n) {
                    int i2 = this.b - 1;
                    this.b = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.b = 0;
                }
                a();
                Map map = this.q;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((mgj) it.next()).a = 0;
                }
                map.clear();
                Future future = this.k;
                if (future != null) {
                    future.cancel(false);
                    this.k = null;
                    this.l = 0L;
                }
                this.o = 0;
                PowerManager.WakeLock wakeLock = this.j;
                if (wakeLock.isHeld()) {
                    try {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException e) {
                            if (!e.getClass().equals(RuntimeException.class)) {
                                throw e;
                            }
                            Log.e("WakeLock", String.format("%s failed to release!", this.d), e);
                            if (this.c != null) {
                                this.c = null;
                            }
                        }
                    } finally {
                        if (this.c != null) {
                            this.c = null;
                        }
                    }
                } else {
                    spu.aD("%s should be held!", this.d);
                }
            }
        }
    }

    public final void g() {
        synchronized (this.a) {
            this.n = false;
        }
    }
}
