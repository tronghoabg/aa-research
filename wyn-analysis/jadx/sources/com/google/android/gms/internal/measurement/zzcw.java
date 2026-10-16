package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes4.dex */
public final class zzcw {
    public static final int zza;

    static {
        zza = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }

    public static PendingIntent zza(Context context, int i5, Intent intent, int i10) {
        return PendingIntent.getBroadcast(context, 0, intent, i10);
    }
}
