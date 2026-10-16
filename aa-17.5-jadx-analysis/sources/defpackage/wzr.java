package defpackage;

import android.content.SharedPreferences;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.devsettings.DeveloperSettingsActivity;
import java.util.Map;

/* loaded from: classes3.dex */
public final class wzr implements rbt {
    final /* synthetic */ DeveloperSettingsActivity a;

    public wzr(DeveloperSettingsActivity developerSettingsActivity) {
        this.a = developerSettingsActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rbt
    public final void a() {
        final DeveloperSettingsActivity developerSettingsActivity = this.a;
        developerSettingsActivity.addPreferencesFromResource(R.xml.developer_preferences);
        SharedPreferences sharedPreferences = developerSettingsActivity.getPreferenceScreen().getSharedPreferences();
        yfu yfuVar = new yfu(4);
        yno it = DeveloperSettingsActivity.d.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                yfuVar.e(str, Boolean.valueOf(ols.h(developerSettingsActivity.i, str)));
            } catch (qrz unused) {
                tss.q("GH.DeveloperSettings", "Couldn't get car service settings", new Object[0]);
            }
        }
        yno it2 = DeveloperSettingsActivity.e.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            try {
                yfuVar.e(str2, ols.y(developerSettingsActivity.i, str2, ""));
            } catch (qrz unused2) {
                tss.q("GH.DeveloperSettings", "Couldn't get car service settings", new Object[0]);
            }
        }
        DeveloperSettingsActivity.b(yfuVar.d(true), sharedPreferences);
        developerSettingsActivity.c("car_video_resolution", yfq.v("none", "480p", "720p", "1080p", "1440p", "2160p"), "none");
        developerSettingsActivity.c("car_audio_codec", yfq.t("none", "pcm", "aac_lc", "aac_lc_adts"), "none");
        developerSettingsActivity.c("car_app_mode", yfq.t("Release", "Developer", "Retail", "X-Ray"), "Release");
        yno it3 = DeveloperSettingsActivity.g.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            Preference preferenceFindPreference = developerSettingsActivity.findPreference((CharSequence) entry.getKey());
            preferenceFindPreference.setEnabled(false);
            preferenceFindPreference.setDefaultValue(a$$ExternalSyntheticApiModelOutline3.m44m(entry.getValue()).get());
        }
        yno it4 = DeveloperSettingsActivity.f.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it4.next();
            String str3 = (String) entry2.getKey();
            if (((Boolean) a$$ExternalSyntheticApiModelOutline3.m44m(entry2.getValue()).get()).booleanValue()) {
                ((PreferenceCategory) developerSettingsActivity.findPreference("action_developer_settings")).removePreference(developerSettingsActivity.getPreferenceManager().findPreference(str3));
            }
        }
        sharedPreferences.registerOnSharedPreferenceChangeListener(developerSettingsActivity);
        ygp ygpVar = new ygp();
        ygpVar.c("car_clear_data");
        ygpVar.c("car_share_screenshot");
        ygpVar.c("failure_injection_enabled");
        if (acvh.o()) {
            ygpVar.c("clear_tos");
        }
        if (DeveloperSettingsActivity.f()) {
            ygpVar.c("reset_usb_port");
        }
        if (DeveloperSettingsActivity.e()) {
            ygpVar.c("reset_usb_gadget");
        }
        if (DeveloperSettingsActivity.g()) {
            ygpVar.c("reset_usb_roles");
        }
        if (DeveloperSettingsActivity.d()) {
            ygpVar.c("reset_usb_function");
        }
        if (aclx.c()) {
            ygpVar.c("app_quality_tester");
        }
        yno it5 = ygpVar.g().iterator();
        while (it5.hasNext()) {
            developerSettingsActivity.findPreference((String) it5.next()).setOnPreferenceClickListener(developerSettingsActivity);
        }
        Preference preferenceFindPreference2 = developerSettingsActivity.getPreferenceManager().findPreference("enable_wireless_projection");
        preferenceFindPreference2.getClass();
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preferenceFindPreference2;
        if (lgv.c().g()) {
            checkBoxPreference.setEnabled(true);
            checkBoxPreference.setSummary("");
        } else {
            checkBoxPreference.setEnabled(false);
            checkBoxPreference.setSummary(developerSettingsActivity.getString(R.string.settings_connection_wireless_disabled_remediation_message));
        }
        checkBoxPreference.setChecked(omc.a().k(developerSettingsActivity));
        checkBoxPreference.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() { // from class: wzm
            @Override // android.preference.Preference.OnPreferenceChangeListener
            public final boolean onPreferenceChange(Preference preference, Object obj) {
                omc.a().l(developerSettingsActivity, ((Boolean) obj).booleanValue());
                return true;
            }
        });
    }

    @Override // defpackage.rbt
    public final void b(rbs rbsVar) {
        ((ype) ((ype) DeveloperSettingsActivity.c.h()).ai((char) 9961)).y("Car Client connection suspended: %s", rbsVar);
        this.a.finish();
    }
}
