package cg;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public abstract class n implements F {

    /* renamed from: a, reason: collision with root package name */
    public final F f19914a;

    public n(F delegate) {
        AbstractC3340k.e(delegate, "delegate");
        this.f19914a = delegate;
    }

    @Override // cg.F
    public void E(C1618g source, long j8) {
        AbstractC3340k.e(source, "source");
        this.f19914a.E(source, j8);
    }

    @Override // cg.F, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19914a.close();
    }

    @Override // cg.F, java.io.Flushable
    public void flush() {
        this.f19914a.flush();
    }

    @Override // cg.F
    public final J timeout() {
        return this.f19914a.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f19914a + ')';
    }
}
