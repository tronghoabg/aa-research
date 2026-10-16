package defpackage;

import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.display.CarDisplayId;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class kym implements kix {
    private final /* synthetic */ int a;

    public /* synthetic */ kym(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [aezk, java.lang.Object] */
    @Override // defpackage.kix
    public final Object a() throws qrz {
        switch (this.a) {
            case 0:
                yph yphVar = kyw.a;
                mki.a.g();
                rdm rdmVarD = ((qsz) kio.b().e()).d();
                Integer num = (Integer) rdmVarD.f.b(new rcl(rdmVarD, 18));
                num.intValue();
                return num;
            case 1:
                int i = jqt.b;
                mki.a.f();
                return Boolean.valueOf(oni.c(kio.b().e()) == 2);
            case 2:
                yph yphVar2 = mrq.a;
                return a.Q();
            case 3:
                yph yphVar3 = mrq.a;
                return a.Q();
            case 4:
                yph yphVar4 = mrq.a;
                mki.a.f();
                CarInfo carInfoD = oni.d(kio.b().e());
                carInfoD.getClass();
                return carInfoD;
            case 5:
                yph yphVar5 = nfy.a;
                mki.a.g();
                rdx rdxVar = ols.v(kio.b().e(), CarDisplayId.a).h;
                List list = (List) ((rox) rdxVar.f.a()).b(new rdw(rdxVar, z ? 1 : 0));
                return Boolean.valueOf(list == null || list.isEmpty());
            case 6:
                yph yphVar6 = nwf.a;
                mki.a.f();
                CarInfo carInfoD2 = oni.d(kio.b().e());
                carInfoD2.getClass();
                ((ype) nwf.a.l().ai(5478)).w("carInfo driver position: %d", carInfoD2.h);
                return Boolean.valueOf(carInfoD2.h == 1);
            case 7:
                mki.a.g();
                return ols.p(kio.b().e()).a();
            case 8:
                yph yphVar7 = wxz.m;
                return a.Q();
            case 9:
                yph yphVar8 = wxz.m;
                mki.a.f();
                return Boolean.valueOf(oni.c(kio.b().e()) == 2);
            case 10:
                int i2 = xef.c;
                mki.a.f();
                return oni.d(kio.b().e());
            default:
                int i3 = xef.c;
                return lau.a().c(kio.b().e());
        }
    }
}
