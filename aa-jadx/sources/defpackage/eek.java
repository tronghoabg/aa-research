package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eek {
    public int a;
    public int b;
    public float c;
    public float d;
    public float h;
    public int i;
    public long e = Long.MIN_VALUE;
    public long g = -1;
    public long f = 0;

    public final float a(long j) {
        long j2 = this.e;
        if (j < j2) {
            return com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        long j3 = this.g;
        if (j3 < 0 || j < j3) {
            return defpackage.eel.a((j - j2) / this.a, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f) * 0.5f;
        }
        float f = this.h;
        return (1.0f - f) + (f * defpackage.eel.a((j - j3) / this.i, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f));
    }
}
