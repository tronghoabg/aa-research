package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class eel implements Interpolator {
    private final /* synthetic */ int a;

    public eel(int i) {
        this.a = i;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = this.a;
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
