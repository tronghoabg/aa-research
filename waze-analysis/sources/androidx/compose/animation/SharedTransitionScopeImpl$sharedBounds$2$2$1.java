package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SharedTransitionScopeImpl$sharedBounds$2$2$1 extends y implements a<Boolean> {
    final /* synthetic */ SharedTransitionScope.SharedContentState $sharedContentState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedTransitionScopeImpl$sharedBounds$2$2$1(SharedTransitionScope.SharedContentState sharedContentState) {
        super(0);
        this.$sharedContentState = sharedContentState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.g.a.a
    public final Boolean invoke() {
        return Boolean.valueOf(this.$sharedContentState.isMatchFound());
    }
}
