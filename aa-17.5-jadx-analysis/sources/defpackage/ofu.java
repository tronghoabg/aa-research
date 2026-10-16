package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class ofu {
    static final /* synthetic */ afia[] a = {new affn(ofu.class, "instance", "getInstance()Lcom/google/android/apps/auto/components/telecom/notification/processor/CallNotificationActionProcessor;", 0)};

    public static final PendingIntent a(oft oftVar, int i) {
        Intent intent = new Intent("com.google.android.gearhead.ACTION_HANDLE_PROJECTION_NOTIFICATION_INTENT");
        intent.setPackage("com.google.android.projection.gearhead");
        intent.putExtra("action", oftVar);
        intent.putExtra("call_id", i);
        Context context = mki.a.c;
        int i2 = ofx.d;
        ofx.d = i2 + 1;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i2, intent, 201326592);
        broadcast.getClass();
        return broadcast;
    }

    public static final void b(int i, yzy yzyVar) {
        ebf.j().f(odn.a().i(i, yzz.PROJECTION_NOTIFICATION, yzyVar));
    }
}
