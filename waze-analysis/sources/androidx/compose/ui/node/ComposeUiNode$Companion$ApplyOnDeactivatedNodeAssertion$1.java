package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import h.ab;
import h.g.a.l;
import h.g.b.y;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1 extends y implements l<ComposeUiNode, ab> {
    public static final ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1 INSTANCE = new ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1();

    ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ComposeUiNode composeUiNode) {
        LayoutNode layoutNode = composeUiNode instanceof LayoutNode ? (LayoutNode) composeUiNode : null;
        if (layoutNode == null || !layoutNode.isDeactivated()) {
            return;
        }
        Objects.toString(composeUiNode);
        InlineClassHelperKt.throwIllegalStateException("Apply is called on deactivated node ".concat(String.valueOf(composeUiNode)));
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(ComposeUiNode composeUiNode) {
        invoke2(composeUiNode);
        return ab.f48028a;
    }
}
