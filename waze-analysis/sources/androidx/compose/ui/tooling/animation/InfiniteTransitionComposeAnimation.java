package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.ui.tooling.animation.search.InfiniteTransitionSearchInfo;
import e.c.d.a;
import h.g.b.o;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class InfiniteTransitionComposeAnimation implements ComposeAnimation {
    private static boolean apiAvailable;
    private final InfiniteTransition animationObject;
    private final String label;
    private final Set<Object> states;
    private final ToolingState<Long> toolingState;
    private final ComposeAnimationType type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    static {
        ComposeAnimationType[] composeAnimationTypeArrValues = ComposeAnimationType.values();
        int length = composeAnimationTypeArrValues.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (x.n(composeAnimationTypeArrValues[i2].name(), "INFINITE_TRANSITION")) {
                z = true;
                break;
            }
            i2++;
        }
        apiAvailable = z;
    }

    private InfiniteTransitionComposeAnimation(ToolingState<Long> toolingState, InfiniteTransition infiniteTransition) {
        this.toolingState = toolingState;
        this.animationObject = infiniteTransition;
        this.type = ComposeAnimationType.INFINITE_TRANSITION;
        this.states = a.o(0);
        this.label = getAnimationObject().getLabel();
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public String getLabel() {
        return this.label;
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public Set<Object> getStates() {
        return this.states;
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public ComposeAnimationType getType() {
        return this.type;
    }

    public final void setTimeNanos(long j2) {
        this.toolingState.setValue(Long.valueOf(j2));
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean getApiAvailable() {
            return InfiniteTransitionComposeAnimation.apiAvailable;
        }

        public final InfiniteTransitionComposeAnimation parse$ui_tooling(InfiniteTransitionSearchInfo infiniteTransitionSearchInfo) {
            o oVar = null;
            if (getApiAvailable()) {
                return new InfiniteTransitionComposeAnimation(infiniteTransitionSearchInfo.getToolingOverride().getState(), infiniteTransitionSearchInfo.getInfiniteTransition(), oVar);
            }
            return null;
        }

        public final void testOverrideAvailability(boolean z) {
            InfiniteTransitionComposeAnimation.apiAvailable = z;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public InfiniteTransition getAnimationObject() {
        return this.animationObject;
    }

    public /* synthetic */ InfiniteTransitionComposeAnimation(ToolingState toolingState, InfiniteTransition infiniteTransition, o oVar) {
        this(toolingState, infiniteTransition);
    }
}
