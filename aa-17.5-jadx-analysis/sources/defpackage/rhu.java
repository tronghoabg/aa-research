package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class rhu implements ServiceConnection {
    protected rhu() {
    }

    public abstract void a(ComponentName componentName, IBinder iBinder);

    public abstract void b(ComponentName componentName);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        b(componentName);
    }
}
