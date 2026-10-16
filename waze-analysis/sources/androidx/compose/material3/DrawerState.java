package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.gestures.AnchoredDragScope;
import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchors;
import androidx.compose.material3.DrawerState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.a.r;
import h.g.b.an;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DrawerState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private FiniteAnimationSpec<Float> anchoredDraggableMotionSpec;
    private final AnchoredDraggableState<DrawerValue> anchoredDraggableState;
    private FiniteAnimationSpec<Float> closeDrawerMotionSpec;
    private final l<DrawerValue, Boolean> confirmStateChange;
    private final MutableState density$delegate;
    private final State<Float> offset;
    private FiniteAnimationSpec<Float> openDrawerMotionSpec;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.DrawerState$animateTo$3, reason: invalid class name */
    final class AnonymousClass3 extends g implements r<AnchoredDragScope, DraggableAnchors<DrawerValue>, DrawerValue, e<? super ab>, Object> {
        final /* synthetic */ AnimationSpec<Float> $animationSpec;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(float f2, AnimationSpec<Float> animationSpec, e<? super AnonymousClass3> eVar) {
            super(4, eVar);
            this.$velocity = f2;
            this.$animationSpec = animationSpec;
        }

        static final ab invokeSuspend$lambda$0(AnchoredDragScope anchoredDragScope, an anVar, float f2, float f3) {
            anchoredDragScope.dragTo(f2, f3);
            anVar.f48102a = f2;
            return ab.f48028a;
        }

        @Override // h.g.a.r
        public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<DrawerValue> draggableAnchors, DrawerValue drawerValue, e<? super ab> eVar) {
            AnonymousClass3 anonymousClass3 = DrawerState.this.new AnonymousClass3(this.$velocity, this.$animationSpec, eVar);
            anonymousClass3.L$0 = anchoredDragScope;
            anonymousClass3.L$1 = draggableAnchors;
            anonymousClass3.L$2 = drawerValue;
            return anonymousClass3.invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
                float fPositionOf = ((DraggableAnchors) this.L$1).positionOf((DrawerValue) this.L$2);
                if (!Float.isNaN(fPositionOf)) {
                    final an anVar = new an();
                    float currentOffset = Float.isNaN(DrawerState.this.getCurrentOffset()) ? 0.0f : DrawerState.this.getCurrentOffset();
                    anVar.f48102a = currentOffset;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (SuspendAnimationKt.animate(currentOffset, fPositionOf, this.$velocity, this.$animationSpec, new p() { // from class: androidx.compose.material3.DrawerState$animateTo$3$$ExternalSyntheticLambda0
                        @Override // h.g.a.p
                        public final Object invoke(Object obj2, Object obj3) {
                            return DrawerState.AnonymousClass3.invokeSuspend$lambda$0(anchoredDragScope, anVar, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    }, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DrawerState(DrawerValue drawerValue, l<? super DrawerValue, Boolean> lVar) {
        this.confirmStateChange = lVar;
        TweenSpec tweenSpec = NavigationDrawerKt.AnchoredDraggableDefaultAnimationSpec;
        this.anchoredDraggableMotionSpec = tweenSpec;
        this.anchoredDraggableState = AnchoredDraggableKt.AnchoredDraggableState(drawerValue, new l() { // from class: androidx.compose.material3.DrawerState$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Float.valueOf(DrawerState.anchoredDraggableState$lambda$0(((Float) obj).floatValue()));
            }
        }, new h.g.a.a() { // from class: androidx.compose.material3.DrawerState$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return Float.valueOf(this.f$0.requireDensity().mo2127toPx0680j_4(NavigationDrawerKt.DrawerVelocityThreshold));
            }
        }, tweenSpec, AnchoredDraggableDefaults.INSTANCE.getDecayAnimationSpec(), lVar);
        this.offset = new State<Float>() { // from class: androidx.compose.material3.DrawerState$offset$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.compose.runtime.State
            public Float getValue() {
                return Float.valueOf(this.this$0.getAnchoredDraggableState$material3().getOffset());
            }
        };
        this.density$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.openDrawerMotionSpec = AnimationSpecKt.snap$default(0, 1, null);
        this.closeDrawerMotionSpec = AnimationSpecKt.snap$default(0, 1, null);
    }

    static final boolean _init_$lambda$0(DrawerValue drawerValue) {
        return true;
    }

    static final float anchoredDraggableState$lambda$0(float f2) {
        return f2 * NavigationDrawerKt.DrawerPositionalThreshold;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, float f2, e<? super ab> eVar) {
        Object objAnchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(this.anchoredDraggableState, drawerValue, null, new AnonymousClass3(f2, animationSpec, null), eVar, 2, null);
        return objAnchoredDrag$default == a.f48038a ? objAnchoredDrag$default : ab.f48028a;
    }

    static /* synthetic */ Object animateTo$default(DrawerState drawerState, DrawerValue drawerValue, AnimationSpec animationSpec, float f2, e eVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f2 = drawerState.anchoredDraggableState.getLastVelocity();
        }
        return drawerState.animateTo(drawerValue, animationSpec, f2, eVar);
    }

    private final Density requireDensity() {
        Density density$material3 = getDensity$material3();
        if (density$material3 != null) {
            return density$material3;
        }
        throw new IllegalArgumentException("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the ModalNavigationDrawer or DismissibleNavigationDrawer composables?");
    }

    public final Object close(e<? super ab> eVar) {
        Object objAnimateTo$default = animateTo$default(this, DrawerValue.Closed, this.closeDrawerMotionSpec, 0.0f, eVar, 4, null);
        return objAnimateTo$default == a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    public final FiniteAnimationSpec<Float> getAnchoredDraggableMotionSpec$material3() {
        return this.anchoredDraggableMotionSpec;
    }

    public final AnchoredDraggableState<DrawerValue> getAnchoredDraggableState$material3() {
        return this.anchoredDraggableState;
    }

    public final FiniteAnimationSpec<Float> getCloseDrawerMotionSpec$material3() {
        return this.closeDrawerMotionSpec;
    }

    public final l<DrawerValue, Boolean> getConfirmStateChange$material3() {
        return this.confirmStateChange;
    }

    public final float getCurrentOffset() {
        return this.anchoredDraggableState.getOffset();
    }

    public final DrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getSettledValue();
    }

    public final Density getDensity$material3() {
        return (Density) this.density$delegate.getValue();
    }

    public final State<Float> getOffset() {
        return this.offset;
    }

    public final FiniteAnimationSpec<Float> getOpenDrawerMotionSpec$material3() {
        return this.openDrawerMotionSpec;
    }

    public final DrawerValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isAnimationRunning() {
        return this.anchoredDraggableState.isAnimationRunning();
    }

    public final boolean isClosed() {
        return getCurrentValue() == DrawerValue.Closed;
    }

    public final boolean isOpen() {
        return getCurrentValue() == DrawerValue.Open;
    }

    public final Object open(e<? super ab> eVar) {
        Object objAnimateTo$default = animateTo$default(this, DrawerValue.Open, this.openDrawerMotionSpec, 0.0f, eVar, 4, null);
        return objAnimateTo$default == a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    public final float requireOffset$material3() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setAnchoredDraggableMotionSpec$material3(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.anchoredDraggableMotionSpec = finiteAnimationSpec;
    }

    public final void setCloseDrawerMotionSpec$material3(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.closeDrawerMotionSpec = finiteAnimationSpec;
    }

    public final void setDensity$material3(Density density) {
        this.density$delegate.setValue(density);
    }

    public final void setOpenDrawerMotionSpec$material3(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.openDrawerMotionSpec = finiteAnimationSpec;
    }

    public final Object snapTo(DrawerValue drawerValue, e<? super ab> eVar) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, drawerValue, eVar);
        return objSnapTo == a.f48038a ? objSnapTo : ab.f48028a;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final DrawerState Saver$lambda$1(l lVar, DrawerValue drawerValue) {
            return new DrawerState(drawerValue, lVar);
        }

        public final Saver<DrawerState, DrawerValue> Saver(final l<? super DrawerValue, Boolean> lVar) {
            return SaverKt.Saver(new p() { // from class: androidx.compose.material3.DrawerState$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((DrawerState) obj2).getCurrentValue();
                }
            }, new l() { // from class: androidx.compose.material3.DrawerState$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return DrawerState.Companion.Saver$lambda$1(lVar, (DrawerValue) obj);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void getAnchoredDraggableState$material3$annotations() {
    }

    public static /* synthetic */ void getOffset$annotations() {
    }

    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, e<? super ab> eVar) {
        Object objAnimateTo$default = animateTo$default(this, drawerValue, animationSpec, 0.0f, eVar, 4, null);
        return objAnimateTo$default == a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, l lVar, int i2, o oVar) {
        this(drawerValue, (i2 & 2) != 0 ? new l() { // from class: androidx.compose.material3.DrawerState$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return true;
            }
        } : lVar);
    }
}
