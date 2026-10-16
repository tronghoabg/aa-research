package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ajnv extends defpackage.ajpe {
    public static final defpackage.ajot b = new defpackage.ajot();
    public static defpackage.ajnv c;
    public static final java.util.concurrent.locks.ReentrantLock d;
    public static final java.util.concurrent.locks.Condition e;
    public static final long f;
    public static final long g;
    public int h;
    public int i = -1;
    public long j;

    static {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        d = reentrantLock;
        java.util.concurrent.locks.Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        e = conditionNewCondition;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        f = 60000L;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        g = 60000000000L;
    }

    public java.io.IOException c(java.io.IOException iOException) {
        throw null;
    }

    public final void d() {
        long j = this.l;
        boolean zG = g();
        if (j != 0 || zG) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = d;
            reentrantLock.lock();
            try {
                if (this.h != 0) {
                    throw new java.lang.IllegalStateException("Unbalanced enter/exit");
                }
                this.h = 1;
                if (c == null) {
                    c = new defpackage.ajnv();
                    new defpackage.ajns().start();
                }
                long jNanoTime = java.lang.System.nanoTime();
                long j2 = this.l;
                boolean zG2 = g();
                if (j2 != 0 && g()) {
                    this.j = jNanoTime + java.lang.Math.min(j2, h() - jNanoTime);
                } else if (j2 != 0) {
                    this.j = jNanoTime + j2;
                } else {
                    if (!zG2) {
                        throw new java.lang.AssertionError();
                    }
                    this.j = h();
                }
                defpackage.ajot ajotVar = b;
                int i = ajotVar.a + 1;
                ajotVar.a = i;
                java.lang.Object obj = ajotVar.b;
                if (i == ((defpackage.ajnv[]) obj).length) {
                    defpackage.ajnv[] ajnvVarArr = new defpackage.ajnv[i + i];
                    defpackage.afga.cv((java.lang.Object[]) obj, ajnvVarArr, 0, 0, 14);
                    ajotVar.b = ajnvVarArr;
                }
                ajotVar.b(i, this);
                if (this.i == 1) {
                    e.signal();
                }
                reentrantLock.unlock();
            } catch (java.lang.Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean e() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        try {
            int i = this.h;
            this.h = 0;
            if (i != 1) {
                return i == 2;
            }
            b.c(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    protected void a() {
    }
}
