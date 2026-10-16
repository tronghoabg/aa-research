package defpackage;

@afdo
/* loaded from: classes3.dex */
public final class tdg {
    private final float a;

    public static final int a(float f, int i) {
        return Float.compare(f, i);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tdg) && Float.compare(this.a, ((tdg) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return this.a + "px";
    }
}
