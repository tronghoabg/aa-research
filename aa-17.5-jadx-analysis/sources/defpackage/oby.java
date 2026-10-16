package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public final /* synthetic */ class oby implements Interpolator {
    private final /* synthetic */ int a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (this.a == 0) {
            return 1.0f;
        }
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
