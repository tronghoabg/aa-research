package androidx.compose.animation;

import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1 extends y implements p<EnterExitState, EnterExitState, Boolean> {
    public static final AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1 INSTANCE = new AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1();

    AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1() {
        super(2);
    }

    @Override // h.g.a.p
    public final Boolean invoke(EnterExitState enterExitState, EnterExitState enterExitState2) {
        boolean z = false;
        if (enterExitState == enterExitState2 && enterExitState2 == EnterExitState.PostExit) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
