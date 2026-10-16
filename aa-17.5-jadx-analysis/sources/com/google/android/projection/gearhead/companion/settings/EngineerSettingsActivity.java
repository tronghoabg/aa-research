package com.google.android.projection.gearhead.companion.settings;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import android.widget.Toast;
import com.google.android.projection.gearhead.companion.settings.EngineerSettingsActivity;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.aacq;
import defpackage.acvz;
import defpackage.jrl;
import defpackage.ngf;
import defpackage.omc;
import defpackage.qiy;
import defpackage.qsz;
import defpackage.rbt;
import defpackage.rbv;
import defpackage.wyb;
import defpackage.xaa;
import defpackage.ygr;
import defpackage.yph;
import defpackage.yyi;

/* loaded from: classes3.dex */
public class EngineerSettingsActivity extends qiy implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final yph c = yph.c("GH.EngineerSettings");
    public static final ygr d = ygr.p("debug", "dogfood");
    final rbt e;
    private qsz f;

    public EngineerSettingsActivity() {
        super("vn_dev_settings");
        this.e = new xaa(this);
    }

    @Override // defpackage.qiy, android.preference.PreferenceActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 29) {
            getListView().setClipToPadding(false);
        }
        qsz qszVarB = omc.b(this, this.e, new rbv() { // from class: wzz
            @Override // defpackage.rbv
            public final void a(rbu rbuVar) {
                ((ype) ((ype) EngineerSettingsActivity.c.h()).ai((char) 9992)).y("Car client connection failed: %s", rbuVar);
                this.a.finish();
            }
        }, null, 0);
        this.f = qszVarB;
        qszVarB.e();
    }

    @Override // android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
        this.f.g();
    }

    @Override // android.preference.PreferenceActivity
    @ResultIgnorabilityUnspecified
    public final boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        if (preference.getKey().equals("vn_reset_education_history")) {
            ngf.g().a.edit().clear().putBoolean("checked_for_new_user", true).putBoolean("is_new_user", true).commit();
            Toast.makeText(this, "Education stats reset", 0).show();
        }
        return super.onPreferenceTreeClick(preferenceScreen, preference);
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals("vn_force_verbose_logging") || str.equals("vn_log_buffer_size")) {
            wyb.b(this, jrl.a(), aacq.q(this), this.f, yyi.b((int) acvz.b()), null);
        }
    }
}
