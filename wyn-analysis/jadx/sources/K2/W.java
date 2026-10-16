package k2;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final int f38957a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f38958b;

    public W(int i5, boolean z2) {
        this.f38957a = i5;
        this.f38958b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W.class != obj.getClass()) {
            return false;
        }
        W w2 = (W) obj;
        return this.f38957a == w2.f38957a && this.f38958b == w2.f38958b;
    }

    public final int hashCode() {
        return (this.f38957a * 31) + (this.f38958b ? 1 : 0);
    }
}
