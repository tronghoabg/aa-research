package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import h.ab;
import h.c.a.a;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.q;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PullToRefreshStateImpl implements PullToRefreshState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<PullToRefreshStateImpl, Float> Saver = SaverKt.Saver(new p() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$$ExternalSyntheticLambda0
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            return ((PullToRefreshStateImpl) obj2).anim.getValue();
        }
    }, new l() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshStateImpl$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return PullToRefreshStateImpl.Saver$lambda$1(((Float) obj).floatValue());
        }
    });
    private final Animatable<Float, AnimationVector1D> anim;

    public PullToRefreshStateImpl() {
        this(new Animatable(Float.valueOf(0.0f), VectorConvertersKt.getVectorConverter(q.f48127a), null, null, 12, null));
    }

    static final PullToRefreshStateImpl Saver$lambda$1(float f2) {
        return new PullToRefreshStateImpl(new Animatable(Float.valueOf(f2), VectorConvertersKt.getVectorConverter(q.f48127a), null, null, 12, null));
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public Object animateToHidden(e<? super ab> eVar) {
        Object objAnimateTo$default = Animatable.animateTo$default(this.anim, new Float(0.0f), null, null, null, eVar, 14, null);
        return objAnimateTo$default == a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public Object animateToThreshold(e<? super ab> eVar) {
        Object objAnimateTo$default = Animatable.animateTo$default(this.anim, new Float(1.0f), null, null, null, eVar, 14, null);
        return objAnimateTo$default == a.f48038a ? objAnimateTo$default : ab.f48028a;
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public float getDistanceFraction() {
        return this.anim.getValue().floatValue();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public boolean isAnimating() {
        return this.anim.isRunning();
    }

    @Override // androidx.compose.material3.pulltorefresh.PullToRefreshState
    public Object snapTo(float f2, e<? super ab> eVar) {
        Object objSnapTo = this.anim.snapTo(new Float(f2), eVar);
        return objSnapTo == a.f48038a ? objSnapTo : ab.f48028a;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Saver<PullToRefreshStateImpl, Float> getSaver() {
            return PullToRefreshStateImpl.Saver;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    private PullToRefreshStateImpl(Animatable<Float, AnimationVector1D> animatable) {
        this.anim = animatable;
    }
}
