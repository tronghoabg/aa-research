package k;

import java.io.Closeable;
import java.io.Flushable;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public interface al extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    ao h();

    void l(h hVar, long j2);
}
