package cg;

import java.io.EOFException;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: cg.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1617f implements F {
    @Override // cg.F
    public final void E(C1618g source, long j8) throws EOFException {
        AbstractC3340k.e(source, "source");
        source.skip(j8);
    }

    @Override // cg.F
    public final J timeout() {
        return J.f19879d;
    }

    @Override // cg.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // cg.F, java.io.Flushable
    public final void flush() {
    }
}
