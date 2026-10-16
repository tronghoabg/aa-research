package Jf;

import Ef.F0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import jf.InterfaceC3108h;

/* loaded from: classes5.dex */
public abstract class r extends c implements F0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6135d = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f6136c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public r(long j8, r rVar, int i5) {
        super(rVar);
        this.f6136c = j8;
        this.cleanedAndPointers$volatile = i5 << 16;
    }

    @Override // Jf.c
    public final boolean d() {
        return f6135d.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f6135d.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i5, InterfaceC3108h interfaceC3108h);

    public final void i() {
        if (f6135d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f6135d;
            i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 65536 + i5));
        return true;
    }
}
