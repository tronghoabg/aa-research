package G7;

import A7.V;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import n7.AbstractC3601f;
import n7.C3597b;
import n7.g;
import p7.C3773c;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: o, reason: collision with root package name */
    public static final long f4649o = TimeUnit.DAYS.toMillis(366);

    /* renamed from: p, reason: collision with root package name */
    public static volatile ScheduledExecutorService f4650p = null;

    /* renamed from: q, reason: collision with root package name */
    public static final Object f4651q = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f4652a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f4653b;

    /* renamed from: c, reason: collision with root package name */
    public int f4654c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f4655d;

    /* renamed from: e, reason: collision with root package name */
    public long f4656e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f4657f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4658g;

    /* renamed from: h, reason: collision with root package name */
    public zzb f4659h;

    /* renamed from: i, reason: collision with root package name */
    public final C3597b f4660i;

    /* renamed from: j, reason: collision with root package name */
    public final String f4661j;
    public final Context k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f4662l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicInteger f4663m;

    /* renamed from: n, reason: collision with root package name */
    public final ScheduledExecutorService f4664n;

    public a(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String packageName = context.getPackageName();
        this.f4652a = new Object();
        this.f4654c = 0;
        this.f4657f = new HashSet();
        this.f4658g = true;
        this.f4660i = C3597b.f40921a;
        this.f4662l = new HashMap();
        this.f4663m = new AtomicInteger(0);
        AbstractC1732v.g("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        this.k = context.getApplicationContext();
        WorkSource workSource = null;
        this.f4659h = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            this.f4661j = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.f4661j = "wake:com.google.firebase.iid.WakeLockHolder".length() != 0 ? "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder") : new String("*gcore*:");
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append((CharSequence) "expected a non-null reference", 0, 29);
            throw new zzi(sb2.toString());
        }
        this.f4653b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        if (g.b(context)) {
            packageName = AbstractC3601f.b(packageName) ? context.getPackageName() : packageName;
            if (context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoA = C3773c.a(context).a(0, packageName);
                    if (applicationInfoA == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i5 = applicationInfoA.uid;
                        workSource = new WorkSource();
                        g.a(workSource, i5, packageName);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            if (workSource != null) {
                try {
                    this.f4653b.setWorkSource(workSource);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e7) {
                    Log.wtf("WakeLock", e7.toString());
                }
            }
        }
        ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = f4650p;
        if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
            synchronized (f4651q) {
                try {
                    scheduledExecutorServiceUnconfigurableScheduledExecutorService = f4650p;
                    if (scheduledExecutorServiceUnconfigurableScheduledExecutorService == null) {
                        zzh.zza();
                        scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f4650p = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
                    }
                } finally {
                }
            }
        }
        this.f4664n = scheduledExecutorServiceUnconfigurableScheduledExecutorService;
    }

    public final void a(long j8) {
        this.f4663m.incrementAndGet();
        long jMax = Math.max(Math.min(Long.MAX_VALUE, f4649o), 1L);
        if (j8 > 0) {
            jMax = Math.min(j8, jMax);
        }
        synchronized (this.f4652a) {
            try {
                if (!b()) {
                    this.f4659h = zzb.zza(false, null);
                    this.f4653b.acquire();
                    this.f4660i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f4654c++;
                if (this.f4658g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f4662l.get(null);
                if (bVar == null) {
                    bVar = new b();
                    this.f4662l.put(null, bVar);
                }
                bVar.f4665a++;
                this.f4660i.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
                if (j10 > this.f4656e) {
                    this.f4656e = j10;
                    ScheduledFuture scheduledFuture = this.f4655d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f4655d = this.f4664n.schedule(new V(this, 14), jMax, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z2;
        synchronized (this.f4652a) {
            z2 = this.f4654c > 0;
        }
        return z2;
    }

    public final void c() {
        if (this.f4663m.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f4661j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f4652a) {
            try {
                if (this.f4658g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f4662l.containsKey(null)) {
                    b bVar = (b) this.f4662l.get(null);
                    if (bVar != null) {
                        int i5 = bVar.f4665a - 1;
                        bVar.f4665a = i5;
                        if (i5 == 0) {
                            this.f4662l.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f4661j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f4657f;
        if (hashSet.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        hashSet.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void e() {
        synchronized (this.f4652a) {
            try {
                if (b()) {
                    if (this.f4658g) {
                        int i5 = this.f4654c - 1;
                        this.f4654c = i5;
                        if (i5 > 0) {
                            return;
                        }
                    } else {
                        this.f4654c = 0;
                    }
                    d();
                    Iterator it = this.f4662l.values().iterator();
                    while (it.hasNext()) {
                        ((b) it.next()).f4665a = 0;
                    }
                    this.f4662l.clear();
                    ScheduledFuture scheduledFuture = this.f4655d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f4655d = null;
                        this.f4656e = 0L;
                    }
                    if (this.f4653b.isHeld()) {
                        try {
                            try {
                                this.f4653b.release();
                                if (this.f4659h != null) {
                                    this.f4659h = null;
                                }
                            } catch (RuntimeException e7) {
                                if (!e7.getClass().equals(RuntimeException.class)) {
                                    throw e7;
                                }
                                Log.e("WakeLock", String.valueOf(this.f4661j).concat(" failed to release!"), e7);
                                if (this.f4659h != null) {
                                    this.f4659h = null;
                                }
                            }
                        } catch (Throwable th) {
                            if (this.f4659h != null) {
                                this.f4659h = null;
                            }
                            throw th;
                        }
                    } else {
                        Log.e("WakeLock", String.valueOf(this.f4661j).concat(" should be held!"));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
