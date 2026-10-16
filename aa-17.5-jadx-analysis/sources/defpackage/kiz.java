package defpackage;

import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.projection.gearhead.R;
import java.util.UUID;

/* loaded from: classes.dex */
public final /* synthetic */ class kiz implements kix {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kiz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kiy] */
    @Override // defpackage.kix
    public final Object a() throws qrz, qsa {
        CarWindowLayoutParams carWindowLayoutParamsA;
        switch (this.b) {
            case 0:
                return this.a.invoke();
            case 1:
                ?? r4 = this.a;
                r4.a();
                return r4;
            case 2:
                mki.a.f();
                return oni.d((qrn) this.a);
            case 3:
                return ((sab) this.a).b();
            case 4:
                int i = nfo.a;
                mki.a.g();
                return ols.y((qrn) this.a, "car_day_night_mode", nfp.h.i);
            case 5:
                int i2 = 36;
                if (!nrd.a().f() && !nrd.a().d()) {
                    i2 = 5;
                }
                qsw qswVarN = nsr.c().b().n(nsn.i);
                if (qswVarN == null) {
                    tss.q("GH.HunPresenterBase", "unable to find layout params for SystemLayoutRegionType.NOTIFICATION", new Object[0]);
                    carWindowLayoutParamsA = new qsw(0, 0, UUID.randomUUID()).a();
                } else {
                    qswVarN.m = i2;
                    qswVarN.l = true;
                    qswVarN.n = R.style.Theme_Gearhead_Coolwalk_Hun;
                    carWindowLayoutParamsA = qswVarN.a();
                }
                Object obj = this.a;
                nwn nwnVar = new nwn();
                eqa eqaVar = ((nwj) obj).d;
                eqaVar.getClass();
                nog nogVarB = nsh.b(carWindowLayoutParamsA, "HUN", nwnVar, eqaVar);
                nogVarB.e = obj;
                return nogVarB.a();
            case 6:
                return ((sab) this.a).d();
            case 7:
                mki.a.g();
                return Integer.valueOf(ols.v((qrn) this.a, CarDisplayId.a).a());
            case 8:
                return ((sab) this.a).b();
            case 9:
                mki.a.g();
                return ols.v((qrn) this.a, CarDisplayId.a);
            default:
                mki.a.g();
                return ols.v(kio.b().e(), ((xft) this.a).b);
        }
    }
}
