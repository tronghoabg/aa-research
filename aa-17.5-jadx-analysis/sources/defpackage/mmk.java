package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.CrossProfileApps;
import com.google.android.apps.auto.components.settings.ui.CarSettingsService;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class mmk implements wd {
    private final /* synthetic */ int a;

    public /* synthetic */ mmk(int i) {
        this.a = i;
    }

    @Override // defpackage.wd
    public final void a(boolean z) {
        int i = this.a;
        if (i == 0) {
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, yzy.ew).l());
            mpl.f().a().b("key_settings_gemini_share_precise_location", z);
            return;
        }
        if (i != 1) {
            mme mmeVarB = mme.b();
            qrn qrnVarE = kio.b().e();
            jfe jfeVar = z ? jfe.ON : jfe.OFF;
            yzz yzzVar = yzz.SETTINGS_CAR_SCREEN_UI;
            ((ype) mme.a.l().ai((char) 5059)).y("updateMultiDisplaySetting(%s)", jfeVar);
            mme.c(qrnVarE, "power_saving_mode", jfeVar.c, yzzVar, jfeVar.d);
            mmeVarB.b.m(jfeVar);
            return;
        }
        boolean zG = kwo.b().g();
        CarSettingsService.c.l().Q("setWorkProfileSupportEnabled\nenabled=%b\nshouldRequestPermission=%b", z, zG);
        if (zG && z) {
            kwo kwoVarB = kwo.b();
            CrossProfileApps crossProfileApps = kwoVarB.c;
            yzz yzzVar2 = yzz.SETTINGS_CAR_SCREEN_UI;
            crossProfileApps.getClass();
            Intent intentCreateRequestInteractAcrossProfilesIntent = crossProfileApps.createRequestInteractAcrossProfilesIntent();
            intentCreateRequestInteractAcrossProfilesIntent.addFlags(268435456);
            Context context = kwoVarB.b;
            mfe.a();
            mfe.b(context, intentCreateRequestInteractAcrossProfilesIntent, context.getString(R.string.permission_prompt_toast_success), context.getString(R.string.permission_prompt_toast_failure_due_to_locked_phone), context.getString(R.string.permission_prompt_toast_failure_due_to_driving), null, yzz.CROSS_PROFILE_CONNECTION, 1);
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzzVar2, yzy.BD).l());
        }
        mpl.f().a().a("key_work_profile_support", z);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, z ? yzy.BA : yzy.BB).l());
    }
}
