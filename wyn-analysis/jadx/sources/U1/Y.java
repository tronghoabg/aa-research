package U1;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: c, reason: collision with root package name */
    public static final Y f12013c = new Y(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f12014a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12015b;

    public Y(int i5, boolean z2) {
        this.f12014a = i5;
        this.f12015b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Y.class == obj.getClass()) {
            Y y10 = (Y) obj;
            if (this.f12014a == y10.f12014a && this.f12015b == y10.f12015b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f12014a << 1) + (this.f12015b ? 1 : 0);
    }
}
