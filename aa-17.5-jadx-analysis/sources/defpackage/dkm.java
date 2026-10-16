package defpackage;

@afdo
/* loaded from: classes.dex */
public final class dkm {
    public final float a;

    public final boolean equals(Object obj) {
        return (obj instanceof dkm) && Float.compare(this.a, ((dkm) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ")";
    }
}
