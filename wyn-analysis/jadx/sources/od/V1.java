package od;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class V1 {

    /* renamed from: d, reason: collision with root package name */
    public static final V1 f41821d = new V1(new Y1(15));

    /* renamed from: a, reason: collision with root package name */
    public final IdentityHashMap f41822a = new IdentityHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Y1 f41823b;

    /* renamed from: c, reason: collision with root package name */
    public ScheduledExecutorService f41824c;

    public V1(Y1 y12) {
        this.f41823b = y12;
    }

    public static Object a(U1 u12) {
        Object obj;
        V1 v1 = f41821d;
        synchronized (v1) {
            try {
                T1 t12 = (T1) v1.f41822a.get(u12);
                if (t12 == null) {
                    t12 = new T1(u12.c());
                    v1.f41822a.put(u12, t12);
                }
                ScheduledFuture scheduledFuture = t12.f41814c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    t12.f41814c = null;
                }
                t12.f41813b++;
                obj = t12.f41812a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public static void b(U1 u12, Object obj) {
        V1 v1 = f41821d;
        synchronized (v1) {
            try {
                T1 t12 = (T1) v1.f41822a.get(u12);
                if (t12 == null) {
                    throw new IllegalArgumentException("No cached instance found for " + u12);
                }
                Fe.e.p("Releasing the wrong instance", obj == t12.f41812a);
                Fe.e.w("Refcount has already reached zero", t12.f41813b > 0);
                int i5 = t12.f41813b - 1;
                t12.f41813b = i5;
                if (i5 == 0) {
                    Fe.e.w("Destroy task already scheduled", t12.f41814c == null);
                    if (v1.f41824c == null) {
                        v1.f41823b.getClass();
                        v1.f41824c = Executors.newSingleThreadScheduledExecutor(AbstractC3669a0.e("grpc-shared-destroyer-%d"));
                    }
                    t12.f41814c = v1.f41824c.schedule(new RunnableC3731v0(new A7.W0(v1, t12, u12, obj, 23)), 1L, TimeUnit.SECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
