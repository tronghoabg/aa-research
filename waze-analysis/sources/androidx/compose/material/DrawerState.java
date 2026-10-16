package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.material.DrawerState;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.unit.Density;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DrawerState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AnchoredDraggableState<DrawerValue> anchoredDraggableState;
    private Density density;

    public DrawerState(DrawerValue drawerValue, l<? super DrawerValue, Boolean> lVar) {
        this.anchoredDraggableState = new AnchoredDraggableState<>(drawerValue, new l() { // from class: androidx.compose.material.DrawerState$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                DrawerState drawerState = this.f$0;
                ((Float) obj).floatValue();
                return Float.valueOf(drawerState.requireDensity().mo2127toPx0680j_4(DrawerKt.DrawerPositionalThreshold));
            }
        }, new a() { // from class: androidx.compose.material.DrawerState$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return Float.valueOf(this.f$0.requireDensity().mo2127toPx0680j_4(DrawerKt.DrawerVelocityThreshold));
            }
        }, DrawerKt.AnimationSpec, lVar);
    }

    static final boolean _init_$lambda$0(DrawerValue drawerValue) {
        return true;
    }

    private final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?");
    }

    public final Object animateTo(DrawerValue drawerValue, AnimationSpec<Float> animationSpec, e<? super ab> eVar) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, drawerValue, 0.0f, eVar, 2, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    public final Object close(e<? super ab> eVar) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, DrawerValue.Closed, 0.0f, eVar, 2, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    public final AnchoredDraggableState<DrawerValue> getAnchoredDraggableState$material() {
        return this.anchoredDraggableState;
    }

    public final DrawerValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final Density getDensity$material() {
        return this.density;
    }

    public final float getOffset() {
        return this.anchoredDraggableState.getOffset();
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
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, DrawerValue.Open, 0.0f, eVar, 2, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    public final float requireOffset$material() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final void setDensity$material(Density density) {
        this.density = density;
    }

    public final Object snapTo(DrawerValue drawerValue, e<? super ab> eVar) {
        Object objSnapTo = AnchoredDraggableKt.snapTo(this.anchoredDraggableState, drawerValue, eVar);
        return objSnapTo == h.c.a.a.f48038a ? objSnapTo : ab.f48028a;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final DrawerState Saver$lambda$1(l lVar, DrawerValue drawerValue) {
            return new DrawerState(drawerValue, lVar);
        }

        public final Saver<DrawerState, DrawerValue> Saver(final l<? super DrawerValue, Boolean> lVar) {
            return SaverKt.Saver(new p() { // from class: androidx.compose.material.DrawerState$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((DrawerState) obj2).getCurrentValue();
                }
            }, new l() { // from class: androidx.compose.material.DrawerState$Companion$$ExternalSyntheticLambda1
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

    public static /* synthetic */ void getOffset$annotations() {
    }

    public static /* synthetic */ void getTargetValue$annotations() {
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, l lVar, int i2, o oVar) {
        this(drawerValue, (i2 & 2) != 0 ? new l() { // from class: androidx.compose.material.DrawerState$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return true;
            }
        } : lVar);
    }
}
