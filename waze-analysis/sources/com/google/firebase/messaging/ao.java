package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ao extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ap f10165a;

    /* renamed from: b, reason: collision with root package name */
    private ap f10166b;

    public ao(ap apVar, ap apVar2) {
        Objects.requireNonNull(apVar);
        this.f10165a = apVar;
        this.f10166b = apVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        ap apVar = this.f10166b;
        if (apVar != null && apVar.e()) {
            if (ap.c()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.f10166b.f10173g.b(this.f10166b, 0L);
            context.unregisterReceiver(this);
            this.f10166b = null;
        }
    }
}
