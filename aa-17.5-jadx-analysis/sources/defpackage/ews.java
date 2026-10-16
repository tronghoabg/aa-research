package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class ews {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public ews(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ews ewsVar = (ews) obj;
            return this.c == ewsVar.c && this.d == ewsVar.d && this.b == ewsVar.b && this.a == ewsVar.a && this.e == ewsVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.b)) * 31) + this.a) * 31) + a.g(this.e);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ")";
    }

    public ews() {
        this(2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0L);
    }
}
