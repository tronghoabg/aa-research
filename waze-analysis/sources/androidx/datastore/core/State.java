package androidx.datastore.core;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class State<T> {
    private final int version;

    private State(int i2) {
        this.version = i2;
    }

    public final int getVersion() {
        return this.version;
    }

    public /* synthetic */ State(int i2, o oVar) {
        this(i2);
    }
}
