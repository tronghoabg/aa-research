package com.google.firebase.sessions;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ay implements ax {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.e f10854a;

    public ay(com.google.firebase.e eVar) {
        h.g.b.x.f(eVar, "firebaseApp");
        this.f10854a = eVar;
    }

    @Override // com.google.firebase.sessions.ax
    public final void a(Messenger messenger, ServiceConnection serviceConnection) {
        h.g.b.x.f(messenger, "callback");
        h.g.b.x.f(serviceConnection, "serviceConnection");
        Context applicationContext = this.f10854a.a().getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", messenger);
        try {
            if (applicationContext.bindService(intent, serviceConnection, 65)) {
                return;
            }
        } catch (SecurityException e2) {
            Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", e2);
        }
        h.g.b.x.c(applicationContext);
        try {
            applicationContext.unbindService(serviceConnection);
        } catch (IllegalArgumentException e3) {
            Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", e3);
        }
        Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
    }
}
