package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class saf {
    public volatile sbq b;
    private final Context c;
    private final ServiceConnection e = new sae(this, 0);
    public final Semaphore a = new Semaphore(0);
    private boolean d = false;

    public saf(Context context) {
        this.c = context;
    }

    public final synchronized void a() throws RemoteException {
        if (omc.c("CAR.DATA.SERVICE", 3)) {
            Log.d("CAR.DATA.SERVICE", "connect");
        }
        Intent intent = new Intent("com.google.android.gms.carsetup.CAR_DATA").setPackage("com.google.android.gms");
        boolean zD = spi.a().d(this.c, intent, this.e, 1);
        this.d = zD;
        if (!zD) {
            throw new RemoteException("Failed to bind to service");
        }
        try {
            if (this.a.tryAcquire(5000L, TimeUnit.MILLISECONDS)) {
            }
        } catch (InterruptedException unused) {
        }
        spi.a().b(this.c, this.e);
        this.d = false;
        throw new RemoteException("Failed to connect");
    }

    public final synchronized void b() {
        if (omc.c("CAR.DATA.SERVICE", 3)) {
            Log.d("CAR.DATA.SERVICE", "disconnect");
        }
        if (this.d) {
            spi.a().b(this.c, this.e);
            this.d = false;
        }
    }
}
