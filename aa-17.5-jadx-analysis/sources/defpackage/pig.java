package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public final class pig implements Interpolator {
    public static final pig a = new pig();

    public pig() {
        woy.S(true, "The exponent should be greater than 0 and less than 1, but %s was given.", Double.valueOf(0.01d));
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) ((1.0d - Math.pow(0.01d, f)) / 0.99d);
    }
}
