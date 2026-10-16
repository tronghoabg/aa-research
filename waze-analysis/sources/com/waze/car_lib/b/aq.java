package com.waze.car_lib.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.content.IntentCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class aq extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ as f18993a;

    aq(as asVar) {
        this.f18993a = asVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        v vVar = (v) IntentCompat.getSerializableExtra(intent, "ALERTER_ACTION_EXTRA_KEY", v.class);
        int intExtra = intent.getIntExtra("ALERTER_ID_EXTRA_KEY", -1);
        com.waze.k kVar = (com.waze.k) IntentCompat.getParcelableExtra(intent, "ALERTER_ID_EXTRA_KEY", com.waze.k.class);
        if (vVar == null || intExtra == -1 || kVar == null) {
            return;
        }
        as.b(this.f18993a).J(vVar, kVar);
    }
}
