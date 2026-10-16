package androidx.compose.ui.platform;

import androidx.collection.IntObjectMap;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$1 extends y implements l<SemanticsNode, Boolean> {
    final /* synthetic */ IntObjectMap<SemanticsNodeWithAdjustedBounds> $currentSemanticsNodes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeViewAccessibilityDelegateCompat_androidKt$setTraversalValues$semanticsOrderList$1(IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap) {
        super(1);
        this.$currentSemanticsNodes = intObjectMap;
    }

    @Override // h.g.a.l
    public final Boolean invoke(SemanticsNode semanticsNode) {
        return Boolean.valueOf(this.$currentSemanticsNodes.containsKey(semanticsNode.getId()));
    }
}
