package Ye;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class e extends AtomicInteger implements Oe.e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16795a;

    /* renamed from: b, reason: collision with root package name */
    public final He.f f16796b;

    public e(He.f fVar, Object obj) {
        this.f16796b = fVar;
        this.f16795a = obj;
    }

    @Override // Oe.d
    public final int c(int i5) {
        return 1;
    }

    @Override // ug.b
    public final void cancel() {
        lazySet(2);
    }

    @Override // Oe.h
    public final void clear() {
        lazySet(1);
    }

    @Override // Oe.h
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // Oe.h
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Oe.h
    public final Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f16795a;
    }

    @Override // ug.b
    public final void request(long j8) {
        if (f.c(j8) && compareAndSet(0, 1)) {
            He.f fVar = this.f16796b;
            fVar.b(this.f16795a);
            if (get() != 2) {
                fVar.onComplete();
            }
        }
    }
}
