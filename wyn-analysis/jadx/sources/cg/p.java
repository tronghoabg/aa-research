package cg;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class p extends J {

    /* renamed from: e, reason: collision with root package name */
    public J f19915e;

    public p(J delegate) {
        AbstractC3340k.e(delegate, "delegate");
        this.f19915e = delegate;
    }

    @Override // cg.J
    public final J a() {
        return this.f19915e.a();
    }

    @Override // cg.J
    public final J b() {
        return this.f19915e.b();
    }

    @Override // cg.J
    public final long c() {
        return this.f19915e.c();
    }

    @Override // cg.J
    public final J d(long j8) {
        return this.f19915e.d(j8);
    }

    @Override // cg.J
    public final boolean e() {
        return this.f19915e.e();
    }

    @Override // cg.J
    public final void f() throws InterruptedIOException {
        this.f19915e.f();
    }

    @Override // cg.J
    public final J g(long j8, TimeUnit unit) {
        AbstractC3340k.e(unit, "unit");
        return this.f19915e.g(j8, unit);
    }
}
