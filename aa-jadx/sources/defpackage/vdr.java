package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vdr extends defpackage.vds {
    public final void a(android.graphics.Path path, defpackage.vdq vdqVar, float f, float f2, float f3) {
        path.reset();
        float fMin = java.lang.Math.min(f3, 1.0f) * f;
        if (f2 > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            float f4 = (-0.5f) + f3;
            fMin += java.lang.Math.max(f2 - (((f4 * f4) * f2) * 5.0f), com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        }
        float f5 = vdqVar.e;
        float f6 = f5 + 18.849556f;
        float f7 = ((vdqVar.f + f6) - f) * f3;
        if (f7 < f5) {
            float fMin2 = java.lang.Math.min(f7 + fMin, f5);
            path.moveTo(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f7);
            path.lineTo(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, fMin2);
            fMin -= fMin2 - f7;
        }
        if (f7 < f6 && fMin > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            float fMax = java.lang.Math.max(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f7 - f5);
            float fMin3 = java.lang.Math.min(18.849556f, fMax + fMin);
            float f8 = (fMax * 180.0f) / 18.849556f;
            float f9 = (fMin3 * 180.0f) / 18.849556f;
            boolean z = vdqVar.g;
            if (!z) {
                f8 = 180.0f - f8;
                f9 = 180.0f - f9;
            }
            android.graphics.RectF rectF = this.a;
            rectF.set(-6.0f, -6.0f, 6.0f, 6.0f);
            rectF.offset(true != z ? 6.0f : -6.0f, f5);
            path.addArc(rectF, f8, f9 - f8);
            fMin -= fMin3 - fMax;
        }
        if (fMin > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            float f10 = true != vdqVar.g ? 12.0f : -12.0f;
            path.moveTo(f10, f5);
            path.lineTo(f10, f5 - fMin);
        }
    }
}
