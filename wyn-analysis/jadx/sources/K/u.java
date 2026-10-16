package K;

import N.C0740o;
import e0.C2465q;

/* loaded from: classes.dex */
public final class u implements M.t {

    /* renamed from: a, reason: collision with root package name */
    public static final u f6296a = new u();

    @Override // M.t
    public final long a(C0740o c0740o) {
        c0740o.M(550536719);
        long j8 = ((C2465q) c0740o.j(AbstractC0684i.f6262a)).f34382a;
        boolean zD = ((C0680e) c0740o.j(AbstractC0682g.f6260a)).d();
        float fL = e0.z.l(j8);
        if (!zD && fL < 0.5d) {
            j8 = C2465q.f34375d;
        }
        c0740o.p(false);
        return j8;
    }

    @Override // M.t
    public final M.g b(C0740o c0740o) {
        c0740o.M(-1419762518);
        M.g gVar = ((C0680e) c0740o.j(AbstractC0682g.f6260a)).d() ? ((double) e0.z.l(((C2465q) c0740o.j(AbstractC0684i.f6262a)).f34382a)) > 0.5d ? M.v.f7216b : M.v.f7217c : M.v.f7218d;
        c0740o.p(false);
        return gVar;
    }
}
