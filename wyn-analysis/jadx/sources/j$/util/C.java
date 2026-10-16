package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: c, reason: collision with root package name */
    private static final C f37750c = new C();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37751a;

    /* renamed from: b, reason: collision with root package name */
    private final long f37752b;

    private C() {
        this.f37751a = false;
        this.f37752b = 0L;
    }

    public static C a() {
        return f37750c;
    }

    private C(long j8) {
        this.f37751a = true;
        this.f37752b = j8;
    }

    public static C d(long j8) {
        return new C(j8);
    }

    public final long b() {
        if (!this.f37751a) {
            throw new NoSuchElementException("No value present");
        }
        return this.f37752b;
    }

    public final boolean c() {
        return this.f37751a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        boolean z2 = this.f37751a;
        return (z2 && c10.f37751a) ? this.f37752b == c10.f37752b : z2 == c10.f37751a;
    }

    public final int hashCode() {
        if (!this.f37751a) {
            return 0;
        }
        long j8 = this.f37752b;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        if (this.f37751a) {
            return "OptionalLong[" + this.f37752b + "]";
        }
        return "OptionalLong.empty";
    }
}
