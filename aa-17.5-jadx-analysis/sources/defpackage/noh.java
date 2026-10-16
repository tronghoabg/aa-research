package defpackage;

import android.R;
import android.content.Context;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarDisplayId;
import java.util.Map;

/* loaded from: classes.dex */
public final class noh extends noc {
    public final sab k;
    public final CarWindowLayoutParams l;
    public final rby m;
    private final nsn n;
    private final nsk o;
    private final nso p;
    private final eqn q;

    public noh(sab sabVar, CarWindowLayoutParams carWindowLayoutParams, nsn nsnVar, nso nsoVar, Fragment fragment, eqa eqaVar, Object obj) {
        super(fragment, eqaVar, obj);
        this.m = new rby() { // from class: nod
            @Override // defpackage.rby
            public final View a(Context context) {
                return this.a.n(context);
            }
        };
        this.o = new noe(this, 0);
        nof nofVar = new nof(this);
        this.q = nofVar;
        this.k = sabVar;
        this.l = carWindowLayoutParams;
        this.n = nsnVar;
        this.p = nsoVar;
        leh.a.a();
        ksa.a.a().e.fE(eqaVar, nofVar);
    }

    @Override // defpackage.noc
    protected final void c() {
        this.p.B(this.n, this.o);
        this.k.i(this.m);
        ksa.d().e.k(this.q);
    }

