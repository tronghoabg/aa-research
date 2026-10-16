package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class eec {
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
        if (j < this.e) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        long j2 = this.g;
        if (j2 < 0 || j < j2) {
            return eed.a((j - r0) / this.a, BitmapDescriptorFactory.HUE_RED, 1.0f) * 0.5f;
        }
        float f = this.h;
        return (1.0f - f) + (f * eed.a((j - j2) / this.i, BitmapDescriptorFactory.HUE_RED, 1.0f));
    }
}
