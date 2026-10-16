package androidx.datastore.core;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ReadException<T> extends State<T> {
    private final Throwable readException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadException(Throwable th, int i2) {
        super(i2, null);
        x.f(th, "readException");
        this.readException = th;
    }

    public final Throwable getReadException() {
        return this.readException;
    }
}
