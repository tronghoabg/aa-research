package androidx.compose.ui.semantics;

import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CustomAccessibilityAction {
    public static final int $stable = 0;
    private final a<Boolean> action;
    private final String label;

    public CustomAccessibilityAction(String str, a<Boolean> aVar) {
        this.label = str;
        this.action = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAccessibilityAction)) {
            return false;
        }
        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) obj;
        return x.n(this.label, customAccessibilityAction.label) && this.action == customAccessibilityAction.action;
    }

    public final a<Boolean> getAction() {
        return this.action;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.action.hashCode();
    }

    public String toString() {
        return "CustomAccessibilityAction(label=" + this.label + ", action=" + this.action + ')';
    }
}
