package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnimatedContentTransitionScopeImpl$slideOutOfContainer$3 extends y implements l<Integer, Integer> {
    final /* synthetic */ l<Integer, Integer> $targetOffset;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnimatedContentTransitionScopeImpl$slideOutOfContainer$3(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, l<? super Integer, Integer> lVar) {
        super(1);
        this.this$0 = animatedContentTransitionScopeImpl;
        this.$targetOffset = lVar;
    }

    public final Integer invoke(int i2) {
        AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.this$0;
        State state = (State) animatedContentTransitionScopeImpl.getTargetSizeMap$animation().get(animatedContentTransitionScopeImpl.getTransition$animation().getTargetState());
        long j2 = i2;
        return this.$targetOffset.invoke(Integer.valueOf((-IntOffset.m11297getYimpl(this.this$0.m1724calculateOffsetemnUabE((j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (j2 << 32), state != null ? ((IntSize) state.getValue()).m11343unboximpl() : IntSize.Companion.m11344getZeroYbymL2g()))) - i2));
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }
}
