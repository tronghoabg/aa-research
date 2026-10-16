package defpackage;

import com.google.android.apps.auto.components.settings.ui.CarSettingsService;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayId;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class llj implements afdr {
    private final /* synthetic */ int a;

    public /* synthetic */ llj(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.google.android.gms.car.display.CarDisplayBlendedUiConfig] */
    @Override // defpackage.afdr
    public final Object invoke() {
        CarDisplay carDisplayD;
        int i = 2;
        int i2 = 3;
        byte[] bArr = null;
        bArr = null;
        switch (this.a) {
            case 0:
                return new lll();
            case 1:
                return new liw(bArr);
            case 2:
                return afak.a;
            case 3:
                loe loeVar = lof.a;
                eqj eqjVarB = lpq.i().b();
                eqjVarB.getClass();
                return tby.B(eqjVarB, new lmv(i2));
            case 4:
                return new loo();
            case 5:
                return new ltu();
            case 6:
                return new lwo();
            case 7:
                return new lyl();
            case 8:
                return new lyn();
            case 9:
                return new mab();
            case 10:
                mce mceVar = mce.a;
                return woy.bi(mce.a, mce.b);
            case 11:
                return afak.a;
            case 12:
                return afak.a;
            case 13:
                return new mda(bArr);
            case 14:
                mej.a();
                return afak.a;
            case 15:
                mej.a();
                return afak.a;
            case 16:
                try {
                    mki.a.g();
                    sab sabVarV = ols.v(kio.b().e(), CarDisplayId.a);
                    if (sabVarV != null && (carDisplayD = sabVarV.d()) != null) {
                        bArr = carDisplayD.i;
                    }
                } catch (Exception e) {
                    ((ype) ((ype) CarSettingsService.c.h()).p(e)).u("Failed to query CarWindowManager for blended UI config");
                }
                boolean z = bArr != null;
                return Boolean.valueOf(z);
            case 17:
                int i3 = mqi.f;
                mdc.a();
                Object objCollect = Collection.EL.stream(mdc.d(kio.b().e())).map(new mix(mqh.a, 4)).filter(new lye(13)).map(new mix(new mii(7), 5)).sorted(new czs(new mqe(i), 6)).collect(Collectors.toList());
                objCollect.getClass();
                afco afcoVar = tby.a;
                return new eqm((List) objCollect);
            case 18:
                return new mtz(i2);
            case 19:
                return new mtn();
            default:
                return new mtr();
        }
    }
}
