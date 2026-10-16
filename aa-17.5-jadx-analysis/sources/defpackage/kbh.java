package defpackage;

import com.google.android.gms.car.control.CarAction;
import com.google.android.gms.car.display.CarDisplayId;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class kbh implements afdr {
    private final /* synthetic */ int a;

    public /* synthetic */ kbh(int i) {
        this.a = i;
    }

    @Override // defpackage.afdr
    public final Object invoke() {
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                return new jvh();
            case 1:
                return new hhn();
            case 2:
                return new kgs();
            case 3:
                int i = kkz.a;
                return yph.c("Gh.CarControlCAS");
            case 4:
                List listI = kjq.a.a().i();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listI) {
                    int i2 = ((kjz) obj).a.a;
                    if (a.Y(i2, 354419978) || a.Y(i2, 354419977) || a.Y(i2, 356517121) || a.Y(i2, 356517120) || a.Y(i2, 356517131) || a.Y(i2, 358614275) || a.Y(i2, 289408270) || a.Y(i2, 354419973) || a.Y(i2, 354419974) || a.Y(i2, 320865540) || a.Y(i2, 354419975) || a.Y(i2, 354419984) || a.Y(i2, 354419986) || a.Y(i2, 354419976) || a.Y(i2, 356517139) || a.Y(i2, 339739916) || a.Y(i2, 289408269)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case 5:
                return kjq.a.a().i();
            case 6:
                return kjq.a.a().a();
            case 7:
                return kjq.a.a().j();
            case 8:
                mki.a.g();
                return ols.v(kio.b().e(), CarDisplayId.a).d();
            case 9:
                return Boolean.valueOf(nrd.a().f());
            case 10:
                return Boolean.valueOf(nrd.a().d());
            case 11:
                aezr aezrVar = kts.a;
                return new ktr(null);
            case 12:
                aezr aezrVar2 = kts.a;
                return new ktr();
            case 13:
                aezr aezrVar3 = kts.a;
                return new ktq();
            case 14:
                abnp abnpVarN = osp.a.n();
                abnpVarN.getClass();
                DesugarCollections.unmodifiableList(((osp) abnpVarN.b).b).getClass();
                List<CarAction> listJ = kjq.a.a().j();
                ArrayList arrayList2 = new ArrayList(woy.bp(listJ, 10));
                for (CarAction carAction : listJ) {
                    abnp abnpVarN2 = oso.a.n();
                    abnpVarN2.getClass();
                    int i3 = carAction.a;
                    abnpVarN2.t();
                    oso osoVar = (oso) abnpVarN2.b;
                    osoVar.b |= 1;
                    osoVar.c = i3;
                    abnv abnvVarQ = abnpVarN2.q();
                    abnvVarQ.getClass();
                    arrayList2.add((oso) abnvVarQ);
                }
                abnpVarN.t();
                osp ospVar = (osp) abnpVarN.b;
                aboh abohVar = ospVar.b;
                if (!abohVar.c()) {
                    ospVar.b = abnv.I(abohVar);
                }
                abmc.i(arrayList2, ospVar.b);
                abnv abnvVarQ2 = abnpVarN.q();
                abnvVarQ2.getClass();
                return (osp) abnvVarQ2;
            case 15:
                return new lck(bArr);
            case 16:
                return new lcq(null);
            case 17:
                return new lcy(bArr);
            case 18:
                return new lda(null);
            case 19:
                return new lel();
            default:
                return new lgu();
        }
    }
}
