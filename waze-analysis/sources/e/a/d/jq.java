package e.a.d;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class jq {

    /* renamed from: a, reason: collision with root package name */
    private static final jq f47242a = new jq();

    /* renamed from: b, reason: collision with root package name */
    private final IdentityHashMap f47243b = new IdentityHashMap();

    /* renamed from: c, reason: collision with root package name */
    private ScheduledExecutorService f47244c;

    jq() {
    }

    public static Object a(jp jpVar) {
        return f47242a.b(jpVar);
    }

    public static void f(jp jpVar, Object obj) {
        f47242a.g(jpVar, obj);
    }

    final synchronized Object b(jp jpVar) {
        jo joVar;
        IdentityHashMap identityHashMap = this.f47243b;
        joVar = (jo) identityHashMap.get(jpVar);
        if (joVar == null) {
            joVar = new jo(jpVar.a());
            identityHashMap.put(jpVar, joVar);
        }
        ScheduledFuture scheduledFuture = joVar.f47241c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            joVar.f47241c = null;
        }
        joVar.f47240b++;
        return joVar.f47239a;
    }

    final synchronized void g(jp jpVar, Object obj) {
        jo joVar = (jo) this.f47243b.get(jpVar);
        if (joVar == null) {
            throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(String.valueOf(jpVar))));
        }
        boolean z = true;
        com.google.d.b.an.m(obj == joVar.f47239a, "Releasing the wrong instance");
        com.google.d.b.an.v(joVar.f47240b > 0, "Refcount has already reached zero");
        int i2 = joVar.f47240b - 1;
        joVar.f47240b = i2;
        if (i2 == 0) {
            if (joVar.f47241c != null) {
                z = false;
            }
            com.google.d.b.an.v(z, "Destroy task already scheduled");
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = this.f47244c;
            if (scheduledExecutorServiceNewSingleThreadScheduledExecutor == null) {
                scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(dh.i("grpc-shared-destroyer-%d"));
                this.f47244c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            }
            joVar.f47241c = scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new em(new jn(this, joVar, jpVar, obj)), 1L, TimeUnit.SECONDS);
        }
    }
}
