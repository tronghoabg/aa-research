package com.waze.map;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.map.b.Cdo;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class fv implements com.waze.map.canvas.a.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gb f29026a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cx f29027b;

    fv(cx cxVar, gb gbVar) {
        this.f29027b = cxVar;
        this.f29026a = gbVar;
    }

    @Override // com.waze.map.canvas.a.c
    public final void a(String str) {
        h.g.b.x.f(str, "adId");
        this.f29027b.j().invoke(new com.waze.map.b.cu(str));
    }

    @Override // com.waze.map.canvas.a.c
    public final void b(int i2, com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(cVar, "coordinate");
        this.f29027b.j().invoke(new com.waze.map.b.cv(i2, cVar));
    }

    @Override // com.waze.map.canvas.a.c
    public final void c(int i2, com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(cVar, "coordinate");
        this.f29027b.j().invoke(new com.waze.map.b.cw(i2, cVar));
    }

    @Override // com.waze.map.canvas.a.c
    public final void d(com.waze.map.b.dw dwVar) {
        h.g.b.x.f(dwVar, "point");
        this.f29027b.j().invoke(com.waze.map.b.cx.f28173a);
    }

    @Override // com.waze.map.canvas.a.c
    public final void e(com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(cVar, "coordinate");
        this.f29027b.j().invoke(new com.waze.map.b.da(cVar));
    }

    @Override // com.waze.map.canvas.a.c
    public final void f(com.waze.map.b.cs csVar) {
        this.f29027b.i().invoke(csVar);
    }

    @Override // com.waze.map.canvas.a.c
    public final void g() {
        this.f29027b.j().invoke(com.waze.map.b.cy.f28174a);
    }

    @Override // com.waze.map.canvas.a.c
    public final void h(String str) {
        h.g.b.x.f(str, "markerId");
        h.g.a.l lVarO = this.f29027b.o();
        ct.d(str);
        lVarO.invoke(ct.a(str));
    }

    @Override // com.waze.map.canvas.a.c
    public final void i(com.waze.map.b.dk dkVar) {
        h.g.b.x.f(dkVar, "movement");
        this.f29027b.k().invoke(dkVar);
    }

    @Override // com.waze.map.canvas.a.c
    public final void j(Cdo cdo) {
        this.f29027b.l().invoke(cdo);
    }

    @Override // com.waze.map.canvas.a.c
    public final void k(int i2, com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(cVar, "coordinate");
        this.f29027b.j().invoke(new com.waze.map.b.dc(i2, cVar));
    }

    @Override // com.waze.map.canvas.a.c
    public final void l(com.waze.shared_infra.h.c cVar, com.waze.map.b.cg cgVar) {
        h.g.b.x.f(cVar, "coordinate");
        h.g.b.x.f(cgVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f29027b.j().invoke(new com.waze.map.b.dd(cVar, cgVar));
    }

    @Override // com.waze.map.canvas.a.c
    public final void m(String str) {
        String strX;
        h.g.b.x.f(str, "polylineTag");
        this.f29026a.f29133f.a("onPolylineClicked(polylineTag:" + str + ")");
        Long lH = null;
        String str2 = true != h.n.o.ah(str, "%alt_route%") ? null : str;
        if (str2 != null && (strX = h.n.o.x(str2, "%alt_route%")) != null) {
            lH = h.n.o.h(strX);
        }
        cx cxVar = this.f29027b;
        if (lH != null) {
            cxVar.j().invoke(new com.waze.map.b.de(lH.longValue()));
            return;
        }
        h.g.a.l lVarP = cxVar.p();
        ct.d(str);
        lVarP.invoke(ct.a(str));
    }

    @Override // com.waze.map.canvas.a.c
    public final void n(long j2) {
        this.f29027b.j().invoke(new com.waze.map.b.de(j2));
    }

    @Override // com.waze.map.canvas.a.c
    public final void o(com.waze.map.b.dx dxVar) {
        h.g.b.x.f(dxVar, "skin");
        this.f29027b.m().invoke(dxVar);
    }

    @Override // com.waze.map.canvas.a.c
    public final void p() {
        this.f29027b.j().invoke(com.waze.map.b.dh.f28189a);
    }

    @Override // com.waze.map.canvas.a.c
    public final void q(com.waze.map.b.dm dmVar) {
        this.f29027b.n().invoke(dmVar);
        com.waze.shared_infra.h.c cVarE = dmVar != null ? dmVar.e() : null;
        if (cVarE == null || h.g.b.x.n(cVarE, com.waze.shared_infra.h.c.f37873a) || h.g.b.x.n(cVarE, com.waze.shared_infra.h.c.f37874b)) {
            return;
        }
        gb.r(this.f29026a, null, null, true, 3);
    }

    @Override // com.waze.map.canvas.a.c
    public final void r(int i2, com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(cVar, "coordinate");
        this.f29027b.j().invoke(new com.waze.map.b.di(i2, cVar));
    }
}
