package com.waze.sound;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ce extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cf f39648a;

    ce(cf cfVar) {
        this.f39648a = cfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f39648a.j();
    }
}
