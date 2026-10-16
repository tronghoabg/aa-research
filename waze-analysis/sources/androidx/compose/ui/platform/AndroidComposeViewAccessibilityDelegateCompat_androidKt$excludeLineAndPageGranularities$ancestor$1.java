package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1 extends y implements l<LayoutNode, Boolean> {
    public static final AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1 INSTANCE = new AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1();

    AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1() {
        super(1);
    }

    @Override // h.g.a.l
    public final Boolean invoke(LayoutNode layoutNode) {
        SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
        boolean z = false;
        if (semanticsConfiguration != null && semanticsConfiguration.isMergingSemanticsOfDescendants() && semanticsConfiguration.contains(SemanticsProperties.INSTANCE.getEditableText())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
