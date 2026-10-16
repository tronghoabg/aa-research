package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OnLayoutRectChangedModifierKt {
    public static final Modifier onLayoutRectChanged(Modifier modifier, long j2, long j3, l<? super RelativeLayoutBounds, ab> lVar) {
        return modifier.then(new OnLayoutRectChangedElement(j2, j3, lVar));
    }

    public static /* synthetic */ Modifier onLayoutRectChanged$default(Modifier modifier, long j2, long j3, l lVar, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            j2 = 0;
        }
        long j4 = j2;
        if ((i2 & 2) != 0) {
            j3 = 64;
        }
        return onLayoutRectChanged(modifier, j4, j3, lVar);
    }

    public static final DelegatableNode.RegistrationHandle registerOnLayoutRectChanged(DelegatableNode delegatableNode, long j2, long j3, l<? super RelativeLayoutBounds, ab> lVar) {
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        return LayoutNodeKt.requireOwner(layoutNodeRequireLayoutNode).getRectManager().registerOnRectChangedCallback(layoutNodeRequireLayoutNode.getSemanticsId(), j2, j3, delegatableNode, lVar);
    }
}
