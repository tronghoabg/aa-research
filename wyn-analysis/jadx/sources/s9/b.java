package s9;

import A7.AbstractC0279p0;

/* loaded from: classes4.dex */
public final class b implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final b f45360d = new b(o.f45389b, h.b(), -1);

    /* renamed from: e, reason: collision with root package name */
    public static final q6.d f45361e = new q6.d(19);

    /* renamed from: a, reason: collision with root package name */
    public final o f45362a;

    /* renamed from: b, reason: collision with root package name */
    public final h f45363b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45364c;

    public b(o oVar, h hVar, int i5) {
        if (oVar == null) {
            throw new NullPointerException("Null readTime");
        }
        this.f45362a = oVar;
        if (hVar == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.f45363b = hVar;
        this.f45364c = i5;
    }

    public static b b(k kVar) {
        return new b(kVar.f45383d, kVar.f45380a, -1);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(b bVar) {
        int iCompareTo = this.f45362a.compareTo(bVar.f45362a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f45363b.compareTo(bVar.f45363b);
        return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(this.f45364c, bVar.f45364c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f45362a.equals(bVar.f45362a) && this.f45363b.equals(bVar.f45363b) && this.f45364c == bVar.f45364c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f45362a.f45390a.hashCode() ^ 1000003) * 1000003) ^ this.f45363b.f45375a.hashCode()) * 1000003) ^ this.f45364c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IndexOffset{readTime=");
        sb2.append(this.f45362a);
        sb2.append(", documentKey=");
        sb2.append(this.f45363b);
        sb2.append(", largestBatchId=");
        return AbstractC0279p0.j(this.f45364c, "}", sb2);
    }
}
