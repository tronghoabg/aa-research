package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public abstract class zsj {
    public static final String d = "zsj";
    public final Context e;
    public final Executor f;
    protected final String h;
    protected final String i;
    public IInterface k;
    public final Queue g = new ArrayDeque();
    public final ServiceConnection j = new lbg(this, 4);
    public int l = 1;

    public zsj(Context context, Executor executor) {
        zkt.n(context, "processContext");
        this.e = context;
        this.h = "com.google.android.gms";
        this.i = "com.google.android.gms.maps.auth.ApiTokenService";
        zkt.n(executor, "executor");
        this.f = executor;
    }

    public abstract IInterface a(IBinder iBinder);

    public final void d() {
        ServiceConnection serviceConnection = this.j;
        synchronized (serviceConnection) {
            if (this.l == 3) {
                this.l = 1;
                this.e.unbindService(serviceConnection);
            } else {
                String str = d;
                if (zrn.e(str, 6)) {
                    Log.e(str, "Attempt to unbind a service that is not bound.");
                }
            }
        }
    }
}
