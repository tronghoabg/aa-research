package com.waze.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f35271a;

    b(d dVar) {
        this.f35271a = dVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        if (h.g.b.x.n(intent.getAction(), "android.intent.action.PACKAGE_ADDED") || h.g.b.x.n(intent.getAction(), "android.intent.action.PACKAGE_REMOVED")) {
            this.f35271a.c();
        }
    }
}
