package defpackage;

import android.os.SystemClock;
import android.view.KeyEvent;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes.dex */
public final /* synthetic */ class npz implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ npz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.afdr
    public final Object invoke() throws qrz {
        switch (this.b) {
            case 0:
                nqa nqaVar = nqd.a;
                mki.a.g();
                ols.E(kio.b().e(), (CarRegionId) this.a);
                return afak.a;
            case 1:
                Object obj = this.a;
                nqa nqaVar2 = nqd.a;
                return roc.am((ProjectionWindowAnimationChoreography) obj);
            case 2:
                ((owj) this.a).c();
                ngf.g().h(nqm.a);
                return afak.a;
            case 3:
                ((owj) this.a).c();
                return afak.a;
            case 4:
                ((nqq) this.a).b.invoke();
                return afak.a;
            case 5:
                noh nohVar = ((nqx) this.a).c;
                if (nohVar != null) {
                    nohVar.e(false);
                }
                return afak.a;
            case 6:
                noh nohVar2 = ((nqx) this.a).d;
                if (nohVar2 != null) {
                    nohVar2.e(false);
                }
                return afak.a;
            case 7:
                nqj.a.a().b();
                ((nra) this.a).i(yzy.LI);
                return afak.a;
            case 8:
                nqj.a.a().b();
                KeyEvent keyEvent = new KeyEvent(0L, SystemClock.uptimeMillis(), 0, 4, 0, 0, 0, 0, 4);
                KeyEvent keyEvent2 = new KeyEvent(0L, SystemClock.uptimeMillis(), 1, 4, 0, 0, 0, 0, 4);
                CarRegionId carRegionIdR = nsr.c().b().r(nsn.d);
                nra nraVar = (nra) this.a;
                nraVar.h().g(carRegionIdR, keyEvent);
                nraVar.h().g(carRegionIdR, keyEvent2);
                nraVar.i(yzy.LF);
                return afak.a;
            case 9:
                nrq.b().a().fF();
                ((nra) this.a).i(yzy.LG);
                return afak.a;
            case 10:
                mki.a.g();
                return ols.o((qrn) this.a, CarDisplayId.a).b();
            case 11:
                float f = nvv.a;
                ((kmf) this.a).requestFocus();
                return afak.a;
            case 12:
                Runnable runnable = (Runnable) ((nvv) this.a).h.a();
                if (runnable != null) {
                    runnable.run();
                }
                return afak.a;
            case 13:
                nwr nwrVar = (nwr) this.a;
                int i = nwrVar.u;
                if (i == 0) {
                    throw null;
                }
                mcd.J(nwrVar, lxw.u(i, 0));
                return afak.a;
            case 14:
                nwr nwrVar2 = (nwr) this.a;
                int i2 = nwrVar2.u;
                if (i2 == 0) {
                    throw null;
                }
                mcd.J(nwrVar2, lxw.u(i2, 1));
                return afak.a;
            case 15:
                nwr nwrVar3 = (nwr) this.a;
                int i3 = nwrVar3.u;
                if (i3 == 0) {
                    throw null;
                }
                mcd.J(nwrVar3, lxw.u(i3, 2));
                return afak.a;
            case 16:
                nwr nwrVar4 = (nwr) this.a;
                lxw.x(nwrVar4.m);
                mcd.J(nwrVar4, yzy.nX);
                nwrVar4.g.run();
                return afak.a;
            case 17:
                nwr nwrVar5 = (nwr) this.a;
                nwrVar5.g.run();
                mcd.J(nwrVar5, yzy.oa);
                return afak.a;
            case 18:
                ((nwr) this.a).v = 3;
                return afak.a;
            case 19:
                ((nwr) this.a).v = 2;
                return afak.a;
            default:
                nwr nwrVar6 = (nwr) this.a;
                int i4 = nwrVar6.u;
                if (i4 == 0) {
                    throw null;
                }
                mcd.J(nwrVar6, lxw.u(i4, 0));
                return afak.a;
        }
    }
}
