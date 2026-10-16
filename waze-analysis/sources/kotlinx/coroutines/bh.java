package kotlinx.coroutines;

import java.io.Closeable;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class bh extends ab implements Closeable, AutoCloseable {
    static {
        new h.c.b(ab.Key, new z(2));
    }

    public abstract Executor a();
}
