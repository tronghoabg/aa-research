package com.google.android.projection.gearhead.companion.devsettings;

import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.text.format.Time;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.auto.components.connectivity.reset.ConnectionResetReceiver;
import com.google.android.apps.auto.components.frx.frxrewind.FrxRewindJobService;
import com.google.android.gms.common.api.Status;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.devsettings.DeveloperSettingsActivity;
import defpackage.acvz;
import defpackage.len;
import defpackage.maf;
import defpackage.mki;
import defpackage.ols;
import defpackage.omc;
import defpackage.qiy;
import defpackage.qrz;
import defpackage.qsz;
import defpackage.rbt;
import defpackage.rbv;
import defpackage.tss;
import defpackage.wzr;
import defpackage.yfq;
import defpackage.yfu;
import defpackage.yfy;
import defpackage.ygr;
import defpackage.ype;
import defpackage.yph;
import j$.util.Objects;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class DeveloperSettingsActivity extends qiy implements SharedPreferences.OnSharedPreferenceChangeListener, Preference.OnPreferenceClickListener {
    public static final yph c = yph.c("GH.DeveloperSettings");
    public static final ygr d = ygr.t("allow_unknown_sources", "car_enable_audio_latency_dump", "car_enable_gal_snoop", "car_gal_snoop_log_video_ack", "car_gal_snoop_log_media_ack", "car_gal_snoop_log_guidance_ack", "car_collect_gps_data", "car_disable_anr_monitoring", "car_dump_screenshot", "car_force_logging", "car_save_audio", "car_save_mic", "car_save_video", "failure_injection_enabled");
    public static final ygr e = ygr.r("car_app_mode", "car_audio_codec", "car_video_resolution", "car_gal_snoop_buffer_size");
    public static final yfy f;
    public static final yfy g;
    public final AtomicBoolean h;
    public qsz i;
    final rbt j;
    private final Executor k;

    static {
        yfu yfuVar = new yfu(4);
        yfuVar.e("car_enable_gal_snoop", new maf(11));
        yfuVar.e("car_gal_snoop_options", new maf(15));
        yfuVar.e("touchpad_tuning", new maf(16));
        yfuVar.e("clear_tos", new maf(17));
        yfuVar.e("reset_usb_port", new maf(18));
        yfuVar.e("reset_usb_gadget", new maf(19));
        yfuVar.e("reset_usb_roles", new maf(7));
        yfuVar.e("reset_usb_function", new maf(8));
        yfuVar.e("app_quality_tester", new maf(9));
        yfuVar.e("car_audio_codec", new maf(10));
        f = yfuVar.d(true);
        g = yfy.m("touchpad_base_fraction", new maf(12), "touchpad_min_size_mm", new maf(13), "touchpad_multimove_penalty_mm", new maf(14));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeveloperSettingsActivity() {
        super("action_developer_settings");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.h = new AtomicBoolean();
        mki.a.g();
        this.k = executorServiceNewSingleThreadExecutor;
        this.j = new wzr(this);
    }

    public static boolean d() {
        return h() && Build.VERSION.SDK_INT >= 30;
    }

    public static boolean e() {
        return h() && Build.VERSION.SDK_INT >= 30;
    }

    public static boolean f() {
        return h() && Build.VERSION.SDK_INT >= 33;
    }

    public static boolean g() {
        return h() && Build.VERSION.SDK_INT >= 30;
    }

    private static boolean h() {
        int iB = (int) acvz.b();
        return iB == 1 || iB == 4;
    }

    public final void c(String str, yfq yfqVar, String str2) {
        ListPreference listPreference = (ListPreference) findPreference(str);
        listPreference.setEntryValues((CharSequence[]) yfqVar.toArray(new String[0]));
        listPreference.setDefaultValue(str2);
    }

    @Override // defpackage.qiy, android.preference.PreferenceActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        qsz qszVarB = omc.b(this, this.j, new rbv() { // from class: wzn
            @Override // defpackage.rbv
            public final void a(rbu rbuVar) {
                ((ype) ((ype) DeveloperSettingsActivity.c.h()).ai((char) 9960)).y("Car Client connection failed: %s", rbuVar);
                this.a.finish();
            }
        }, null, 0);
        this.i = qszVarB;
        qszVarB.e();
    }

    @Override // android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        this.i.g();
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // android.preference.Preference.OnPreferenceClickListener
    public final boolean onPreferenceClick(Preference preference) {
        if ("car_clear_data".equals(preference.getKey())) {
            final File externalFilesDir = getExternalFilesDir(null);
            this.k.execute(new Runnable() { // from class: wzo
                @Override // java.lang.Runnable
                public final void run() {
                    yph yphVar = DeveloperSettingsActivity.c;
                    ((ype) ((ype) yphVar.f()).ai((char) 9956)).u("Deleting saved Android Auto data");
                    if (!gjs.g(externalFilesDir)) {
                        ((ype) ((ype) yphVar.h()).ai((char) 9958)).u("Failed to delete all saved Android Auto Gearhead data");
                    }
                    rdm rdmVarD = this.a.i.d();
                    if (rdmVarD.p(raj.n) && ((Boolean) rdmVarD.f.d(new rcl(rdmVarD, 5), false)).booleanValue()) {
                        return;
                    }
                    ((ype) ((ype) yphVar.h()).ai((char) 9957)).u("Failed to delete all saved Android Auto Car Module data");
                }
            });
            return true;
        }
        if ("car_share_screenshot".equals(preference.getKey())) {
            this.k.execute(new Runnable() { // from class: wzp
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    DeveloperSettingsActivity developerSettingsActivity = this.a;
                    if (developerSettingsActivity.h.compareAndSet(false, true)) {
                        try {
                            rbk rbkVar = (rbk) ols.g(developerSettingsActivity.i).get();
                            if (Status.a.equals(rbkVar.b)) {
                                Bitmap bitmapA = rbkVar.a();
                                Time time = new Time();
                                time.setToNow();
                                File externalFilesDir2 = developerSettingsActivity.getExternalFilesDir("screendumps");
                                File file = null;
                                if (externalFilesDir2 == null) {
                                    ((ype) ((ype) DeveloperSettingsActivity.c.h()).ai((char) 9968)).u("Couldn't find external files directory to save screenshot to");
                                } else {
                                    File file2 = new File(externalFilesDir2, "screendump - " + time.format("%Y-%m-%d-%H:%M:%S") + ".png");
                                    try {
                                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                                        try {
                                            bitmapA.compress(Bitmap.CompressFormat.PNG, 0, bufferedOutputStream);
                                            bufferedOutputStream.close();
                                            file = file2;
                                        } catch (Throwable th) {
                                            try {
                                                bufferedOutputStream.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    } catch (IOException unused) {
                                        ((ype) ((ype) DeveloperSettingsActivity.c.h()).ai((char) 9967)).u("Couldn't save screenshot");
                                    }
                                }
                                if (file != null) {
                                    developerSettingsActivity.startActivity(new Intent("android.intent.action.SEND").addFlags(268959744).addFlags(1).setType("image/*").putExtra("android.intent.extra.STREAM", duq.a(developerSettingsActivity, "com.google.android.projection.gearhead.devsettings.fileprovider", file)));
                                }
                                bitmapA.recycle();
                            } else {
                                ((ype) ((ype) DeveloperSettingsActivity.c.h()).ai((char) 9969)).u("Failed to capture a valid screenshot");
                            }
                        } catch (InterruptedException | ExecutionException | qrz unused2) {
                            ((ype) ((ype) DeveloperSettingsActivity.c.h()).ai((char) 9959)).u("Failed to capture screenshot");
                        }
                        developerSettingsActivity.h.set(false);
                    }
                }
            });
            return true;
        }
        if ("clear_tos".equals(preference.getKey())) {
            ((ype) ((ype) c.f()).ai((char) 9966)).u("Scheduling immediate FRX Reset.");
            yph yphVar = len.a;
            FrxRewindJobService.a(this).edit().clear().apply();
            len.a(this, 0L);
            Toast.makeText(this, R.string.clear_tos_confirmation, 0).show();
            return true;
        }
        if ("reset_usb_port".equals(preference.getKey())) {
            ((ype) ((ype) c.f()).ai((char) 9965)).u("Requesting USB Port reset");
            Intent intent = new Intent("com.google.android.projection.gearhead.RESET_USB_PORT");
            intent.setComponent(new ComponentName(this, (Class<?>) ConnectionResetReceiver.class));
            sendBroadcast(intent);
            Toast.makeText(this, R.string.reset_usb_confirmation, 0).show();
            return true;
        }
        if ("reset_usb_gadget".equals(preference.getKey())) {
            ((ype) ((ype) c.f()).ai((char) 9964)).u("Requesting USB Gadget reset");
            Intent intent2 = new Intent("com.google.android.projection.gearhead.RESET_USB_GADGET");
            intent2.setComponent(new ComponentName(this, (Class<?>) ConnectionResetReceiver.class));
            sendBroadcast(intent2);
            Toast.makeText(this, R.string.reset_usb_confirmation, 0).show();
            return true;
        }
        if ("reset_usb_roles".equals(preference.getKey())) {
            ((ype) ((ype) c.f()).ai((char) 9963)).u("Requesting USB Roles reset");
            Intent intent3 = new Intent("com.google.android.projection.gearhead.RESET_USB_ROLES");
            intent3.setComponent(new ComponentName(this, (Class<?>) ConnectionResetReceiver.class));
            sendBroadcast(intent3);
            Toast.makeText(this, R.string.reset_usb_confirmation, 0).show();
            return true;
        }
        if ("reset_usb_function".equals(preference.getKey())) {
            ((ype) ((ype) c.f()).ai((char) 9962)).u("Requesting USB Function reset");
            Intent intent4 = new Intent("com.google.android.projection.gearhead.RESET_USB_FUNCTION");
            intent4.setComponent(new ComponentName(this, (Class<?>) ConnectionResetReceiver.class));
            sendBroadcast(intent4);
            Toast.makeText(this, R.string.reset_usb_confirmation, 0).show();
            return true;
        }
        if ("app_quality_tester".equals(preference.getKey())) {
            startActivity(new Intent(this, (Class<?>) AppQualityTesterActivity.class));
        } else if (Objects.equals(preference.getKey(), "failure_injection_enabled")) {
            Snackbar snackbarK = Snackbar.k(getListView(), R.string.car_failure_injection_enabled_confirmation);
            snackbarK.m(R.string.car_open_settings_button, new View.OnClickListener() { // from class: wzq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Intent intent5 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent5.setData(Uri.parse("package:com.google.android.projection.gearhead"));
                    this.a.startActivity(intent5);
                }
            });
            snackbarK.f();
            return true;
        }
        return false;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (d.contains(str)) {
            boolean z = sharedPreferences.getBoolean(str, false);
            try {
                ols.C(this.i, str, z);
                b(yfy.k(str, Boolean.valueOf(z)), sharedPreferences);
                return;
            } catch (qrz unused) {
                tss.q("GH.DeveloperSettings", "Couldn't set car service settings", new Object[0]);
                return;
            }
        }
        if (e.contains(str)) {
            String string = sharedPreferences.getString(str, "");
            try {
                ols.D(this.i, str, string);
                b(yfy.k(str, string), sharedPreferences);
            } catch (qrz unused2) {
                tss.q("GH.DeveloperSettings", "Couldn't set car service settings", new Object[0]);
            }
        }
    }
}
