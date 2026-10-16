package defpackage;

@afdo
/* loaded from: classes.dex */
public final class dlj implements Comparable {
    public final float a;

    public static int a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static String b(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public static final boolean c(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return a(this.a, ((dlj) obj).a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dlj) && Float.compare(this.a, ((dlj) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
