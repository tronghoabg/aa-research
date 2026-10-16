package androidx.tracing;

import h.c.h;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class PropagationUnsupportedToken implements PropagationToken, AutoCloseable {
    public static final PropagationUnsupportedToken INSTANCE = new PropagationUnsupportedToken();

    private PropagationUnsupportedToken() {
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }

    @Override // androidx.tracing.PropagationToken
    @DelicateTracingApi
    public h contextElementOrNull() {
        return null;
    }
}
