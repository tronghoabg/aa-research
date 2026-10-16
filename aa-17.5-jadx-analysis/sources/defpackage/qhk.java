package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.car.CarInfo;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;

@Deprecated
/* loaded from: classes.dex */
public final class qhk implements kmt {
    private CarInfo a;
    private final SharedPreferences b = mki.a.c.getSharedPreferences("app_state_shared_preferences", 0);

    private final void e(yyv yyvVar) {
        rqu rquVarH = rqv.h(yxy.GEARHEAD, 5, yyvVar);
        CarInfo carInfo = this.a;
        carInfo.getClass();
        rquVarH.f(carInfo.a());
        ebf.j().F(rquVarH.l());
    }

    @Override // defpackage.kmt
    public final long a() {
        return this.b.getLong("pref_projected_activation_date", -1L);
    }

    @Override // defpackage.kmt
    public final CarInfo b() {
        return this.a;
    }

    @Override // defpackage.kmt
    public final void c() {
        SharedPreferences sharedPreferences = this.b;
        if (!sharedPreferences.getBoolean("pref_projected_activation", false)) {
            sharedPreferences.edit().putBoolean("pref_projected_activation", true).putLong("pref_projected_activation_date", Instant.now().truncatedTo(ChronoUnit.DAYS).toEpochMilli()).commit();
            e(yyv.PROJECTED_ACTIVATION);
        }
        if (sharedPreferences.getBoolean("pref_android_auto_activation", false)) {
            return;
        }
        sharedPreferences.edit().putBoolean("pref_android_auto_activation", true).commit();
        e(yyv.ANDROID_AUTO_ACTIVATION);
    }

    @Override // defpackage.kmt
    public final void d(CarInfo carInfo) {
        this.a = carInfo;
    }
}
