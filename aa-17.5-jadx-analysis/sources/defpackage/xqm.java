package defpackage;

import android.graphics.Color;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class xqm {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final int j;
    public final float k;

    public /* synthetic */ xqm(String str, int i) {
        this(1 == (i & 1) ? "" : str, 30.2f, 4.4f, 0.06967213f, 0.47950816f, 3.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, Color.argb(255, 218, 109, 213), 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqm)) {
            return false;
        }
        xqm xqmVar = (xqm) obj;
        return affa.f(this.a, xqmVar.a) && Float.compare(this.b, xqmVar.b) == 0 && Float.compare(this.c, xqmVar.c) == 0 && Float.compare(this.d, xqmVar.d) == 0 && Float.compare(this.e, xqmVar.e) == 0 && Float.compare(this.f, xqmVar.f) == 0 && Float.compare(this.g, xqmVar.g) == 0 && Float.compare(this.h, xqmVar.h) == 0 && Float.compare(this.i, xqmVar.i) == 0 && this.j == xqmVar.j && Float.compare(this.k, xqmVar.k) == 0;
    }

    public final int hashCode() {
        return (((((((((((((((((((this.a.hashCode() * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + Float.floatToIntBits(this.i)) * 31) + this.j) * 31) + Float.floatToIntBits(this.k);
    }

    public final String toString() {
        return "BorderLightConfig(id=" + this.a + ", topBlurRadius=" + this.b + ", bottomBlurRadius=" + this.c + ", topIntensity=" + this.d + ", bottomIntensity=" + this.e + ", strokeWidth=" + this.f + ", distortionSpeed=" + this.g + ", distortionFrequency=" + this.h + ", distortionAmplitude=" + this.i + ", color=" + this.j + ", alpha=" + this.k + ")";
    }

    public xqm(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i, float f9) {
        str.getClass();
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.j = i;
        this.k = f9;
    }

    public xqm() {
        this(null, 2047);
    }
}
