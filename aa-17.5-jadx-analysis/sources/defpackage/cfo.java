package defpackage;

/* loaded from: classes2.dex */
public final class cfo implements cfm {
    public final float a;

    public cfo(float f) {
        this.a = f;
    }

    @Override // defpackage.cfm
    public final int a(int i, int i2, dlr dlrVar) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfo) && Float.compare(this.a, ((cfo) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ")";
    }
}
