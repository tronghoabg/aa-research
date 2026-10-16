package defpackage;

import android.util.Log;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aagv {
    private static final String f = "aagv";
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public aagv(float f2, float f3, float f4, float f5) {
        zkt.l(f2, "nx cannot be NaN");
        this.a = f2;
        zkt.l(f3, "ny cannot be NaN");
        this.b = f3;
        zkt.l(f4, "nz cannot be NaN");
        this.c = f4;
        zkt.l(f5, "dotProduct cannot be NaN");
        this.d = f5;
        zkt.e((f2 == BitmapDescriptorFactory.HUE_RED && f3 == BitmapDescriptorFactory.HUE_RED && f4 == BitmapDescriptorFactory.HUE_RED) ? false : true, "Zero plane illegal.");
        this.e = Math.abs(f4) >= 0.9f;
    }

    public final Float a(float f2, float f3, float f4) {
        String str = f;
        if (zrn.e(str, 2)) {
            Log.v(str, String.format("directionDepth(%s,%s,%s)[%s]", Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), this));
        }
        float f5 = (this.a * f2) + (this.b * f3) + (this.c * f4);
        if (!Float.isNaN(f5) && f5 != BitmapDescriptorFactory.HUE_RED) {
            return Float.valueOf(this.d / f5);
        }
        if (!zrn.e(str, 5)) {
            return null;
        }
        Log.w(str, String.format("directionDepth(%s,%s,%s)[%s] == %s", Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), this, Float.valueOf(f5)));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aagv)) {
            return false;
        }
        aagv aagvVar = (aagv) obj;
        return a.C(Float.valueOf(this.a), Float.valueOf(aagvVar.a)) && a.C(Float.valueOf(this.b), Float.valueOf(aagvVar.b)) && a.C(Float.valueOf(this.c), Float.valueOf(aagvVar.c)) && a.C(Float.valueOf(this.d), Float.valueOf(aagvVar.d));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d)});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.d("nx", this.a);
        zsaVarA.d("ny", this.b);
        zsaVarA.d("nz", this.c);
        zsaVarA.d("dotProduct", this.d);
        zsaVarA.g("isGroundPlane", this.e);
        return zsaVarA.toString();
    }
}
