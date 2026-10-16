package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1 extends y implements l<Placeable.PlacementScope, ab> {
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ Placeable $placeable;
    final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$1(AnimatedContentTransitionScopeImpl.SizeModifierNode<S> sizeModifierNode, Placeable placeable, long j2) {
        super(1);
        this.this$0 = sizeModifierNode;
        this.$placeable = placeable;
        this.$measuredSize = j2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.m9813place70tqf50$default(placementScope, this.$placeable, this.this$0.getScope().getContentAlignment().mo7648alignKFBX0sM((this.$placeable.getWidth() << 32) | (this.$placeable.getHeight() & MuxerUtil.UNSIGNED_INT_MAX_VALUE), this.$measuredSize, LayoutDirection.Ltr), 0.0f, 2, null);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return ab.f48028a;
    }
}
