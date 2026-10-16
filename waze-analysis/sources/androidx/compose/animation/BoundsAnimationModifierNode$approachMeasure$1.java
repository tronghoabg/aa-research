package androidx.compose.animation;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class BoundsAnimationModifierNode$approachMeasure$1 extends y implements l<Placeable.PlacementScope, ab> {
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ BoundsAnimationModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BoundsAnimationModifierNode$approachMeasure$1(BoundsAnimationModifierNode boundsAnimationModifierNode, Placeable placeable) {
        super(1);
        this.this$0 = boundsAnimationModifierNode;
        this.$placeable = placeable;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope placementScope) {
        long jM8015getTopLeftF1C5BW0;
        Rect value = this.this$0.boundsAnimation.getValue();
        LookaheadScope lookaheadScope = this.this$0.getLookaheadScope();
        LayoutCoordinates coordinates = placementScope.getCoordinates();
        Offset offsetM7969boximpl = coordinates != null ? Offset.m7969boximpl(lookaheadScope.getLookaheadScopeCoordinates(placementScope).mo9745localPositionOfS_NoaFU(coordinates, Offset.Companion.m7996getZeroF1C5BW0(), this.this$0.getAnimateMotionFrameOfReference())) : null;
        BoundsAnimationModifierNode boundsAnimationModifierNode = this.this$0;
        if (value != null) {
            boundsAnimationModifierNode.boundsAnimation.m1744updateCurrentBoundstz77jQw(value.m8015getTopLeftF1C5BW0(), value.m8013getSizeNHjbRc());
            jM8015getTopLeftF1C5BW0 = value.m8015getTopLeftF1C5BW0();
        } else {
            Rect currentBounds = boundsAnimationModifierNode.boundsAnimation.getCurrentBounds();
            jM8015getTopLeftF1C5BW0 = currentBounds != null ? currentBounds.m8015getTopLeftF1C5BW0() : Offset.Companion.m7996getZeroF1C5BW0();
        }
        long jM7984minusMKHz9U = offsetM7969boximpl != null ? Offset.m7984minusMKHz9U(jM8015getTopLeftF1C5BW0, offsetM7969boximpl.m7990unboximpl()) : Offset.Companion.m7996getZeroF1C5BW0();
        Placeable.PlacementScope.place$default(placementScope, this.$placeable, Math.round(Float.intBitsToFloat((int) (jM7984minusMKHz9U >> 32))), Math.round(Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & jM7984minusMKHz9U))), 0.0f, 4, null);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return ab.f48028a;
    }
}
