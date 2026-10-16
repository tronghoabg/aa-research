package androidx.compose.ui.tooling.animation.search;

import androidx.compose.ui.tooling.animation.ClockInfo;
import androidx.compose.ui.tooling.animation.UnsupportedComposeAnimation;
import androidx.compose.ui.tooling.animation.clock.NoopClock;
import androidx.compose.ui.tooling.animation.states.ComposeAnimationState;
import androidx.compose.ui.tooling.animation.states.NoopState_androidKt;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class UnsupportedSearchInfo implements SearchInfo<UnsupportedComposeAnimation, NoopClock> {
    public static final int $stable = 8;
    private final Object animationObject;
    private final String label;
    private final ComposeAnimationState initialState = NoopState_androidKt.getNoopState();
    private final ComposeAnimationState targetState = NoopState_androidKt.getNoopState();

    public UnsupportedSearchInfo(Object obj, String str) {
        this.label = str;
        this.animationObject = obj;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public /* synthetic */ void attach() {
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public UnsupportedComposeAnimation createAnimation() {
        return UnsupportedComposeAnimation.Companion.create(getLabel());
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public /* synthetic */ void detach() {
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Object getAnimationObject() {
        return this.animationObject;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public String getLabel() {
        return this.label;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void setInitialStateToCurrentAnimationValue() {
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void setTargetStateToCurrentAnimationValue() {
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public ComposeAnimationState getInitialState() {
        return this.initialState;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public ComposeAnimationState getTargetState() {
        return this.targetState;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public NoopClock createClock(UnsupportedComposeAnimation unsupportedComposeAnimation, ClockInfo clockInfo) {
        return new NoopClock(unsupportedComposeAnimation);
    }
}
