package t9;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public final class o extends h {

    /* renamed from: d, reason: collision with root package name */
    public final s9.l f45967d;

    public o(s9.h hVar, s9.l lVar, m mVar, List list) {
        super(hVar, mVar, list);
        this.f45967d = lVar;
    }

    @Override // t9.h
    public final f a(s9.k kVar, f fVar, s8.q qVar) {
        j(kVar);
        if (!this.f45952b.b(kVar)) {
            return fVar;
        }
        HashMap mapH = h(qVar, kVar);
        s9.l lVar = new s9.l(this.f45967d.b());
        lVar.h(mapH);
        kVar.a(kVar.f45382c, lVar);
        kVar.f45385f = 1;
        kVar.f45382c = s9.o.f45389b;
        return null;
    }

    @Override // t9.h
    public final void b(s9.k kVar, j jVar) {
        j(kVar);
        s9.l lVar = new s9.l(this.f45967d.b());
        lVar.h(i(kVar, jVar.f45959b));
        kVar.a(jVar.f45958a, lVar);
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
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (e(oVar) && this.f45967d.equals(oVar.f45967d) && this.f45953c.equals(oVar.f45953c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f45967d.hashCode() + (f() * 31);
    }

    public final String toString() {
        return "SetMutation{" + g() + ", value=" + this.f45967d + "}";
    }
}
