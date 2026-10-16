package androidx.constraintlayout.compose;

import h.g.b.x;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MotionSceneDslImpl implements MotionScene {
    public static final int $stable = 0;
    private final Map<String, ConstraintSet> constraintSetsByName;
    private final Map<String, Transition> transitionsByName;

    /* JADX WARN: Multi-variable type inference failed */
    public MotionSceneDslImpl(Map<String, ? extends ConstraintSet> map, Map<String, ? extends Transition> map2) {
        this.constraintSetsByName = map;
        this.transitionsByName = map2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x.n(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        x.d(obj, "null cannot be cast to non-null type androidx.constraintlayout.compose.MotionSceneDslImpl");
        MotionSceneDslImpl motionSceneDslImpl = (MotionSceneDslImpl) obj;
        return x.n(this.constraintSetsByName, motionSceneDslImpl.constraintSetsByName) && x.n(this.transitionsByName, motionSceneDslImpl.transitionsByName);
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public String getConstraintSet(int i2) {
        return "";
    }

    @Override // androidx.constraintlayout.compose.MotionScene
    public ConstraintSet getConstraintSetInstance(String str) {
        return this.constraintSetsByName.get(str);
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public String getTransition(String str) {
        return "";
    }

    @Override // androidx.constraintlayout.compose.MotionScene
    public Transition getTransitionInstance(String str) {
        return this.transitionsByName.get(str);
    }

    public int hashCode() {
        return (this.constraintSetsByName.hashCode() * 31) + this.transitionsByName.hashCode();
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public void setConstraintSetContent(String str, String str2) {
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public void setDebugName(String str) {
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public void setTransitionContent(String str, String str2) {
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public String getConstraintSet(String str) {
        return "";
    }
}
