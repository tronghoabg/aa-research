package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class A {

    /* renamed from: c, reason: collision with root package name */
    private static final A f37744c = new A();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37745a;

    /* renamed from: b, reason: collision with root package name */
    private final double f37746b;

    private A() {
        this.f37745a = false;
        this.f37746b = Double.NaN;
    }

    public static A a() {
        return f37744c;
    }

    private A(double d3) {
        this.f37745a = true;
        this.f37746b = d3;
    }

    public static A d(double d3) {
        return new A(d3);
    }

    public final double b() {
        if (!this.f37745a) {
            throw new NoSuchElementException("No value present");
        }
        return this.f37746b;
    }

    public final boolean c() {
        return this.f37745a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a5 = (A) obj;
        boolean z2 = this.f37745a;
        return (z2 && a5.f37745a) ? Double.compare(this.f37746b, a5.f37746b) == 0 : z2 == a5.f37745a;
    }

    public final int hashCode() {
        if (!this.f37745a) {
            return 0;
        }
        long jDoubleToLongBits = Double.doubleToLongBits(this.f37746b);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final String toString() {
        if (this.f37745a) {
            return "OptionalDouble[" + this.f37746b + "]";
        }
        return "OptionalDouble.empty";
    }
}
