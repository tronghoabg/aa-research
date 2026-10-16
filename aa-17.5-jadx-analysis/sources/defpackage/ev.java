package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
final class ev implements gk {
    final /* synthetic */ fe a;
    private final gk b;

    public ev(fe feVar, gk gkVar) {
        this.a = feVar;
        this.b = gkVar;
    }

    @Override // defpackage.gk
    public final void a(gl glVar) {
        gn gnVar = (gn) this.b;
        gnVar.a.onDestroyActionMode(gnVar.e(glVar));
        fe feVar = this.a;
        if (feVar.s != null) {
            feVar.l.getDecorView().removeCallbacks(feVar.t);
        }
        if (feVar.r != null) {
            feVar.G();
            erb erbVarV = ebm.v(feVar.r);
            erbVarV.u(BitmapDescriptorFactory.HUE_RED);
            feVar.J = erbVarV;
            feVar.J.w(new eu(this));
        }
        feVar.q = null;
        ViewGroup viewGroup = feVar.v;
        int[] iArr = ebm.a;
        viewGroup.requestApplyInsets();
        feVar.J();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gk
    public final boolean b(gl glVar, MenuItem menuItem) {
        gn gnVar = (gn) this.b;
        return gnVar.a.onActionItemClicked(gnVar.e(glVar), new hn(gnVar.b, menuItem));
    }

    @Override // defpackage.gk
    public final boolean c(gl glVar, Menu menu) {
        gn gnVar = (gn) this.b;
        return gnVar.a.onCreateActionMode(gnVar.e(glVar), gnVar.f(menu));
    }

    @Override // defpackage.gk
    public final void d(gl glVar, Menu menu) {
        ViewGroup viewGroup = this.a.v;
        int[] iArr = ebm.a;
        viewGroup.requestApplyInsets();
        gn gnVar = (gn) this.b;
        gnVar.a.onPrepareActionMode(gnVar.e(glVar), gnVar.f(menu));
    }
}
