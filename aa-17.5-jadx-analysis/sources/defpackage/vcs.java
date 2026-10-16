package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class vcs extends vcv {
    public static final float b(float f) {
        return f < 0.66f ? BitmapDescriptorFactory.HUE_RED : (f - 0.66f) / 0.33999997f;
    }

    public static final float c(float f, float f2) {
        if (f < 1.0f) {
            return f + f;
        }
        float f3 = (f2 * 0.15999997f) + 1.0f;
        return f3 + f3;
    }

    public final void a(float f, float f2) {
        float f3 = f2 * ((3.725f * f) + 1.0f);
        this.e = c(f3, f);
        RectF rectF = this.a;
        float f4 = -f3;
        rectF.set(f4, f4, f3, f3);
        Path path = this.c;
        path.addOval(rectF, Path.Direction.CW);
        float f5 = 0.95f * f3;
        rectF.set(-f5, f4, f5, f3);
        path.addOval(rectF, Path.Direction.CW);
    }
}
