package E5;

/* renamed from: E5.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0464n implements InterfaceC0453h {

    /* renamed from: a, reason: collision with root package name */
    public final int f3468a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3469b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3470c;

    public C0464n(int i5, int i10, int i11) {
        this.f3468a = i5;
        this.f3469b = i10;
        this.f3470c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0464n)) {
            return false;
        }
        C0464n c0464n = (C0464n) obj;
        return this.f3468a == c0464n.f3468a && this.f3469b == c0464n.f3469b && this.f3470c == c0464n.f3470c;
    }

    public final int hashCode() {
        return ((((527 + this.f3468a) * 31) + this.f3469b) * 31) + this.f3470c;
    }
}
