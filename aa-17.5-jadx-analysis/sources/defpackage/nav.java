package defpackage;

import android.support.v4.app.Fragment;
import com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher;
import com.google.android.apps.auto.components.telecom.PhoneCall;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarDisplayUiFeatures;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final /* synthetic */ class nav implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nav(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v51, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v54, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v63, types: [bym, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() throws qrz, qsa {
        switch (this.b) {
            case 0:
                return (SlidingViewSwitcher) ((Fragment) this.a).requireView().findViewById(R.id.media_switcher);
            case 1:
                return new zos((nbb) this.a);
            case 2:
                aezr aezrVar = ndj.a;
                return new ndp((String) this.a);
            case 3:
                ndl ndlVar = ndn.a;
                return Boolean.valueOf(((mko) this.a).n());
            case 4:
                int i = ((PhoneCall) this.a).a;
                yph yphVar = nea.a;
                mwc.c(yzy.E, Integer.valueOf(i));
                ebf.A().m(i);
                return afak.a;
            case 5:
                nea.a((PhoneCall) this.a, true);
                return afak.a;
            case 6:
                yph yphVar2 = nea.a;
                Object obj = this.a;
                PhoneCall phoneCall = (PhoneCall) obj;
                yzy yzyVar = phoneCall.c() ? yzy.G : yzy.I;
                int i2 = phoneCall.a;
                mwc.c(yzyVar, Integer.valueOf(i2));
                if (!ebf.A().y(i2)) {
                    ((ype) nea.a.h()).y("Call could not be ended. %s", obj);
                }
                return afak.a;
            case 7:
                nea.a((PhoneCall) this.a, false);
                return afak.a;
            case 8:
                Object obj2 = this.a;
                ney neyVar = (ney) obj2;
                qrn qrnVarE = neyVar.h;
                if (qrnVarE == null) {
                    qrnVarE = kio.b().e();
                    qrnVarE.getClass();
                }
                mki.a.f();
                roj rojVarF = oni.f(qrnVarE);
                neyVar.j = rojVarF;
                rojVarF.f(neyVar.i, 22, 3);
                qsf qsfVarA = rojVarF.a(22);
                if (qsfVarA != null) {
                    float[] fArr = qsfVarA.c;
                    fArr.getClass();
                    byte[] bArr = qsfVarA.d;
                    bArr.getClass();
                    ((eqj) obj2).j(Boolean.valueOf(mva.r(qsfVarA.a, qsfVarA.b, fArr, bArr).i().a));
                }
                return afak.a;
            case 9:
                mki.a.g();
                ols.B(kio.b().e(), CarDisplayId.a, ((nfr) this.a).a());
                return afak.a;
            case 10:
                mki.a.g();
                ols.F(kio.b().e(), CarDisplayId.a, ((nfr) this.a).a());
                return afak.a;
            case 11:
                mki.a.g();
                CarDisplayUiFeatures carDisplayUiFeaturesW = ols.w(kio.b().e(), CarDisplayId.a);
                carDisplayUiFeaturesW.getClass();
                ((nfr) this.a).g(carDisplayUiFeaturesW, "initialization");
                return afak.a;
            case 12:
                nfq nfqVar = nfr.a;
                mki.a.g();
                rjs rjsVarN = ols.n((qrn) this.a);
                ((rox) rjsVarN.b).g(new rcu(rjsVarN, CarDisplayId.a, 13));
                return afak.a;
            case 13:
                nfq nfqVar2 = nfr.a;
                mki.a.g();
                rjs rjsVarN2 = ols.n((qrn) this.a);
                ((rox) rjsVarN2.b).g(new rcu(rjsVarN2, CarDisplayId.a, 14));
                return afak.a;
            case 14:
                Object obj3 = this.a;
                yph yphVar3 = nih.a;
                return mva.p((byd) obj3);
            case 15:
                nxs nxsVarB = nih.b(this.a);
                return Integer.valueOf(nxsVarB != null ? nxsVarB.b : 0);
            case 16:
                nxs nxsVarB2 = nih.b(this.a);
                return Boolean.valueOf(nxsVarB2 != null ? nxsVarB2.a : false);
            case 17:
                Object obj4 = this.a;
                yph yphVar4 = nih.a;
                return mva.p((byd) obj4);
            case 18:
                Object obj5 = this.a;
                yph yphVar5 = nih.a;
                return mva.p((byd) obj5);
            case 19:
                yph yphVar6 = nih.a;
                return Boolean.valueOf(((Number) this.a.a()).intValue() == 2);
            default:
                return new njx(((niy) this.a).a().k, 2);
        }
    }
}
