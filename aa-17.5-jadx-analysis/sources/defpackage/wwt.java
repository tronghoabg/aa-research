package defpackage;

import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.format.Time;
import android.text.method.PasswordTransformationMethod;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.RequestManifestPermissionsActivity;
import com.google.android.projection.gearhead.companion.RequestNotificationAccessActivity;
import com.google.android.projection.gearhead.companion.devsettings.AppQualityTesterActivity;
import com.google.android.projection.gearhead.companion.feedback.FeedbackEditorActivity;
import com.google.android.projection.gearhead.companion.settings.AddAssistantShortcutActivity;
import com.google.android.projection.gearhead.companion.settings.LauncherAppSettingsActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final /* synthetic */ class wwt implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wwt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IOException {
        int i = 0;
        switch (this.b) {
            case 0:
                ((www) this.a).m();
                return;
            case 1:
                Object obj = this.a;
                wwn wwnVar = (wwn) obj;
                EditText editText = wwnVar.a;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (view.hasFocus()) {
                    wwnVar.a.requestFocus();
                }
                if (text != null) {
                    text.clear();
                }
                ((wxb) obj).x();
                return;
            case 2:
                Object obj2 = this.a;
                wxg wxgVar = (wxg) obj2;
                EditText editText2 = wxgVar.a;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                if (wxgVar.k()) {
                    wxgVar.a.setTransformationMethod(null);
                } else {
                    wxgVar.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    wxgVar.a.setSelection(selectionEnd);
                }
                ((wxb) obj2).x();
                return;
            case 3:
                ((wyr) this.a).finish();
                return;
            case 4:
                ((wyr) this.a).b();
                return;
            case 5:
                ((ob) this.a).startActivityForResult(lfm.c().d.c(), 47);
                return;
            case 6:
                Object obj3 = this.a;
                ((ob) obj3).startActivityForResult(new Intent((Context) obj3, (Class<?>) RequestManifestPermissionsActivity.class), 48);
                return;
            case 7:
                Object obj4 = this.a;
                ((ob) obj4).startActivityForResult(new Intent((Context) obj4, (Class<?>) RequestNotificationAccessActivity.class), 49);
                return;
            case 8:
                Button button = (Button) view;
                button.setText(R.string.companion_handwriting_input_downloading);
                button.setEnabled(false);
                new wyu((lgp) this.a).execute(button);
                return;
            case 9:
                ((AlertDialog) this.a).dismiss();
                return;
            case 10:
                Object obj5 = this.a;
                AppQualityTesterActivity appQualityTesterActivity = (AppQualityTesterActivity) obj5;
                appQualityTesterActivity.u.setEnabled(false);
                appQualityTesterActivity.q = ((ComponentName) appQualityTesterActivity.p.get(appQualityTesterActivity.t.getSelectedItemPosition())).flattenToShortString();
                appQualityTesterActivity.A();
                yfq yfqVar = yls.a;
                appQualityTesterActivity.r = yfqVar;
                appQualityTesterActivity.s.b(appQualityTesterActivity.r);
                Context applicationContext = appQualityTesterActivity.getApplicationContext();
                ComponentName componentName = (ComponentName) appQualityTesterActivity.p.get(appQualityTesterActivity.t.getSelectedItemPosition());
                zgp zgpVarY = wub.Y(yfqVar);
                kex kexVar = appQualityTesterActivity.o;
                Object obj6 = kexVar.b;
                yfq yfqVarS = yfq.s(new kez(), new kff(), new kfc());
                int i2 = ((yls) yfqVarS).c;
                while (i < i2) {
                    zgpVarY = zfb.g(zgpVarY, new oyf(kexVar, (keu) yfqVarS.get(i), applicationContext, componentName, 1), new fpe(kexVar.c, 3));
                    i++;
                }
                ikn iknVar = new ikn(obj5, 18);
                Handler handler = appQualityTesterActivity.n;
                handler.getClass();
                wub.ah(zgpVarY, iknVar, new fpe(handler, 10));
                return;
            case 11:
                Time time = new Time();
                time.setToNow();
                Object obj7 = this.a;
                File file = new File(((FeedbackEditorActivity) obj7).getExternalFilesDir("screendumps"), "screendump - " + time.format("%Y-%m-%d-%H:%M:%S") + ".png");
                try {
                    InputStream inputStreamB = wdx.b((Context) obj7, ((FeedbackEditorActivity) obj7).b.h, wdw.b);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            yts.a(inputStreamB, fileOutputStream);
                            fileOutputStream.close();
                            if (inputStreamB != null) {
                                inputStreamB.close();
                            }
                            Object obj8 = this.a;
                            ((FeedbackEditorActivity) obj8).startActivity(Intent.createChooser(new Intent("android.intent.action.SEND").addFlags(268959744).addFlags(1).setType("image/*").putExtra("android.intent.extra.STREAM", duq.a((Context) obj8, "com.google.android.projection.gearhead.devsettings.fileprovider", file)), null));
                            return;
                        } finally {
                        }
                    } finally {
                    }
                } catch (IOException e) {
                    ((ype) ((ype) ((ype) FeedbackEditorActivity.a.g()).p(e)).ai((char) 9972)).u("Failed to copy screenshot!");
                    Toast.makeText((Context) this.a, "Failed to copy screenshot!", 0).show();
                    return;
                }
            case 12:
                Object obj9 = this.a;
                FeedbackEditorActivity feedbackEditorActivity = (FeedbackEditorActivity) obj9;
                feedbackEditorActivity.b.f = ((EditText) feedbackEditorActivity.findViewById(R.id.description)).getText().toString();
                CheckBox checkBox = feedbackEditorActivity.e;
                if (checkBox != null && !checkBox.isChecked()) {
                    feedbackEditorActivity.b.n = null;
                }
                ldw.g((Context) obj9, feedbackEditorActivity.b);
                feedbackEditorActivity.finish();
                return;
            case 13:
                Object obj10 = this.a;
                FeedbackEditorActivity feedbackEditorActivity2 = (FeedbackEditorActivity) obj10;
                feedbackEditorActivity2.b.f((Context) obj10);
                feedbackEditorActivity2.c = true;
                feedbackEditorActivity2.finish();
                return;
            case 14:
                ldw.e((Context) this.a);
                return;
            case 15:
                ((AddAssistantShortcutActivity) this.a).A();
                return;
            case 16:
                woy.Z(!lbh.d().i());
                AddAssistantShortcutActivity addAssistantShortcutActivity = (AddAssistantShortcutActivity) this.a;
                ((ype) AddAssistantShortcutActivity.m.l().ai((char) 9988)).w("test query, len=%d", addAssistantShortcutActivity.o.getText().length());
                if (TextUtils.isEmpty(addAssistantShortcutActivity.o.getText())) {
                    Snackbar.k(addAssistantShortcutActivity.n, R.string.settings_customize_add_assistant_shortcut_error_query_empty).f();
                    return;
                }
                kfl.h().C(addAssistantShortcutActivity.o.getText().toString());
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LAUNCHER_SHORTCUT, yzy.uM).l());
                Snackbar.k(addAssistantShortcutActivity.n, R.string.settings_customize_add_assistant_test_query_starting_assistant).f();
                return;
            case 17:
                ((AddAssistantShortcutActivity) this.a).A();
                return;
            case 18:
                ((wzy) this.a).F();
                return;
            case 19:
                ((wzy) this.a).F();
                return;
            default:
                ohs ohsVarJ = ebf.j();
                yxy yxyVar = yxy.GEARHEAD;
                yzz yzzVar = yzz.LAUNCHER_SHORTCUT;
                ohsVarJ.F(rrc.h(yxyVar, yzzVar, yzy.uH).l());
                int size = mrj.b().b.size();
                int iB = (int) acsi.b();
                Object obj11 = this.a;
                if (size >= iB) {
                    Snackbar.l(((xaf) obj11).a, mki.a.c.getResources().getQuantityString(R.plurals.settings_customize_add_shortcut_error_max_shortcuts_reached, (int) acsi.b(), Integer.valueOf((int) acsi.b())), 0).f();
                    ebf.j().F(rrc.h(yxyVar, yzzVar, yzy.uL).l());
                    return;
                }
                if (!acsi.d()) {
                    ((xaf) obj11).E();
                    return;
                }
                LauncherAppSettingsActivity launcherAppSettingsActivity = ((xaf) obj11).s.h;
                View viewInflate = launcherAppSettingsActivity.getLayoutInflater().inflate(R.layout.add_launcher_shortcut_type_dialog, (ViewGroup) launcherAppSettingsActivity.findViewById(android.R.id.content), false);
                em emVar = new em(new ContextThemeWrapper(launcherAppSettingsActivity, R.style.Theme_Gearhead_Settings_AlertDialog));
                emVar.n(R.string.settings_customize_add_shortcut_dialog_title);
                emVar.p(viewInflate);
                en enVarB = emVar.b();
                viewInflate.findViewById(R.id.call_shortcut_click_target).setOnClickListener(new xae(obj11, enVarB, i));
                if (mki.a.c.getSharedPreferences("AssistantPreferences", 0).getBoolean("GEMINI_ENABLED_KEY", false)) {
                    ((TextView) viewInflate.findViewById(R.id.assistant_shortcut)).setText(R.string.settings_customize_add_shortcut_dialog_option_gemini);
                    ((ImageView) viewInflate.findViewById(R.id.assistant_icon)).setImageDrawable(mki.a.c.getDrawable(2131233026));
                }
                viewInflate.findViewById(R.id.assistant_shortcut_click_target).setOnClickListener(new xae(obj11, enVarB, 2));
                enVarB.show();
                return;
        }
    }

    public wwt(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
