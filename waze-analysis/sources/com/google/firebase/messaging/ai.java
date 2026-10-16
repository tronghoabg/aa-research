package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ai extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private aj f10136a;

    /* renamed from: b, reason: collision with root package name */
    private Context f10137b;

    public ai(aj ajVar) {
        this.f10136a = ajVar;
    }

    public final void a() {
        if (aj.b()) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        aj ajVar = this.f10136a;
        if (ajVar != null) {
            Context contextA = ajVar.a();
            this.f10137b = contextA;
            contextA.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        aj ajVar = this.f10136a;
        if (ajVar != null && ajVar.c()) {
            if (aj.b()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            this.f10136a.f10141d;
            FirebaseMessaging.s(this.f10136a, 0L);
            Context context2 = this.f10137b;
            if (context2 != null) {
                context2.unregisterReceiver(this);
            }
            this.f10136a = null;
        }
    }
}
