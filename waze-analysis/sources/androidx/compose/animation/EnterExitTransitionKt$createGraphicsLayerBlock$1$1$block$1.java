package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1 extends y implements l<GraphicsLayerScope, ab> {
    final /* synthetic */ State<Float> $alpha;
    final /* synthetic */ SharedMutableTransformState $mutableTransformState;
    final /* synthetic */ State<Float> $scale;
    final /* synthetic */ State<TransformOrigin> $transformOrigin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1(SharedMutableTransformState sharedMutableTransformState, State<Float> state, State<Float> state2, State<TransformOrigin> state3) {
        super(1);
        this.$mutableTransformState = sharedMutableTransformState;
        this.$alpha = state;
        this.$scale = state2;
        this.$transformOrigin = state3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
        State<Float> state = this.$alpha;
        graphicsLayerScope.setAlpha(this.$mutableTransformState.combinedAlpha(state != null ? state.getValue().floatValue() : 1.0f));
        SharedMutableTransformState sharedMutableTransformState = this.$mutableTransformState;
        State<Float> state2 = this.$scale;
        float fCombinedScale = sharedMutableTransformState.combinedScale(state2 != null ? state2.getValue().floatValue() : 1.0f);
        graphicsLayerScope.setScaleX(fCombinedScale);
        graphicsLayerScope.setScaleY(fCombinedScale);
        SharedMutableTransformState sharedMutableTransformState2 = this.$mutableTransformState;
        State<TransformOrigin> state3 = this.$transformOrigin;
        graphicsLayerScope.mo8413setTransformOrigin__ExYCQ(sharedMutableTransformState2.m1811combinedTransformOrigin488XkdY(state3 != null ? state3.getValue().m8670unboximpl() : TransformOrigin.Companion.m8671getCenterSzJe1aQ()));
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return ab.f48028a;
    }
}
