package com.waze.alerters;

import android.graphics.Bitmap;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarIconSpan;
import androidx.core.graphics.drawable.IconCompat;
import com.waze.an.a.p;
import com.waze.car_lib.f.hk;
import com.waze.car_lib.login.LoginController$LoginState;
import com.waze.car_lib.o.v;
import com.waze.settings.tree.d.n;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class h implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f14274a;

    public /* synthetic */ h(int i2) {
        this.f14274a = i2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f14274a) {
            case 0:
                return i.h((org.a.d.g.a) obj);
            case 1:
                ((hk) obj).f().e();
                return ab.f48028a;
            case 2:
                ((hk) obj).f().g();
                return ab.f48028a;
            case 3:
                ((hk) obj).f().f();
                return ab.f48028a;
            case 4:
                ((hk) obj).f().d();
                return ab.f48028a;
            case 5:
                Runnable runnable = (Runnable) obj;
                x.f(runnable, "runnable");
                runnable.run();
                return ab.f48028a;
            case 6:
                LoginController$LoginState loginController$LoginState = (LoginController$LoginState) obj;
                x.f(loginController$LoginState, "it");
                return loginController$LoginState.copy(com.waze.car_lib.login.e.f20302a);
            case 7:
                LoginController$LoginState loginController$LoginState2 = (LoginController$LoginState) obj;
                x.f(loginController$LoginState2, "it");
                return loginController$LoginState2.copy(com.waze.car_lib.login.f.f20303a);
            case 8:
                LoginController$LoginState loginController$LoginState3 = (LoginController$LoginState) obj;
                x.f(loginController$LoginState3, "it");
                return loginController$LoginState3.copy(com.waze.car_lib.login.d.f20301a);
            case 9:
                LoginController$LoginState loginController$LoginState4 = (LoginController$LoginState) obj;
                x.f(loginController$LoginState4, "it");
                return loginController$LoginState4.copy(com.waze.car_lib.login.d.f20301a);
            case 10:
                return ((LoginController$LoginState) obj).copy(com.waze.car_lib.login.c.f20300a);
            case 11:
                p pVar = (p) obj;
                if (pVar != null) {
                    return pVar.a();
                }
                return null;
            case 12:
                ((Boolean) obj).booleanValue();
                return ab.f48028a;
            case 13:
                x.f((com.waze.settings.tree.d.d) obj, "it");
                return ab.f48028a;
            case 14:
                x.f((n) obj, "it");
                return ab.f48028a;
            case 15:
                x.f((v) obj, "it");
                return ab.f48028a;
            case 16:
                x.f((com.waze.car_lib.o.x) obj, "it");
                return ab.f48028a;
            case 17:
                x.f((com.waze.settings.tree.d.h) obj, "it");
                return ab.f48028a;
            case 18:
                com.waze.av.d.f fVar = (com.waze.av.d.f) obj;
                x.f(fVar, "it");
                return Float.valueOf(fVar.a());
            case 19:
                com.waze.av.d.f fVar2 = (com.waze.av.d.f) obj;
                x.f(fVar2, "it");
                return Integer.valueOf(fVar2.b());
            default:
                Bitmap bitmap = (Bitmap) obj;
                x.f(bitmap, "bitmap");
                CarIconSpan carIconSpanCreate = CarIconSpan.create(new CarIcon.Builder(IconCompat.createWithBitmap(bitmap)).build(), 2);
                x.e(carIconSpanCreate, "create(...)");
                return carIconSpanCreate;
        }
    }
}
