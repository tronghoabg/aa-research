package cg;

import a9.C1342b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: cg.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1616e extends J {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f19894h;

    /* renamed from: i, reason: collision with root package name */
    public static final Condition f19895i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f19896j;
    public static final long k;

    /* renamed from: l, reason: collision with root package name */
    public static C1616e f19897l;

    /* renamed from: e, reason: collision with root package name */
    public int f19898e;

    /* renamed from: f, reason: collision with root package name */
    public C1616e f19899f;

    /* renamed from: g, reason: collision with root package name */
    public long f19900g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f19894h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        AbstractC3340k.d(conditionNewCondition, "newCondition(...)");
        f19895i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f19896j = millis;
        k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j8 = this.f19882c;
        boolean z2 = this.f19880a;
        if (j8 != 0 || z2) {
            ReentrantLock reentrantLock = f19894h;
            reentrantLock.lock();
            try {
                if (this.f19898e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f19898e = 1;
                C1342b.e(this, j8, z2);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f19894h;
        reentrantLock.lock();
        try {
            int i5 = this.f19898e;
            this.f19898e = 0;
            if (i5 != 1) {
                return i5 == 2;
            }
            C1616e c1616e = f19897l;
            while (c1616e != null) {
                C1616e c1616e2 = c1616e.f19899f;
                if (c1616e2 == this) {
                    c1616e.f19899f = this.f19899f;
                    this.f19899f = null;
                    return false;
                }
                c1616e = c1616e2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
