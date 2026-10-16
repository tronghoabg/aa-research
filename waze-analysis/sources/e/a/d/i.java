package e.a.d;

import j$.util.Objects;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f47136a;

    /* renamed from: b, reason: collision with root package name */
    private final long f47137b;

    /* synthetic */ i(j jVar, long j2) {
        Objects.requireNonNull(jVar);
        this.f47136a = jVar;
        this.f47137b = j2;
    }

    public final long a() {
        return this.f47137b;
    }

    public final void b() {
        j jVar = this.f47136a;
        long j2 = this.f47137b;
        long jMax = Math.max(j2 + j2, j2);
        if (jVar.f47214c.compareAndSet(j2, jMax)) {
            j.f47212a.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{jVar.f47213b, Long.valueOf(jMax)});
        }
    }
}
