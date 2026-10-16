package M;

import A.C0225s;
import A.Z;
import N.C0718d;
import N.C0732k;
import N.C0740o;
import N.V;
import e0.C2465q;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final Z f7213a = new Z(15, C0225s.f182a, 0);

    public static final e a(C0740o c0740o, int i5, int i10) {
        c0740o.M(1635163520);
        V vI = C0718d.I(new C2465q(C2465q.f34380i), c0740o);
        L0.d dVar = new L0.d(Float.NaN);
        c0740o.M(-3686552);
        boolean zE = c0740o.e(true) | c0740o.e(dVar);
        Object objF = c0740o.F();
        if (zE || objF == C0732k.f7800a) {
            objF = new e(true, vI);
            c0740o.U(objF);
        }
        c0740o.p(false);
        e eVar = (e) objF;
        c0740o.p(false);
        return eVar;
    }
}
