package androidx.constraintlayout.compose;

import androidx.constraintlayout.core.state.CoreMotionScene;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface MotionScene extends CoreMotionScene {
    ConstraintSet getConstraintSetInstance(String str);

    Transition getTransitionInstance(String str);
}
