package androidx.compose.animation;

import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SizeAnimationModifierNode$measure$2 extends y implements l<Placeable.PlacementScope, ab> {
    final /* synthetic */ int $height;
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ MeasureScope $this_measure;
    final /* synthetic */ int $width;
    final /* synthetic */ SizeAnimationModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SizeAnimationModifierNode$measure$2(SizeAnimationModifierNode sizeAnimationModifierNode, long j2, int i2, int i3, MeasureScope measureScope, Placeable placeable) {
        super(1);
        this.this$0 = sizeAnimationModifierNode;
        this.$measuredSize = j2;
        this.$width = i2;
        this.$height = i3;
        this.$this_measure = measureScope;
        this.$placeable = placeable;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope placementScope) {
        long j2 = this.$width;
        long j3 = this.$height;
        Placeable.PlacementScope.m9813place70tqf50$default(placementScope, this.$placeable, this.this$0.getAlignment().mo7648alignKFBX0sM(this.$measuredSize, (j2 << 32) | (j3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), this.$this_measure.getLayoutDirection()), 0.0f, 2, null);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return ab.f48028a;
    }
}
