package p9;

import A.AbstractC0213f;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f43406a;

    /* renamed from: b, reason: collision with root package name */
    public final s9.j f43407b;

    public t(int i5, s9.j jVar) {
        this.f43406a = i5;
        this.f43407b = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f43406a == tVar.f43406a && this.f43407b.equals(tVar.f43407b);
    }

    public final int hashCode() {
        return this.f43407b.hashCode() + AbstractC0213f.d(this.f43406a, 899, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f43406a == 1 ? "" : "-");
        sb2.append(this.f43407b.c());
        return sb2.toString();
    }
}
