package t9;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final s9.j f45949a;

    /* renamed from: b, reason: collision with root package name */
    public final p f45950b;

    public g(s9.j jVar, p pVar) {
        this.f45949a = jVar;
        this.f45950b = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f45949a.equals(gVar.f45949a)) {
            return this.f45950b.equals(gVar.f45950b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45950b.hashCode() + (this.f45949a.hashCode() * 31);
    }
}
