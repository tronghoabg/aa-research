package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f5047a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5048b;

    public h(m mVar, int i2) {
        Objects.requireNonNull(mVar);
        this.f5047a = mVar;
        this.f5048b = i2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m mVar = this.f5047a;
        if (iBinder == null) {
            m.Z(mVar);
            return;
        }
        synchronized (mVar.f5063k) {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            mVar.f5064l = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof au)) ? new at(iBinder) : (au) iInterfaceQueryLocalInterface;
        }
        this.f5047a.P(0, null, this.f5048b);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        m mVar = this.f5047a;
        synchronized (mVar.f5063k) {
            mVar.f5064l = null;
        }
        m mVar2 = this.f5047a;
        int i2 = this.f5048b;
        Handler handler = mVar2.f5055b;
        handler.sendMessage(handler.obtainMessage(6, i2, 1));
    }
}
