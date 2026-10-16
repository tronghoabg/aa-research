package com.waze;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v implements org.a.d.a.a {
    public static final PendingIntent b(Context context, lv lvVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(lvVar, "message");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, lvVar.a(), d(context, lvVar), Build.VERSION.SDK_INT >= 31 ? 301989888 : 268435456);
        h.g.b.x.e(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    private static final Context c(h.f fVar) {
        return (Context) fVar.getValue();
    }

    private static final Intent d(Context context, lv lvVar) {
        Intent intent = new Intent(context, (Class<?>) AppServiceBroadcastReceiver.class);
        intent.setAction("custom_waze_service_action");
        intent.putExtra("message_key", lvVar);
        return intent;
    }

    public final void a(lv lvVar) {
        h.g.b.x.f(lvVar, "message");
        h.f fVarB = h.g.b(h.h.f48130a, new du(this, 1));
        c(fVarB).sendBroadcast(d(c(fVarB), lvVar));
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
