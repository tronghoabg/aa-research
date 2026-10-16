package defpackage;

import android.graphics.Color;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class xqz {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final int g;

    public /* synthetic */ xqz(byte[] bArr) {
        this(BitmapDescriptorFactory.HUE_RED, 1.0f, 0.01f, 59.0f, 0.81f, BitmapDescriptorFactory.HUE_RED, Color.argb(255, 123, 99, 231));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqz)) {
            return false;
        }
        xqz xqzVar = (xqz) obj;
        return Float.compare(this.a, xqzVar.a) == 0 && Float.compare(this.b, xqzVar.b) == 0 && Float.compare(this.c, xqzVar.c) == 0 && Float.compare(this.d, xqzVar.d) == 0 && Float.compare(this.e, xqzVar.e) == 0 && Float.compare(this.f, xqzVar.f) == 0 && this.g == xqzVar.g;
    }

    public final int hashCode() {
        return (((((((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + this.g;
    }

    public final String toString() {
        return "RippleLightConfig(alpha=" + this.a + ", expansionSpeed=" + this.b + ", frequency=" + this.c + ", oscillationDistance=" + this.d + ", oscillationSpeed=" + this.e + ", blurRadius=" + this.f + ", color=" + this.g + ")";
    }

    public xqz(float f, float f2, float f3, float f4, float f5, float f6, int i) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = i;
    }

    public xqz() {
        this(null);
    }
}
