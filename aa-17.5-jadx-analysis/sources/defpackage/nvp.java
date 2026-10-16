package defpackage;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.auto.components.system.notification.quickfeedback.QuickFeedbackNotificationService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class nvp {
    public static final /* synthetic */ int a = 0;
    private static final AtomicInteger b = new AtomicInteger(0);

    public static PendingIntent a(Context context, yzz yzzVar, yzy yzyVar, ComponentName componentName, nvo nvoVar) {
        nvk nvkVar = new nvk(nvoVar, yzyVar);
        Intent intent = new Intent(context, (Class<?>) QuickFeedbackNotificationService.class);
        intent.putExtra("telemetry_ui_context_extra", yzzVar.he);
        intent.putExtra("telemetry_action_extra", yzyVar.a());
        intent.putExtra("telemetry_component_name_extra", componentName);
        Bundle bundle = new Bundle(1);
        bundle.putBinder("telemetry_feedback_callback_extra", nvkVar);
        intent.putExtra("telemetry_feedback_callback_extra", bundle);
        int andIncrement = b.getAndIncrement();
        ClipData clipData = wdu.a;
        PendingIntent pendingIntentD = wdu.d(context, andIncrement, intent, 67108864);
        pendingIntentD.getClass();
        return pendingIntentD;
    }
}
