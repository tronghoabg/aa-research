package defpackage;

import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarInfoInternal;

/* loaded from: classes2.dex */
public final /* synthetic */ class kpu implements kpw {
    private final /* synthetic */ int a;

    @Override // defpackage.kpw
    public final boolean a(jlo jloVar, CarInfoInternal carInfoInternal) {
        int i = this.a;
        if (i == 0) {
            return jloVar.m(carInfoInternal);
        }
        if (i == 1) {
            return jloVar.l(carInfoInternal);
        }
        CarInfo carInfo = carInfoInternal.a;
        jloVar.i(carInfo.d, carInfo.a);
        return true;
    }
}
