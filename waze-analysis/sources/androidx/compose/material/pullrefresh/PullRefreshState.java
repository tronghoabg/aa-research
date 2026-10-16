package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material.pullrefresh.PullRefreshState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.k.n;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PullRefreshState {
    public static final int $stable = 8;
    private final MutableFloatState _refreshingOffset$delegate;
    private final MutableFloatState _threshold$delegate;
    private final af animationScope;
    private final State<a<ab>> onRefreshState;
    private final State adjustedDistancePulled$delegate = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.material.pullrefresh.PullRefreshState$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return Float.valueOf(PullRefreshState.adjustedDistancePulled_delegate$lambda$0(this.f$0));
        }
    });
    private final MutableState _refreshing$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    private final MutableFloatState _position$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    private final MutableFloatState distancePulled$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    private final MutatorMutex mutatorMutex = new MutatorMutex();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ float $offset;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1, reason: invalid class name and collision with other inner class name */
        final class C00631 extends g implements l<e<? super ab>, Object> {
            final /* synthetic */ float $offset;
            int label;
            final /* synthetic */ PullRefreshState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00631(PullRefreshState pullRefreshState, float f2, e<? super C00631> eVar) {
                super(1, eVar);
                this.this$0 = pullRefreshState;
                this.$offset = f2;
            }

            static final ab invokeSuspend$lambda$0(PullRefreshState pullRefreshState, float f2, float f3) {
                pullRefreshState.set_position(f2);
                return ab.f48028a;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(e<?> eVar) {
                return new C00631(this.this$0, this.$offset, eVar);
            }

            @Override // h.g.a.l
            public final Object invoke(e<? super ab> eVar) {
                return ((C00631) create(eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    final PullRefreshState pullRefreshState = this.this$0;
                    float f2 = this.$offset;
                    this.label = 1;
                    if (SuspendAnimationKt.animate$default(pullRefreshState.get_position(), f2, 0.0f, null, new p() { // from class: androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1$$ExternalSyntheticLambda0
                        @Override // h.g.a.p
                        public final Object invoke(Object obj2, Object obj3) {
                            return PullRefreshState.AnonymousClass1.C00631.invokeSuspend$lambda$0(pullRefreshState, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                        }
                    }, this, 12, null) == aVar) {
                        return aVar;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(float f2, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$offset = f2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return PullRefreshState.this.new AnonymousClass1(this.$offset, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                PullRefreshState pullRefreshState = PullRefreshState.this;
                float f2 = this.$offset;
                this.label = 1;
                if (MutatorMutex.mutate$default(pullRefreshState.mutatorMutex, null, new C00631(pullRefreshState, f2, null), this, 1, null) == aVar) {
                    return aVar;
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
    public PullRefreshState(af afVar, State<? extends a<ab>> state, float f2, float f3) {
        this.animationScope = afVar;
        this.onRefreshState = state;
        this._threshold$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f3);
        this._refreshingOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
    }

    static final float adjustedDistancePulled_delegate$lambda$0(PullRefreshState pullRefreshState) {
        return pullRefreshState.getDistancePulled() * 0.5f;
    }

    private final br animateIndicatorTo(float f2) {
        return aj.z(this.animationScope, null, null, new AnonymousClass1(f2, null), 3);
    }

    private final float calculateIndicatorPosition() {
        if (getAdjustedDistancePulled() <= getThreshold$material()) {
            return getAdjustedDistancePulled();
        }
        float fAbs = Math.abs(getProgress()) - 1.0f;
        if (fAbs < 0.0f) {
            fAbs = 0.0f;
        }
        if (fAbs > 2.0f) {
            fAbs = 2.0f;
        }
        return getThreshold$material() + (getThreshold$material() * (fAbs - (((float) Math.pow(fAbs, 2.0d)) / 4.0f)));
    }

    private final float getAdjustedDistancePulled() {
        return ((Number) this.adjustedDistancePulled$delegate.getValue()).floatValue();
    }

    private final float getDistancePulled() {
        return this.distancePulled$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float get_position() {
        return this._position$delegate.getFloatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean get_refreshing() {
        return ((Boolean) this._refreshing$delegate.getValue()).booleanValue();
    }

    private final float get_refreshingOffset() {
        return this._refreshingOffset$delegate.getFloatValue();
    }

    private final float get_threshold() {
        return this._threshold$delegate.getFloatValue();
    }

    private final void setDistancePulled(float f2) {
        this.distancePulled$delegate.setFloatValue(f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_position(float f2) {
        this._position$delegate.setFloatValue(f2);
    }

    private final void set_refreshing(boolean z) {
        this._refreshing$delegate.setValue(Boolean.valueOf(z));
    }

    private final void set_refreshingOffset(float f2) {
        this._refreshingOffset$delegate.setFloatValue(f2);
    }

    private final void set_threshold(float f2) {
        this._threshold$delegate.setFloatValue(f2);
    }

    public final float getPosition$material() {
        return get_position();
    }

    public final float getProgress() {
        return getAdjustedDistancePulled() / getThreshold$material();
    }

    public final boolean getRefreshing$material() {
        return get_refreshing();
    }

    public final float getThreshold$material() {
        return get_threshold();
    }

    public final float onPull$material(float f2) {
        if (get_refreshing()) {
            return 0.0f;
        }
        float fE = n.e(getDistancePulled() + f2, 0.0f);
        float distancePulled = fE - getDistancePulled();
        setDistancePulled(fE);
        set_position(calculateIndicatorPosition());
        return distancePulled;
    }

    public final float onRelease$material(float f2) {
        if (getRefreshing$material()) {
            return 0.0f;
        }
        if (getAdjustedDistancePulled() > getThreshold$material()) {
            this.onRefreshState.getValue().invoke();
        }
        animateIndicatorTo(0.0f);
        if (getDistancePulled() == 0.0f || f2 < 0.0f) {
            f2 = 0.0f;
        }
        setDistancePulled(0.0f);
        return f2;
    }

    public final void setRefreshing$material(boolean z) {
        if (get_refreshing() != z) {
            set_refreshing(z);
            setDistancePulled(0.0f);
            animateIndicatorTo(z ? get_refreshingOffset() : 0.0f);
        }
    }

    public final void setRefreshingOffset$material(float f2) {
        if (get_refreshingOffset() == f2) {
            return;
        }
        set_refreshingOffset(f2);
        if (getRefreshing$material()) {
            animateIndicatorTo(f2);
        }
    }

    public final void setThreshold$material(float f2) {
        set_threshold(f2);
    }
}
