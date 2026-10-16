package androidx.compose.ui.tooling.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.tooling.AnimationDebugMutableState;
import e.c.d.a;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TriggerComposeAnimation<T> {
    private final MutableState<T> animationObject;
    private final T defaultState;
    private T initialState;
    private final String label;
    private final Set<T> states;
    private T targetState;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    private TriggerComposeAnimation(MutableState<T> mutableState, String str, Set<? extends T> set) {
        this.animationObject = mutableState;
        this.label = str;
        this.initialState = mutableState.getValue();
        Set<? extends T> set2 = set;
        for (T t : set2) {
            if (!x.n(t, this.initialState)) {
                this.targetState = t;
                Set<T> setAt = i.at(i.ac(set2));
                T value = this.animationObject.getValue();
                setAt.addAll(value != null ? a.o(value) : a.p());
                this.states = setAt;
                this.defaultState = this.animationObject.getValue();
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final MutableState<T> getAnimationObject() {
        return this.animationObject;
    }

    public final T getInitialState() {
        return this.initialState;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Set<T> getStates() {
        return this.states;
    }

    public final T getTargetState() {
        return this.targetState;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final <T> TriggerComposeAnimation<T> parse(AnimationDebugMutableState<T> animationDebugMutableState) {
            Set<T> setInvoke = animationDebugMutableState.getStates().invoke();
            x.d(animationDebugMutableState, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.ui.tooling.animation.TriggerComposeAnimation.Companion.parse>");
            return new TriggerComposeAnimation<>(animationDebugMutableState, animationDebugMutableState.getLabel(), setInvoke, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ TriggerComposeAnimation(MutableState mutableState, String str, Set set, o oVar) {
        this(mutableState, str, set);
    }
}
