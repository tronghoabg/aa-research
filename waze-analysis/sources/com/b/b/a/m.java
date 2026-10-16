package com.b.b.a;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public abstract class m implements l {

    /* renamed from: a, reason: collision with root package name */
    protected volatile boolean f2599a;

    /* renamed from: b, reason: collision with root package name */
    protected volatile s f2600b;

    /* renamed from: c, reason: collision with root package name */
    protected volatile j f2601c;

    /* renamed from: d, reason: collision with root package name */
    private final CountDownLatch f2602d = new CountDownLatch(1);

    protected abstract void b();

    @Override // com.b.b.a.l
    public final s d(long j2, TimeUnit timeUnit) {
        try {
            if (!this.f2602d.await(j2, timeUnit)) {
                this.f2600b = new t(new Exception("Result was not delivered on time."), 1);
            }
        } catch (InterruptedException e2) {
            this.f2600b = new t(e2, 1);
        }
        return this.f2600b;
    }

    public final void e(Throwable th) {
        this.f2600b = new t(th, 1);
        this.f2602d.countDown();
        if (this.f2601c != null) {
            this.f2601c.a(this.f2600b.b());
        }
    }

    public final void f(s sVar) {
        this.f2600b = sVar;
        this.f2602d.countDown();
        b();
    }

    public final void g(j jVar) {
        this.f2601c = jVar;
        if (this.f2601c == null || this.f2600b == null || this.f2600b.b() == null) {
            return;
        }
        this.f2601c.a(this.f2600b.b());
    }
}
