package L0;

/* loaded from: classes.dex */
public final class d implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final float f6795a;

    public static final boolean a(float f10, float f11) {
        return Float.valueOf(f10).equals(Float.valueOf(f11));
    }

    public static String b(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f6795a, ((d) obj).f6795a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return Float.valueOf(this.f6795a).equals(Float.valueOf(((d) obj).f6795a));
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6795a);
    }

    public final String toString() {
        return b(this.f6795a);
    }
}
