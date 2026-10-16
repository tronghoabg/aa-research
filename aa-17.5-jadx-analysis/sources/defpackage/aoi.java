package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class aoi {
    public static final afeh a = new aoh((afck) null, 1, (byte[]) null);
    public static final afeh b = new aoh(null, 0);

    public static final float a(long j, api apiVar) {
        return Float.intBitsToFloat((int) (apiVar == api.a ? j & 4294967295L : j >> 32));
    }

    public static final long b(long j) {
        int i = (int) (j >> 32);
        boolean zIsNaN = Float.isNaN(Float.intBitsToFloat(i));
        float fIntBitsToFloat = BitmapDescriptorFactory.HUE_RED;
        float fIntBitsToFloat2 = zIsNaN ? 0.0f : Float.intBitsToFloat(i);
        int i2 = (int) (j & 4294967295L);
        if (!Float.isNaN(Float.intBitsToFloat(i2))) {
            fIntBitsToFloat = Float.intBitsToFloat(i2);
        }
        return roc.aA(fIntBitsToFloat2, fIntBitsToFloat);
    }

    public static final boolean c(api apiVar, float f) {
        return apiVar == api.b ? f <= 30.0f : f > 30.0f && f <= 90.0f;
    }
}
