package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class o extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private p f9966a;

    public o(p pVar) {
        this.f9966a = pVar;
    }

    public final void a() {
        if (FirebaseInstanceId.k()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.f9966a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        p pVar = this.f9966a;
        if (pVar != null && pVar.b()) {
            if (FirebaseInstanceId.k()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            this.f9966a.f9970d;
            FirebaseInstanceId.o(this.f9966a, 0L);
            this.f9966a.a().unregisterReceiver(this);
            this.f9966a = null;
        }
    }
}
