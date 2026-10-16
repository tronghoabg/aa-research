package androidx.compose.material3;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class InteractiveListColorState {
    private final boolean dragged;
    private final boolean enabled;
    private final boolean selected;

    public InteractiveListColorState(boolean z, boolean z2, boolean z3) {
        this.enabled = z;
        this.selected = z2;
        this.dragged = z3;
    }

    public static /* synthetic */ InteractiveListColorState copy$default(InteractiveListColorState interactiveListColorState, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = interactiveListColorState.enabled;
        }
        if ((i2 & 2) != 0) {
            z2 = interactiveListColorState.selected;
        }
        if ((i2 & 4) != 0) {
            z3 = interactiveListColorState.dragged;
        }
        return interactiveListColorState.copy(z, z2, z3);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final boolean component2() {
        return this.selected;
    }

    public final boolean component3() {
        return this.dragged;
    }

    public final InteractiveListColorState copy(boolean z, boolean z2, boolean z3) {
        return new InteractiveListColorState(z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractiveListColorState)) {
            return false;
        }
        InteractiveListColorState interactiveListColorState = (InteractiveListColorState) obj;
        return this.enabled == interactiveListColorState.enabled && this.selected == interactiveListColorState.selected && this.dragged == interactiveListColorState.dragged;
    }

    public final boolean getDragged() {
        return this.dragged;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        return (((InteractiveListColorState$$ExternalSyntheticBackport0.m(this.enabled) * 31) + InteractiveListColorState$$ExternalSyntheticBackport0.m(this.selected)) * 31) + InteractiveListColorState$$ExternalSyntheticBackport0.m(this.dragged);
    }

    public String toString() {
        return "InteractiveListColorState(enabled=" + this.enabled + ", selected=" + this.selected + ", dragged=" + this.dragged + ')';
    }
}
