package defpackage;

/* loaded from: classes.dex */
public final class cfs implements cfn {
    private final float a;
    private final float b;

    public cfs(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.cfn
    public final long a(long j, long j2, dlr dlrVar) {
        dlr dlrVar2 = dlr.a;
        float f = this.a;
        if (dlrVar != dlrVar2) {
            f = -f;
        }
        long j3 = j2 & 4294967295L;
        float f2 = this.b;
        return (Math.round(((((int) j3) - ((int) (j & 4294967295L))) / 2.0f) * (f2 + 1.0f)) & 4294967295L) | (Math.round(((((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f) * (f + 1.0f)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfs)) {
            return false;
        }
        cfs cfsVar = (cfs) obj;
        return Float.compare(this.a, cfsVar.a) == 0 && Float.compare(this.b, cfsVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "BiasAlignment(horizontalBias=" + this.a + ", verticalBias=" + this.b + ")";
    }
}
