package com.waze.planned_drive;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.activity.ComponentActivity;
import com.waze.settings.CustomVoicesFallbackVoicePickerActivity;
import com.waze.settings.SettingsCalendarSelectionActivity;
import com.waze.settings.SettingsHOVSearchActivity;
import com.waze.settings.ds;
import com.waze.settings.gr;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class af implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f33187a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33188b;

    public /* synthetic */ af(Object obj, int i2) {
        this.f33188b = i2;
        this.f33187a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f33188b) {
            case 0:
                ay.C((ay) this.f33187a);
                break;
            case 1:
                ay.E((ay) this.f33187a);
                break;
            case 2:
                ay.D((ay) this.f33187a);
                break;
            case 3:
                com.waze.sdk.ae.Z((com.waze.sdk.ae) this.f33187a);
                break;
            case 4:
                ((com.waze.sdk.ae) this.f33187a).ar(false);
                break;
            case 5:
                ((com.waze.sdk.ae) this.f33187a).f35219e.J();
                break;
            case 6:
                int i2 = com.waze.sdk.ae.f35216a;
                com.waze.sdk.bd.d().F((String) this.f33187a);
                break;
            case 7:
                com.waze.sdk.ae aeVar = (com.waze.sdk.ae) this.f33187a;
                aeVar.ap(aeVar.f35223i);
                break;
            case 8:
                ((CustomVoicesFallbackVoicePickerActivity) this.f33187a).finish();
                break;
            case 9:
                ((ComponentActivity) this.f33187a).onBackPressed();
                break;
            case 10:
                CustomVoicesFallbackVoicePickerActivity customVoicesFallbackVoicePickerActivity = (CustomVoicesFallbackVoicePickerActivity) this.f33187a;
                customVoicesFallbackVoicePickerActivity.setResult(-1);
                customVoicesFallbackVoicePickerActivity.finish();
                break;
            case 11:
                ((android.support.v4.app.ar) this.f33187a).requireActivity().getOnBackPressedDispatcher().onBackPressed();
                break;
            case 12:
                ((android.support.v4.app.ar) this.f33187a).requireActivity().getOnBackPressedDispatcher().onBackPressed();
                break;
            case 13:
                ((ComponentActivity) this.f33187a).onBackPressed();
                break;
            case 14:
                SettingsCalendarSelectionActivity settingsCalendarSelectionActivity = (SettingsCalendarSelectionActivity) this.f33187a;
                settingsCalendarSelectionActivity.setResult(-1);
                settingsCalendarSelectionActivity.finish();
                break;
            case 15:
                Object obj = this.f33187a;
                ((ComponentActivity) obj).startActivityForResult(new Intent((Context) obj, (Class<?>) SettingsHOVSearchActivity.class), 0);
                break;
            case 16:
                SettingsHOVSearchActivity.v((SettingsHOVSearchActivity) this.f33187a);
                break;
            case 17:
                ((gr) this.f33187a).X();
                break;
            case 18:
                h.g.b.x.f(view, "v");
                Context context = view.getContext();
                h.g.b.x.e(context, "getContext(...)");
                ((ds) this.f33187a).G(context);
                break;
            case 19:
                ((ds) this.f33187a).V();
                break;
            default:
                ((gr) this.f33187a).X();
                break;
        }
    }
}
