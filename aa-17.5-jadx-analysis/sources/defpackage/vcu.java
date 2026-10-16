package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class vcu extends vcv {
    public final void a(Path path, vct vctVar, float f, float f2, float f3) {
        path.reset();
        float fMin = Math.min(f3, 1.0f) * f;
        if (f2 > BitmapDescriptorFactory.HUE_RED) {
            float f4 = (-0.5f) + f3;
            fMin += Math.max(f2 - (((f4 * f4) * f2) * 5.0f), BitmapDescriptorFactory.HUE_RED);
        }
        float f5 = vctVar.e;
        float f6 = f5 + 18.849556f;
        float f7 = ((vctVar.f + f6) - f) * f3;
        if (f7 < f5) {
            float fMin2 = Math.min(f7 + fMin, f5);
            path.moveTo(BitmapDescriptorFactory.HUE_RED, f7);
            path.lineTo(BitmapDescriptorFactory.HUE_RED, fMin2);
            fMin -= fMin2 - f7;
        }
        if (f7 < f6 && fMin > BitmapDescriptorFactory.HUE_RED) {
            float fMax = Math.max(BitmapDescriptorFactory.HUE_RED, f7 - f5);
            float fMin3 = Math.min(18.849556f, fMax + fMin);
            float f8 = (fMax * 180.0f) / 18.849556f;
            float f9 = (fMin3 * 180.0f) / 18.849556f;
            boolean z = vctVar.g;
            if (!z) {
                f8 = 180.0f - f8;
                f9 = 180.0f - f9;
            }
            RectF rectF = this.a;
            rectF.set(-6.0f, -6.0f, 6.0f, 6.0f);
            rectF.offset(true != z ? 6.0f : -6.0f, f5);
            path.addArc(rectF, f8, f9 - f8);
            fMin -= fMin3 - fMax;
        }
        if (fMin > BitmapDescriptorFactory.HUE_RED) {
            float f10 = true != vctVar.g ? 12.0f : -12.0f;
            path.moveTo(f10, f5);
            path.lineTo(f10, f5 - fMin);
        }
    }
}
