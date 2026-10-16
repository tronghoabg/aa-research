package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class adqb {
    public static final Logger a = Logger.getLogger(adqb.class.getName());
    public static final adqq c = new adqq();
    protected final IBinder b;

    protected adqb(IBinder iBinder) {
        this.b = iBinder;
    }

    public static adqb b(IBinder iBinder, Executor executor) {
        return iBinder instanceof Binder ? new adpz(iBinder, executor) : new adqa(iBinder);
    }

    public abstract void a(int i, adqf adqfVar) throws RemoteException;

    protected final boolean c(int i, Parcel parcel) throws RemoteException {
        try {
            return this.b.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
