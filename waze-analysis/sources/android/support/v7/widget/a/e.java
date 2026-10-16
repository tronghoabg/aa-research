package android.support.v7.widget.a;

import android.view.animation.Interpolator;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class e implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f997a;

    e(int i2) {
        this.f997a = i2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        if (this.f997a != 0) {
            return f2 * f2 * f2 * f2 * f2;
        }
        float f3 = f2 - 1.0f;
        return (f3 * f3 * f3 * f3 * f3) + 1.0f;
    }
}
