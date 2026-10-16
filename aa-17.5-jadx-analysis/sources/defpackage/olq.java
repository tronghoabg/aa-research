package defpackage;

import android.view.animation.Interpolator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class olq implements Interpolator {
    final float a = 1.0f / a(1.0f);

    static float a(float f) {
        return ((float) (-Math.pow(100.0d, -f))) + 1.0f + (f * BitmapDescriptorFactory.HUE_RED);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return a(f) * this.a;
    }
}
