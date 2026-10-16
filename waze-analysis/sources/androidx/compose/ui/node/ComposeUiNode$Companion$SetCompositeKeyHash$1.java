package androidx.compose.ui.node;

import h.ab;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ComposeUiNode$Companion$SetCompositeKeyHash$1 extends y implements p<ComposeUiNode, Integer, ab> {
    public static final ComposeUiNode$Companion$SetCompositeKeyHash$1 INSTANCE = new ComposeUiNode$Companion$SetCompositeKeyHash$1();

    ComposeUiNode$Companion$SetCompositeKeyHash$1() {
        super(2);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(ComposeUiNode composeUiNode, Integer num) {
        invoke(composeUiNode, num.intValue());
        return ab.f48028a;
    }

    public final void invoke(ComposeUiNode composeUiNode, int i2) {
        composeUiNode.setCompositeKeyHash(i2);
    }
}
