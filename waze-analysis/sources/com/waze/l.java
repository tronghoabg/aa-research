package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25077a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f25078b;

    public l(boolean z, Integer num) {
        this.f25077a = z;
        this.f25078b = num;
    }

    public final Integer a() {
        return this.f25078b;
    }

    public final boolean b() {
        return this.f25077a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f25077a == lVar.f25077a && h.g.b.x.n(this.f25078b, lVar.f25078b);
    }

    public final int hashCode() {
        Integer num = this.f25078b;
        return (a.a.a(this.f25077a) * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ValidationResult(isValid=" + this.f25077a + ", distanceMeters=" + this.f25078b + ")";
    }
}
