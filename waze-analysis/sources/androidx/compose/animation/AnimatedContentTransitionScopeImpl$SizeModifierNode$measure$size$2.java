package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntSize;
import h.g.a.l;
import h.g.b.x;
import h.g.b.y;

/* JADX INFO: Add missing generic type declarations: [S] */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2<S> extends y implements l<S, IntSize> {
    final /* synthetic */ long $currentSize;
    final /* synthetic */ AnimatedContentTransitionScopeImpl.SizeModifierNode<S> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedContentTransitionScopeImpl$SizeModifierNode$measure$size$2(AnimatedContentTransitionScopeImpl.SizeModifierNode<S> sizeModifierNode, long j2) {
        super(1);
        this.this$0 = sizeModifierNode;
        this.$currentSize = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ IntSize invoke(Object obj) {
        return IntSize.m11331boximpl(m1733invokeYEO4UFw(obj));
    }

    /* renamed from: invoke-YEO4UFw, reason: not valid java name */
    public final long m1733invokeYEO4UFw(S s) {
        boolean zN = x.n(s, this.this$0.getScope().getInitialState());
        AnimatedContentTransitionScopeImpl.SizeModifierNode<S> sizeModifierNode = this.this$0;
        if (zN) {
            return sizeModifierNode.m1731lastContinuousSizeOrDefaultmzRDjE0(this.$currentSize);
        }
        State<IntSize> state = sizeModifierNode.getScope().getTargetSizeMap$animation().get(s);
        return state != null ? state.getValue().m11343unboximpl() : IntSize.Companion.m11344getZeroYbymL2g();
    }
}
