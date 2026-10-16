package E;

import N.C0718d;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3908m;
import r0.InterfaceC3909n;
import t0.C4054b;
import t0.C4056d;
import t0.InterfaceC4055c;
import u0.InterfaceC4193p0;

/* renamed from: E.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0426p {

    /* renamed from: a, reason: collision with root package name */
    public static final C0425o f2763a = new C0425o(Z.a.f16900a, false);

    /* renamed from: b, reason: collision with root package name */
    public static final C0423m f2764b = C0423m.f2753b;

    public static final void a(Z.k modifier, C0740o c0740o, int i5) {
        AbstractC3340k.e(modifier, "modifier");
        c0740o.N(-211209833);
        if ((((c0740o.e(modifier) ? 4 : 2) | i5) & 11) == 2 && c0740o.x()) {
            c0740o.I();
        } else {
            c0740o.M(-1323940314);
            L0.b bVar = (L0.b) c0740o.j(u0.M.f46143e);
            L0.i iVar = (L0.i) c0740o.j(u0.M.k);
            InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o.j(u0.M.f46152o);
            InterfaceC4055c.g9.getClass();
            C4056d c4056d = C4054b.f45453b;
            V.d dVarY = S3.f.y(modifier);
            c0740o.O();
            if (c0740o.f7843O) {
                c0740o.k(c4056d);
            } else {
                c0740o.X();
            }
            c0740o.f7867x = false;
            C0718d.M(c0740o, f2764b, C4054b.f45456e);
            C0718d.M(c0740o, bVar, C4054b.f45455d);
            C0718d.M(c0740o, iVar, C4054b.f45457f);
            wg.b.d(0, dVarY, wg.b.b(c0740o, interfaceC4193p0, C4054b.f45458g, c0740o), c0740o, 2058660585);
            c0740o.M(1021196736);
            c0740o.p(false);
            c0740o.p(false);
            c0740o.p(true);
            c0740o.p(false);
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new C0421k(modifier, i5, 0);
    }

    public static final void b(r0.s sVar, r0.t tVar, InterfaceC3908m interfaceC3908m, L0.i iVar, int i5, int i10, Z.d dVar) {
        Z.d dVar2;
        Object objA = interfaceC3908m.a();
        C0420j c0420j = objA instanceof C0420j ? (C0420j) objA : null;
        long jA = ((c0420j == null || (dVar2 = c0420j.f2746b) == null) ? dVar : dVar2).a(Ba.c.a(tVar.f44307a, tVar.f44308b), Ba.c.a(i5, i10), iVar);
        sVar.getClass();
        r0.s.b(tVar, jA, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public static final InterfaceC3909n c(Z.d dVar, boolean z2, C0740o c0740o) {
        InterfaceC3909n interfaceC3909n;
        c0740o.M(56522820);
        if (!dVar.equals(Z.a.f16900a) || z2) {
            Boolean boolValueOf = Boolean.valueOf(z2);
            c0740o.M(511388516);
            boolean zE = c0740o.e(boolValueOf) | c0740o.e(dVar);
            Object objF = c0740o.F();
            if (zE || objF == C0732k.f7800a) {
                objF = new C0425o(dVar, z2);
                c0740o.U(objF);
            }
            c0740o.p(false);
            interfaceC3909n = (InterfaceC3909n) objF;
        } else {
            interfaceC3909n = f2763a;
        }
        c0740o.p(false);
        return interfaceC3909n;
    }
}
