package Re;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class O extends AtomicLong implements ug.b {

    /* renamed from: a, reason: collision with root package name */
    public final He.f f10682a;

    /* renamed from: b, reason: collision with root package name */
    public volatile P f10683b;

    /* renamed from: c, reason: collision with root package name */
    public long f10684c;

    public O(He.f fVar) {
        this.f10682a = fVar;
    }

    @Override // ug.b
    public final void cancel() {
        P p10;
        if (get() == Long.MIN_VALUE || getAndSet(Long.MIN_VALUE) == Long.MIN_VALUE || (p10 = this.f10683b) == null) {
            return;
        }
        p10.g(this);
        p10.c();
    }

    @Override // ug.b
    public final void request(long j8) {
        long j10;
        if (Ye.f.c(j8)) {
            do {
                j10 = get();
                if (j10 == Long.MIN_VALUE || j10 == Long.MAX_VALUE) {
                    break;
                }
            } while (!compareAndSet(j10, Fe.e.h(j10, j8)));
            P p10 = this.f10683b;
            if (p10 != null) {
                p10.c();
            }
        }
    }
}
