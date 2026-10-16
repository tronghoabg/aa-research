package od;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: od.f0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3684f0 {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f41948g = Logger.getLogger(C3684f0.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final long f41949a;

    /* renamed from: b, reason: collision with root package name */
    public final j.E f41950b;

    /* renamed from: c, reason: collision with root package name */
    public LinkedHashMap f41951c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f41952d;

    /* renamed from: e, reason: collision with root package name */
    public md.l0 f41953e;

    /* renamed from: f, reason: collision with root package name */
    public long f41954f;

    public C3684f0(long j8, j.E e7) {
        this.f41949a = j8;
        this.f41950b = e7;
    }

    public final void a(C3725t0 c3725t0) {
        p8.n nVar = p8.n.f43298a;
        synchronized (this) {
            try {
                if (!this.f41952d) {
                    this.f41951c.put(c3725t0, nVar);
                    return;
                }
                md.l0 l0Var = this.f41953e;
                RunnableC3681e0 runnableC3681e0 = l0Var != null ? new RunnableC3681e0(c3725t0, l0Var) : new RunnableC3681e0(c3725t0, this.f41954f);
                try {
                    nVar.execute(runnableC3681e0);
                } catch (Throwable th) {
                    f41948g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this) {
            try {
                if (this.f41952d) {
                    return;
                }
                this.f41952d = true;
                j.E e7 = this.f41950b;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long jA = e7.a();
                this.f41954f = jA;
                LinkedHashMap linkedHashMap = this.f41951c;
                this.f41951c = null;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    try {
                        ((Executor) entry.getValue()).execute(new RunnableC3681e0((C3725t0) entry.getKey(), jA));
                    } catch (Throwable th) {
                        f41948g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(md.l0 l0Var) {
        synchronized (this) {
            try {
                if (this.f41952d) {
                    return;
                }
                this.f41952d = true;
                this.f41953e = l0Var;
                LinkedHashMap linkedHashMap = this.f41951c;
                this.f41951c = null;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    try {
                        ((Executor) entry.getValue()).execute(new RunnableC3681e0((C3725t0) entry.getKey(), l0Var));
                    } catch (Throwable th) {
                        f41948g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
