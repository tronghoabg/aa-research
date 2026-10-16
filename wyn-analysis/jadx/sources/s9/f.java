package s9;

/* loaded from: classes4.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final String f45370a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45371b;

    public f(String str, String str2) {
        this.f45370a = str;
        this.f45371b = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        int iCompareTo = this.f45370a.compareTo(fVar.f45370a);
        return iCompareTo != 0 ? iCompareTo : this.f45371b.compareTo(fVar.f45371b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (this.f45370a.equals(fVar.f45370a) && this.f45371b.equals(fVar.f45371b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f45371b.hashCode() + (this.f45370a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DatabaseId(");
        sb2.append(this.f45370a);
        sb2.append(", ");
        return wg.b.c(sb2, this.f45371b, ")");
    }
}
