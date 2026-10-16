package com.waze.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.core.content.IntentCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.firebase.messaging.z;
import com.waze.kw;
import com.waze.ui.z.as;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class DeleteNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        x.f(context, "context");
        x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        String stringExtra = intent.getStringExtra("NotificationType");
        com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("DeleteNotificationReceiver");
        x.e(eVarD, "create(...)");
        kw.f25072a.a().d(as.c(eVarD, stringExtra));
        z zVar = (z) ((Parcelable) IntentCompat.getParcelableExtra(intent, "RemoteMessage", z.class));
        if (zVar != null) {
            g gVar = new g(zVar);
            if (gVar.l() != null) {
                n.f33443a.a().b(gVar);
            }
        }
    }
}
