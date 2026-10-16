package K;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final H.d f6309a;

    /* renamed from: b, reason: collision with root package name */
    public final H.d f6310b;

    /* renamed from: c, reason: collision with root package name */
    public final H.d f6311c;

    public z(H.d dVar, H.d dVar2, H.d dVar3) {
        this.f6309a = dVar;
        this.f6310b = dVar2;
        this.f6311c = dVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f6309a.equals(zVar.f6309a) && this.f6310b.equals(zVar.f6310b) && this.f6311c.equals(zVar.f6311c);
    }

    public final int hashCode() {
        return this.f6311c.hashCode() + ((this.f6310b.hashCode() + (this.f6309a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.f6309a + ", medium=" + this.f6310b + ", large=" + this.f6311c + ')';
    }
}
