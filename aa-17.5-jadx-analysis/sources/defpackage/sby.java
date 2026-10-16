package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class sby extends ijo implements sbz {
    private IBinder a;
    private final boolean b;

    public sby(IBinder iBinder) {
        super("com.google.android.gms.carsetup.ILocalBinderTransport");
        this.a = iBinder;
        this.b = true;
    }

    @Override // defpackage.sbz
    public final IBinder e() {
        if (Binder.getCallingPid() != Process.myPid()) {
            throw new RuntimeException("Non-local call");
        }
        IBinder iBinder = this.a;
        if (this.b) {
            this.a = null;
        }
        return iBinder;
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        IBinder iBinderE = e();
        parcel2.writeNoException();
        parcel2.writeStrongBinder(iBinderE);
        return true;
    }
}
