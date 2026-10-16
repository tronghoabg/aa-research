package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class slq {
    public final int c;
    public boolean d = false;
    public boolean e = false;

    public slq(int i) {
        this.c = i;
    }

    public static Status j(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void f(Status status);

    public abstract void g(Exception exc);

    public abstract void h(sme smeVar) throws DeadObjectException;

    public abstract void i(rju rjuVar, boolean z);
}
