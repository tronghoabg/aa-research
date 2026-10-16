package d7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: d7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC2398a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public boolean f34111a = false;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f34112b = new LinkedBlockingQueue();

    public final IBinder a() {
        AbstractC1732v.h("BlockingServiceConnection.getService() called on main thread");
        if (this.f34111a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f34111a = true;
        return (IBinder) this.f34112b.take();
    }

    public final IBinder b() throws TimeoutException {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC1732v.h("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f34111a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f34111a = true;
        IBinder iBinder = (IBinder) this.f34112b.poll(10000L, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f34112b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
