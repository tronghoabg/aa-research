package com.google.v;

import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class af {

    /* renamed from: a, reason: collision with root package name */
    private final ae f12645a;

    private af(ae aeVar) {
        aeVar.getClass();
        this.f12645a = aeVar;
        aeVar.f12644a = this;
    }

    private static /* synthetic */ void N(af afVar, int i2, List list, boolean z) {
        int i3 = 0;
        if (!(list instanceof ed)) {
            if (!z) {
                while (i3 < list.size()) {
                    afVar.f12645a.m(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            ae aeVar = afVar.f12645a;
            aeVar.t(i2, 2);
            int iJ = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iJ += ae.J(((Integer) list.get(i4)).intValue());
            }
            aeVar.v(iJ);
            while (i3 < list.size()) {
                aeVar.n(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        ed edVar = (ed) list;
        if (!z) {
            while (i3 < edVar.size()) {
                afVar.f12645a.m(i2, edVar.d(i3));
                i3++;
            }
            return;
        }
        ae aeVar2 = afVar.f12645a;
        aeVar2.t(i2, 2);
        int iJ2 = 0;
        for (int i5 = 0; i5 < edVar.size(); i5++) {
            iJ2 += ae.J(edVar.d(i5));
        }
        aeVar2.v(iJ2);
        while (i3 < edVar.size()) {
            aeVar2.n(edVar.d(i3));
            i3++;
        }
    }

    private static /* synthetic */ void O(af afVar, int i2, List list, boolean z) {
        int i3 = 0;
        if (!(list instanceof ed)) {
            if (!z) {
                while (i3 < list.size()) {
                    afVar.f12645a.i(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            ae aeVar = afVar.f12645a;
            aeVar.t(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Integer) list.get(i5)).intValue();
                i4 += 4;
            }
            aeVar.v(i4);
            while (i3 < list.size()) {
                aeVar.j(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        ed edVar = (ed) list;
        if (!z) {
            while (i3 < edVar.size()) {
                afVar.f12645a.i(i2, edVar.d(i3));
                i3++;
            }
            return;
        }
        ae aeVar2 = afVar.f12645a;
        aeVar2.t(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < edVar.size(); i7++) {
            edVar.d(i7);
            i6 += 4;
        }
        aeVar2.v(i6);
        while (i3 < edVar.size()) {
            aeVar2.j(edVar.d(i3));
            i3++;
        }
    }

    private static /* synthetic */ void P(af afVar, int i2, List list, boolean z) {
        int i3 = 0;
        if (!(list instanceof fc)) {
            if (!z) {
                while (i3 < list.size()) {
                    afVar.f12645a.k(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            ae aeVar = afVar.f12645a;
            aeVar.t(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Long) list.get(i5)).longValue();
                i4 += 8;
            }
            aeVar.v(i4);
            while (i3 < list.size()) {
                aeVar.l(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        fc fcVar = (fc) list;
        if (!z) {
            while (i3 < fcVar.size()) {
                afVar.f12645a.k(i2, fcVar.a(i3));
                i3++;
            }
            return;
        }
        ae aeVar2 = afVar.f12645a;
        aeVar2.t(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < fcVar.size(); i7++) {
            fcVar.a(i7);
            i6 += 8;
        }
        aeVar2.v(i6);
        while (i3 < fcVar.size()) {
            aeVar2.l(fcVar.a(i3));
            i3++;
        }
    }

    private static /* synthetic */ void Q(af afVar, int i2, List list, boolean z) {
        int i3 = 0;
        if (!(list instanceof fc)) {
            if (!z) {
                while (i3 < list.size()) {
                    afVar.f12645a.w(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            ae aeVar = afVar.f12645a;
            aeVar.t(i2, 2);
            int iY = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iY += ae.Y(((Long) list.get(i4)).longValue());
            }
            aeVar.v(iY);
            while (i3 < list.size()) {
                aeVar.x(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        fc fcVar = (fc) list;
        if (!z) {
            while (i3 < fcVar.size()) {
                afVar.f12645a.w(i2, fcVar.a(i3));
                i3++;
            }
            return;
        }
        ae aeVar2 = afVar.f12645a;
        aeVar2.t(i2, 2);
        int iY2 = 0;
        for (int i5 = 0; i5 < fcVar.size(); i5++) {
            iY2 += ae.Y(fcVar.a(i5));
        }
        aeVar2.v(iY2);
        while (i3 < fcVar.size()) {
            aeVar2.x(fcVar.a(i3));
            i3++;
        }
    }

    public static af a(ae aeVar) {
        Object obj = aeVar.f12644a;
        return obj != null ? (af) obj : new af(aeVar);
    }

    public final void A(int i2, long j2) {
        this.f12645a.k(i2, j2);
    }

    public final void B(int i2, List list, boolean z) {
        P(this, i2, list, z);
    }

    public final void C(int i2, int i3) {
        this.f12645a.aj(i2, i3);
    }

    public final void D(int i2, List list, boolean z) {
        int i3 = 0;
        if (!(list instanceof ed)) {
            if (!z) {
                while (i3 < list.size()) {
                    this.f12645a.aj(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            ae aeVar = this.f12645a;
            aeVar.t(i2, 2);
            int iP = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iP += ae.P(((Integer) list.get(i4)).intValue());
            }
            aeVar.v(iP);
            while (i3 < list.size()) {
                aeVar.ak(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        ed edVar = (ed) list;
        if (!z) {
            while (i3 < edVar.size()) {
                this.f12645a.aj(i2, edVar.d(i3));
                i3++;
            }
            return;
        }
        ae aeVar2 = this.f12645a;
        aeVar2.t(i2, 2);
        int iP2 = 0;
        for (int i5 = 0; i5 < edVar.size(); i5++) {
            iP2 += ae.P(edVar.d(i5));
        }
        aeVar2.v(iP2);
        while (i3 < edVar.size()) {
            aeVar2.ak(edVar.d(i3));
            i3++;
        }
    }

    public final void E(int i2, long j2) {
        this.f12645a.al(i2, j2);
    }

    public final void F(int i2, List list, boolean z) {
        int i3 = 0;
        if (!(list instanceof fc)) {
            if (!z) {
                while (i3 < list.size()) {
                    this.f12645a.al(i2, ((Long) list.get(i3)).longValue());
                    i3++;
                }
                return;
            }
            ae aeVar = this.f12645a;
            aeVar.t(i2, 2);
            int iR = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iR += ae.R(((Long) list.get(i4)).longValue());
            }
            aeVar.v(iR);
            while (i3 < list.size()) {
                aeVar.am(((Long) list.get(i3)).longValue());
                i3++;
            }
            return;
        }
        fc fcVar = (fc) list;
        if (!z) {
            while (i3 < fcVar.size()) {
                this.f12645a.al(i2, fcVar.a(i3));
                i3++;
            }
            return;
        }
        ae aeVar2 = this.f12645a;
        aeVar2.t(i2, 2);
        int iR2 = 0;
        for (int i5 = 0; i5 < fcVar.size(); i5++) {
            iR2 += ae.R(fcVar.a(i5));
        }
        aeVar2.v(iR2);
        while (i3 < fcVar.size()) {
            aeVar2.am(fcVar.a(i3));
            i3++;
        }
    }

    @Deprecated
    public final void G(int i2) {
        this.f12645a.t(i2, 3);
    }

    public final void H(int i2, String str) {
        this.f12645a.r(i2, str);
    }

    public final void I(int i2, List list) {
        int i3 = 0;
        if (!(list instanceof fb)) {
            while (i3 < list.size()) {
                this.f12645a.r(i2, (String) list.get(i3));
                i3++;
            }
            return;
        }
        fb fbVar = (fb) list;
        while (i3 < list.size()) {
            Object objC = fbVar.c();
            boolean z = objC instanceof String;
            ae aeVar = this.f12645a;
            if (z) {
                aeVar.r(i2, (String) objC);
            } else {
                aeVar.g(i2, (v) objC);
            }
            i3++;
        }
    }

    public final void J(int i2, int i3) {
        this.f12645a.u(i2, i3);
    }

    public final void K(int i2, List list, boolean z) {
        int i3 = 0;
        if (!(list instanceof ed)) {
            if (!z) {
                while (i3 < list.size()) {
                    this.f12645a.u(i2, ((Integer) list.get(i3)).intValue());
                    i3++;
                }
                return;
            }
            ae aeVar = this.f12645a;
            aeVar.t(i2, 2);
            int iW = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                iW += ae.W(((Integer) list.get(i4)).intValue());
            }
            aeVar.v(iW);
            while (i3 < list.size()) {
                aeVar.v(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return;
        }
        ed edVar = (ed) list;
        if (!z) {
            while (i3 < edVar.size()) {
                this.f12645a.u(i2, edVar.d(i3));
                i3++;
            }
            return;
        }
        ae aeVar2 = this.f12645a;
        aeVar2.t(i2, 2);
        int iW2 = 0;
        for (int i5 = 0; i5 < edVar.size(); i5++) {
            iW2 += ae.W(edVar.d(i5));
        }
        aeVar2.v(iW2);
        while (i3 < edVar.size()) {
            aeVar2.v(edVar.d(i3));
            i3++;
        }
    }

    public final void L(int i2, long j2) {
        this.f12645a.w(i2, j2);
    }

    public final void M(int i2, List list, boolean z) {
        Q(this, i2, list, z);
    }

    public final void b(int i2, boolean z) {
        this.f12645a.f(i2, z);
    }

    public final void c(int i2, List list, boolean z) {
        int i3 = 0;
        if (!(list instanceof p)) {
            if (!z) {
                while (i3 < list.size()) {
                    this.f12645a.f(i2, ((Boolean) list.get(i3)).booleanValue());
                    i3++;
                }
                return;
            }
            ae aeVar = this.f12645a;
            aeVar.t(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Boolean) list.get(i5)).booleanValue();
                i4++;
            }
            aeVar.v(i4);
            while (i3 < list.size()) {
                aeVar.d(((Boolean) list.get(i3)).booleanValue() ? (byte) 1 : (byte) 0);
                i3++;
            }
            return;
        }
        p pVar = (p) list;
        if (!z) {
            while (i3 < pVar.size()) {
                this.f12645a.f(i2, pVar.h(i3));
                i3++;
            }
            return;
        }
        ae aeVar2 = this.f12645a;
        aeVar2.t(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < pVar.size(); i7++) {
            pVar.h(i7);
            i6++;
        }
        aeVar2.v(i6);
        while (i3 < pVar.size()) {
            aeVar2.d(pVar.h(i3) ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    public final void d(int i2, v vVar) {
        this.f12645a.g(i2, vVar);
    }

    public final void e(int i2, List list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f12645a.g(i2, (v) list.get(i3));
        }
    }

    public final void f(int i2, double d2) {
        this.f12645a.ae(i2, d2);
    }

    public final void g(int i2, List list, boolean z) {
        int i3 = 0;
        if (!(list instanceof cz)) {
            if (!z) {
                while (i3 < list.size()) {
                    this.f12645a.ae(i2, ((Double) list.get(i3)).doubleValue());
                    i3++;
                }
                return;
            }
            ae aeVar = this.f12645a;
            aeVar.t(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Double) list.get(i5)).doubleValue();
                i4 += 8;
            }
            aeVar.v(i4);
            while (i3 < list.size()) {
                aeVar.af(((Double) list.get(i3)).doubleValue());
                i3++;
            }
            return;
        }
        cz czVar = (cz) list;
        if (!z) {
            while (i3 < czVar.size()) {
                this.f12645a.ae(i2, czVar.d(i3));
                i3++;
            }
            return;
        }
        ae aeVar2 = this.f12645a;
        aeVar2.t(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < czVar.size(); i7++) {
            czVar.d(i7);
            i6 += 8;
        }
        aeVar2.v(i6);
        while (i3 < czVar.size()) {
            aeVar2.af(czVar.d(i3));
            i3++;
        }
    }

    @Deprecated
    public final void h(int i2) {
        this.f12645a.t(i2, 4);
    }

    public final void i(int i2, int i3) {
        this.f12645a.m(i2, i3);
    }

    public final void j(int i2, List list, boolean z) {
        N(this, i2, list, z);
    }

    public final void k(int i2, int i3) {
        this.f12645a.i(i2, i3);
    }

    public final void l(int i2, List list, boolean z) {
        O(this, i2, list, z);
    }

    public final void m(int i2, long j2) {
        this.f12645a.k(i2, j2);
    }

    public final void n(int i2, List list, boolean z) {
        P(this, i2, list, z);
    }

    public final void o(int i2, float f2) {
        this.f12645a.ag(i2, f2);
    }

    public final void p(int i2, List list, boolean z) {
        int i3 = 0;
        if (!(list instanceof dj)) {
            if (!z) {
                while (i3 < list.size()) {
                    this.f12645a.ag(i2, ((Float) list.get(i3)).floatValue());
                    i3++;
                }
                return;
            }
            ae aeVar = this.f12645a;
            aeVar.t(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Float) list.get(i5)).floatValue();
                i4 += 4;
            }
            aeVar.v(i4);
            while (i3 < list.size()) {
                aeVar.ah(((Float) list.get(i3)).floatValue());
                i3++;
            }
            return;
        }
        dj djVar = (dj) list;
        if (!z) {
            while (i3 < djVar.size()) {
                this.f12645a.ag(i2, djVar.d(i3));
                i3++;
            }
            return;
        }
        ae aeVar2 = this.f12645a;
        aeVar2.t(i2, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < djVar.size(); i7++) {
            djVar.d(i7);
            i6 += 4;
        }
        aeVar2.v(i6);
        while (i3 < djVar.size()) {
            aeVar2.ah(djVar.d(i3));
            i3++;
        }
    }

    public final void q(int i2, Object obj, ft ftVar) {
        ae aeVar = this.f12645a;
        aeVar.t(i2, 3);
        ftVar.j((c) obj, this);
        aeVar.t(i2, 4);
    }

    public final void r(int i2, int i3) {
        this.f12645a.m(i2, i3);
    }

    public final void s(int i2, List list, boolean z) {
        N(this, i2, list, z);
    }

    public final void t(int i2, long j2) {
        this.f12645a.w(i2, j2);
    }

    public final void u(int i2, List list, boolean z) {
        Q(this, i2, list, z);
    }

    public final void v(int i2, fd fdVar, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ae aeVar = this.f12645a;
            aeVar.t(i2, 2);
            aeVar.v(fe.b(fdVar, entry.getKey(), entry.getValue()));
            fe.e(aeVar, fdVar, entry.getKey(), entry.getValue());
        }
    }

    public final void w(int i2, Object obj, ft ftVar) {
        ae aeVar = this.f12645a;
        c cVar = (c) obj;
        aeVar.t(i2, 2);
        aeVar.v(cVar.getSerializedSize(ftVar));
        ftVar.j(cVar, this);
    }

    public final void x(int i2, Object obj) {
        boolean z = obj instanceof v;
        ae aeVar = this.f12645a;
        if (z) {
            aeVar.q(i2, (v) obj);
        } else {
            aeVar.p(i2, (fi) obj);
        }
    }

    public final void y(int i2, int i3) {
        this.f12645a.i(i2, i3);
    }

    public final void z(int i2, List list, boolean z) {
        O(this, i2, list, z);
    }
}
