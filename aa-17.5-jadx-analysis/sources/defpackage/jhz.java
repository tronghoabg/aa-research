package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class jhz extends jia {
    @Override // defpackage.jia, defpackage.jhv
    public final float a(float f, float f2, float f3) {
        if (f <= f2) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f >= f3) {
            return 1.0f;
        }
        return 1.0f - (b(1.0f - ((f - f2) / (f3 - f2))) * this.a);
    }
}
