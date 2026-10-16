package s9;

import A.AbstractC0213f;

/* loaded from: classes4.dex */
public final class d implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final j f45367a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45368b;

    public d(int i5, j jVar) {
        if (jVar == null) {
            throw new NullPointerException("Null fieldPath");
        }
        this.f45367a = jVar;
        if (i5 == 0) {
            throw new NullPointerException("Null kind");
        }
        this.f45368b = i5;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        int iCompareTo = this.f45367a.compareTo(dVar.f45367a);
        return iCompareTo != 0 ? iCompareTo : AbstractC0213f.a(this.f45368b, dVar.f45368b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f45367a.equals(dVar.f45367a) && AbstractC0213f.b(this.f45368b, dVar.f45368b);
    }

    public final int hashCode() {
        return ((this.f45367a.hashCode() ^ 1000003) * 1000003) ^ AbstractC0213f.f(this.f45368b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Segment{fieldPath=");
        sb2.append(this.f45367a);
        sb2.append(", kind=");
        int i5 = this.f45368b;
        sb2.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? "null" : "CONTAINS" : "DESCENDING" : "ASCENDING");
        sb2.append("}");
        return sb2.toString();
    }
}
