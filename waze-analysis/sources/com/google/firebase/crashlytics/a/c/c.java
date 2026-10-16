package com.google.firebase.crashlytics.a.c;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Float f9164a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9165b;

    private c(Float f2, boolean z) {
        this.f9165b = z;
        this.f9164a = f2;
    }

    public static c b(Context context) {
        boolean z = false;
        Float fValueOf = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
                if (intExtra != -1 && (intExtra == 2 || intExtra == 5)) {
                    z = true;
                }
                int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (intExtra2 != -1 && intExtra3 != -1) {
                    fValueOf = Float.valueOf(intExtra2 / intExtra3);
                }
            }
        } catch (IllegalStateException e2) {
            com.google.firebase.crashlytics.a.i.a().e("An error occurred getting battery state.", e2);
        }
        return new c(fValueOf, z);
    }

    public final int a() {
        Float f2;
        if (!this.f9165b || (f2 = this.f9164a) == null) {
            return 1;
        }
        return ((double) f2.floatValue()) < 0.99d ? 2 : 3;
    }

    public final Float c() {
        return this.f9164a;
    }
}
