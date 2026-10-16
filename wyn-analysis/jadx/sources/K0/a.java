package K0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f6312a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Float.valueOf(this.f6312a).equals(Float.valueOf(((a) obj).f6312a));
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6312a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.f6312a + ')';
    }
}
