package k;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public class e extends ao {

    /* renamed from: a, reason: collision with root package name */
    private static final ad f50830a = new ad();

    /* renamed from: d, reason: collision with root package name */
    private static e f50831d;

    /* renamed from: e, reason: collision with root package name */
    private static final ReentrantLock f50832e;

    /* renamed from: f, reason: collision with root package name */
    private static final Condition f50833f;

    /* renamed from: g, reason: collision with root package name */
    private static final long f50834g;

    /* renamed from: h, reason: collision with root package name */
    private static final long f50835h;

    /* renamed from: b, reason: collision with root package name */
    public int f50836b = -1;

    /* renamed from: i, reason: collision with root package name */
    private int f50837i;

    /* renamed from: j, reason: collision with root package name */
    private long f50838j;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f50832e = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        h.g.b.x.e(conditionNewCondition, "newCondition(...)");
        f50833f = conditionNewCondition;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f50834g = 60000L;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        f50835h = 60000000000L;
    }

    public final long e() {
        return this.f50838j;
    }

    public final long f(long j2) {
        return this.f50838j - j2;
    }

    protected IOException g(IOException iOException) {
        throw null;
    }

    public final void l() {
        long jP = p();
        boolean zV = v();
        if (jP != 0 || zV) {
            ReentrantLock reentrantLock = f50832e;
            reentrantLock.lock();
            try {
                if (this.f50837i != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f50837i = 1;
                if (f50831d == null) {
                    f50831d = new e();
                    new b().start();
                }
                long jNanoTime = System.nanoTime();
                long jP2 = p();
                boolean zV2 = v();
                if (p() != 0 && v()) {
                    this.f50838j = jNanoTime + Math.min(jP2, q() - jNanoTime);
                } else if (jP2 != 0) {
                    this.f50838j = jNanoTime + jP2;
                } else {
                    if (!zV2) {
                        throw new AssertionError();
                    }
                    this.f50838j = q();
                }
                f50830a.b(this);
                if (this.f50836b == 1) {
                    f50833f.signal();
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean m() {
        ReentrantLock reentrantLock = f50832e;
        reentrantLock.lock();
        try {
            int i2 = this.f50837i;
            this.f50837i = 0;
            if (i2 != 1) {
                return i2 == 2;
            }
            f50830a.c(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    protected void a() {
    }
}
