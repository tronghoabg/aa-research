package Xe;

import A7.AbstractC0279p0;
import Fe.e;
import He.f;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class d extends AtomicInteger implements f, ug.b {

    /* renamed from: a, reason: collision with root package name */
    public final f f16242a;

    /* renamed from: b, reason: collision with root package name */
    public final Ze.b f16243b = new Ze.b();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f16244c = new AtomicLong();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f16245d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f16246e = new AtomicBoolean();

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f16247f;

    public d(f fVar) {
        this.f16242a = fVar;
    }

    @Override // He.f
    public final void b(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            f fVar = this.f16242a;
            fVar.b(obj);
            if (decrementAndGet() != 0) {
                Ze.b bVar = this.f16243b;
                bVar.getClass();
                Throwable thB = Ze.d.b(bVar);
                if (thB != null) {
                    fVar.onError(thB);
                } else {
                    fVar.onComplete();
                }
            }
        }
    }

    @Override // ug.b
    public final void cancel() {
        if (this.f16247f) {
            return;
        }
        Ye.f.a(this.f16245d);
    }

    @Override // He.f
    public final void e(ug.b bVar) {
        if (!this.f16246e.compareAndSet(false, true)) {
            bVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
            return;
        }
        this.f16242a.e(this);
        AtomicReference atomicReference = this.f16245d;
        AtomicLong atomicLong = this.f16244c;
        if (Ye.f.b(atomicReference, bVar)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                bVar.request(andSet);
            }
        }
    }

    @Override // He.f
    public final void onComplete() {
        this.f16247f = true;
        f fVar = this.f16242a;
        Ze.b bVar = this.f16243b;
        if (getAndIncrement() == 0) {
            bVar.getClass();
            Throwable thB = Ze.d.b(bVar);
            if (thB != null) {
                fVar.onError(thB);
            } else {
                fVar.onComplete();
            }
        }
    }

    @Override // He.f
    public final void onError(Throwable th) {
        this.f16247f = true;
        f fVar = this.f16242a;
        Ze.b bVar = this.f16243b;
        bVar.getClass();
        if (!Ze.d.a(bVar, th)) {
            S3.f.A(th);
        } else if (getAndIncrement() == 0) {
            fVar.onError(Ze.d.b(bVar));
        }
    }

    @Override // ug.b
    public final void request(long j8) {
        if (j8 <= 0) {
            cancel();
            onError(new IllegalArgumentException(AbstractC0279p0.k(j8, "§3.9 violated: positive request amount required but it was ")));
            return;
        }
        AtomicReference atomicReference = this.f16245d;
        AtomicLong atomicLong = this.f16244c;
        ug.b bVar = (ug.b) atomicReference.get();
        if (bVar != null) {
            bVar.request(j8);
            return;
        }
        if (Ye.f.c(j8)) {
            e.f(atomicLong, j8);
            ug.b bVar2 = (ug.b) atomicReference.get();
            if (bVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    bVar2.request(andSet);
                }
            }
        }
    }
}
