package defpackage;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class kol {
    public final List a;
    public final boolean b;
    public final Lock c;
    public final Condition d;
    public final Object e;
    public final Handler f;
    public int g;
    public boolean h;

    public kol(Handler handler, List list, boolean z) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.c = reentrantLock;
        this.d = reentrantLock.newCondition();
        this.e = new Object();
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
