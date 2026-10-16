package cg;

import ef.InterfaceC2519c;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class o implements H {

    @NotNull
    private final H delegate;

    public o(H delegate) {
        AbstractC3340k.e(delegate, "delegate");
        this.delegate = delegate;
    }

    @InterfaceC2519c
    @NotNull
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final H m6deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @NotNull
    public final H delegate() {
        return this.delegate;
    }

    @Override // cg.H
    public long read(C1618g sink, long j8) {
        AbstractC3340k.e(sink, "sink");
        return this.delegate.read(sink, j8);
    }

    @Override // cg.H
    @NotNull
    public J timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
