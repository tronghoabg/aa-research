package defpackage;

/* loaded from: classes.dex */
public final class cng {
    public static int a;
    public static final Object b;
    public static final czz m;
    public final String c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final col h;
    public final long i;
    public final int j;
    public final boolean k;
    public final int l;

    static {
        czz czzVar = new czz();
        m = czzVar;
        b = czzVar;
    }

    public cng(String str, float f, float f2, float f3, float f4, col colVar, long j, int i, boolean z, int i2) {
        this.c = str;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = colVar;
        this.i = j;
        this.j = i;
        this.k = z;
        this.l = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cng)) {
            return false;
        }
        cng cngVar = (cng) obj;
        return affa.f(this.c, cngVar.c) && Float.compare(this.d, cngVar.d) == 0 && Float.compare(this.e, cngVar.e) == 0 && this.f == cngVar.f && this.g == cngVar.g && affa.f(this.h, cngVar.h) && this.i == cngVar.i && this.j == cngVar.j && this.k == cngVar.k;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.c.hashCode() * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + this.h.hashCode();
        int i = true != this.k ? 1237 : 1231;
        long j = this.i;
        return (((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.j) * 31) + i;
    }
}
