package k2;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final Object f38903a;

    /* renamed from: b, reason: collision with root package name */
    public final int f38904b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38905c;

    /* renamed from: d, reason: collision with root package name */
    public final long f38906d;

    /* renamed from: e, reason: collision with root package name */
    public final int f38907e;

    public H(Object obj) {
        this(obj, -1L);
    }

    public final H a(Object obj) {
        if (this.f38903a.equals(obj)) {
            return this;
        }
        return new H(obj, this.f38904b, this.f38905c, this.f38906d, this.f38907e);
    }

    public final boolean b() {
        return this.f38904b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return this.f38903a.equals(h10.f38903a) && this.f38904b == h10.f38904b && this.f38905c == h10.f38905c && this.f38906d == h10.f38906d && this.f38907e == h10.f38907e;
    }

    public final int hashCode() {
        return ((((((((this.f38903a.hashCode() + 527) * 31) + this.f38904b) * 31) + this.f38905c) * 31) + ((int) this.f38906d)) * 31) + this.f38907e;
    }

    public H(Object obj, long j8) {
        this(obj, -1, -1, j8, -1);
    }

    public H(Object obj, long j8, int i5) {
        this(obj, -1, -1, j8, i5);
    }

    public H(Object obj, int i5, int i10, long j8, int i11) {
        this.f38903a = obj;
        this.f38904b = i5;
        this.f38905c = i10;
        this.f38906d = j8;
        this.f38907e = i11;
    }
}
