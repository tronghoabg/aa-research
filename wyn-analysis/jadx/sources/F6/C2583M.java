package f6;

/* renamed from: f6.M, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2583M {

    /* renamed from: a, reason: collision with root package name */
    public final int f34915a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34916b;

    public C2583M(int i5, boolean z2) {
        this.f34915a = i5;
        this.f34916b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2583M.class != obj.getClass()) {
            return false;
        }
        C2583M c2583m = (C2583M) obj;
        return this.f34915a == c2583m.f34915a && this.f34916b == c2583m.f34916b;
    }

    public final int hashCode() {
        return (this.f34915a * 31) + (this.f34916b ? 1 : 0);
    }
}
