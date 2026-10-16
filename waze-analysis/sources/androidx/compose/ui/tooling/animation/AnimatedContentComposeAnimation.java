package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.ui.tooling.animation.search.AnimatedContentSearchInfo;
import e.c.d.a;
import h.a.c;
import h.g.b.o;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AnimatedContentComposeAnimation<T> implements ComposeAnimation, TransitionBasedAnimation<T> {
    private static boolean apiAvailable;
    private final Transition<T> animationObject;
    private final Object initialState;
    private final String label;
    private final Set<Object> states;
    private final Object targetState;
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
            if (x.n(composeAnimationTypeArrValues[i2].name(), "ANIMATED_CONTENT")) {
                z = true;
                break;
            }
            i2++;
        }
        apiAvailable = z;
    }

    private AnimatedContentComposeAnimation(Object obj, Object obj2, Transition<T> transition, Set<? extends Object> set, String str) {
        this.initialState = obj;
        this.targetState = obj2;
        this.animationObject = transition;
        this.states = set;
        this.label = str;
        this.type = ComposeAnimationType.ANIMATED_CONTENT;
    }

    public final Object getInitialState() {
        return this.initialState;
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public String getLabel() {
        return this.label;
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public Set<Object> getStates() {
        return this.states;
    }

    public final Object getTargetState() {
        return this.targetState;
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public ComposeAnimationType getType() {
        return this.type;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean getApiAvailable() {
            return AnimatedContentComposeAnimation.apiAvailable;
        }

        public final AnimatedContentComposeAnimation<?> parseAnimatedContent(AnimatedContentSearchInfo animatedContentSearchInfo) {
            Object currentState;
            Set setO;
            if (!getApiAvailable() || (currentState = animatedContentSearchInfo.getTransition().getCurrentState()) == null) {
                return null;
            }
            Object[] enumConstants = currentState.getClass().getEnumConstants();
            if (enumConstants == null || (setO = c.ad(enumConstants)) == null) {
                setO = a.o(currentState);
            }
            return new AnimatedContentComposeAnimation<>(animatedContentSearchInfo.getInitialState(), animatedContentSearchInfo.getTargetState(), animatedContentSearchInfo.getTransition(), setO, animatedContentSearchInfo.getLabel(), null);
        }

        public final void testOverrideAvailability(boolean z) {
            AnimatedContentComposeAnimation.apiAvailable = z;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public Transition<T> getAnimationObject() {
        return this.animationObject;
    }

    public /* synthetic */ AnimatedContentComposeAnimation(Object obj, Object obj2, Transition transition, Set set, String str, o oVar) {
        this(obj, obj2, transition, set, str);
    }
}
