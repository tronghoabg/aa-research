package ad;

/* loaded from: classes5.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f17525a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17526b;

    public P(Integer num, String str) {
        this.f17525a = num;
        this.f17526b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p10 = (P) obj;
        if (this.f17525a.equals(p10.f17525a)) {
            return this.f17526b.equals(p10.f17526b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17526b.hashCode() + (this.f17525a.hashCode() * 31);
    }
}
