package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Objects;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class tto implements Serializable {
    public static final tto a = new tto(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    public final float b;
    public final float c;

    public tto(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public static tto d(tto ttoVar) {
        float f = ttoVar.b;
        boolean zIsNaN = Float.isNaN(f);
        float fI = BitmapDescriptorFactory.HUE_RED;
        float fI2 = zIsNaN ? 0.0f : dlz.i(f, -1.0f, 1.0f);
        float f2 = ttoVar.c;
        if (!Float.isNaN(f2)) {
            fI = dlz.i(f2, -1.0f, 1.0f);
        }
        return (Float.floatToIntBits(fI2) == Float.floatToIntBits(f) && Float.floatToIntBits(fI) == Float.floatToIntBits(f2)) ? ttoVar : new tto(fI2, fI);
    }

    public final float a() {
        return (this.b + 1.0f) / 2.0f;
    }

    public final float b() {
        return (this.c + 1.0f) / 2.0f;
    }

    public final tto c(tto ttoVar, float f) {
        float f2 = ttoVar.b;
        int i = uzg.a;
        float f3 = this.b;
        float f4 = ttoVar.c;
        float f5 = this.c;
        return new tto(f3 + ((f2 - f3) * f), f5 + ((f4 - f5) * f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tto) {
            tto ttoVar = (tto) obj;
            if (Float.floatToIntBits(this.b) == Float.floatToIntBits(ttoVar.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(ttoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Float.valueOf(this.b), Float.valueOf(this.c));
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.e("x", this.b);
        xxgVarAo.e("y", this.c);
        return xxgVarAo.toString();
    }
}
