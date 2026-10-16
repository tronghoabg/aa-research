package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class rec implements rdl {
    private final zgp a;
    private final IBinder.DeathRecipient b;
    private volatile boolean c = false;
    private volatile boolean d = true;

    static {
        new rcj("Binder died");
    }

    @Deprecated
    public rec(qup qupVar, rdk rdkVar) throws RemoteException {
        this.a = qupVar == null ? zgl.a : new zgl(qupVar);
        ray rayVar = new ray(this, rdkVar, 2);
        this.b = rayVar;
        try {
            qupVar.asBinder().linkToDeath(rayVar, 0);
        } catch (RemoteException unused) {
            rrd.b("GH.SimpleCarClientCtor", null, "Unable to link death recipient to ICar.");
        }
    }

    @Override // defpackage.rdl
    @ResultIgnorabilityUnspecified
    public final synchronized qup a() {
        woy.aa(this.d, "Client not connected.");
        return (qup) wub.ag(this.a);
    }

    @Override // defpackage.rdl
    public final synchronized zgp b() {
        a();
        return zgl.a;
    }

    @Override // defpackage.rdl
    public final void c() {
        e(false);
    }

    @Override // defpackage.rdl
    public final synchronized boolean d() {
        return this.d;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized boolean e(boolean z) {
        boolean z2 = this.d;
        this.d = false;
        if (z2) {
            this.c = z;
            if (this.c) {
                return true;
            }
            IBinder.DeathRecipient deathRecipient = this.b;
            if (deathRecipient != null) {
                try {
                    ((qup) wub.ag(this.a)).asBinder().unlinkToDeath(deathRecipient, 0);
                } catch (NoSuchElementException unused) {
                }
            }
        }
        return false;
    }
}
