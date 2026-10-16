package com.google.firebase.sessions;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class au implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ av f10846a;

    au(av avVar) {
        this.f10846a = avVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        av avVar = this.f10846a;
        Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + avVar.f10849c.size());
        avVar.f10848b = new Messenger(iBinder);
        avVar.m(avVar.j());
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
        this.f10846a.f10848b = null;
    }
}
