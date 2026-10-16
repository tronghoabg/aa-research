package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.format.DateFormat;
import j$.time.Duration;

/* loaded from: classes.dex */
public final class nza extends BroadcastReceiver {
    final /* synthetic */ bwq a;
    final /* synthetic */ byf b;

    public nza(byf byfVar, bwq bwqVar) {
        this.b = byfVar;
        this.a = bwqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        Duration duration = nyy.a;
        this.b.h(System.currentTimeMillis());
        if (affa.f(intent.getAction(), "android.intent.action.TIME_SET") || affa.f(intent.getAction(), "android.intent.action.TIMEZONE_CHANGED")) {
            this.a.b(Boolean.valueOf(DateFormat.is24HourFormat(context)));
        }
    }
}
