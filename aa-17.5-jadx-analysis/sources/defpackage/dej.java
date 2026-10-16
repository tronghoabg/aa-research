package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class dej {
    public final long a;
    public final long b;
    public final long c;
    private final long d;
    private final long e;
    private final float[] f;
    private final cwd g;

    public dej(long j, long j2, long j3, long j4, long j5, float[] fArr, cwd cwdVar) {
        this.a = j;
        this.b = j2;
        this.d = j3;
        this.e = j4;
        this.c = j5;
        this.f = fArr;
        this.g = cwdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dej dejVar = (dej) obj;
            if (this.a == dejVar.a && this.b == dejVar.b && this.c == dejVar.c && this.d == dejVar.d && this.e == dejVar.e) {
                float[] fArr = this.f;
                float[] fArr2 = dejVar.f;
                if (fArr != null ? !(fArr2 == null || !affa.f(fArr, fArr2)) : fArr2 == null) {
                    return affa.f(this.g, dejVar.g);
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.f;
        int iHashCode = fArr != null ? Arrays.hashCode(fArr) : 0;
        long j = this.e;
        long j2 = this.d;
        long j3 = this.c;
        long j4 = this.b;
        long j5 = this.a;
        return (((((((((((((int) (j5 ^ (j5 >>> 32))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode) * 31) + this.g.hashCode();
    }
}
