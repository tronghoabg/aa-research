package N9;

/* loaded from: classes4.dex */
public final class g extends h {

    /* renamed from: c, reason: collision with root package name */
    public f f8620c;

    /* renamed from: d, reason: collision with root package name */
    public a f8621d;

    @Override // N9.h
    public final f a() {
        return this.f8620c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (hashCode() != gVar.hashCode()) {
            return false;
        }
        a aVar = gVar.f8621d;
        a aVar2 = this.f8621d;
        return (aVar2 != null || aVar == null) && (aVar2 == null || aVar2.equals(aVar)) && this.f8620c.equals(gVar.f8620c);
    }

    public final int hashCode() {
        a aVar = this.f8621d;
        return this.f8620c.f8619a.hashCode() + (aVar != null ? aVar.hashCode() : 0);
    }
}
