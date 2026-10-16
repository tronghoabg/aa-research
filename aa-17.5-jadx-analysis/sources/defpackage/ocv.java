package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class ocv extends wub {
    private final float a;
    private final float b;
    private final float c;
    private final boolean d;
    private final boolean e;

    public ocv(float f, float f2, float f3, boolean z, boolean z2) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.wub
    public final void b(float f, float f2, float f3, wuu wuuVar) {
        float f4 = this.c;
        float f5 = f4 * f3;
        float f6 = f5 / 2.0f;
        float f7 = -(this.b * f3);
        if (f < 1.0f) {
            float f8 = f2 - f6;
            double d = this.a;
            float f9 = (float) (-(Math.sqrt(Math.pow(d, 2.0d) - Math.pow(f8 - f2, 2.0d)) - d));
            wuuVar.d(f8, f9);
            wuuVar.d(f2, f7);
            wuuVar.d(f8 + f5, f9);
            return;
        }
        if (!this.d) {
            f2 = this.e ? f4 / 2.0f : f - (f4 / 2.0f);
        }
        float f10 = f2 - f6;
        wuuVar.d(f10, BitmapDescriptorFactory.HUE_RED);
        wuuVar.d(f6 + f10, f7);
        wuuVar.d(f10 + f5, BitmapDescriptorFactory.HUE_RED);
        wuuVar.d(f, BitmapDescriptorFactory.HUE_RED);
    }
}
