package com.google.android.apps.auto.components.system.notification.quickfeedback;

import android.app.IntentService;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import defpackage.ebf;
import defpackage.nvj;
import defpackage.nvl;
import defpackage.rrb;
import defpackage.rrc;
import defpackage.woy;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;

/* loaded from: classes2.dex */
public class QuickFeedbackNotificationService extends IntentService {
    private static final yph a = yph.c("GH.QuickFeedbackNS");

    public QuickFeedbackNotificationService() {
        super("QuickFeedbackNotificationService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        if (intent != null && intent.hasExtra("telemetry_action_extra") && intent.hasExtra("telemetry_ui_context_extra")) {
            ((ype) ((ype) a.f()).ai((char) 5468)).u("Logging telemetry for quick feedback");
            int intExtra = intent.getIntExtra("telemetry_ui_context_extra", -1);
            int intExtra2 = intent.getIntExtra("telemetry_action_extra", -1);
            ComponentName componentName = intent.hasExtra("telemetry_component_name_extra") ? (ComponentName) intent.getParcelableExtra("telemetry_component_name_extra") : null;
            woy.N(intExtra >= 0);
            woy.N(intExtra2 >= 0);
            yzz yzzVarB = yzz.b(intExtra);
            yzzVarB.getClass();
            yzy yzyVarB = yzy.b(intExtra2);
            yzyVarB.getClass();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzzVarB, yzyVarB);
            if (componentName != null) {
                rrbVarH.p(componentName);
            }
            ebf.j().F(rrbVarH.l());
            if (intent.hasExtra("telemetry_feedback_callback_extra")) {
                Bundle bundleExtra = intent.getBundleExtra("telemetry_feedback_callback_extra");
                bundleExtra.getClass();
                IBinder binder = bundleExtra.getBinder("telemetry_feedback_callback_extra");
                binder.getClass();
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("com.google.android.apps.auto.components.system.notification.quickfeedback.IOnFeedbackCallback");
                try {
                    (iInterfaceQueryLocalInterface instanceof nvl ? (nvl) iInterfaceQueryLocalInterface : new nvj(binder)).e();
                } catch (RemoteException e) {
                    ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 5469)).u("Projection is down when handling feedback");
                }
            }
        }
    }
}
