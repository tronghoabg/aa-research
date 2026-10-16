package com.waze;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.waze.gw.Gateway;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class AppServiceBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final v f13533a = new v();

    public static final void a(lv lvVar, long j2) {
        h.g.b.x.f(lvVar, "message");
        kotlinx.coroutines.aj.z(kotlinx.coroutines.aj.f(), null, null, new u(j2, lvVar, null), 3);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(intent, AccessibilityNodeInfoCompat.MathInfoCompat.MATH_ATTRIBUTE_INTENT);
        Serializable serializableExtra = intent.getSerializableExtra("message_key");
        lv lvVar = serializableExtra instanceof lv ? (lv) serializableExtra : null;
        if (lvVar == null) {
            Uri data = intent.getData();
            Objects.toString(data);
            com.waze.shared_infra.i.h.k("WAZE_Service", "failed to parse request: data=".concat(String.valueOf(data)));
            return;
        }
        Context applicationContext = context.getApplicationContext();
        h.g.b.x.e(applicationContext, "getApplicationContext(...)");
        if (lvVar instanceof lt) {
            Intent intent2 = new Intent(applicationContext, (Class<?>) MainActivity.class);
            intent2.setFlags(268435456);
            applicationContext.startActivity(intent2);
        } else {
            if (lvVar instanceof ls) {
                Intent intent3 = new Intent(applicationContext, (Class<?>) FreeMapAppActivity.class);
                intent3.setAction("android.intent.action.MAIN");
                intent3.addCategory("android.intent.category.LAUNCHER");
                intent3.setFlags(268435456);
                applicationContext.startActivity(intent3);
                return;
            }
            if (!(lvVar instanceof lu)) {
                throw new h.i();
            }
            if (NativeManager.isAppStarted()) {
                Gateway.requestExplicitShutdown();
                NativeManager.getInstance().shutDown();
            }
        }
    }
}
