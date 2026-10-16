package androidx.compose.ui.layout;

import androidx.compose.ui.spatial.RelativeLayoutBounds;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class OnFirstVisibleNode$rectChanged$1 extends y implements l<RelativeLayoutBounds, ab> {
    final /* synthetic */ OnFirstVisibleNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnFirstVisibleNode$rectChanged$1(OnFirstVisibleNode onFirstVisibleNode) {
        super(1);
        this.this$0 = onFirstVisibleNode;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RelativeLayoutBounds relativeLayoutBounds) {
        OnFirstVisibleNode onFirstVisibleNode = this.this$0;
        onFirstVisibleNode.checkVisibility(onFirstVisibleNode.getMinFractionVisible(), relativeLayoutBounds, onFirstVisibleNode.getLastViewport());
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(RelativeLayoutBounds relativeLayoutBounds) {
        invoke2(relativeLayoutBounds);
        return ab.f48028a;
    }
}
