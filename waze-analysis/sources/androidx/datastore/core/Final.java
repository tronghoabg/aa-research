package androidx.datastore.core;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Final<T> extends State<T> {
    private final Throwable finalException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Final(Throwable th) {
        super(Integer.MAX_VALUE, null);
        x.f(th, "finalException");
        this.finalException = th;
    }

    public final Throwable getFinalException() {
        return this.finalException;
    }
}
