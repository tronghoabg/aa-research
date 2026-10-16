package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BackdropScaffoldState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final AnchoredDraggableState<BackdropValue> anchoredDraggableState;
    private final l<BackdropValue, Boolean> confirmValueChange;
    private Density density;
    private final NestedScrollConnection nestedScrollConnection;
    private final SnackbarHostState snackbarHostState;

    /* JADX WARN: Multi-variable type inference failed */
    public BackdropScaffoldState(BackdropValue backdropValue, AnimationSpec<Float> animationSpec, l<? super BackdropValue, Boolean> lVar, SnackbarHostState snackbarHostState) {
        this.confirmValueChange = lVar;
        this.snackbarHostState = snackbarHostState;
        AnchoredDraggableState<BackdropValue> anchoredDraggableState = new AnchoredDraggableState<>(backdropValue, new l() { // from class: androidx.compose.material.BackdropScaffoldState$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                BackdropScaffoldState backdropScaffoldState = this.f$0;
                ((Float) obj).floatValue();
                return Float.valueOf(backdropScaffoldState.requireDensity().mo2127toPx0680j_4(BackdropScaffoldKt.PositionalThreshold));
            }
        }, new a() { // from class: androidx.compose.material.BackdropScaffoldState$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return Float.valueOf(this.f$0.requireDensity().mo2127toPx0680j_4(BackdropScaffoldKt.VelocityThreshold));
            }
        }, animationSpec, lVar);
        this.anchoredDraggableState = anchoredDraggableState;
        this.nestedScrollConnection = BackdropScaffoldKt.ConsumeSwipeNestedScrollConnection(anchoredDraggableState, Orientation.Vertical);
    }

    static final boolean _init_$lambda$0(BackdropValue backdropValue) {
        return true;
    }

    private final Density requireDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException("The density on BackdropScaffoldState (" + this + ") was not set. Did you use BackdropScaffoldState with the BackdropScaffold composable?");
    }

    public final Object conceal(e<? super ab> eVar) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BackdropValue.Concealed, 0.0f, eVar, 2, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    public final AnchoredDraggableState<BackdropValue> getAnchoredDraggableState$material() {
        return this.anchoredDraggableState;
    }

    public final l<BackdropValue, Boolean> getConfirmValueChange() {
        return this.confirmValueChange;
    }

    public final BackdropValue getCurrentValue() {
        return this.anchoredDraggableState.getCurrentValue();
    }

    public final Density getDensity$material() {
        return this.density;
    }

    public final NestedScrollConnection getNestedScrollConnection$material() {
        return this.nestedScrollConnection;
    }

    public final SnackbarHostState getSnackbarHostState() {
        return this.snackbarHostState;
    }

    public final BackdropValue getTargetValue() {
        return this.anchoredDraggableState.getTargetValue();
    }

    public final boolean isConcealed() {
        return this.anchoredDraggableState.getCurrentValue() == BackdropValue.Concealed;
    }

    public final boolean isRevealed() {
        return this.anchoredDraggableState.getCurrentValue() == BackdropValue.Revealed;
    }

    public final float progress(BackdropValue backdropValue, BackdropValue backdropValue2) {
        float fPositionOf = this.anchoredDraggableState.getAnchors().positionOf(backdropValue);
        float fPositionOf2 = this.anchoredDraggableState.getAnchors().positionOf(backdropValue2);
        float fG = (n.g(this.anchoredDraggableState.getOffset(), Math.min(fPositionOf, fPositionOf2), Math.max(fPositionOf, fPositionOf2)) - fPositionOf) / (fPositionOf2 - fPositionOf);
        if (Float.isNaN(fG)) {
            return 1.0f;
        }
        return Math.abs(fG);
    }

    public final float requireOffset() {
        return this.anchoredDraggableState.requireOffset();
    }

    public final Object reveal(e<? super ab> eVar) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.anchoredDraggableState, BackdropValue.Revealed, 0.0f, eVar, 2, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    public final void setDensity$material(Density density) {
        this.density = density;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Saver<BackdropScaffoldState, ?> Saver(final AnimationSpec<Float> animationSpec, final l<? super BackdropValue, Boolean> lVar, final SnackbarHostState snackbarHostState, final Density density) {
            return SaverKt.Saver(new p() { // from class: androidx.compose.material.BackdropScaffoldState$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ((BackdropScaffoldState) obj2).getAnchoredDraggableState$material().getCurrentValue();
                }
            }, new l() { // from class: androidx.compose.material.BackdropScaffoldState$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return BackdropScaffoldKt.BackdropScaffoldState((BackdropValue) obj, density, animationSpec, lVar, snackbarHostState);
                }
            });
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ BackdropScaffoldState(BackdropValue backdropValue, AnimationSpec animationSpec, l lVar, SnackbarHostState snackbarHostState, int i2, o oVar) {
        this(backdropValue, (i2 & 2) != 0 ? BackdropScaffoldDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i2 & 4) != 0 ? new l() { // from class: androidx.compose.material.BackdropScaffoldState$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return true;
            }
        } : lVar, (i2 & 8) != 0 ? new SnackbarHostState() : snackbarHostState);
    }
}
