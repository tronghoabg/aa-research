package c0;

import a2.v;
import ff.AbstractC2641B;
import kotlin.jvm.internal.AbstractC3340k;
import t0.C4046K;
import t0.y;
import u0.C4188n;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final v f19525a = AbstractC2641B.G(C1537b.f19489l);

    public static final void a(C1542g c1542g) {
        C4046K snapshotObserver;
        AbstractC3340k.e(c1542g, "<this>");
        y yVar = c1542g.k;
        if (yVar == null) {
            return;
        }
        l lVar = c1542g.f19505i;
        AbstractC3340k.e(lVar, "<this>");
        lVar.f19516a = true;
        o oVar = o.f19529b;
        AbstractC3340k.e(oVar, "<set-?>");
        lVar.f19517b = oVar;
        lVar.f19518c = oVar;
        lVar.f19519d = oVar;
        lVar.f19520e = oVar;
        lVar.f19521f = oVar;
        lVar.f19522g = oVar;
        lVar.f19523h = oVar;
        lVar.f19524i = oVar;
        C4188n c4188n = yVar.f45561e.f45517g;
        if (c4188n != null && (snapshotObserver = c4188n.getSnapshotObserver()) != null) {
            snapshotObserver.a(c1542g, C1541f.f19497i, new C1544i(c1542g, 1));
        }
        if (lVar.f19516a) {
            xg.g.i(c1542g);
        } else {
            xg.g.w(c1542g);
        }
    }
}
