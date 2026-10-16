package androidx.compose.runtime;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CompositionLocalContext {
    public static final int $stable = 0;
    private final PersistentCompositionLocalMap compositionLocals;

    public CompositionLocalContext(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        this.compositionLocals = persistentCompositionLocalMap;
    }

    public boolean equals(Object obj) {
        return (obj instanceof CompositionLocalContext) && x.n(((CompositionLocalContext) obj).compositionLocals, this.compositionLocals);
    }

    public final PersistentCompositionLocalMap getCompositionLocals$runtime() {
        return this.compositionLocals;
    }

    public int hashCode() {
        return this.compositionLocals.hashCode();
    }
}
