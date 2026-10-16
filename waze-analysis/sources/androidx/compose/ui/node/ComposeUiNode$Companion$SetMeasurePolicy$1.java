package androidx.compose.ui.node;

import androidx.compose.ui.layout.MeasurePolicy;
import h.ab;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ComposeUiNode$Companion$SetMeasurePolicy$1 extends y implements p<ComposeUiNode, MeasurePolicy, ab> {
    public static final ComposeUiNode$Companion$SetMeasurePolicy$1 INSTANCE = new ComposeUiNode$Companion$SetMeasurePolicy$1();

    ComposeUiNode$Companion$SetMeasurePolicy$1() {
        super(2);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(ComposeUiNode composeUiNode, MeasurePolicy measurePolicy) {
        invoke2(composeUiNode, measurePolicy);
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ComposeUiNode composeUiNode, MeasurePolicy measurePolicy) {
        composeUiNode.setMeasurePolicy(measurePolicy);
    }
}
