package N9;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f8601a;

    /* renamed from: b, reason: collision with root package name */
    public final d f8602b;

    public a(String str, d dVar) {
        this.f8601a = str;
        this.f8602b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (hashCode() != aVar.hashCode()) {
            return false;
        }
        String str = aVar.f8601a;
        String str2 = this.f8601a;
        if ((str2 == null && str != null) || (str2 != null && !str2.equals(str))) {
            return false;
        }
        d dVar = aVar.f8602b;
        d dVar2 = this.f8602b;
        return (dVar2 == null && dVar == null) || (dVar2 != null && dVar2.equals(dVar));
    }

    public final int hashCode() {
        String str = this.f8601a;
        int iHashCode = str != null ? str.hashCode() : 0;
        d dVar = this.f8602b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
