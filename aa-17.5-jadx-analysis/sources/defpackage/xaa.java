package defpackage;

import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.settings.EngineerSettingsActivity;

/* loaded from: classes3.dex */
public final class xaa implements rbt {
    final /* synthetic */ EngineerSettingsActivity a;

    public xaa(EngineerSettingsActivity engineerSettingsActivity) {
        this.a = engineerSettingsActivity;
    }

    @Override // defpackage.rbt
    public final void a() {
        ((ype) EngineerSettingsActivity.c.l().ai((char) 9991)).u("Car Client connected");
        EngineerSettingsActivity engineerSettingsActivity = this.a;
        engineerSettingsActivity.addPreferencesFromResource(R.xml.engineer_settings);
        PreferenceScreen preferenceScreen = engineerSettingsActivity.getPreferenceScreen();
        SharedPreferences sharedPreferences = preferenceScreen.getSharedPreferences();
        sharedPreferences.registerOnSharedPreferenceChangeListener(engineerSettingsActivity);
        if (EngineerSettingsActivity.d.contains("release")) {
            return;
        }
        if (sharedPreferences.getBoolean("vn_force_verbose_logging", true)) {
            sharedPreferences.edit().putBoolean("vn_force_verbose_logging", false).apply();
        }
        Preference preferenceFindPreference = preferenceScreen.findPreference("vn_force_verbose_logging");
        preferenceFindPreference.setSummary(R.string.engineer_force_verbose_logging_disabled_summary);
        preferenceFindPreference.setEnabled(false);
    }

    @Override // defpackage.rbt
    public final void b(rbs rbsVar) {
        ((ype) ((ype) EngineerSettingsActivity.c.h()).ai((char) 9993)).y("Car Client connection suspended: %s", rbsVar);
        this.a.finish();
    }
}
