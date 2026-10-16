package s9;

import A7.AbstractC0279p0;
import s8.q;

/* loaded from: classes4.dex */
public final class o implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final o f45389b = new o(new q(0, 0));

    /* renamed from: a, reason: collision with root package name */
    public final q f45390a;

    public o(q qVar) {
        this.f45390a = qVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(o oVar) {
        return this.f45390a.compareTo(oVar.f45390a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof o) && compareTo((o) obj) == 0;
    }

    public final int hashCode() {
        return this.f45390a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SnapshotVersion(seconds=");
        q qVar = this.f45390a;
        sb2.append(qVar.f45352a);
        sb2.append(", nanos=");
        return AbstractC0279p0.j(qVar.f45353b, ")", sb2);
    }
}
