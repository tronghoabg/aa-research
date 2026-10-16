package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class P implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final int f26609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC1717f f26610b;

    public P(AbstractC1717f abstractC1717f, int i5) {
        Objects.requireNonNull(abstractC1717f);
        this.f26610b = abstractC1717f;
        this.f26609a = i5;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC1717f abstractC1717f = this.f26610b;
        if (iBinder == null) {
            abstractC1717f.zzf(16);
            return;
        }
        synchronized (abstractC1717f.zzh()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC1717f.zzi((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof r)) ? new H(iBinder) : (r) iInterfaceQueryLocalInterface);
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f26610b.zzb(0, null, this.f26609a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC1717f abstractC1717f = this.f26610b;
        synchronized (abstractC1717f.zzh()) {
            abstractC1717f.zzi(null);
        }
        AbstractC1717f abstractC1717f2 = this.f26610b;
        int i5 = this.f26609a;
        Handler handler = abstractC1717f2.zzb;
        handler.sendMessage(handler.obtainMessage(6, i5, 1));
    }
}
