package com.waze.inbox;

import android.content.Context;
import android.view.View;
import com.waze.ConfigManager;
import com.waze.R;
import com.waze.lm;
import com.waze.mywaze.MyWazeNativeManager;
import com.waze.reports.SosProvidersListActivity;
import com.waze.sdk.SdkConfiguration;
import com.waze.sdk.ae;
import com.waze.sdk.bd;
import com.waze.settings.CustomPromptsRecordingActivity;
import com.waze.settings.hd;
import com.waze.uid.FlowContext;
import com.waze.uid.FlowType;
import com.waze.uid.b.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f24641a;

    public /* synthetic */ e(int i2) {
        this.f24641a = i2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = this.f24641a;
        if (i2 == 0) {
            com.waze.alerters.a.k.e().d();
            return;
        }
        if (i2 == 3) {
            SdkConfiguration.enableAudioSdk(false);
            return;
        }
        if (i2 == 5) {
            SdkConfiguration.enableAudioSdk(false);
            return;
        }
        int i3 = 18;
        if (i2 == 16) {
            h.g.b.x.f(view, "v");
            Context context = view.getContext();
            if (context == null) {
                com.waze.shared_infra.i.h.d("LogoutConfirmationDialog", "context is null");
                return;
            }
            if (com.waze.sharedui.profile.b.a().b().getBasicInfo().getEmailVerified()) {
                com.waze.sharedui.g.p pVar = new com.waze.sharedui.g.p(context);
                pVar.h(com.waze.shared_infra.o.b.a().c(R.string.LOG_OUT, new Object[0]));
                pVar.e(com.waze.shared_infra.o.b.a().c(R.string.CONFIRM_LOG_OUT_TEXT, new Object[0]));
                pVar.c(com.waze.shared_infra.o.b.a().c(R.string.CONFIRM_LOG_OUT_BUTTON_TEXT, new Object[0]), new com.waze.uid.e(0));
                pVar.g(com.waze.shared_infra.o.b.a().c(R.string.CONFIRM_LOG_OUT_CANCEL_BUTTON_TEXT, new Object[0]), new e(19));
                pVar.j();
                pVar.d();
                pVar.i();
                return;
            }
            com.waze.sharedui.g.p pVar2 = new com.waze.sharedui.g.p(context);
            pVar2.h(com.waze.shared_infra.o.b.a().c(R.string.LOG_OUT_QUESTION, new Object[0]));
            pVar2.e(com.waze.shared_infra.o.b.a().c(R.string.CONFIRM_LOG_OUT_UNVERIFIED_EMAIL_TEXT, new Object[0]));
            pVar2.c(com.waze.shared_infra.o.b.a().c(R.string.CONFIRM_CREATE_ACCOUNT_BUTTON, new Object[0]), new e(i3));
            pVar2.g(com.waze.shared_infra.o.b.a().c(R.string.CONFIRM_LOG_OUT_ANYWAY_BUTTON, new Object[0]), new com.waze.uid.e(1));
            pVar2.j();
            pVar2.d();
            pVar2.i();
            return;
        }
        if (i2 == 18) {
            ab.f44136a.a().A(com.waze.uid.r.d(FlowType.ADD_ID, FlowContext.OTHER));
            return;
        }
        switch (i2) {
            case 7:
                bd.d();
                bd.Q();
                break;
            case 8:
                com.waze.settings.c.n.b(hd.f37382a, ConfigManager.getInstance());
                break;
            case 9:
                com.waze.app_nav.w.f15441a.a().d();
                break;
            case 10:
                com.waze.app_nav.w.f15441a.a().c();
                break;
            case 11:
                int i4 = SosProvidersListActivity.f33565f;
                com.waze.share.aa.f(com.waze.share.z.f37758e, MyWazeNativeManager.getInstance().GetLastShareURL());
                break;
            case 12:
                int i5 = com.waze.rtalerts.l.f35131a;
                com.waze.sharedui.a.e eVarE = lm.d().e();
                eVarE.setResult(-1);
                eVarE.finish();
                break;
            case 13:
                int i6 = ae.f35216a;
                SdkConfiguration.openAudioSdkSettingsScreen();
                break;
            case 14:
                int i7 = CustomPromptsRecordingActivity.f36666f;
                break;
        }
    }
}
