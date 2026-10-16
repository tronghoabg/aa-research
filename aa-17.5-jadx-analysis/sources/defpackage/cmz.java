package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class cmz {
    public final float a;
    public final float b;
    public final long c;
    public final float f;
    public final int d = 3;
    public final long e = -72057594037927936L;
    private final cjs g = null;

    public cmz(float f, float f2, long j, float f3) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.f = afpt.d(f3, BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmz)) {
            return false;
        }
        cmz cmzVar = (cmz) obj;
        if (Float.compare(this.a, cmzVar.a) != 0 || Float.compare(this.b, cmzVar.b) != 0 || this.c != cmzVar.c || this.f != cmzVar.f) {
            return false;
        }
        int i = cmzVar.d;
        long j = cmzVar.e;
        cjs cjsVar = cmzVar.g;
        return true;
    }

    public final int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
        long j = this.c;
        return ((((((((iFloatToIntBits * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.f)) * 31) + 3) * 31) - 16777216) * 31;
    }

    public final String toString() {
        long j = this.c;
        float f = this.b;
        return "Shadow(radius=" + dlj.b(this.a) + ", spread=" + dlj.b(f) + ", offset=" + dlk.a(j) + ", alpha=" + this.f + ", blendMode=" + cjo.a(3) + ", color=" + cjv.g(-72057594037927936L) + ", brush=null)";
    }
}
