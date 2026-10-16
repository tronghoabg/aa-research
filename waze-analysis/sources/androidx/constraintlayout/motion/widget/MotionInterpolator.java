package androidx.constraintlayout.motion.widget;

import android.view.animation.Interpolator;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public abstract class MotionInterpolator implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public abstract float getInterpolation(float f2);

    public abstract float getVelocity();
}
