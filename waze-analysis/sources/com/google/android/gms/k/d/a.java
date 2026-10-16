package com.google.android.gms.k.d;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f5570a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f5571b = false;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f5572c = false;

    static {
        f5570a = Build.VERSION.SDK_INT >= 31 ? GroupFlagsKt.HasAuxSlotFlag : 0;
    }

    public static PendingIntent a(Context context, Intent intent, int i2) {
        return PendingIntent.getActivity(context, 0, intent, i2);
    }

    public static PendingIntent b(Context context, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, 0, intent, i2);
    }
}
