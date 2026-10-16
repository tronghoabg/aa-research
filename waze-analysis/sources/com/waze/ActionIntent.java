package com.waze;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class ActionIntent extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            ((NotificationManager) context.getSystemService("notification")).cancel(2);
            try {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            } catch (SecurityException unused) {
            }
            if (intent.getData() != null) {
                String stringExtra = intent.getStringExtra("QuestionID");
                Intent intent2 = new Intent(context, (Class<?>) FreeMapAppActivity.class);
                intent2.setData(intent.getData());
                if (stringExtra != null && !stringExtra.isEmpty()) {
                    intent2.putExtra("QuestionID", stringExtra);
                }
                intent2.setFlags(268435456);
                context.startActivity(intent2);
            }
        } catch (Throwable unused2) {
        }
    }
}
