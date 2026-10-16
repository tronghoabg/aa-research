package androidx.compose.ui.platform;

import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.IntSize;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ComposeViewContext$calculateWindowSizeLambda$1 extends y implements a<DerivedSize> {
    final /* synthetic */ ComposeViewContext this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposeViewContext$calculateWindowSizeLambda$1(ComposeViewContext composeViewContext) {
        super(0);
        this.this$0 = composeViewContext;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.g.a.a
    public final DerivedSize invoke() {
        boolean zM11337equalsimpl0 = IntSize.m11337equalsimpl0(this.this$0.m10218getTestWindowSizeYbymL2g$ui(), IntSize.Companion.m11344getZeroYbymL2g());
        ComposeViewContext composeViewContext = this.this$0;
        return zM11337equalsimpl0 ? AndroidWindowInfo_androidKt.calculateWindowSize(composeViewContext.getView$ui()) : DerivedSize.Companion.m10229fromPxSizeviCIZxY(composeViewContext.m10218getTestWindowSizeYbymL2g$ui(), AndroidDensity_androidKt.Density(composeViewContext.getView$ui().getContext()));
    }
}
