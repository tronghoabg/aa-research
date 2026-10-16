package defpackage;

import com.google.android.gms.car.CarInfo;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.projection.gearhead.system.GhLifecycleService;

/* loaded from: classes.dex */
public final /* synthetic */ class kja implements kix {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kja(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kiy] */
    @Override // defpackage.kix
    public final Object a() throws qrz, qsa {
        switch (this.b) {
            case 0:
                return this.a.invoke();
            case 1:
                ?? r1 = this.a;
                r1.a();
                return r1;
            case 2:
                yph yphVar = mrq.a;
                mki.a.g();
                return ((raz) this.a).a.h(CarDisplayId.a);
            case 3:
                return ((sab) this.a).d();
            case 4:
                yph yphVar2 = mrq.a;
                mki.a.f();
                CarInfo carInfoC = ((raz) this.a).a.c();
                carInfoC.getClass();
                return carInfoC;
            case 5:
                msf msfVar = msh.a;
                mki.a.g();
                Object obj = this.a;
                return ((qrn) obj).a().h(CarDisplayId.a);
            case 6:
                msf msfVar2 = msh.a;
                return ((sab) this.a).d();
            case 7:
                mki.a.f();
                return Boolean.valueOf(((qrn) this.a).a().y().d(22));
            default:
                return Integer.valueOf(((GhLifecycleService) this.a).k(CarDisplayId.a).a());
        }
    }
}
