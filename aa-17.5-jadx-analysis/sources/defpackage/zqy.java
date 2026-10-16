package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zqy implements Runnable, zsl, zqz {
    static final long a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    public static final /* synthetic */ int k = 0;
    private static final String l = "zqy";
    public final Context f;
    public final String g;
    public long h;
    public final zrb i;
    public final zra j;
    private final ScheduledExecutorService m;
    private Future n;
    private final Random o;
    private int p;
    private final Set q = new HashSet();
    private final Executor r;
    private zwj s;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        a = 300000L;
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        b = 60000L;
        TimeUnit timeUnit3 = TimeUnit.SECONDS;
        c = 10000L;
        TimeUnit timeUnit4 = TimeUnit.HOURS;
        d = 3600000L;
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        e = 5000L;
    }

    public zqy(Context context, String str, Random random, ScheduledExecutorService scheduledExecutorService, zrb zrbVar, zra zraVar, Executor executor) {
        this.f = context;
        this.g = str;
        this.o = random;
        this.m = scheduledExecutorService;
        this.i = zrbVar;
        this.j = zraVar;
        this.r = executor;
    }

    private final void h(long j) throws Throwable {
        Future future = this.n;
        if (future != null) {
            future.cancel(false);
        }
        if (j != 0) {
            this.n = this.m.schedule(this, j, TimeUnit.MILLISECONDS);
        } else {
            this.n = null;
            run();
        }
    }

    @Override // defpackage.zsl
    public final synchronized String a() {
        zwj zwjVar = this.s;
        if (zwjVar == null) {
            return null;
        }
        return (String) zwjVar.b;
    }

    @Override // defpackage.zsl
    public final void b(zsk zskVar) throws Throwable {
        boolean zIsEmpty;
        if (g()) {
            zskVar.a(this);
            return;
        }
        Set set = this.q;
        synchronized (set) {
            zIsEmpty = set.isEmpty();
            set.add(zskVar);
        }
        if (zIsEmpty) {
            h(0L);
        }
    }

    @Override // defpackage.zsl
    public final void c() {
        String str = l;
        if (zrn.e(str, 4)) {
            Log.i(str, "Token rejected");
        }
        synchronized (this) {
            this.s = null;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis < this.h + b) {
                return;
            }
            this.h = jCurrentTimeMillis;
            this.i.a();
        }
    }

    @Override // defpackage.zqz
    public final void d(String str) {
        String str2 = l;
        if (zrn.e(str2, 6)) {
            Log.e(str2, str);
        }
        Future future = this.n;
        if (future != null) {
            future.cancel(false);
        }
    }

    public final void e() throws Throwable {
        h(Math.min(d, (long) ((c * Math.pow(1.6d, this.p)) + (this.o.nextDouble() * e))));
        this.p++;
    }

    public final void f(String str, long j, long j2) throws Throwable {
        this.p = 0;
        long j3 = j2 - a;
        if (j3 > 0) {
            String str2 = l;
            if (zrn.e(str2, 4)) {
                Log.i(str2, "Scheduling next attempt in " + (j3 / 1000) + " seconds.");
            }
            h(j3);
        }
        synchronized (this) {
            this.s = new zwj(str, j);
        }
        Set<zsk> set = this.q;
        synchronized (set) {
            for (zsk zskVar : set) {
                if (zskVar != null) {
                    zskVar.a(this);
                }
            }
            set.clear();
        }
    }

    public final synchronized boolean g() {
        return this.s != null;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() throws Throwable {
        zqy zqyVar;
        try {
            try {
                zwj zwjVarC = this.i.c(this.g);
                if (zwjVarC != null) {
                    long j = zwjVarC.a;
                    long jCurrentTimeMillis = j - System.currentTimeMillis();
                    Object obj = zwjVarC.b;
                    if (jCurrentTimeMillis > a) {
                        String str = l;
                        if (zrn.e(str, 4)) {
                            Log.i(str, a.bI(jCurrentTimeMillis, "Token loaded from file. Expires in: ", " ms."));
                        }
                        f((String) obj, j, jCurrentTimeMillis);
                        return;
                    }
                    String str2 = l;
                    if (zrn.e(str2, 4)) {
                        Log.i(str2, "Saved token has expired. Fetching a new one.");
                    }
                    if (addm.a.gu().k() && !zrf.b(this.f)) {
                        if (zrn.e(str2, 4)) {
                            Log.i(str2, "Device is offline. Keeping saved token until network connection is available.");
                        }
                        f((String) obj, j, jCurrentTimeMillis);
                        this.r.execute(new wxj(this, 18));
                        return;
                    }
                    zqyVar = this;
                    zqyVar.c();
                } else {
                    zqyVar = this;
                }
                if (zrf.b(zqyVar.f)) {
                    zqyVar.j.b(zqyVar);
                    return;
                }
                String str3 = l;
                if (zrn.e(str3, 4)) {
                    Log.i(str3, "Waiting for active network connection to fetch a new auth token.");
                }
                zqyVar.r.execute(new wxj(zqyVar, 19));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
