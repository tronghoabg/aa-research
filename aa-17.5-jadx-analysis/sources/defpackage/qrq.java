package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class qrq extends qqh implements eqa, eru, epo, fbg, or, dur, dus {
    private final fbf a;
    private ert b;
    private erq c;
    private final CopyOnWriteArrayList d;
    public final ov f = new ov();
    public final eqc g;
    public final qrp h;
    public final CopyOnWriteArrayList i;
    final jyk j;
    public final bii k;
    private final CopyOnWriteArrayList l;

    public qrq() {
        eqc eqcVar = new eqc(this, true);
        this.g = eqcVar;
        fbf fbfVarL = ebi.l(this);
        this.a = fbfVarL;
        this.k = new bii(new nwg(this, 6, null));
        qrp qrpVar = new qrp(this);
        this.h = qrpVar;
        this.j = new jyk(qrpVar);
        this.d = new CopyOnWriteArrayList();
        this.l = new CopyOnWriteArrayList();
        this.i = new CopyOnWriteArrayList();
        eqcVar.c(new mfs(this, 3));
        eqcVar.c(new mfs(this, 4));
        if (Build.VERSION.SDK_INT >= 33) {
            rbe.g(Looper.getMainLooper(), new nwg(this, 5));
        }
        fbfVarL.a();
        erg.b(this);
    }

    private final void l(epr eprVar) {
        eqc eqcVar = this.g;
        if (eqcVar instanceof eqc) {
            eqcVar.e(eprVar);
        }
    }

    @Override // defpackage.qqh
    public final Object E() {
        Object objD;
        Object obj = this.b;
        if (obj == null && (objD = D()) != null) {
            obj = ((ntn) objD).a;
        }
        if (obj == null) {
            return null;
        }
        ntn ntnVar = new ntn();
        ntnVar.a = obj;
        return ntnVar;
    }

    @Override // defpackage.qqh
    public void G() {
        l(epr.ON_DESTROY);
    }

    @Override // defpackage.qqh
    public final void H() {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((dzg) it.next()).a(80);
        }
    }

    @Override // defpackage.qqh
    public void I() {
        l(epr.ON_PAUSE);
    }

    @Override // defpackage.qqh
    public void K() {
        l(epr.ON_RESUME);
    }

    public final void Q() {
        if (this.b == null) {
            Object objD = D();
            if (objD != null) {
                this.b = (ert) ((ntn) objD).a;
            }
            if (this.b == null) {
                this.b = new ert();
            }
        }
    }

    public final void R() {
        View decorView = C().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = C().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = C().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = C().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = C().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // defpackage.qqh
    public void a(Bundle bundle) {
        this.a.b(bundle);
        this.f.c(this);
        l(epr.ON_CREATE);
    }

    @Override // defpackage.qqh
    @Deprecated
    public void c() {
        this.k.y();
    }

    @Override // defpackage.qqh
    public void d(Configuration configuration) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((dzg) it.next()).a(configuration);
        }
    }

    @Override // defpackage.qqh
    public void e(Intent intent) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((dzg) it.next()).a(intent);
        }
    }

    @Override // defpackage.qqh
    public void g(Bundle bundle) {
        eqc eqcVar = this.g;
        if (eqcVar instanceof eqc) {
            eqcVar.f(eps.c);
        }
        super.g(bundle);
        this.a.c(bundle);
    }

    @Override // defpackage.dur
    public final void gB(dzg dzgVar) {
        this.d.add(dzgVar);
    }

    @Override // defpackage.dus
    public final void gE(dzg dzgVar) {
        this.l.add(dzgVar);
    }

    @Override // defpackage.epo
    public final esc getDefaultViewModelCreationExtras() {
        ese eseVar = new ese((byte[]) null);
        eseVar.b(erg.a, this);
        eseVar.b(erg.b, this);
        if (q() != null && q().getExtras() != null) {
            eseVar.b(erg.c, q().getExtras());
        }
        return eseVar;
    }

    @Override // defpackage.epo
    public final erq getDefaultViewModelProviderFactory() {
        if (this.c == null) {
            this.c = new erh(null, this, q() != null ? q().getExtras() : null);
        }
        return this.c;
    }

    @Override // defpackage.eqa
    public final ept getLifecycle() {
        return this.g;
    }

    @Override // defpackage.fbg
    public final fbe getSavedStateRegistry() {
        return (fbe) this.a.b;
    }

    @Override // defpackage.eru
    public final ert getViewModelStore() {
        Q();
        return this.b;
    }

    @Override // defpackage.qqh
    public void h() {
        l(epr.ON_START);
    }

    @Override // defpackage.qqh
    public void j() {
        l(epr.ON_STOP);
    }

    @Override // defpackage.dur
    public final void k(dzg dzgVar) {
        this.d.remove(dzgVar);
    }

    @Override // defpackage.dus
    public final void n(dzg dzgVar) {
        this.l.remove(dzgVar);
    }

    @Override // defpackage.or
    public final bii r() {
        return this.k;
    }

    @Override // defpackage.qqh
    public void v(int i) {
        R();
        this.h.a(C().getDecorView());
        super.v(R.layout.preflight_placeholder);
    }

    public void w(View view) {
        throw null;
    }
}
