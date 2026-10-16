package androidx.compose.animation.tooling;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ComposeAnimatedProperty {
    private final String label;
    private final Object value;

    public ComposeAnimatedProperty(String str, Object obj) {
        this.label = str;
        this.value = obj;
    }

    public static /* synthetic */ ComposeAnimatedProperty copy$default(ComposeAnimatedProperty composeAnimatedProperty, String str, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = composeAnimatedProperty.label;
        }
        if ((i2 & 2) != 0) {
            obj = composeAnimatedProperty.value;
        }
        return composeAnimatedProperty.copy(str, obj);
    }

    public final String component1() {
        return this.label;
    }

    public final Object component2() {
        return this.value;
    }

    public final ComposeAnimatedProperty copy(String str, Object obj) {
        return new ComposeAnimatedProperty(str, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposeAnimatedProperty)) {
            return false;
        }
        ComposeAnimatedProperty composeAnimatedProperty = (ComposeAnimatedProperty) obj;
        return x.n(this.label, composeAnimatedProperty.label) && x.n(this.value, composeAnimatedProperty.value);
    }

    public final String getLabel() {
        return this.label;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "ComposeAnimatedProperty(label=" + this.label + ", value=" + this.value + ')';
    }
}
