package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class adzr {
    private static final adzr c = new adzr();
    public final IdentityHashMap a = new IdentityHashMap();
    public ScheduledExecutorService b;

    public static Object a(adzq adzqVar) {
        return c.b(adzqVar);
    }

    public static void c(adzq adzqVar, Object obj) throws Throwable {
        c.d(adzqVar, obj);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    final synchronized Object b(adzq adzqVar) {
        adzp adzpVar;
        IdentityHashMap identityHashMap = this.a;
        adzpVar = (adzp) identityHashMap.get(adzqVar);
        if (adzpVar == null) {
            adzpVar = new adzp(adzqVar.a());
            identityHashMap.put(adzqVar, adzpVar);
        }
        ?? r4 = adzpVar.c;
        if (r4 != 0) {
            r4.cancel(false);
            adzpVar.c = null;
        }
        adzpVar.b++;
        return adzpVar.a;
    }

    final synchronized void d(adzq adzqVar, Object obj) throws Throwable {
        Throwable th;
        adzr adzrVar;
        try {
            try {
                adzp adzpVar = (adzp) this.a.get(adzqVar);
                if (adzpVar == null) {
                    throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(String.valueOf(adzqVar))));
                }
                boolean z = true;
                woy.O(obj == adzpVar.a, "Releasing the wrong instance");
                woy.aa(adzpVar.b > 0, "Refcount has already reached zero");
                int i = adzpVar.b - 1;
                adzpVar.b = i;
                if (i == 0) {
                    if (adzpVar.c != null) {
                        z = false;
                    }
                    woy.aa(z, "Destroy task already scheduled");
                    ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = this.b;
                    if (scheduledExecutorServiceNewSingleThreadScheduledExecutor == null) {
                        try {
                            scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(adue.i("grpc-shared-destroyer-%d"));
                            this.b = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                        } catch (Throwable th2) {
                            th = th2;
                            adzrVar = this;
                            throw th;
                        }
                    }
                    adzpVar.c = scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new advb(new adtg(this, adzpVar, adzqVar, obj, 3)), 1L, TimeUnit.SECONDS);
                }
            } catch (Throwable th3) {
                th = th3;
                adzrVar = this;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
