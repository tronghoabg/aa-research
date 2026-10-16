package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class clc {
    public static final defpackage.clc a = new defpackage.clc(-72057594037927936L, 0, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
    public final long b;
    public final long c;
    public final float d;

    public clc(long j, long j2, float f) {
        this.b = j;
        this.c = j2;
        this.d = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.clc)) {
            return false;
        }
        defpackage.clc clcVar = (defpackage.clc) obj;
        return this.b == clcVar.b && this.c == clcVar.c && this.d == clcVar.d;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + java.lang.Float.floatToIntBits(this.d);
    }

    public final java.lang.String toString() {
        long j = this.c;
        return "Shadow(color=" + defpackage.ckd.g(this.b) + ", offset=" + defpackage.cji.d(j) + ", blurRadius=" + this.d + ")";
    }
}
