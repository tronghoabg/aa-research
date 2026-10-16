package N9;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final l f8610a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8611b;

    public d(l lVar, String str) {
        this.f8610a = lVar;
        this.f8611b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return hashCode() == dVar.hashCode() && this.f8610a.equals(dVar.f8610a) && this.f8611b.equals(dVar.f8611b);
    }

    public final int hashCode() {
        return this.f8611b.hashCode() + this.f8610a.hashCode();
    }
}
