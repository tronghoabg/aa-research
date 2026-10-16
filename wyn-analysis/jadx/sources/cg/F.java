package cg;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes5.dex */
public interface F extends Closeable, Flushable {
    void E(C1618g c1618g, long j8);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    J timeout();
}
