package androidx.compose.ui.layout;

import androidx.compose.ui.spatial.RelativeLayoutBounds;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class OnVisibilityChangedNode$rectChanged$1 extends y implements l<RelativeLayoutBounds, ab> {
    final /* synthetic */ OnVisibilityChangedNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OnVisibilityChangedNode$rectChanged$1(OnVisibilityChangedNode onVisibilityChangedNode) {
        super(1);
        this.this$0 = onVisibilityChangedNode;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(RelativeLayoutBounds relativeLayoutBounds) {
        LayoutBoundsHolder viewportBounds = this.this$0.getViewportBounds();
        this.this$0.setLastViewport(viewportBounds != null ? viewportBounds.getBounds() : null);
        OnVisibilityChangedNode onVisibilityChangedNode = this.this$0;
        onVisibilityChangedNode.checkVisibility(onVisibilityChangedNode.getMinFractionVisible(), relativeLayoutBounds, onVisibilityChangedNode.getLastViewport());
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(RelativeLayoutBounds relativeLayoutBounds) {
        invoke2(relativeLayoutBounds);
        return ab.f48028a;
    }
}
