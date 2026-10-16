package K3;

import android.content.Context;
import android.content.SharedPreferences;
import l3.AbstractC3384a;
import o3.InterfaceC3644a;

/* loaded from: classes.dex */
public final class g extends AbstractC3384a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6482c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Context f6483d;

    public g(Context context, int i5, int i10) {
        super(i5, i10);
        this.f6483d = context;
    }

    @Override // l3.AbstractC3384a
    public final void a(InterfaceC3644a interfaceC3644a) {
        Context context = this.f6483d;
        switch (this.f6482c) {
            case 0:
                if (this.f39943b >= 10) {
                    interfaceC3644a.l("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                interfaceC3644a.f("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j8 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j10 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    interfaceC3644a.c();
                    try {
                        interfaceC3644a.l("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j8)});
                        interfaceC3644a.l("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j10)});
                        sharedPreferences.edit().clear().apply();
                        interfaceC3644a.k();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i5 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i10 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    interfaceC3644a.c();
                    try {
                        interfaceC3644a.l("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i5)});
                        interfaceC3644a.l("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i10)});
                        sharedPreferences2.edit().clear().apply();
                        interfaceC3644a.k();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public g(Context context) {
        super(9, 10);
        this.f6483d = context;
    }
}
