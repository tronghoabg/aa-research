package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class koq {
    public final java.util.List a;
    public final boolean b;
    public final java.util.concurrent.locks.Lock c;
    public final java.util.concurrent.locks.Condition d;
    public final java.lang.Object e;
    public final android.os.Handler f;
    public int g;
    public boolean h;

    public koq(android.os.Handler handler, java.util.List list, boolean z) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.c = reentrantLock;
        this.d = reentrantLock.newCondition();
        this.e = new java.lang.Object();
        this.g = 0;
        this.h = false;
        this.a = list;
        this.b = z;
        this.f = handler;
    }

    public final void a() {
        this.c.lock();
        try {
            if (this.h) {
                this.f.removeCallbacksAndMessages(this.e);
                this.h = false;
                this.d.signalAll();
            }
        } finally {
            this.c.unlock();
        }
    }
}
