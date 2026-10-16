package n2;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3578a {

    /* renamed from: a, reason: collision with root package name */
    public final long f40791a;

    /* renamed from: b, reason: collision with root package name */
    public final long f40792b;

    public C3578a(long j8, long j10) {
        this.f40791a = j8;
        this.f40792b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3578a)) {
            return false;
        }
        C3578a c3578a = (C3578a) obj;
        return this.f40791a == c3578a.f40791a && this.f40792b == c3578a.f40792b;
    }

    public final int hashCode() {
        return (((int) this.f40791a) * 31) + ((int) this.f40792b);
    }
}
