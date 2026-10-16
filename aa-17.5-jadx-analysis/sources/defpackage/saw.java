package defpackage;

import com.google.android.gms.carsetup.CarSetupServiceImpl;

/* loaded from: classes.dex */
public final class saw extends sfg {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ CarSetupServiceImpl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public saw(final CarSetupServiceImpl carSetupServiceImpl) {
        super(carSetupServiceImpl, new sff() { // from class: sav
            @Override // defpackage.sff
            public final int a() {
                int i = saw.b;
                return carSetupServiceImpl.e;
            }
        });
        this.a = carSetupServiceImpl;
    }

    @Override // defpackage.sfg
    public final void a(yze yzeVar, yzf yzfVar) {
        sak sakVar = this.a.g;
        spu.ax(yzeVar, "errorCode is necessary");
        abnp abnpVarN = yzg.a.n();
        abnpVarN.t();
        yzg yzgVar = (yzg) abnpVarN.b;
        yzgVar.b |= 1;
        yzgVar.c = yzeVar.D;
        abnpVarN.t();
        yzg yzgVar2 = (yzg) abnpVarN.b;
        yzgVar2.b |= 2;
        yzgVar2.d = yzfVar.az;
        yzg yzgVar3 = (yzg) abnpVarN.q();
        abnp abnpVarN2 = yxb.a.n();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        yzgVar3.getClass();
        yxbVar.s = yzgVar3;
        yxbVar.b |= 65536;
        yxc yxcVar = yxc.PROJECTION_ERROR;
        int i = yfq.d;
        sakVar.f(abnpVarN2, yxcVar, yls.a);
    }

    @Override // defpackage.sfg
    public final void b() {
        this.a.k();
    }
}
