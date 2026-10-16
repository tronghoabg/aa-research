package com.waze.google_assistant;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.speech.SpeechRecognizer;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import androidx.core.view.InputDeviceCompat;
import com.waze.R;
import com.waze.dc;
import com.waze.settings.SettingsNativeManager;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class SpeechRecognizerActivity extends com.waze.ifs.ui.a {

    /* renamed from: f, reason: collision with root package name */
    private aw f24052f;

    /* renamed from: g, reason: collision with root package name */
    private SpeechRecognizer f24053g;

    /* renamed from: h, reason: collision with root package name */
    private ComponentName f24054h;

    /* renamed from: k, reason: collision with root package name */
    private Integer f24055k = null;

    /* renamed from: l, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f24056l = com.waze.shared_infra.o.b.a();

    public static Intent l(Context context) {
        return m(context, null);
    }

    public static Intent m(Context context, Integer num) {
        Intent intent = new Intent(context, (Class<?>) SpeechRecognizerActivity.class);
        if (num != null) {
            intent.putExtra("prompt_res_id", num);
        }
        return intent;
    }

    static /* bridge */ /* synthetic */ void p(SpeechRecognizerActivity speechRecognizerActivity) {
        speechRecognizerActivity.v();
        speechRecognizerActivity.aG(new com.google.android.material.textfield.ao(speechRecognizerActivity, 3), speechRecognizerActivity.getResources().getInteger(R.integer.slide_animation_duration_ms));
    }

    public static void s(int i2, Intent intent, ax axVar) {
        ArrayList<String> stringArrayListExtra;
        String str = null;
        if (i2 == -1) {
            if (intent != null && intent.hasExtra("android.speech.extra.RESULTS") && (stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS")) != null && !stringArrayListExtra.isEmpty()) {
                com.waze.sharedui.utils.o.c().e();
                str = stringArrayListExtra.get(0);
            }
        } else if (i2 == 0) {
            com.waze.sound.f.d.f39988a.a().d();
        }
        if (str != null) {
            axVar.a(str);
        }
    }

    private final void v() {
        SpeechRecognizer speechRecognizer = this.f24053g;
        if (speechRecognizer != null) {
            speechRecognizer.setRecognitionListener(null);
            this.f24053g.cancel();
            this.f24053g.stopListening();
            try {
                this.f24053g.destroy();
            } catch (Exception e2) {
                Log.e("WAZE", "SpeechRecognizerActivity: Crashed when trying to destroy: ", e2);
            }
            this.f24053g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        ActivityCompat.requestPermissions(this, new String[]{"android.permission.RECORD_AUDIO"}, InputDeviceCompat.SOURCE_TOUCHSCREEN);
    }

    private final void x() {
        com.waze.ab.o oVar = new com.waze.ab.o();
        com.waze.shared_infra.o.a aVar = this.f24056l;
        oVar.Q(aVar.c(R.string.SPEECH_ACTIVITY_NOT_FOUND_TITLE, new Object[0]));
        oVar.P(aVar.c(R.string.SPEECH_ACTIVITY_NOT_FOUND_CONTENT, new Object[0]));
        oVar.f13808a = new dc(this, 3);
        oVar.G(new com.waze.planned_drive.v(this, 1));
        oVar.R(true);
        oVar.M(aVar.c(R.string.SPEECH_ACTIVITY_NOT_FOUND_BUTTON, new Object[0]));
        oVar.y(false);
        com.waze.z.a.d.ai.r(oVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y() {
        v();
        SpeechRecognizer speechRecognizerCreateSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(this, this.f24054h);
        this.f24053g = speechRecognizerCreateSpeechRecognizer;
        speechRecognizerCreateSpeechRecognizer.setRecognitionListener(this.f24052f);
        try {
            SpeechRecognizer speechRecognizer = this.f24053g;
            SettingsNativeManager settingsNativeManager = (SettingsNativeManager) com.waze.web.r.h(SettingsNativeManager.class);
            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
            intent.putExtra("android.speech.extra.LANGUAGE", settingsNativeManager.getCurrentSearchVoice());
            intent.putExtra("android.speech.extra.MAX_RESULTS", 3);
            intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
            intent.putExtra("calling_package", getPackageName());
            speechRecognizer.startListening(intent);
            if (!this.f24052f.isShowing()) {
                this.f24052f.show();
            }
            aw.b(this.f24052f);
        } catch (SecurityException e2) {
            com.waze.shared_infra.i.h.e("Could not start listening to speech recognizer: " + this.f24054h.getPackageName() + " " + this.f24054h.getClassName(), e2);
            this.f24053g.setRecognitionListener(null);
            if (this.f24052f.isShowing()) {
                this.f24052f.setOnDismissListener(null);
                this.f24052f.dismiss();
            }
            x();
        }
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v7.app.o, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aw awVar = this.f24052f;
        this.f24052f = new aw(this, this);
        if (isFinishing() || awVar == null || !awVar.isShowing()) {
            return;
        }
        awVar.setOnDismissListener(null);
        awVar.dismiss();
        y();
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) throws PackageManager.NameNotFoundException {
        int intExtra;
        aE();
        super.onCreate(bundle);
        Iterator<ResolveInfo> it = getPackageManager().queryIntentServices(new Intent("android.speech.RecognitionService"), 0).iterator();
        Integer numValueOf = null;
        ComponentName componentName = null;
        while (true) {
            if (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    if ("com.google.android.apps.speech.tts.googletts.service.GoogleTTSRecognitionService".equals(str2)) {
                        com.waze.shared_infra.i.h.a("Found RecognitionService. packageName: " + str + " name: " + str2);
                        componentName = new ComponentName(str, str2);
                        break;
                    }
                    if ("com.google.android.voicesearch.serviceapi.GoogleRecognitionService".equals(str2)) {
                        componentName = new ComponentName(str, str2);
                    } else {
                        com.waze.shared_infra.i.h.j("Found RecognitionService but not picked it. packageName: " + str + " name: " + str2);
                    }
                }
            } else if (componentName != null) {
                com.waze.shared_infra.i.h.a("Found service. packageName: " + componentName.getPackageName() + " name: " + componentName.getClassName());
            } else {
                try {
                    getPackageManager().getPackageInfo("com.google.android.apps.speechservices", 0);
                    com.waze.shared_infra.i.h.a("Found SpeechServices. packageName: com.google.android.apps.speechservices name: com.google.android.voicesearch.serviceapi.GoogleRecognitionService");
                    componentName = new ComponentName("com.google.android.apps.speechservices", "com.google.android.voicesearch.serviceapi.GoogleRecognitionService");
                } catch (PackageManager.NameNotFoundException unused) {
                    com.waze.shared_infra.i.h.j("Package not found: com.google.android.apps.speechservices");
                    componentName = null;
                }
            }
        }
        this.f24054h = componentName;
        if (componentName == null) {
            x();
            return;
        }
        this.f24052f = new aw(this, this);
        Intent intent = getIntent();
        if (intent.hasExtra("prompt_res_id") && (intExtra = intent.getIntExtra("prompt_res_id", -1)) != -1) {
            numValueOf = Integer.valueOf(intExtra);
        }
        this.f24055k = numValueOf;
        w();
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
    }

    @Override // android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (i2 == 4098) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                finish();
            } else {
                y();
            }
        }
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    public final void onStop() {
        super.onStop();
        v();
    }
}
