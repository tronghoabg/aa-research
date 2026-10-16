package androidx.constraintlayout.compose;

import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MotionSceneScopeKt {
    private static final String UNDEFINED_NAME_PREFIX = "androidx.constraintlayout";

    public static final MotionScene MotionScene(l<? super MotionSceneScope, ab> lVar) {
        MotionSceneScope motionSceneScope = new MotionSceneScope();
        lVar.invoke(motionSceneScope);
        return new MotionSceneDslImpl(motionSceneScope.getConstraintSetsByName$constraintlayout_compose(), motionSceneScope.getTransitionsByName$constraintlayout_compose());
    }
}
