package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class tre {
    public final int a;
    public final acgk b;
    public final int c;
    public final boolean d;
    public final int e;
    private final float f;
    private final int g;
    private final ygr h;

    public tre(float f, int i, acgk acgkVar, int i2, int i3, boolean z, ygr ygrVar, int i4) {
        this.f = 1.5f;
        this.a = 300;
        this.b = acgkVar;
        this.c = 10080;
        this.g = 43200;
        this.d = true;
        this.h = ygrVar;
        this.e = i4;
    }

    public final ygr a() {
        ygr ygrVar = this.h;
        return ygrVar == null ? yly.a : ygrVar;
    }

    public final boolean equals(Object obj) {
        ygr ygrVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tre) {
            tre treVar = (tre) obj;
            if (Float.floatToIntBits(this.f) == Float.floatToIntBits(treVar.f) && Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) == Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) && this.a == treVar.a && this.b.equals(treVar.b) && this.c == treVar.c && this.g == treVar.g && this.d == treVar.d && ((ygrVar = this.h) != null ? ygrVar.equals(treVar.h) : treVar.h == null) && this.e == treVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((((((((Float.floatToIntBits(this.f) ^ 1000003) * 1000003) ^ Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED)) * 1000003) ^ this.a) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.b.hashCode();
        ygr ygrVar = this.h;
        int iHashCode = ygrVar == null ? 0 : ygrVar.hashCode();
        int i = (((((iFloatToIntBits * 1000003) ^ this.c) * 1000003) ^ this.g) * 1000003) ^ 1237;
        return ((this.e ^ (((((((((((((((i * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ iHashCode) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        ygr ygrVar = this.h;
        return "{" + this.f + ", 0.0, " + this.a + ", false, false, " + String.valueOf(this.b) + ", " + this.c + ", " + this.g + ", false, " + this.d + ", false, false, " + String.valueOf(ygrVar) + ", false, false, false, " + this.e + ", false}";
    }

    public tre() {
        throw null;
    }
}
