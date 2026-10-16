package E5;

/* loaded from: classes3.dex */
public final class B0 {

    /* renamed from: b, reason: collision with root package name */
    public static final B0 f3009b = new B0(false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3010a;

    public B0(boolean z2) {
        this.f3010a = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && B0.class == obj.getClass() && this.f3010a == ((B0) obj).f3010a;
    }

    public final int hashCode() {
        return !this.f3010a ? 1 : 0;
    }
}
