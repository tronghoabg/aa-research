package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final class wfe implements Closeable {
    private final /* synthetic */ int a;
    private Object b;

    public wfe(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.a;
        Object obj = this.b;
        if (i != 0) {
            if (obj != null) {
                ((FileLock) obj).release();
                this.b = null;
                return;
            }
            return;
        }
        if (obj != null) {
            ((Semaphore) obj).release();
            this.b = null;
        }
    }
}
