package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class cku {
    public static final cku a = new cku(-72057594037927936L, 0, BitmapDescriptorFactory.HUE_RED);
    public final long b;
    public final long c;
    public final float d;

    public cku(long j, long j2, float f) {
        this.b = j;
        this.c = j2;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cku)) {
            return false;
        }
        cku ckuVar = (cku) obj;
        return this.b == ckuVar.b && this.c == ckuVar.c && this.d == ckuVar.d;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        long j = this.c;
        return "Shadow(color=" + cjv.g(this.b) + ", offset=" + cja.d(j) + ", blurRadius=" + this.d + ")";
    }
}
