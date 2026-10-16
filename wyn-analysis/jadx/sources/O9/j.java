package o9;

import s9.o;

/* loaded from: classes4.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f41458a;

    /* renamed from: b, reason: collision with root package name */
    public final i f41459b;

    /* renamed from: c, reason: collision with root package name */
    public final o f41460c;

    public j(String str, i iVar, o oVar) {
        this.f41458a = str;
        this.f41459b = iVar;
        this.f41460c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f41458a.equals(jVar.f41458a) && this.f41459b.equals(jVar.f41459b)) {
            return this.f41460c.equals(jVar.f41460c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41460c.f45390a.hashCode() + ((this.f41459b.hashCode() + (this.f41458a.hashCode() * 31)) * 31);
    }
}
