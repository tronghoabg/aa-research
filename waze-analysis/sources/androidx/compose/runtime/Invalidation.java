package androidx.compose.runtime;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class Invalidation {
    private Object instances;
    private int location;
    private final RecomposeScopeImpl scope;

    public Invalidation(RecomposeScopeImpl recomposeScopeImpl, int i2, Object obj) {
        this.scope = recomposeScopeImpl;
        this.location = i2;
        this.instances = obj;
    }

    public final Object getInstances() {
        return this.instances;
    }

    public final int getLocation() {
        return this.location;
    }

    public final RecomposeScopeImpl getScope() {
        return this.scope;
    }

    public final boolean isInvalid() {
        return this.scope.isInvalidFor(this.instances);
    }

    public final void setInstances(Object obj) {
        this.instances = obj;
    }

    public final void setLocation(int i2) {
        this.location = i2;
    }
}
