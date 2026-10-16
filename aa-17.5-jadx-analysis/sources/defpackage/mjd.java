package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.apps.auto.components.radio.RadioMediaBrowserService;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class mjd implements kiy {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mjd(nrx nrxVar, boolean z, int i) {
        this.c = i;
        this.b = nrxVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, qyb] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, qyb] */
    @Override // defpackage.kiy
    public final void a() throws qrz, qsa {
        ProjectionWindowAnimationParams projectionWindowAnimationParams;
        ProjectionWindowAnimationParams projectionWindowAnimationParams2;
        int i = this.c;
        if (i == 0) {
            yph yphVar = RadioMediaBrowserService.g;
            Object obj = this.b;
            boolean z = this.a;
            if (omc.c("CAR.RADIO", 3)) {
                rrd.a("CAR.RADIO", null, "muteRadio()");
            }
            try {
                ((qsb) obj).a.n(z);
                return;
            } catch (RemoteException e) {
                olm.h(e);
                return;
            } catch (IllegalStateException e2) {
                olm.f(e2);
                return;
            }
        }
        if (i == 1) {
            yph yphVar2 = RadioMediaBrowserService.g;
            Object obj2 = this.b;
            boolean z2 = this.a;
            if (omc.c("CAR.RADIO", 3)) {
                rrd.a("CAR.RADIO", null, "setFavorite()");
            }
            try {
                ((qsb) obj2).a.u(z2);
                return;
            } catch (RemoteException e3) {
                olm.h(e3);
                return;
            } catch (IllegalStateException e4) {
                olm.f(e4);
                return;
            }
        }
        mki.a.g();
        sab sabVarV = ols.v(kio.b().e(), CarDisplayId.a);
        CarDisplay carDisplayD = sabVarV.d();
        if (carDisplayD == null) {
            ((ype) ((ype) nrx.a.h()).ai((char) 5351)).u("showIrregularActivityScrim called before layout is calculated.");
            return;
        }
        Point point = carDisplayD.d;
        if (point == null) {
            ((ype) ((ype) nrx.a.h()).ai((char) 5350)).u("showIrregularActivityScrim called but displayDimensions is null.");
            return;
        }
        boolean z3 = this.a;
        nso nsoVarB = nsr.c().b();
        boolean zJ = nsoVarB.J();
        if (!z3) {
            projectionWindowAnimationParams = new ProjectionWindowAnimationParams(R.anim.coolwalk_app_switch_enter, false, null, 0);
            projectionWindowAnimationParams2 = new ProjectionWindowAnimationParams(R.anim.coolwalk_app_switch_exit, false, null, 0);
        } else if (!nsoVarB.F()) {
            projectionWindowAnimationParams = new ProjectionWindowAnimationParams(R.anim.activity_slide_up, false, null, 0);
            projectionWindowAnimationParams2 = new ProjectionWindowAnimationParams(R.anim.activity_slide_down, false, null, 0);
        } else if (zJ) {
            projectionWindowAnimationParams = new ProjectionWindowAnimationParams(R.anim.activity_slide_in_from_right, false, null, 0);
            projectionWindowAnimationParams2 = new ProjectionWindowAnimationParams(R.anim.activity_slide_out_to_right, false, null, 0);
        } else {
            projectionWindowAnimationParams = new ProjectionWindowAnimationParams(R.anim.activity_slide_in_from_left, false, null, 0);
            projectionWindowAnimationParams2 = new ProjectionWindowAnimationParams(R.anim.activity_slide_out_to_left, false, null, 0);
        }
        Object obj3 = this.b;
        nrw nrwVar = new nrw(projectionWindowAnimationParams, projectionWindowAnimationParams2, zJ);
        qsw qswVarN = nsoVarB.n(nsn.s);
        qswVarN.getClass();
        CarWindowLayoutParams carWindowLayoutParamsA = qswVarN.a();
        nrx nrxVar = (nrx) obj3;
        nrv nrvVar = nrxVar.d;
        if (nrvVar != null) {
            nrvVar.a();
        }
        qsw qswVar = new qsw(point.x, point.y, nsoVarB.v());
        qswVar.g = carWindowLayoutParamsA.i + 2;
        qswVar.h = nrwVar.a;
        qswVar.q = null;
        qswVar.i = nrwVar.b;
        qswVar.l = true;
        qswVar.m = 192;
        CarWindowLayoutParams carWindowLayoutParamsA2 = qswVar.a();
        Context context = mki.a.c;
        nrv nrvVar2 = new nrv(sabVarV, nrwVar.c, nsoVarB.m());
        nrvVar2.c = new xfs(nrvVar2, 1);
        sabVarV.f(nrvVar2.c, "irregular_activity_scrim", context, carWindowLayoutParamsA2, 0);
        nrxVar.d = nrvVar2;
    }

    public /* synthetic */ mjd(boolean z, qsb qsbVar, int i) {
        this.c = i;
        this.a = z;
        this.b = qsbVar;
    }
}
