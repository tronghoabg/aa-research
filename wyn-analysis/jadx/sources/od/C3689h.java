package od;

import ba.C1521a;
import g5.RunnableC2707d;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: od.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3689h {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f41965e = Logger.getLogger(C3689h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final K0 f41966a;

    /* renamed from: b, reason: collision with root package name */
    public final md.n0 f41967b;

    /* renamed from: c, reason: collision with root package name */
    public Q f41968c;

    /* renamed from: d, reason: collision with root package name */
    public C1521a f41969d;

    public C3689h(Y1 y12, K0 k02, md.n0 n0Var) {
        this.f41966a = k02;
        this.f41967b = n0Var;
    }

    public final void a(RunnableC2707d runnableC2707d) {
        this.f41967b.e();
        if (this.f41968c == null) {
            this.f41968c = Y1.e();
        }
        C1521a c1521a = this.f41969d;
        if (c1521a != null) {
            N6.w wVar = (N6.w) c1521a.f19414b;
            if (!wVar.f8559c && !wVar.f8558b) {
                return;
            }
        }
        long jA = this.f41968c.a();
        this.f41969d = this.f41967b.d(runnableC2707d, jA, TimeUnit.NANOSECONDS, this.f41966a);
        f41965e.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jA));
    }
}
