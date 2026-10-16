package androidx.compose.runtime;

import h.ab;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MovableContent<P> {
    public static final int $stable = 0;
    private final q<P, Composer, Integer, ab> content;

    /* JADX WARN: Multi-variable type inference failed */
    public MovableContent(q<? super P, ? super Composer, ? super Integer, ab> qVar) {
        this.content = qVar;
    }

    public final q<P, Composer, Integer, ab> getContent() {
        return this.content;
    }
}
