package androidx.compose.ui.tooling.animation.search;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.ui.tooling.animation.ClockInfo;
import androidx.compose.ui.tooling.animation.InfiniteTransitionComposeAnimation;
import androidx.compose.ui.tooling.animation.ToolingOverride;
import androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock;
import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class InfiniteTransitionSearchInfo implements SearchInfo<InfiniteTransitionComposeAnimation, InfiniteTransitionClock> {
    public static final int $stable = 8;
    private final Object animationObject;
    private final InfiniteTransition infiniteTransition;
    private final Object initialState;
    private final Object targetState;
    private final ToolingOverride<Long> toolingOverride;

    public InfiniteTransitionSearchInfo(InfiniteTransition infiniteTransition, ToolingOverride<Long> toolingOverride) {
        this.infiniteTransition = infiniteTransition;
        this.toolingOverride = toolingOverride;
        this.animationObject = infiniteTransition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InfiniteTransitionSearchInfo copy$default(InfiniteTransitionSearchInfo infiniteTransitionSearchInfo, InfiniteTransition infiniteTransition, ToolingOverride toolingOverride, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            infiniteTransition = infiniteTransitionSearchInfo.infiniteTransition;
        }
        if ((i2 & 2) != 0) {
            toolingOverride = infiniteTransitionSearchInfo.toolingOverride;
        }
        return infiniteTransitionSearchInfo.copy(infiniteTransition, toolingOverride);
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void attach() {
        this.toolingOverride.overrideState();
    }

    public final InfiniteTransition component1() {
        return this.infiniteTransition;
    }

    public final ToolingOverride<Long> component2() {
        return this.toolingOverride;
    }

    public final InfiniteTransitionSearchInfo copy(InfiniteTransition infiniteTransition, ToolingOverride<Long> toolingOverride) {
        return new InfiniteTransitionSearchInfo(infiniteTransition, toolingOverride);
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public InfiniteTransitionClock createClock(InfiniteTransitionComposeAnimation infiniteTransitionComposeAnimation, final ClockInfo clockInfo) {
        return new InfiniteTransitionClock(infiniteTransitionComposeAnimation, new a() { // from class: androidx.compose.ui.tooling.animation.search.InfiniteTransitionSearchInfo$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return Long.valueOf(clockInfo.getMaxDurationPerIterationMillis());
            }
        });
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void detach() {
        this.toolingOverride.clearOverride();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfiniteTransitionSearchInfo)) {
            return false;
        }
        InfiniteTransitionSearchInfo infiniteTransitionSearchInfo = (InfiniteTransitionSearchInfo) obj;
        return x.n(this.infiniteTransition, infiniteTransitionSearchInfo.infiniteTransition) && x.n(this.toolingOverride, infiniteTransitionSearchInfo.toolingOverride);
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Object getAnimationObject() {
        return this.animationObject;
    }

    public final InfiniteTransition getInfiniteTransition() {
        return this.infiniteTransition;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Object getInitialState() {
        return this.initialState;
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public String getLabel() {
        return this.infiniteTransition.getLabel();
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public Object getTargetState() {
        return this.targetState;
    }

    public final ToolingOverride<Long> getToolingOverride() {
        return this.toolingOverride;
    }

    public int hashCode() {
        return (this.infiniteTransition.hashCode() * 31) + this.toolingOverride.hashCode();
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void setInitialStateToCurrentAnimationValue() {
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public void setTargetStateToCurrentAnimationValue() {
    }

    public String toString() {
        return "InfiniteTransitionSearchInfo(infiniteTransition=" + this.infiniteTransition + ", toolingOverride=" + this.toolingOverride + ')';
    }

    @Override // androidx.compose.ui.tooling.animation.search.SearchInfo
    public InfiniteTransitionComposeAnimation createAnimation() {
        return InfiniteTransitionComposeAnimation.Companion.parse$ui_tooling(this);
    }
}
