package androidx.compose.ui.node;

import androidx.compose.ui.unit.Density;
import h.ab;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ComposeUiNode$Companion$SetDensity$1 extends y implements p<ComposeUiNode, Density, ab> {
    public static final ComposeUiNode$Companion$SetDensity$1 INSTANCE = new ComposeUiNode$Companion$SetDensity$1();

    ComposeUiNode$Companion$SetDensity$1() {
        super(2);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(ComposeUiNode composeUiNode, Density density) {
        invoke2(composeUiNode, density);
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ComposeUiNode composeUiNode, Density density) {
        composeUiNode.setDensity(density);
    }
}
