package defpackage;

/* loaded from: classes.dex */
public final class cfq implements cfm {
    private final float a;

    public cfq(float f) {
        this.a = f;
    }

    @Override // defpackage.cfm
    public final int a(int i, int i2, dlr dlrVar) {
        dlr dlrVar2 = dlr.a;
        float f = this.a;
        if (dlrVar != dlrVar2) {
            f = -f;
        }
        return Math.round(((i2 - i) / 2.0f) * (f + 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfq) && Float.compare(this.a, ((cfq) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ")";
    }
}
