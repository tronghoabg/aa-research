package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class iou extends rhu {
    public final boolean a;
    final /* synthetic */ ipb b;

    public iou(ipb ipbVar, boolean z) {
        this.b = ipbVar;
        this.a = z;
    }

    @Override // defpackage.rhu
    public final void a(ComponentName componentName, IBinder iBinder) {
        qxv qxtVar;
        yph yphVar = ipb.E;
        ilb.d();
        ype ypeVar = (ype) ((ype) ipb.E.f()).ai(969);
        ipb ipbVar = this.b;
        ypeVar.y("component: %s; Connected", ipbVar.i);
        ipa ipaVar = ipbVar.H;
        rbr.d(ipaVar, ipbVar.I);
        ipbVar.J = 0;
        if (iBinder == null) {
            qxtVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarProjection");
            qxtVar = iInterfaceQueryLocalInterface instanceof qxv ? (qxv) iInterfaceQueryLocalInterface : new qxt(iBinder);
        }
        ipbVar.O = qxtVar;
        ipaVar.j(0, 47);
    }

    @Override // defpackage.rhu
    public final void b(ComponentName componentName) {
        ilb.d();
        ipb ipbVar = this.b;
        ipbVar.H.h();
        ipbVar.O = null;
        ipbVar.S = false;
        ipbVar.e = true;
        if (ipbVar.F()) {
            return;
        }
        if (!ipbVar.j && ipbVar.f == null) {
            if (!ipbVar.H()) {
                ipbVar.b.av(ipbVar, new zwj(null));
                return;
            }
            ((ype) ((ype) ing.a.h()).ai((char) 622)).u("Binder died.");
            iob iobVar = ipbVar.b;
            ComponentName componentName2 = ipbVar.d;
            iobVar.e.i(yyv.CAR_ACTIVITY_MANAGER_BINDER_DIED, yyw.CS_BINDER_DIED, componentName2.getPackageName());
            ipbVar.m(componentName2.getPackageName().equals(ilb.c(iobVar.d)) ? new RuntimeException(String.valueOf(componentName2.flattenToShortString()).concat(" unexpectedly disconnected")) : null);
            return;
        }
        rbr.d(ipbVar.h, ipbVar.g);
        if (ipbVar.f != null) {
            if (acoq.q()) {
                rpz rpzVarA = rpz.a(ipbVar.b.d);
                rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, yzz.ACTIVITY_MANAGER, yzy.tP);
                rrbVarH.p(ipbVar.d);
                rrbVarH.o(ipbVar.f);
                rpzVarA.c(rrbVarH.l());
            }
        } else if (ipbVar.D.get() != null) {
            ((ype) ((ype) ing.a.h()).ai((char) 617)).u("Client did not ANR, but ANR data has been unexpectedly set in handling client death.");
        }
        ipbVar.i();
    }
}
