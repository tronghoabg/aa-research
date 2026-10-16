package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class amw implements amy {
    @Override // defpackage.amy
    public final /* synthetic */ float a(float f, float f2, float f3) {
        float f4 = f2 + f;
        if (f >= BitmapDescriptorFactory.HUE_RED && f4 <= f3) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f < BitmapDescriptorFactory.HUE_RED && f4 > f3) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f5 = f4 - f3;
        return Math.abs(f) >= Math.abs(f5) ? f5 : f;
    }

    @Override // defpackage.amy
    public final /* synthetic */ aec b() {
        return amx.a;
    }
}
