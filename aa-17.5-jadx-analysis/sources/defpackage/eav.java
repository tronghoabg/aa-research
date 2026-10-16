package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class eav {
    public final float[] a = new float[20];
    public final long[] b = new long[20];
    public float c = BitmapDescriptorFactory.HUE_RED;
    public int d = 0;
    public int e = 0;

    public static float a(float f) {
        float fAbs = Math.abs(f);
        return (f < BitmapDescriptorFactory.HUE_RED ? -1.0f : 1.0f) * ((float) Math.sqrt(fAbs + fAbs));
    }
}
