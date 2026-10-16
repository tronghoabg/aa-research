package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BoundsAnimation {
    public static final int $stable = 8;
    private final MutableState animation$delegate;
    private FiniteAnimationSpec<Rect> animationSpec = BoundsAnimationKt.DefaultBoundsAnimation;
    private final MutableState animationState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState boundsTransform$delegate;
    private final a<Offset> momentumOffset;
    private final Transition<Boolean> transition;
    private final SharedTransitionScope transitionScope;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.BoundsAnimation$animate$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<Transition.Segment<Boolean>, FiniteAnimationSpec<Rect>> {
        AnonymousClass1() {
            super(1);
        }

        @Override // h.g.a.l
        public final FiniteAnimationSpec<Rect> invoke(Transition.Segment<Boolean> segment) {
            return BoundsAnimation.this.getAnimationSpec();
        }
    }

    public BoundsAnimation(SharedTransitionScope sharedTransitionScope, Transition<Boolean> transition, Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimation, BoundsTransform boundsTransform, a<Offset> aVar) {
        this.transitionScope = sharedTransitionScope;
        this.transition = transition;
        this.momentumOffset = aVar;
        this.animation$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(deferredAnimation, null, 2, null);
        this.boundsTransform$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(boundsTransform, null, 2, null);
    }

    public static /* synthetic */ void animate$default(BoundsAnimation boundsAnimation, Rect rect, Rect rect2, BoundsTransform boundsTransform, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            boundsTransform = null;
        }
        boundsAnimation.animate(rect, rect2, boundsTransform);
    }

    private final BoundsTransform getBoundsTransform() {
        return (BoundsTransform) this.boundsTransform$delegate.getValue();
    }

    private final void setAnimation(Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimation) {
        this.animation$delegate.setValue(deferredAnimation);
    }

    private final void setBoundsTransform(BoundsTransform boundsTransform) {
        this.boundsTransform$delegate.setValue(boundsTransform);
    }

    public final void animate(Rect rect, Rect rect2, BoundsTransform boundsTransform) {
        if (this.transitionScope.isTransitionActive()) {
            if (getAnimationState() == null) {
                if (boundsTransform == null) {
                    boundsTransform = getBoundsTransform();
                }
                this.animationSpec = boundsTransform.createAnimationSpec(rect, rect2);
            }
            setAnimationState(getAnimation().animate(new AnonymousClass1(), new AnonymousClass2(rect2, rect)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> getAnimation() {
        return (Transition.DeferredAnimation) this.animation$delegate.getValue();
    }

    public final FiniteAnimationSpec<Rect> getAnimationSpec() {
        return this.animationSpec;
    }

    public final State<Rect> getAnimationState() {
        return (State) this.animationState$delegate.getValue();
    }

    public final a<Offset> getMomentumOffset() {
        return this.momentumOffset;
    }

    public final boolean getTarget() {
        return this.transition.getTargetState().booleanValue();
    }

    public final Transition<Boolean> getTransition() {
        return this.transition;
    }

    public final SharedTransitionScope getTransitionScope() {
        return this.transitionScope;
    }

    public final Rect getValue() {
        State<Rect> animationState;
        Rect value;
        if (!this.transitionScope.isTransitionActive() || (animationState = getAnimationState()) == null || (value = animationState.getValue()) == null) {
            return null;
        }
        long jM7990unboximpl = this.momentumOffset.invoke().m7990unboximpl();
        return !Offset.m7977equalsimpl0(jM7990unboximpl, Offset.Companion.m7996getZeroF1C5BW0()) ? value.m8017translatek4lQ0M(jM7990unboximpl) : value;
    }

    public final boolean isRunning() {
        Transition parentTransition = this.transition;
        while (parentTransition.getParentTransition() != null) {
            parentTransition = parentTransition.getParentTransition();
            x.c(parentTransition);
        }
        return !x.n(parentTransition.getCurrentState(), parentTransition.getTargetState());
    }

    public final void setAnimationSpec(FiniteAnimationSpec<Rect> finiteAnimationSpec) {
        this.animationSpec = finiteAnimationSpec;
    }

    public final void setAnimationState(State<Rect> state) {
        this.animationState$delegate.setValue(state);
    }

    public final void updateAnimation(Transition<Boolean>.DeferredAnimation<Rect, AnimationVector4D> deferredAnimation, BoundsTransform boundsTransform) {
        if (!x.n(getAnimation(), deferredAnimation)) {
            setAnimation(deferredAnimation);
            setAnimationState(null);
            this.animationSpec = BoundsAnimationKt.DefaultBoundsAnimation;
        }
        setBoundsTransform(boundsTransform);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.BoundsAnimation$animate$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements l<Boolean, Rect> {
        final /* synthetic */ Rect $currentBounds;
        final /* synthetic */ Rect $targetBounds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Rect rect, Rect rect2) {
            super(1);
            this.$targetBounds = rect;
            this.$currentBounds = rect2;
        }

        public final Rect invoke(boolean z) {
            return z == BoundsAnimation.this.getTransition().getTargetState().booleanValue() ? this.$targetBounds : this.$currentBounds;
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Rect invoke(Boolean bool) {
            return invoke(bool.booleanValue());
        }
    }
}
