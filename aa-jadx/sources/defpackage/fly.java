package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fly extends defpackage.faq {
    private final android.content.Context c;

    public fly(android.content.Context context) {
        super(9, 10);
        this.c = context;
    }

    @Override // defpackage.faq
    public final void a(defpackage.fbs fbsVar) {
        fbsVar.e("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        android.content.SharedPreferences sharedPreferences = this.c.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j2 = true == sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            fbsVar.b();
            try {
                fbsVar.j(new java.lang.Object[]{"last_cancel_all_time_ms", java.lang.Long.valueOf(j)});
                fbsVar.j(new java.lang.Object[]{"reschedule_needed", java.lang.Long.valueOf(j2)});
                sharedPreferences.edit().clear().apply();
                fbsVar.f();
                fbsVar.d();
            } catch (java.lang.Throwable th) {
                fbsVar.d();
                throw th;
            }
        }
        android.content.SharedPreferences sharedPreferences2 = this.c.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
            int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
            fbsVar.b();
            try {
                fbsVar.j(new java.lang.Object[]{"next_job_scheduler_id", java.lang.Integer.valueOf(i)});
                fbsVar.j(new java.lang.Object[]{"next_alarm_manager_id", java.lang.Integer.valueOf(i2)});
                sharedPreferences2.edit().clear().apply();
                fbsVar.f();
            } finally {
                fbsVar.d();
            }
        }
    }
}
