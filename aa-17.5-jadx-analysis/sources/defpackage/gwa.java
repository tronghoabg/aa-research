package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.car.app.model.TemplateWrapper;

/* loaded from: classes2.dex */
public final class gwa extends hld {
    public final gfh a;
    public hju b;
    public final ajab c;
    private aivh g;
    private gwc h;

    public gwa(TemplateWrapper templateWrapper, geu geuVar, gzc gzcVar, gfh gfhVar) {
        super(geuVar, templateWrapper, gzcVar);
        this.a = gfhVar;
        this.c = ajac.a(false);
        d();
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void b() {
        Object objB;
        gwc gwcVar = this.h;
        if (gwcVar != null && (objB = gwcVar.b()) != null) {
            ((gyz) this.i.F(gyz.class)).a(this.k.getId(), objB);
        }
        super.b();
    }

    @Override // defpackage.hlf
    public final void d() {
        gwc gwcVar = ((gza) this.k.getTemplate()).a;
        Object obj = ((gyz) this.i.F(gyz.class)).b.get(this.k.getId());
        if (obj == null) {
            obj = null;
        }
        gwcVar.c(obj);
        aivh aivhVar = this.g;
        if (aivhVar != null) {
            aivhVar.s(null);
        }
        this.h = gwcVar;
        this.c.d(gwcVar.p.b());
        this.g = ahnc.d(dty.f(this), null, 0, new bsk(gwcVar, this, (afck) null, 2), 3);
    }

    @Override // defpackage.hlo
    public final View e() {
        return this.a.a();
    }

    @Override // defpackage.hld, defpackage.hlf, defpackage.hlo
    public final boolean fc() {
        if (this.o.a()) {
            return true;
        }
        hju hjuVar = this.b;
        hjt hjtVar = hjuVar instanceof hjt ? (hjt) hjuVar : null;
        if (hjtVar != null) {
            return hjtVar.j;
        }
        return false;
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void fd(TemplateWrapper templateWrapper) {
        Object objB;
        gza gzaVar = (gza) C();
        gza gzaVar2 = (gza) templateWrapper.getTemplate();
        if (templateWrapper.isRefresh()) {
            gwc gwcVar = gzaVar.a;
            gwc gwcVar2 = gzaVar2.a;
            geu geuVar = this.i;
            geuVar.getClass();
            if (gwcVar2.getClass() == gwcVar.getClass()) {
                try {
                    Object objB2 = gwcVar2.n.b();
                    objB2.getClass();
                    gwcVar.g((gmw) objB2);
                    gwcVar.h((gzc) gwcVar2.o.b());
                    this.k.setId(templateWrapper.getId());
                    return;
                } catch (ClassCastException e) {
                    gnf gnfVar = (gnf) geuVar.F(gnf.class);
                    Object objB3 = gnfVar.b(gwcVar.getClass());
                    Object objB4 = gnfVar.b(gwcVar2.getClass());
                    Object objB5 = gwcVar2.n.b();
                    objB5.getClass();
                    ((ynz) ((ynz) gno.b.g().o(ypi.a, "CarApp.H.Pipeline")).ai(59)).R("Failed to refresh emitter. Current Emitter [%s], incoming emitter [%s], incoming internal model [%s]", objB3, objB4, gnfVar.b(objB5.getClass()));
                    throw e;
                }
            }
        }
        gwc gwcVar3 = this.h;
        if (gwcVar3 != null && (objB = gwcVar3.b()) != null) {
            ((gyz) this.i.F(gyz.class)).a(this.k.getId(), objB);
        }
        super.fd(templateWrapper);
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final boolean fe() {
        return true;
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final boolean ff() {
        return true;
    }

    @Override // defpackage.hlf
    protected final boolean fg(int i, int i2) {
        return false;
    }

    @Override // defpackage.hld
    public final void fb() {
    }

    @Override // defpackage.hld
    public final void fa(Rect rect, Rect rect2) {
    }
}
