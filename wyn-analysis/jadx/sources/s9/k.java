package s9;

import A.AbstractC0213f;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final h f45380a;

    /* renamed from: b, reason: collision with root package name */
    public int f45381b;

    /* renamed from: c, reason: collision with root package name */
    public o f45382c;

    /* renamed from: d, reason: collision with root package name */
    public o f45383d;

    /* renamed from: e, reason: collision with root package name */
    public l f45384e;

    /* renamed from: f, reason: collision with root package name */
    public int f45385f;

    public k(h hVar) {
        this.f45380a = hVar;
        this.f45383d = o.f45389b;
    }

    public static k g(h hVar) {
        o oVar = o.f45389b;
        return new k(hVar, 1, oVar, oVar, new l(), 3);
    }

    public static k h(h hVar, o oVar) {
        k kVar = new k(hVar);
        kVar.b(oVar);
        return kVar;
    }

    public final void a(o oVar, l lVar) {
        this.f45382c = oVar;
        this.f45381b = 2;
        this.f45384e = lVar;
        this.f45385f = 3;
    }

    public final void b(o oVar) {
        this.f45382c = oVar;
        this.f45381b = 3;
        this.f45384e = new l();
        this.f45385f = 3;
    }

    public final boolean c() {
        return AbstractC0213f.b(this.f45385f, 1);
    }

    public final boolean d() {
        return AbstractC0213f.b(this.f45381b, 2);
    }

    public final boolean e() {
        return AbstractC0213f.b(this.f45381b, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f45380a.equals(kVar.f45380a) && this.f45382c.equals(kVar.f45382c) && AbstractC0213f.b(this.f45381b, kVar.f45381b) && AbstractC0213f.b(this.f45385f, kVar.f45385f)) {
            return this.f45384e.equals(kVar.f45384e);
        }
        return false;
    }

    public final k f() {
        return new k(this.f45380a, this.f45381b, this.f45382c, this.f45383d, new l(this.f45384e.b()), this.f45385f);
    }

    public final int hashCode() {
        return this.f45380a.f45375a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Document{key=");
        sb2.append(this.f45380a);
        sb2.append(", version=");
        sb2.append(this.f45382c);
        sb2.append(", readTime=");
        sb2.append(this.f45383d);
        sb2.append(", type=");
        int i5 = this.f45381b;
        sb2.append(i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "null" : "UNKNOWN_DOCUMENT" : "NO_DOCUMENT" : "FOUND_DOCUMENT" : "INVALID");
        sb2.append(", documentState=");
        int i10 = this.f45385f;
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? "null" : "SYNCED" : "HAS_COMMITTED_MUTATIONS" : "HAS_LOCAL_MUTATIONS");
        sb2.append(", value=");
        sb2.append(this.f45384e);
        sb2.append('}');
        return sb2.toString();
    }

    public k(h hVar, int i5, o oVar, o oVar2, l lVar, int i10) {
        this.f45380a = hVar;
        this.f45382c = oVar;
        this.f45383d = oVar2;
        this.f45381b = i5;
        this.f45385f = i10;
        this.f45384e = lVar;
    }
}
