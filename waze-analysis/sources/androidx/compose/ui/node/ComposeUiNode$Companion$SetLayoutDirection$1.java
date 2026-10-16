package androidx.compose.ui.node;

import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ComposeUiNode$Companion$SetLayoutDirection$1 extends y implements p<ComposeUiNode, LayoutDirection, ab> {
    public static final ComposeUiNode$Companion$SetLayoutDirection$1 INSTANCE = new ComposeUiNode$Companion$SetLayoutDirection$1();

    ComposeUiNode$Companion$SetLayoutDirection$1() {
        super(2);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
        invoke2(composeUiNode, layoutDirection);
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
        composeUiNode.setLayoutDirection(layoutDirection);
    }
}
