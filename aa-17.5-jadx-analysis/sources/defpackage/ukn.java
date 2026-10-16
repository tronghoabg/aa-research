package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class ukn {
    public static final ukn a = a(-16777216, Alert.DURATION_SHOW_INDEFINITELY, 12, 2.8f, 1.0f, BitmapDescriptorFactory.HUE_RED, 0, false);
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final int h;
    public final boolean i;

    public ukn(int i, int i2, int i3, float f, float f2, float f3, int i4, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = i4;
        this.i = z;
    }

    public static ukn a(int i, int i2, int i3, float f, float f2, float f3, int i4, boolean z) {
        ukm ukmVar = new ukm();
        ukmVar.a = i;
        int i5 = ukmVar.g | 1;
        ukmVar.b = i2;
        ukmVar.g = (byte) (((byte) i5) | 2);
        ukmVar.c(i3);
        ukmVar.c = f;
        int i6 = ukmVar.g | 8;
        ukmVar.d = f2;
        ukmVar.e = f3;
        ukmVar.g = (byte) (((byte) (((byte) i6) | 16)) | 32);
        ukmVar.b(i4);
        ukmVar.f = z;
        ukmVar.g = (byte) (ukmVar.g | (-128));
        return ukmVar.a();
    }

    public static ukn b(abcv abcvVar) {
        float f;
        int i = abcvVar.c;
        int i2 = abcvVar.d;
        abbt abbtVar = abcvVar.g;
        if (abbtVar == null) {
            abbtVar = abbt.a;
        }
        int i3 = abbtVar.c;
        abbt abbtVar2 = abcvVar.g;
        float fS = uqw.s((abbtVar2 == null ? abbt.a : abbtVar2).g);
        if (((abbtVar2 == null ? abbt.a : abbtVar2).b & 8) != 0) {
            f = (abbtVar2 == null ? abbt.a : abbtVar2).e / 100.0f;
        } else {
            f = 1.0f;
        }
        float f2 = (abbtVar2 == null ? abbt.a : abbtVar2).f;
        if (abbtVar2 == null) {
            abbtVar2 = abbt.a;
        }
        return a(i, i2, i3, fS, f, f2 / 1000.0f, abbtVar2.d, abcvVar.l);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ukn) {
            ukn uknVar = (ukn) obj;
            if (this.b == uknVar.b && this.c == uknVar.c && this.d == uknVar.d) {
                if (Float.floatToIntBits(this.e) == Float.floatToIntBits(uknVar.e)) {
                    if (Float.floatToIntBits(this.f) == Float.floatToIntBits(uknVar.f)) {
                        if (Float.floatToIntBits(this.g) == Float.floatToIntBits(uknVar.g) && this.h == uknVar.h && this.i == uknVar.i) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.h ^ ((((((((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ Float.floatToIntBits(this.e)) * 1000003) ^ Float.floatToIntBits(this.f)) * 1000003) ^ Float.floatToIntBits(this.g)) * 1000003)) * 1000003) ^ (true != this.i ? 1237 : 1231);
    }

    public final String toString() {
        return "TextStyle{color=" + Integer.toHexString(this.b) + ", outlineColor=" + Integer.toHexString(this.c) + ", size=" + this.d + ", outlineWidth=" + this.e + ", leadingRatio=" + this.f + ", trackingRatio=" + this.g + ", attributes=" + this.h + ", off=" + this.i + '}';
    }

    public ukn() {
        throw null;
    }
}
