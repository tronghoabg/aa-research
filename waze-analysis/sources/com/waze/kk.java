package com.waze;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class kk extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static kk f25052a;

    /* renamed from: b, reason: collision with root package name */
    private volatile int f25053b = -1;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f25054c = -1;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f25055d;

    private kk(Context context) {
        e(context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
    }

    static kk c(Context context) {
        kk kkVar = f25052a;
        if (kkVar != null) {
            return kkVar;
        }
        kk kkVar2 = new kk(context);
        f25052a = kkVar2;
        return kkVar2;
    }

    private final void e(Intent intent) {
        if (intent == null) {
            return;
        }
        this.f25054c = (intent.getIntExtra("level", 0) * 100) / intent.getIntExtra("scale", 100);
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        this.f25055d = intExtra == 2 || intExtra == 5;
        this.f25053b = intent.getIntExtra("temperature", 100) / 10;
    }

    public final int a() {
        return this.f25054c;
    }

    public final int b() {
        return this.f25053b;
    }

    public final boolean d() {
        return this.f25055d;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            e(intent);
        }
    }
}
