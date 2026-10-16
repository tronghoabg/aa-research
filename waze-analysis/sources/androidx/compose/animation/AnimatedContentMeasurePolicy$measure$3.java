package androidx.compose.animation;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnimatedContentMeasurePolicy$measure$3 extends y implements l<Placeable.PlacementScope, ab> {
    final /* synthetic */ int $maxHeight;
    final /* synthetic */ int $maxWidth;
    final /* synthetic */ Placeable[] $placeables;
    final /* synthetic */ AnimatedContentMeasurePolicy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedContentMeasurePolicy$measure$3(Placeable[] placeableArr, AnimatedContentMeasurePolicy animatedContentMeasurePolicy, int i2, int i3) {
        super(1);
        this.$placeables = placeableArr;
        this.this$0 = animatedContentMeasurePolicy;
        this.$maxWidth = i2;
        this.$maxHeight = i3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope placementScope) {
        for (Placeable placeable : this.$placeables) {
            if (placeable != null) {
                long jMo7648alignKFBX0sM = this.this$0.getRootScope().getContentAlignment().mo7648alignKFBX0sM((placeable.getWidth() << 32) | (placeable.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (this.$maxHeight & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (this.$maxWidth << 32), LayoutDirection.Ltr);
                Placeable.PlacementScope.place$default(placementScope, placeable, IntOffset.m11296getXimpl(jMo7648alignKFBX0sM), IntOffset.m11297getYimpl(jMo7648alignKFBX0sM), 0.0f, 4, null);
            }
        }
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return ab.f48028a;
    }
}
