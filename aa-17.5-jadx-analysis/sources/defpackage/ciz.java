package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class ciz {
    public float a = BitmapDescriptorFactory.HUE_RED;
    public float b = BitmapDescriptorFactory.HUE_RED;
    public float c = BitmapDescriptorFactory.HUE_RED;
    public float d = BitmapDescriptorFactory.HUE_RED;

    public final void a(float f, float f2, float f3, float f4) {
        this.a = Math.max(f, this.a);
        this.b = Math.max(f2, this.b);
        this.c = Math.min(f3, this.c);
        this.d = Math.min(f4, this.d);
    }

    public final void b(long j) {
        int i = (int) (4294967295L & j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat(i);
        this.a += fIntBitsToFloat;
        this.b += fIntBitsToFloat2;
        this.c += fIntBitsToFloat;
        this.d += fIntBitsToFloat2;
    }

    public final boolean c() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final void d(float f, float f2) {
        this.a = BitmapDescriptorFactory.HUE_RED;
        this.b = BitmapDescriptorFactory.HUE_RED;
        this.c = f;
        this.d = f2;
    }

    public final String toString() {
        return "MutableRect(" + byx.G(this.a) + ", " + byx.G(this.b) + ", " + byx.G(this.c) + ", " + byx.G(this.d) + ")";
    }
}
