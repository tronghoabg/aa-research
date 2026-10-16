package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class B {

    /* renamed from: c, reason: collision with root package name */
    private static final B f37747c = new B();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37748a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37749b;

    private B() {
        this.f37748a = false;
        this.f37749b = 0;
    }

    public static B a() {
        return f37747c;
    }

    private B(int i5) {
        this.f37748a = true;
        this.f37749b = i5;
    }

    public static B d(int i5) {
        return new B(i5);
    }

    public final int b() {
        if (!this.f37748a) {
            throw new NoSuchElementException("No value present");
        }
        return this.f37749b;
    }

    public final boolean c() {
        return this.f37748a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b5 = (B) obj;
        boolean z2 = this.f37748a;
        return (z2 && b5.f37748a) ? this.f37749b == b5.f37749b : z2 == b5.f37748a;
    }

    public final int hashCode() {
        if (this.f37748a) {
            return this.f37749b;
        }
        return 0;
    }

    public final String toString() {
        if (this.f37748a) {
            return "OptionalInt[" + this.f37749b + "]";
        }
        return "OptionalInt.empty";
    }
}
