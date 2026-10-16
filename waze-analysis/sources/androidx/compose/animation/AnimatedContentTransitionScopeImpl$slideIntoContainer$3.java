package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.media3.muxer.MuxerUtil;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnimatedContentTransitionScopeImpl$slideIntoContainer$3 extends y implements l<Integer, Integer> {
    final /* synthetic */ l<Integer, Integer> $initialOffset;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    AnimatedContentTransitionScopeImpl$slideIntoContainer$3(l<? super Integer, Integer> lVar, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
        super(1);
        this.$initialOffset = lVar;
        this.this$0 = animatedContentTransitionScopeImpl;
    }

    public final Integer invoke(int i2) {
        long jM1725getCurrentSizeYbymL2g = this.this$0.m1725getCurrentSizeYbymL2g() & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        long j2 = i2;
        AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.this$0;
        return this.$initialOffset.invoke(Integer.valueOf(((int) jM1725getCurrentSizeYbymL2g) - IntOffset.m11297getYimpl(animatedContentTransitionScopeImpl.m1724calculateOffsetemnUabE((MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2) | (j2 << 32), animatedContentTransitionScopeImpl.m1725getCurrentSizeYbymL2g()))));
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }
}
