package defpackage;

import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class glq implements gek {
    private final gek a;
    private final urf b;

    public glq(gek gekVar, urf urfVar) {
        this.a = gekVar;
        this.b = urfVar;
    }

    @Override // defpackage.gek
    public final void a(glf glfVar) throws xr, RemoteException {
        boolean z;
        this.a.a(glfVar);
        try {
            urf urfVar = this.b;
            synchronized (urfVar) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jCurrentTimeMillis2 = 4000;
                while (true) {
                    z = urfVar.a;
                    if (z || jCurrentTimeMillis2 <= 0) {
                        break;
                    }
                    urfVar.wait(jCurrentTimeMillis2);
                    jCurrentTimeMillis2 = 4000 - (System.currentTimeMillis() - jCurrentTimeMillis);
                }
                if (!z) {
                    throw new TimeoutException("Response was not set while blocked");
                }
            }
            glfVar.a();
        } catch (InterruptedException e) {
            glfVar.a();
            throw new IllegalStateException("Exception while waiting for client response.", e);
        } catch (TimeoutException e2) {
            if (Log.isLoggable("CarApp.H", 5)) {
                Log.w("CarApp.H", "Timeout blocking for a client response", e2);
            }
        }
    }
}
