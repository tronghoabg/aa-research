package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Density;
import h.ab;
import h.g.a.l;
import h.g.b.q;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LazyLayoutScrollDeltaBetweenPasses {
    public static final int $stable = 8;
    private AnimationState<Float, AnimationVector1D> _scrollDeltaBetweenPasses;
    private br job;

    public LazyLayoutScrollDeltaBetweenPasses() {
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(q.f48127a);
        Float fValueOf = Float.valueOf(0.0f);
        this._scrollDeltaBetweenPasses = AnimationStateKt.AnimationState$default(vectorConverter, fValueOf, fValueOf, 0L, 0L, false, 56, null);
    }

    public final br getJob$foundation() {
        return this.job;
    }

    public final float getScrollDeltaBetweenPasses$foundation() {
        return this._scrollDeltaBetweenPasses.getValue().floatValue();
    }

    public final boolean isActive$foundation() {
        return this._scrollDeltaBetweenPasses.getValue().floatValue() != 0.0f;
    }

    public final void setJob$foundation(br brVar) {
        this.job = brVar;
    }

    public final void stop$foundation() {
        br brVar = this.job;
        if (brVar != null) {
            brVar.s(null);
        }
        this._scrollDeltaBetweenPasses = new AnimationState<>(VectorConvertersKt.getVectorConverter(q.f48127a), Float.valueOf(0.0f), null, 0L, 0L, false, 60, null);
    }

    public final void updateScrollDeltaForApproach$foundation(float f2, Density density, af afVar) {
        if (f2 <= density.mo2127toPx0680j_4(LazyLayoutScrollDeltaBetweenPassesKt.DeltaThresholdForScrollAnimation)) {
            return;
        }
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            float fFloatValue = this._scrollDeltaBetweenPasses.getValue().floatValue();
            br brVar = this.job;
            if (brVar != null) {
                brVar.s(null);
            }
            if (this._scrollDeltaBetweenPasses.isRunning()) {
                this._scrollDeltaBetweenPasses = AnimationStateKt.copy$default((AnimationState) this._scrollDeltaBetweenPasses, fFloatValue - f2, 0.0f, 0L, 0L, false, 30, (Object) null);
            } else {
                this._scrollDeltaBetweenPasses = new AnimationState<>(VectorConvertersKt.getVectorConverter(q.f48127a), Float.valueOf(-f2), null, 0L, 0L, false, 60, null);
            }
            this.job = aj.z(afVar, null, null, new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1(this, null), 3);
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
        }
    }
}
