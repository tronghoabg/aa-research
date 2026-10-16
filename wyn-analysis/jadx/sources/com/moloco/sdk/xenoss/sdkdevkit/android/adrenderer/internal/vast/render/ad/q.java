package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import E5.Q;
import Ef.H;
import Ef.H0;
import Ef.S;
import Hf.C0588a0;
import Hf.Z;
import Hf.e0;
import Hf.j0;
import Hf.k0;
import Hf.u0;
import Hf.v0;
import Hf.x0;
import Va.Y7;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.G;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C2103c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class q implements y, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f31641a;

    /* renamed from: b, reason: collision with root package name */
    public final Y7 f31642b;

    /* renamed from: c, reason: collision with root package name */
    public final Kd.a f31643c;

    /* renamed from: d, reason: collision with root package name */
    public final x0 f31644d;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f31645e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f31646f;

    /* renamed from: g, reason: collision with root package name */
    public final X2.j f31647g;

    /* renamed from: h, reason: collision with root package name */
    public final j0 f31648h;

    /* renamed from: i, reason: collision with root package name */
    public final j0 f31649i;

    public q(ArrayList arrayList, Y7 y72) {
        Z z2;
        Z z10;
        int i5 = 0;
        this.f31641a = arrayList;
        this.f31642b = y72;
        Lf.e eVar = S.f3698a;
        Kd.a aVarC = H.c(Jf.n.f6132a);
        this.f31643c = aVarC;
        x0 x0VarC = k0.c(null);
        this.f31644d = x0VarC;
        this.f31645e = k0.x(new Z(x0VarC, this, 1), aVarC, new u0(), null);
        Y3.l lVar = new Y3.l(x0VarC, 2);
        u0 u0Var = new u0();
        Boolean bool = Boolean.FALSE;
        this.f31646f = k0.x(lVar, aVarC, u0Var, bool);
        x0 x0VarC2 = k0.c(null);
        H.D(aVarC, null, new s(x0VarC, x0VarC2, null), 3);
        k0.x(new C0588a0(x0VarC, x0VarC2, new m(this, null)), aVarC, new u0(), bool);
        this.f31647g = new X2.j(x0VarC, aVarC);
        H.D(aVarC, null, new f(this, null), 3);
        j0 j0VarB = k0.b(0, 0, 7);
        this.f31648h = j0VarB;
        this.f31649i = j0VarB;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            D d3 = (D) it.next();
            if (d3 instanceof z) {
                z10 = new Z(((z) d3).f31664a.f31694l, new g(this, (z) d3, null), i5);
            } else {
                if (d3 instanceof B) {
                    z2 = new Z(((B) d3).f31603a.f32033g, new h(this, null), i5);
                } else if (d3 instanceof A) {
                    z2 = new Z(((A) d3).f31602a.f31975g, new j(this, null), i5);
                } else {
                    if (!(d3 instanceof C)) {
                        throw new Q((byte) 0, 9);
                    }
                    z2 = new Z(((C) d3).f31604a.f30453g, new l(this, null), i5);
                }
                z10 = z2;
            }
            k0.u(z10, this.f31643c);
        }
    }

    public final void a() {
        D d3 = (D) ff.o.s0(this.f31641a);
        if (d3 == null) {
            return;
        }
        d(d3);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.List] */
    public final void b() {
        ?? r12;
        x0 x0Var = this.f31644d;
        D d3 = (D) x0Var.getValue();
        ArrayList arrayList = this.f31641a;
        D d5 = (D) ff.o.t0(arrayList.indexOf(d3) + 1, arrayList);
        A a5 = d5 instanceof A ? (A) d5 : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c cVar = a5 != null ? a5.f31602a : null;
        if (cVar != null) {
            C6.l lVar = cVar.f31973e;
            List list = (List) lVar.f1847d;
            if (list != null) {
                G.g((L0) lVar.f1849f, list, null, 14);
                lVar.f1847d = null;
            }
        }
        D d10 = (D) ff.o.t0(arrayList.indexOf(x0Var.getValue()) + 1, arrayList);
        if (d10 != null) {
            d(d10);
            return;
        }
        Y7 y72 = this.f31642b;
        if (y72 != null && (r12 = y72.f13867a) != 0) {
            G.g((L0) y72.f13869c, r12, null, 14);
            y72.f13867a = null;
        }
        c(C2099b.f31609d);
    }

    public final H0 c(AbstractC2101d abstractC2101d) {
        return H.D(this.f31643c, null, new n(abstractC2101d, this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    public final void d(D d3) {
        this.f31644d.j(d3);
        if (d3 instanceof B) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h hVar = ((B) d3).f31603a;
            boolean zBooleanValue = ((Boolean) hVar.f32048w.getValue()).booleanValue();
            x0 x0Var = hVar.k;
            if (!zBooleanValue && ((Number) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z) x0Var.getValue()).f32100a).longValue() == 0 && hVar.f32026A == 0) {
                return;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z zVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.z(0L);
            x0Var.getClass();
            x0Var.k(null, zVar);
            Boolean bool = Boolean.FALSE;
            x0 x0Var2 = hVar.f32038m;
            x0Var2.getClass();
            x0Var2.k(null, bool);
            Integer numValueOf = Integer.valueOf(hVar.f32026A);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l lVar = hVar.f32049x;
            ?? r42 = lVar.f32063g;
            if (r42 != 0) {
                lVar.k.a(r42, null, numValueOf, hVar.f32034h);
            }
            hVar.f32051z = false;
            hVar.f32026A = 0;
            x0 x0Var3 = (x0) hVar.f32050y.f10162f;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e.f31979a;
            x0Var3.getClass();
            x0Var3.k(null, eVar);
            x0 x0Var4 = hVar.f32045t;
            x0Var4.getClass();
            x0Var4.k(null, bool);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final void destroy() {
        H.j(this.f31643c, null);
        Iterator it = this.f31641a.iterator();
        while (it.hasNext()) {
            D d3 = (D) it.next();
            if (d3 instanceof z) {
                ((z) d3).f31664a.destroy();
            } else if (d3 instanceof B) {
                ((B) d3).f31603a.destroy();
            } else if (d3 instanceof A) {
                ((A) d3).f31602a.destroy();
            } else {
                if (!(d3 instanceof C)) {
                    throw new Q((byte) 0, 9);
                }
                ((C) d3).f31604a.destroy();
            }
        }
        d(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d r19) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q.e(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    public final void f() {
        if (this.f31647g.l().getValue() instanceof C2103c) {
            Object value = this.f31644d.getValue();
            B b5 = value instanceof B ? (B) value : null;
            if (b5 == null) {
                b();
                return;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h hVar = b5.f31603a;
            hVar.f32051z = true;
            Integer numValueOf = Integer.valueOf(hVar.f32026A);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l lVar = hVar.f32049x;
            ?? r42 = lVar.f32064h;
            if (r42 != 0) {
                lVar.k.a(r42, null, numValueOf, hVar.f32034h);
            }
            String str = hVar.f32027a.f31992e;
            if (str != null) {
                hVar.f32030d.d(str);
            }
            hVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b.f32017d);
            if (hVar.f32028b) {
                hVar.b(false, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.i.f32052a);
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g
    public final v0 l() {
        return this.f31647g.l();
    }
}