    @Override // defpackage.noc
    protected final void f(boolean z) {
        ror rorVar;
        Map map = this.k.g;
        rby rbyVar = this.m;
        rzx rzxVar = (rzx) map.get(rbyVar);
        if (rzxVar == null) {
            rrd.d(5, "CAR.WM", null, "attempting to hide window layout, but inflater not found: %s", rbyVar);
            return;
        }
        if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
            rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s hideWindow(%b)", rzxVar.a, Boolean.valueOf(z));
        }
        if (rzxVar.p && (rorVar = rzxVar.g) != null) {
            rorVar.k();
        }
        try {
            rzxVar.i.e(z);
        } catch (RemoteException e) {
            rrd.b("CAR.CLIENT.WM.WIN", e, "hide RemoteException");
        }
    }

    @Override // defpackage.noc
    protected final void g(ProjectionWindowAnimationParams projectionWindowAnimationParams) {
        Map map = this.k.g;
        rby rbyVar = this.m;
        rzx rzxVar = (rzx) map.get(rbyVar);
        if (rzxVar == null) {
            rrd.d(5, "CAR.WM", null, "attempting to hide window layout, but inflater not found: %s", rbyVar);
            return;
        }
        if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
            rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s hideWindow(%s)", rzxVar.a, projectionWindowAnimationParams);
        }
        try {
            rzxVar.i.f(projectionWindowAnimationParams);
        } catch (RemoteException e) {
            rrd.b("CAR.CLIENT.WM.WIN", e, "hide RemoteException");
        }
    }

    @Override // defpackage.noc
    protected final void k(boolean z) {
        Map map = this.k.g;
        rby rbyVar = this.m;
        rzx rzxVar = (rzx) map.get(rbyVar);
        if (rzxVar == null) {
            rrd.d(5, "CAR.WM", null, "attempting to show window layout, but inflater not found: %s", rbyVar);
            return;
        }
        if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
            rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s showWindow(%b)", rzxVar.a, Boolean.valueOf(z));
        }
        try {
            rzxVar.i.q(z);
        } catch (RemoteException e) {
            rrd.b("CAR.CLIENT.WM.WIN", e, "showWindow RemoteException");
        }
    }

    @Override // defpackage.noc
    protected final void m(int i, ProjectionWindowAnimationParams projectionWindowAnimationParams) {
        Map map = this.k.g;
        rby rbyVar = this.m;
        rzx rzxVar = (rzx) map.get(rbyVar);
        if (rzxVar == null) {
            rrd.d(5, "CAR.WM", null, "Attempting to update window critical ui state, but inflater not found: %s", rbyVar);
            return;
        }
        if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
            rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s requestDragChange(%s, %s, %s)", rzxVar.a, Integer.valueOf(i), true, projectionWindowAnimationParams);
        }
        try {
            rzxVar.i.l(i, true, projectionWindowAnimationParams);
        } catch (RemoteException e) {
            rrd.b("CAR.CLIENT.WM.WIN", e, "updateCriticalUiState RemoteException");
        }
    }

    protected final View n(Context context) {
        rbx rbxVarA;
        nso nsoVar = this.p;
        nsn nsnVar = this.n;
        nsoVar.x(nsnVar, this.o);
        if (nsnVar != nsn.B && nsnVar != nsn.z) {
            context.getClass();
            context = new pi(context, kfl.i());
        }
        Context contextA = ksa.a.a().a(context);
        String str = this.h;
        yph yphVar = noc.a;
        ((ype) yphVar.l().ai((char) 5312)).y("onCreateView: %s", str);
        if (this.e) {
            ((ype) ((ype) yphVar.h()).ai((char) 5314)).y("onCreateView(): Called after finish() just returning dummy view for %s", str);
            return new FrameLayout(contextA);
        }
        if (this.j == null) {
            ((ype) yphVar.l().ai(5313)).K("Create new FragmentController and start Fragment %s. Available screen width in dp: %d", str, contextA.getResources().getConfiguration().screenWidthDp);
            this.c = new noa(this, contextA);
            this.c.setId(R.id.content);
            this.j = new kwp(new nob(this, contextA, this.b));
            this.j.K();
            this.j.D();
            this.d = true;
            w wVar = new w(this.j.A());
            rbxVarA = null;
            wVar.q(R.id.content, this.g, null);
            wVar.c();
            this.g = null;
        } else {
            rbxVarA = rbx.a(this.c);
            super.i(contextA);
        }
        this.j.G();
        if (rbxVarA != null) {
            rbxVarA.b(this.c);
        }
        return this.c;
    }

    public final CarDisplayId o() {
        return this.p.o;
    }

    public final void p(Runnable runnable) {
        Map map = this.k.g;
        rby rbyVar = this.m;
        rzx rzxVar = (rzx) map.get(rbyVar);
        if (rzxVar == null) {
            rrd.d(5, "CAR.WM", null, "requestWindowFocus inflater not found! : %s", rbyVar);
            return;
        }
        if (rzxVar.g()) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (runnable != null) {
            rzxVar.s.add(new urg(rzxVar, runnable, (byte[]) null));
        }
        if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
            rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s requestFocus", rzxVar.a);
        }
        try {
            rzxVar.i.m();
        } catch (RemoteException e) {
            rrd.b("CAR.CLIENT.WM.WIN", e, "requestFocus RemoteException");
        }
    }

    public final void q(boolean z) {
        if (acpf.m()) {
            if (!z || this.f) {
                sab sabVar = this.k;
                rby rbyVar = this.m;
                rbyVar.getClass();
                rzx rzxVar = (rzx) sabVar.g.get(rbyVar);
                if (rzxVar == null) {
                    rrd.d(5, "CAR.WM", null, "attempting to set transient window visibility, but inflater not found: %s", rbyVar);
                    return;
                }
                if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
                    rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s setOverlayVisible(%s)", rzxVar.a, Boolean.valueOf(z));
                }
                try {
                    rzxVar.i.n(z);
                } catch (RemoteException e) {
                    rrd.b("CAR.CLIENT.WM.WIN", e, "setOverlayVisible RemoteException");
                }
            }
        }
    }

    public final void r() {
        if (acpf.m() && this.f) {
            sab sabVar = this.k;
            rby rbyVar = this.m;
            rzx rzxVar = (rzx) sabVar.g.get(rbyVar);
            if (rzxVar == null) {
                rrd.d(5, "CAR.WM", null, "attempting to show transient window layout, but inflater not found: %s", rbyVar);
                return;
            }
            if (omc.c("CAR.CLIENT.WM.WIN", 3)) {
                rrd.d(3, "CAR.CLIENT.WM.WIN", null, "%s showTransient", rzxVar.a);
            }
            try {
                rzxVar.i.p();
            } catch (RemoteException e) {
                rrd.b("CAR.CLIENT.WM.WIN", e, "showTransient RemoteException");
            }
        }
    }
}
