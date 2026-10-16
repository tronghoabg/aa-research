package okhttp3;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public abstract class at implements Closeable {
    public abstract long a();

    public abstract ae b();

    public abstract k.j c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        okhttp3.internal.b.s(c());
    }

    public final byte[] d() throws IOException {
        long jA = a();
        if (jA > SieveCacheKt.NodeLinkMask) {
            throw new IOException("Cannot buffer entire body for content length: " + jA);
        }
        k.j jVarC = c();
        try {
            byte[] bArrT = jVarC.T();
            h.a.i.aW(jVarC, null);
            int length = bArrT.length;
            if (jA == -1 || jA == length) {
                return bArrT;
            }
            throw new IOException("Content-Length (" + jA + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }
}
