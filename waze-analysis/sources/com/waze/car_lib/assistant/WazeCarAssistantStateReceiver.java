package com.waze.car_lib.assistant;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.waze.google_assistant.aa;
import com.waze.shared_infra.i.h;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class WazeCarAssistantStateReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        x.f(context, "context");
        x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        boolean booleanExtra = intent.getBooleanExtra("ASSISTANT_ACTIVE", false);
        h.h("Received broadcast for assistant state. isActive = " + booleanExtra);
        aa.f24060a.a().A(booleanExtra);
    }
}
