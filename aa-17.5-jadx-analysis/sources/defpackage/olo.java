package defpackage;

import android.view.animation.Interpolator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class olo implements Interpolator {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public olo(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    private final float a(float f) {
        return b(f, this.a, this.c);
    }

    private static final float b(float f, float f2, float f3) {
        if (f == BitmapDescriptorFactory.HUE_RED || f == 1.0f) {
            return f;
        }
        float f4 = ((f2 + BitmapDescriptorFactory.HUE_RED) * f) + BitmapDescriptorFactory.HUE_RED;
        float f5 = f2 + ((f3 - f2) * f);
        float f6 = f4 + ((f5 - f4) * f);
        return f6 + (((f5 + (((f3 + ((1.0f - f3) * f)) - f5) * f)) - f6) * f);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            if (f >= 1.0f) {
                f2 = 1.0f;
            } else {
                float fA = 0.0f;
                float f3 = 1.0f;
                f2 = f;
                float f4 = 0.0f;
                for (int i = 0; i < 8; i++) {
                    fA = a(f2);
                    float fA2 = (a(f2 + 1.0E-6f) - fA) / 1.0E-6f;
                    float f5 = fA - f;
                    if (Math.abs(f5) < 1.0E-6f) {
                        break;
                    }
                    double d = fA2;
                    if (Math.abs(d) < 9.999999974752427E-7d) {
                        break;
                    }
                    if (fA >= f) {
                        f3 = f2;
                    }
                    if (fA < f) {
                        f4 = f2;
                    }
                    f2 = (float) (f2 - (f5 / d));
                }
                for (int i2 = 0; Math.abs(fA - f) > 1.0E-6f && i2 < 8; i2++) {
                    if (fA < f) {
                        f4 = f2;
                        f2 = (f2 + f3) / 2.0f;
                    } else {
                        f3 = f2;
                        f2 = (f2 + f4) / 2.0f;
                    }
                    fA = a(f2);
                }
            }
        }
        return b(f2, this.b, this.d);
    }
}
