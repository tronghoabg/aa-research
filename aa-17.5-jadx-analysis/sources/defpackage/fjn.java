package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class fjn {
    public Context a;
    public WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public fjn(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.a = context;
        this.b = workerParameters;
    }

    public zgp a() {
        throw null;
    }

    public abstract zgp b();

    public final fjc d() {
        return this.b.b;
    }

    public final UUID e() {
        return this.b.a;
    }

    public final Executor f() {
        return this.b.c;
    }

    public final void g(int i) {
        this.c.compareAndSet(-256, i);
    }

    public final boolean h() {
        return this.c.get() != -256;
    }
}
