package defpackage;

import android.text.TextUtils;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.carsetup.CarInfoInternal;
import com.google.android.gms.carsetup.CarSetupServiceImpl;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class sar implements rtu {
    public final /* synthetic */ CarSetupServiceImpl a;
    private String b;
    private long c;

    public sar(CarSetupServiceImpl carSetupServiceImpl) {
        this.a = carSetupServiceImpl;
    }

    @Override // defpackage.rtu
    public final void a(rtg rtgVar, String str, long j, String str2, String str3) {
        this.b = str;
        this.c = j;
        ypf ypfVar = CarSetupServiceImpl.a;
        ypfVar.l().ai(8599).u("Authentication complete");
        CarSetupServiceImpl carSetupServiceImpl = this.a;
        if (carSetupServiceImpl.r.g() && sct.a(carSetupServiceImpl)) {
            ypfVar.h().ai(8600).u("Device has been flagged as never supporting Android Auto, sending ByeBye to head unit");
            ruw ruwVar = carSetupServiceImpl.d;
            if (ruwVar != null) {
                ruwVar.g(ruwVar.k() ? xhv.NOT_CURRENTLY_SUPPORTED : xhv.USER_SELECTION);
                return;
            }
            return;
        }
        sak sakVar = carSetupServiceImpl.g;
        synchronized (sakVar) {
            if (sakVar.a == 0) {
                sakVar.b();
            }
        }
        abnp abnpVarN = yzm.a.n();
        abnpVarN.t();
        yzm yzmVar = (yzm) abnpVarN.b;
        yzmVar.b |= 8;
        yzmVar.f = j;
        if (str != null) {
            abnpVarN.t();
            yzm yzmVar2 = (yzm) abnpVarN.b;
            yzmVar2.b |= 1;
            yzmVar2.c = str;
        }
        if (str2 != null) {
            abnpVarN.t();
            yzm yzmVar3 = (yzm) abnpVarN.b;
            yzmVar3.b |= 2;
            yzmVar3.d = str2;
        }
        if (str3 != null) {
            abnpVarN.t();
            yzm yzmVar4 = (yzm) abnpVarN.b;
            yzmVar4.b |= 4;
            yzmVar4.e = str3;
        }
        abnp abnpVarN2 = yxb.a.n();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        yzm yzmVar5 = (yzm) abnpVarN.q();
        yzmVar5.getClass();
        yxbVar.i = yzmVar5;
        yxbVar.b |= 32;
        yxc yxcVar = yxc.SSL_HANDSHAKE;
        int i = yfq.d;
        sakVar.f(abnpVarN2, yxcVar, yls.a);
        rtgVar.c();
    }

    @Override // defpackage.rtu
    public final void b(int i, int i2, xob xobVar) throws Throwable {
        xgr xgrVar;
        String str;
        String str2 = this.b;
        long j = this.c;
        CarSetupServiceImpl carSetupServiceImpl = this.a;
        int i3 = carSetupServiceImpl.o;
        if ((xobVar.b & 16384) != 0) {
            xgrVar = xobVar.q;
            if (xgrVar == null) {
                xgrVar = xgr.a;
            }
        } else {
            abnp abnpVarN = xgr.a.n();
            String str3 = xobVar.i;
            abnpVarN.t();
            xgr xgrVar2 = (xgr) abnpVarN.b;
            str3.getClass();
            xgrVar2.b |= 16;
            xgrVar2.g = str3;
            String str4 = xobVar.j;
            abnpVarN.t();
            xgr xgrVar3 = (xgr) abnpVarN.b;
            str4.getClass();
            xgrVar3.b |= 32;
            xgrVar3.h = str4;
            String str5 = xobVar.k;
            abnpVarN.t();
            xgr xgrVar4 = (xgr) abnpVarN.b;
            str5.getClass();
            xgrVar4.b |= 64;
            xgrVar4.i = str5;
            String str6 = xobVar.l;
            abnpVarN.t();
            xgr xgrVar5 = (xgr) abnpVarN.b;
            str6.getClass();
            xgrVar5.b |= 128;
            xgrVar5.j = str6;
            String str7 = xobVar.g;
            abnpVarN.t();
            xgr xgrVar6 = (xgr) abnpVarN.b;
            str7.getClass();
            xgrVar6.b |= 8;
            xgrVar6.f = str7;
            String str8 = xobVar.f;
            abnpVarN.t();
            xgr xgrVar7 = (xgr) abnpVarN.b;
            str8.getClass();
            xgrVar7.b |= 4;
            xgrVar7.e = str8;
            String str9 = xobVar.d;
            abnpVarN.t();
            xgr xgrVar8 = (xgr) abnpVarN.b;
            str9.getClass();
            xgrVar8.b |= 1;
            xgrVar8.c = str9;
            String str10 = xobVar.e;
            abnpVarN.t();
            xgr xgrVar9 = (xgr) abnpVarN.b;
            str10.getClass();
            xgrVar9.b |= 2;
            xgrVar9.d = str10;
            xgrVar = (xgr) abnpVarN.q();
        }
        Iterator<E> it = xobVar.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            xnz xnzVar = (xnz) it.next();
            if ((xnzVar.b & 32) != 0) {
                xht xhtVar = xnzVar.h;
                if (xhtVar == null) {
                    xhtVar = xht.b;
                }
                str = xhtVar.c;
            }
        }
        String str11 = xobVar.o;
        if (TextUtils.isEmpty(str11)) {
            str11 = xgrVar.c;
        }
        String str12 = str11;
        int i4 = xobVar.n;
        String str13 = xgrVar.c;
        String str14 = xgrVar.d;
        String str15 = xgrVar.e;
        boolean zA = CarInfoInternal.a(i4, 1);
        xje xjeVarB = xje.b(xobVar.h);
        if (xjeVarB == null) {
            xjeVarB = xje.DRIVER_POSITION_LEFT;
        }
        CarInfo carInfo = new CarInfo(str13, str14, str15, null, i, i2, zA, xjeVarB.e, xgrVar.g, xgrVar.h, xgrVar.i, xgrVar.j, CarInfoInternal.a(i4, 8), CarInfoInternal.a(i4, 2), CarInfoInternal.a(i4, 4), null, str12, xgrVar.k);
        if (xobVar.m) {
            carInfo.m = true;
        }
        CarInfoInternal carInfoInternal = new CarInfoInternal(carInfo, xgrVar.f, false, 0L, 0L, str, null, null, null, -1, str2, -1, -1, i3, false, false, j, false, "", -1, null);
        CarSetupServiceImpl.a.l().ai(8601).y("Got car info %s", carInfoInternal);
        carSetupServiceImpl.g.c(i, i2, xobVar);
        carSetupServiceImpl.d(carInfoInternal, xobVar.p);
    }

    @Override // defpackage.rtu
    public final void c() {
        this.a.m = true;
    }

    @Override // defpackage.rtu
    public final void d() {
        rbe.h(new rzy(this, 2, null));
    }

    @Override // defpackage.rut
    public final void p(yze yzeVar, yzf yzfVar, String str) {
        rbe.h(new saq(this, yzeVar, yzfVar, str, 0));
    }
}
