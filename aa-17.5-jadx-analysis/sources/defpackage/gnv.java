package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.ActionStrip;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.navigation.model.MapController;
import com.android.car.libraries.apphost.basewidgets.PanOverlayView;

/* loaded from: classes2.dex */
public abstract class gnv extends hld {
    public hlo a;
    public final gei b;
    private final epz c;

    public gnv(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        super(geuVar, templateWrapper, gzcVar);
        qy qyVar = new qy(this, 2);
        this.c = qyVar;
        this.j.c(qyVar);
        hem hemVarL = geuVar.l(gei.class);
        hemVarL.getClass();
        this.b = (gei) hemVarL;
    }

    public static final gzc q(geu geuVar) {
        hem hemVarL = geuVar.l(gsf.class);
        hemVarL.getClass();
        return ((gsf) hemVarL).c() ? gzc.d : gzc.e;
    }

    public static final int r(boolean z) {
        return z ? 0 : 8;
    }

    private final void t(boolean z, boolean z2) {
        gev.c(new jol(z, this, z2, 1));
    }

    private final boolean u() {
        hrj hrjVar = (hrj) this.b.a.e();
        return hrjVar != null && hrjVar.a == 1;
    }

    @Override // defpackage.hlf
    protected final View a() {
        if (j().getVisibility() == 0) {
            return j();
        }
        View viewE = e();
        viewE.getClass();
        return viewE;
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void b() {
        this.j.d(this.c);
        this.a = null;
        super.b();
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void c() {
        super.c();
        this.i.B().b(this, 7, new gnu(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.hlf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gnv.d():void");
    }

    public abstract View f();

    public abstract View h();

    @Override // defpackage.hlf, defpackage.hlo
    public final boolean i(int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (((hld) this).d.d(i)) {
            return true;
        }
        if (i == 21) {
            yfq yfqVarQ = yfq.q(f());
            ViewGroup viewGroupJ = j();
            viewGroupJ.getClass();
            if (hlf.J(yfqVarQ, yfq.q(viewGroupJ), false)) {
                return true;
            }
        } else if (i == 22) {
            ViewGroup viewGroupJ2 = j();
            viewGroupJ2.getClass();
            if (hlf.J(yfq.q(viewGroupJ2), yfq.q(f()), false)) {
                return true;
            }
        }
        return false;
    }

    public abstract ViewGroup j();

    public abstract TemplateWrapper k(wb wbVar);

    public abstract PanOverlayView l();

    @Override // defpackage.hld, defpackage.hlk
    public final void m(boolean z) {
        xc panModeDelegate;
        gpf gpfVar = (gpf) this.k.getTemplate();
        t(z, u());
        geu geuVar = this.i;
        geuVar.getClass();
        MapController mapController = gpfVar.a.getMapController();
        if (mapController == null || (panModeDelegate = mapController.getPanModeDelegate()) == null) {
            return;
        }
        geuVar.t().n(panModeDelegate, z);
    }

    @Override // defpackage.hlf, defpackage.hlo
    public final void n() {
        this.i.B().c(this, 7);
        super.n();
    }

    public abstract void o(ActionStrip actionStrip);

    @Override // defpackage.hld
    public final boolean p() {
        geu geuVar = this.i;
        return ((ggk) geuVar.F(ggk.class)).w() && geuVar.i().c() >= 4;
    }

    public abstract gjv s();
}
