package androidx.compose.foundation.style;

import androidx.compose.foundation.internal.System_jvmAndAndroidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StyleInnerElement extends ModifierNodeElement<StyleInnerNode> {
    public static final int $stable = 0;
    public static final StyleInnerElement INSTANCE = new StyleInnerElement();

    private StyleInnerElement() {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return System_jvmAndAndroidKt.identityHashCode(this);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
    }

    public void update(StyleInnerNode styleInnerNode) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public StyleInnerNode create() {
        return new StyleInnerNode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }
}
