package Te;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class o extends AtomicInteger implements Oe.c, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final He.j f11893a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11894b;

    public o(He.j jVar, Object obj) {
        this.f11893a = jVar;
        this.f11894b = obj;
    }

    @Override // Oe.d
    public final int c(int i5) {
        lazySet(1);
        return 1;
    }

    @Override // Oe.h
    public final void clear() {
        lazySet(3);
    }

    @Override // Je.b
    public final void dispose() {
        set(3);
    }

    @Override // Oe.h
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // Oe.h
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Oe.h
    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.f11894b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            He.j jVar = this.f11893a;
            jVar.b(this.f11894b);
            if (get() == 2) {
                lazySet(3);
                jVar.onComplete();
            }
        }
    }
}
