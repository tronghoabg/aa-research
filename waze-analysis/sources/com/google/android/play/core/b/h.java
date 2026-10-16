package com.google.android.play.core.b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f6973a;

    /* synthetic */ h(i iVar) {
        Objects.requireNonNull(iVar);
        this.f6973a = iVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        i iVar = this.f6973a;
        iVar.n.h("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        iVar.p(new f(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        i iVar = this.f6973a;
        iVar.n.h("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        iVar.p(new g(this));
    }
}
