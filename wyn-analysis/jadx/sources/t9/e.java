package t9;

/* loaded from: classes4.dex */
public final class e extends h {
    @Override // t9.h
    public final f a(s9.k kVar, f fVar, s8.q qVar) {
        j(kVar);
        if (!this.f45952b.b(kVar)) {
            return fVar;
        }
        kVar.b(kVar.f45382c);
        kVar.f45385f = 1;
        kVar.f45382c = s9.o.f45389b;
        return null;
    }

    @Override // t9.h
    public final void b(s9.k kVar, j jVar) {
        j(kVar);
        A6.c.z(jVar.f45959b.isEmpty(), "Transform results received by DeleteMutation.", new Object[0]);
        kVar.b(jVar.f45958a);
        kVar.f45385f = 2;
    }

    @Override // t9.h
    public final f d() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        return e((e) obj);
    }

    public final int hashCode() {
        return f();
    }

    public final String toString() {
        return "DeleteMutation{" + g() + "}";
    }
}
