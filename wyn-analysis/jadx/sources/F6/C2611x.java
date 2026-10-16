package f6;

/* renamed from: f6.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2611x {

    /* renamed from: a, reason: collision with root package name */
    public final Object f35112a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35113b;

    /* renamed from: c, reason: collision with root package name */
    public final int f35114c;

    /* renamed from: d, reason: collision with root package name */
    public final long f35115d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35116e;

    public C2611x(Object obj, long j8) {
        this(obj, -1, -1, j8, -1);
    }

    public final boolean a() {
        return this.f35113b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2611x)) {
            return false;
        }
        C2611x c2611x = (C2611x) obj;
        return this.f35112a.equals(c2611x.f35112a) && this.f35113b == c2611x.f35113b && this.f35114c == c2611x.f35114c && this.f35115d == c2611x.f35115d && this.f35116e == c2611x.f35116e;
    }

    public final int hashCode() {
        return ((((((((this.f35112a.hashCode() + 527) * 31) + this.f35113b) * 31) + this.f35114c) * 31) + ((int) this.f35115d)) * 31) + this.f35116e;
    }

    public C2611x(C2611x c2611x) {
        this.f35112a = c2611x.f35112a;
        this.f35113b = c2611x.f35113b;
        this.f35114c = c2611x.f35114c;
        this.f35115d = c2611x.f35115d;
        this.f35116e = c2611x.f35116e;
    }

    public C2611x(Object obj, int i5, int i10, long j8, int i11) {
        this.f35112a = obj;
        this.f35113b = i5;
        this.f35114c = i10;
        this.f35115d = j8;
        this.f35116e = i11;
    }
}
