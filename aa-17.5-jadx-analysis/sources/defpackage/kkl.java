package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.projection.gearhead.R;
import j$.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class kkl implements eqn {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kkl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [bwq, java.lang.Object] */
    @Override // defpackage.eqn
    public final void eS(Object obj) {
        switch (this.b) {
            case 0:
                kkf kkfVar = (kkf) obj;
                kkfVar.getClass();
                ((ype) kkq.h.f()).y("Received overlay property state: %s", kkfVar);
                boolean z = kkfVar instanceof kkc;
                Object obj2 = this.a;
                if (z) {
                    ((eqj) obj2).m(((kkc) kkfVar).a);
                    break;
                } else {
                    ((eqj) obj2).m(0);
                    break;
                }
            case 1:
                this.a.b(obj);
                break;
            case 2:
                krz krzVar = (krz) obj;
                yph yphVar = mge.a;
                View view = (View) this.a;
                mgj.a().b(view.getContext(), krzVar);
                leh.a.a();
                View viewFindViewById = view.findViewById(R.id.preflight_background);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(view.getContext().getResources().getDimension(R.dimen.frx_content_radius));
                gradientDrawable.setColor(krr.q.b(view.getContext(), krzVar));
                viewFindViewById.setBackground(gradientDrawable);
                view.setBackgroundColor(krr.o.b(view.getContext(), krzVar));
                break;
            case 3:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue >= acxa.e()) {
                    Object obj3 = this.a;
                    ((ype) msc.c.f()).w("Thermal status %d triggers compat mode", iIntValue);
                    ((msc) obj3).b(true);
                    break;
                }
                break;
            case 4:
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (!CarRegionId.a.equals(entry.getKey())) {
                        ((nfh) this.a).b((mqc) entry.getValue(), (CarRegionId) entry.getKey());
                    }
                }
                break;
            case 5:
                ((nfh) this.a).b((mqc) obj, CarRegionId.a);
                break;
            case 6:
                int iIntValue2 = ((Integer) obj).intValue();
                nqu nquVar = (nqu) this.a;
                if (nquVar.i() instanceof nqs) {
                    if (acpf.m()) {
                        mpl.e().g(iIntValue2 == 2);
                        break;
                    } else if (iIntValue2 == 1) {
                        nqj.a.a().a(false);
                        break;
                    } else if (iIntValue2 == 2) {
                        nquVar.j();
                        break;
                    }
                }
                break;
            case 7:
                eqj eqjVar = (eqj) this.a;
                ntn ntnVar = new ntn((yfq) eqjVar.e());
                int i = yfq.d;
                eqjVar.m((yfq) Collection.EL.stream((yfq) obj).filter(new iup(6)).filter(new iup(7)).map(new ixx((yfq) ntnVar.i(yls.a), 5)).collect(ycm.a));
                break;
            case 8:
                ((eqj) this.a).m(obj);
                break;
            case 9:
                krz krzVar2 = (krz) obj;
                xft xftVar = (xft) this.a;
                woy.aa(xftVar.c != null, "CarWindowManager not initialized, cannot set background colors");
                ((ype) ((ype) xft.a.f()).ai((char) 10260)).y("Setting background color for palette %s", krzVar2);
                leg legVar = leh.a;
                int iC = legVar.a().b() ? krr.o.c(krzVar2) : krs.a.a(krzVar2.a.b());
                try {
                    xftVar.c.a.m(iC, legVar.a().b() ? krr.o.e(krzVar2) : iC);
                    break;
                } catch (RemoteException e) {
                    boolean z2 = rrd.a;
                    rrd.d(4, "CAR.WM", e, "setBackgroundColors RemoteException", new Object[0]);
                    return;
                }
            default:
                krz krzVar3 = (krz) obj;
                if (leh.a.a().b()) {
                    xft xftVar2 = (xft) this.a;
                    woy.aa(xftVar2.c != null, "CarWindowManager not initialized, cannot set border color");
                    ((ype) ((ype) xft.a.f()).ai((char) 10261)).y("Setting border color for palette %s", krzVar3);
                    try {
                        xftVar2.c.a.n(0, krr.n.e(krzVar3));
                        break;
                    } catch (RemoteException e2) {
                        boolean z3 = rrd.a;
                        rrd.d(4, "CAR.WM", e2, "setBorderColors RemoteException", new Object[0]);
                        return;
                    }
                }
                break;
        }
    }
}
