package e.a.d;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dl {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f46813a = Logger.getLogger(dl.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final long f46814b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.d.b.ai f46815c;

    /* renamed from: d, reason: collision with root package name */
    private Map f46816d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    private boolean f46817e;

    /* renamed from: f, reason: collision with root package name */
    private e.a.ee f46818f;

    public dl(long j2, com.google.d.b.ai aiVar) {
        this.f46814b = j2;
        this.f46815c = aiVar;
    }

    public static void e(ai aiVar, Executor executor) {
        f(executor, new bi(aiVar, 5));
    }

    private static void f(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f46813a.logp(Level.SEVERE, "io.grpc.internal.Http2Ping", "doExecute", "Failed to execute PingCallback", th);
        }
    }

    public final long a() {
        return this.f46814b;
    }

    public final void b(ai aiVar, Executor executor) {
        synchronized (this) {
            if (this.f46817e) {
                f(executor, this.f46818f != null ? new bi(aiVar, 5) : new bi(aiVar, 4));
            } else {
                this.f46816d.put(aiVar, executor);
            }
        }
    }

    public final void c(e.a.ee eeVar) {
        synchronized (this) {
            if (this.f46817e) {
                return;
            }
            this.f46817e = true;
            this.f46818f = eeVar;
            Map map = this.f46816d;
            this.f46816d = null;
            for (Map.Entry entry : map.entrySet()) {
                e((ai) entry.getKey(), (Executor) entry.getValue());
            }
        }
    }

    public final void d() {
        synchronized (this) {
            if (this.f46817e) {
                return;
            }
            this.f46817e = true;
            this.f46815c.a(TimeUnit.NANOSECONDS);
            Map map = this.f46816d;
            this.f46816d = null;
            for (Map.Entry entry : map.entrySet()) {
                f((Executor) entry.getValue(), new bi((ai) entry.getKey(), 4));
            }
        }
    }
}
