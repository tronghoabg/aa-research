package com.moloco.sdk.internal;

import E.F;
import N.C0740o;
import com.moloco.sdk.internal.ortb.model.C1888b;
import com.moloco.sdk.internal.ortb.model.C1894h;
import com.moloco.sdk.internal.ortb.model.C1896j;
import com.moloco.sdk.internal.ortb.model.Z;
import com.moloco.sdk.internal.ortb.model.f0;
import com.moloco.sdk.internal.ortb.model.h0;
import com.wynauto.wyn.R;
import e0.C2465q;
import ef.C2537u;
import ff.AbstractC2641B;
import h0.AbstractC2765c;
import ka.AbstractC3230e0;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class h implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28525a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f28526b;

    public /* synthetic */ h(h0 h0Var, int i5) {
        this.f28525a = i5;
        this.f28526b = h0Var;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        long jB;
        V.d dVarD;
        C2465q c2465q;
        V.d dVarD2;
        V.d dVarC;
        V.d dVarC2;
        switch (this.f28525a) {
            case 0:
                C0740o c0740o = (C0740o) obj;
                ((Number) obj2).intValue();
                c0740o.M(1012987991);
                h0 h0Var = this.f28526b;
                C2537u c2537u = h0Var.f28823d.f28806f;
                if (c2537u != null) {
                    float f10 = c2537u.f34686a;
                    jB = A6.c.b(f10, f10);
                } else {
                    jB = i.f28533d;
                }
                long j8 = jB;
                f0 f0Var = h0Var.f28823d;
                Z.d dVarB = i.b(f0Var.f28803c, f0Var.f28804d);
                float f11 = f0Var.f28802b;
                F f12 = new F(f11, f11, f11, f11);
                long jC = L0.f.c(j8, 0.6f);
                C2465q c2465q2 = f0Var.f28807g;
                V.d dVarB2 = AbstractC3935e.b(j8, jC, c2465q2 != null ? c2465q2.f34382a : i.f28531b, dVarB, f12, f0Var.f28805e, AbstractC2641B.H(R.drawable.moloco_volume_off, c0740o), AbstractC2641B.H(R.drawable.moloco_volume_on, c0740o), c0740o, 516);
                c0740o.p(false);
                return dVarB2;
            case 1:
                C0740o c0740o2 = (C0740o) obj;
                ((Number) obj2).intValue();
                c0740o2.M(-474197615);
                h0 h0Var2 = this.f28526b;
                C1894h c1894h = h0Var2.f28820a;
                if (c1894h == null) {
                    dVarD = null;
                } else {
                    int i5 = c1894h.f28815c;
                    float f13 = i5;
                    long jB2 = A6.c.b(f13, f13);
                    Z z2 = h0Var2.f28831m;
                    long j10 = (z2 == null || (c2465q = z2.f28764d) == null) ? c1894h.f28818f : c2465q.f34382a;
                    Z.d dVarB3 = i.b(c1894h.f28816d, c1894h.f28817e);
                    float f14 = c1894h.f28814b;
                    F f15 = new F(f14, f14, f14, f14);
                    long jE = Fe.b.E(i5);
                    Fe.b.j(jE);
                    long jM = Fe.b.M(1095216660480L & jE, L0.j.c(jE) / 2);
                    long jC2 = L0.f.c(jB2, 0.4f);
                    C2465q c2465q3 = c1894h.f28819g;
                    dVarD = ic.d.d(dVarB3, f15, j10, jB2, jM, i.c(jC2, c2465q3 != null ? c2465q3.f34382a : i.f28531b, j10, h0Var2.f28831m, c0740o2), h0Var2.f28829j, c0740o2, 64);
                }
                c0740o2.p(false);
                return dVarD;
            case 2:
                C0740o c0740o3 = (C0740o) obj;
                ((Number) obj2).intValue();
                c0740o3.M(-606521360);
                h0 h0Var3 = this.f28526b;
                C1894h c1894h2 = h0Var3.f28820a;
                if (c1894h2 == null) {
                    dVarD2 = null;
                } else {
                    int i10 = c1894h2.f28815c;
                    float f16 = i10;
                    long jB3 = A6.c.b(f16, f16);
                    Z.d dVarB4 = i.b(c1894h2.f28816d, c1894h2.f28817e);
                    float f17 = c1894h2.f28814b;
                    F f18 = new F(f17, f17, f17, f17);
                    long jE2 = Fe.b.E(i10);
                    Fe.b.j(jE2);
                    long jM2 = Fe.b.M(1095216660480L & jE2, L0.j.c(jE2) / 2);
                    AbstractC2765c abstractC2765cH = AbstractC2641B.H(R.drawable.moloco_skip, c0740o3);
                    long jC3 = L0.f.c(jB3, 0.4f);
                    C2465q c2465q4 = c1894h2.f28819g;
                    dVarD2 = ic.d.d(dVarB4, f18, c1894h2.f28818f, jB3, jM2, ic.d.f(abstractC2765cH, jC3, c2465q4 != null ? c2465q4.f34382a : i.f28531b, c0740o3, 4), h0Var3.f28829j, c0740o3, 64);
                    c0740o3 = c0740o3;
                }
                c0740o3.p(false);
                return dVarD2;
            case 3:
                C0740o c0740o4 = (C0740o) obj;
                ((Number) obj2).intValue();
                c0740o4.M(830314579);
                C1888b c1888b = this.f28526b.f28822c;
                if (c1888b == null) {
                    dVarC = null;
                } else {
                    Z.d dVarB5 = i.b(c1888b.f28774b, c1888b.f28775c);
                    float f19 = c1888b.f28773a;
                    dVarC = AbstractC3935e.c(dVarB5, new F(f19, f19, f19, f19), c1888b.f28776d, c0740o4, 0);
                }
                c0740o4.p(false);
                return dVarC;
            default:
                C0740o c0740o5 = (C0740o) obj;
                ((Number) obj2).intValue();
                c0740o5.M(392356305);
                C1896j c1896j = this.f28526b.f28827h;
                c0740o5.M(-1135715087);
                if (c1896j == null) {
                    dVarC2 = null;
                } else {
                    Z.d dVarB6 = i.b(c1896j.f28836b, c1896j.f28837c);
                    float f20 = c1896j.f28835a;
                    dVarC2 = AbstractC3230e0.c(dVarB6, new F(f20, f20, f20, f20), c0740o5, 0);
                }
                c0740o5.p(false);
                if (dVarC2 == null) {
                    dVarC2 = AbstractC3230e0.c(null, null, c0740o5, 3);
                }
                c0740o5.p(false);
                return dVarC2;
        }
    }
}
