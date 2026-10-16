package defpackage;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class htr implements iev, iej {
    public volatile htw a;
    public final List b;
    public final hdq c;
    private volatile ief d;
    private volatile Object e;
    private final aixv f;

    public htr(aixv aixvVar, hdq hdqVar) {
        aixvVar.getClass();
        this.f = aixvVar;
        this.c = hdqVar;
        this.b = new ArrayList();
        if (hdqVar instanceof htt) {
            this.a = ((htt) hdqVar).a;
        } else {
            if (!(hdqVar instanceof htq)) {
                throw new aezs();
            }
            ahnc.d(aixvVar, null, 0, new dmx(this, (afck) null, 10), 3);
        }
    }

    @Override // defpackage.iev
    public final void a(Drawable drawable) {
        this.e = null;
        this.f.j(new htu(htx.a, drawable));
    }

    @Override // defpackage.iev
    public final void b(Drawable drawable) {
        this.f.j(new htu(htx.d, drawable));
    }

    @Override // defpackage.iev
    public final void c(Object obj, ife ifeVar) {
        this.e = obj;
        ief iefVar = this.d;
        this.f.j(new htv((iefVar == null || !iefVar.l()) ? htx.b : htx.c, obj));
    }

    @Override // defpackage.iev
    public final ief d() {
        return this.d;
    }

    @Override // defpackage.iev
    public final void e(ieu ieuVar) {
        htw htwVar = this.a;
        if (htwVar != null) {
            ieuVar.e(htwVar.a, htwVar.b);
            return;
        }
        synchronized (this) {
            htw htwVar2 = this.a;
            if (htwVar2 != null) {
                ieuVar.e(htwVar2.a, htwVar2.b);
            } else {
                this.b.add(ieuVar);
            }
        }
    }

    @Override // defpackage.iev
    public final void f(Drawable drawable) {
        this.e = null;
        this.f.j(new htu(htx.b, drawable));
    }

    @Override // defpackage.iej
    public final boolean fh(hwt hwtVar, Object obj, iev ievVar) {
        Object obj2 = this.e;
        ief iefVar = this.d;
        if (obj2 == null || iefVar == null || iefVar.l() || iefVar.n()) {
            return false;
        }
        this.f.j(new htv(htx.d, obj2));
        return false;
    }

    @Override // defpackage.iej
    public final boolean fi(Object obj, Object obj2, iev ievVar, int i) {
        return false;
    }

    @Override // defpackage.iev
    public final void g(ieu ieuVar) {
        synchronized (this) {
            this.b.remove(ieuVar);
        }
    }

    @Override // defpackage.iev
    public final void h(ief iefVar) {
        this.d = iefVar;
    }

    @Override // defpackage.idh
    public final void j() {
    }

    @Override // defpackage.idh
    public final void k() {
    }

    @Override // defpackage.idh
    public final void l() {
    }
}
