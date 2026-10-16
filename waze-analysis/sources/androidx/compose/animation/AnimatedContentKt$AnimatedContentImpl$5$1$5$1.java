package androidx.compose.animation;

import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnimatedContentKt$AnimatedContentImpl$5$1$5$1 extends y implements p<EnterExitState, EnterExitState, Boolean> {
    final /* synthetic */ ExitTransition $exit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AnimatedContentKt$AnimatedContentImpl$5$1$5$1(ExitTransition exitTransition) {
        super(2);
        this.$exit = exitTransition;
    }

    @Override // h.g.a.p
    public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
        EnterExitState enterExitState3 = EnterExitState.PostExit;
        boolean z = false;
        if (enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !this.$exit.getData$animation().getHold()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
