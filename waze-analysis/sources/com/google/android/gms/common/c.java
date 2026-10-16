package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.api.internal.av;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    boolean f4921a = false;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f4922b = new LinkedBlockingQueue();

    public final IBinder a(TimeUnit timeUnit) throws TimeoutException {
        av.h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f4921a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f4921a = true;
        IBinder iBinder = (IBinder) this.f4922b.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f4922b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
