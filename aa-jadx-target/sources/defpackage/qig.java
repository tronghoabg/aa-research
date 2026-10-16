package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@java.lang.Deprecated
public final class qig implements defpackage.kna {
    private com.google.android.gms.car.CarInfo a;
    private final android.content.SharedPreferences b = defpackage.mkp.a.c.getSharedPreferences("app_state_shared_preferences", 0);

    private final void e(defpackage.zaa zaaVar) {
        defpackage.rro rroVarH = defpackage.rrp.h(defpackage.yzd.GEARHEAD, 5, zaaVar);
        com.google.android.gms.car.CarInfo carInfo = this.a;
        carInfo.getClass();
        rroVarH.f(carInfo.a());
        defpackage.omf.u().F(rroVarH.l());
    }

    @Override // defpackage.kna
    public final long a() {
        return this.b.getLong("pref_projected_activation_date", -1L);
    }

    @Override // defpackage.kna
    public final com.google.android.gms.car.CarInfo b() {
        return this.a;
    }

    @Override // defpackage.kna
    public final void c() {
        android.content.SharedPreferences sharedPreferences = this.b;
        if (!sharedPreferences.getBoolean("pref_projected_activation", false)) {
            sharedPreferences.edit().putBoolean("pref_projected_activation", true).putLong("pref_projected_activation_date", j$.time.Instant.now().truncatedTo(j$.time.temporal.ChronoUnit.DAYS).toEpochMilli()).commit();
            e(defpackage.zaa.PROJECTED_ACTIVATION);
        }
        if (sharedPreferences.getBoolean("pref_android_auto_activation", false)) {
            return;
        }
        sharedPreferences.edit().putBoolean("pref_android_auto_activation", true).commit();
        e(defpackage.zaa.ANDROID_AUTO_ACTIVATION);
    }

    @Override // defpackage.kna
    public final void d(com.google.android.gms.car.CarInfo carInfo) {
        this.a = carInfo;
    }
}
