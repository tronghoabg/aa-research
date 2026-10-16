package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ebc {
    public final float[] a = new float[20];
    public final long[] b = new long[20];
    public float c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    public int d = 0;
    public int e = 0;

    public static float a(float f) {
        float fAbs = java.lang.Math.abs(f);
        return (f < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? -1.0f : 1.0f) * ((float) java.lang.Math.sqrt(fAbs + fAbs));
    }
}
