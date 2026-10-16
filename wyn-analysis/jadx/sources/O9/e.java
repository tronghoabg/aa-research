package o9;

import s9.o;

/* loaded from: classes4.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f41439a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41440b;

    /* renamed from: c, reason: collision with root package name */
    public final o f41441c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41442d;

    /* renamed from: e, reason: collision with root package name */
    public final long f41443e;

    public e(String str, int i5, o oVar, int i10, long j8) {
        this.f41439a = str;
        this.f41440b = i5;
        this.f41441c = oVar;
        this.f41442d = i10;
        this.f41443e = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f41440b == eVar.f41440b && this.f41442d == eVar.f41442d && this.f41443e == eVar.f41443e && this.f41439a.equals(eVar.f41439a)) {
            return this.f41441c.equals(eVar.f41441c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f41439a.hashCode() * 31) + this.f41440b) * 31) + this.f41442d) * 31;
        long j8 = this.f41443e;
        return this.f41441c.f45390a.hashCode() + ((iHashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31);
    }
}
