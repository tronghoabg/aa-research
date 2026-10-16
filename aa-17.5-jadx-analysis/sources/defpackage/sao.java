package defpackage;

import com.google.android.gms.carsetup.CarSetupServiceImpl;

/* loaded from: classes2.dex */
public final class sao implements rus {
    final /* synthetic */ CarSetupServiceImpl a;

    public sao(CarSetupServiceImpl carSetupServiceImpl) {
        this.a = carSetupServiceImpl;
    }

    @Override // defpackage.rus
    public final void a() {
        CarSetupServiceImpl carSetupServiceImpl = this.a;
        carSetupServiceImpl.l.c(xny.SENSOR_DRIVING_STATUS_DATA.A, 0L);
        carSetupServiceImpl.g();
    }

    @Override // defpackage.rus
    public final /* synthetic */ boolean b(int i) {
        return false;
    }

    @Override // defpackage.rus
    public final boolean c(int i) {
        return true;
    }
}
