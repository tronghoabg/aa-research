package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class jfn {
    public final Runnable a;
    public ScheduledExecutorService b;
    public long c = 0;
    public long d = 0;
    public TimeUnit e;

    public jfn(Runnable runnable) {
        this.a = runnable;
    }

    @ResultIgnorabilityUnspecified
    public final jfp a() {
        this.b.getClass();
        woy.aa(this.d > 0, "period is required");
        this.e.getClass();
        return new jfp(this);
    }

    public final void b(long j) {
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        this.c = j;
    }

    public final void c(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException();
        }
        this.d = j;
    }
}
