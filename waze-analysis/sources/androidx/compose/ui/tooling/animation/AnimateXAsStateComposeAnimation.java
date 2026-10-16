package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.ui.tooling.animation.search.AnimateXAsStateSearchInfo;
import e.c.d.a;
import h.a.c;
import h.g.b.o;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AnimateXAsStateComposeAnimation<T, V extends AnimationVector> implements ComposeAnimation {
    private static boolean apiAvailable;
    private final Animatable<T, V> animationObject;
    private final AnimationSpec<T> animationSpec;
    private final Object initialState;
    private final String label;
    private final Set<Object> states;
    private final Object targetState;
    private final ToolingState<T> toolingState;
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
            if (x.n(composeAnimationTypeArrValues[i2].name(), "ANIMATE_X_AS_STATE")) {
                z = true;
                break;
            }
            i2++;
        }
        apiAvailable = z;
    }

    private AnimateXAsStateComposeAnimation(Object obj, Object obj2, ToolingState<T> toolingState, AnimationSpec<T> animationSpec, Animatable<T, V> animatable) {
        Set<Object> setAd;
        this.initialState = obj;
        this.targetState = obj2;
        this.toolingState = toolingState;
        this.animationSpec = animationSpec;
        this.animationObject = animatable;
        this.type = ComposeAnimationType.ANIMATE_X_AS_STATE;
        T value = getAnimationObject().getValue();
        x.d(value, "null cannot be cast to non-null type kotlin.Any");
        Object[] enumConstants = value.getClass().getEnumConstants();
        this.states = (enumConstants == null || (setAd = c.ad(enumConstants)) == null) ? a.o(value) : setAd;
        this.label = getAnimationObject().getLabel();
    }

    public final AnimationSpec<T> getAnimationSpec() {
        return this.animationSpec;
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

    public final ToolingState<T> getToolingState() {
        return this.toolingState;
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public ComposeAnimationType getType() {
        return this.type;
    }

    public final void setState(Object obj) {
        this.toolingState.setValue(obj);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean getApiAvailable() {
            return AnimateXAsStateComposeAnimation.apiAvailable;
        }

        public final <T, V extends AnimationVector> AnimateXAsStateComposeAnimation<T, V> parse$ui_tooling(AnimateXAsStateSearchInfo<T, V> animateXAsStateSearchInfo) {
            if (getApiAvailable() && animateXAsStateSearchInfo.getAnimatable().getValue() != null) {
                return new AnimateXAsStateComposeAnimation<>(animateXAsStateSearchInfo.getInitialState(), animateXAsStateSearchInfo.getTargetState(), animateXAsStateSearchInfo.getToolingOverride().getState(), animateXAsStateSearchInfo.getAnimationSpec(), animateXAsStateSearchInfo.getAnimatable(), null);
            }
            return null;
        }

        public final void testOverrideAvailability(boolean z) {
            AnimateXAsStateComposeAnimation.apiAvailable = z;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Override // androidx.compose.animation.tooling.ComposeAnimation
    public Animatable<T, V> getAnimationObject() {
        return this.animationObject;
    }

    public /* synthetic */ AnimateXAsStateComposeAnimation(Object obj, Object obj2, ToolingState toolingState, AnimationSpec animationSpec, Animatable animatable, o oVar) {
        this(obj, obj2, toolingState, animationSpec, animatable);
    }
}
