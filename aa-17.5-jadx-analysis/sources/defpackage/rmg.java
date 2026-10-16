package defpackage;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class rmg extends ijn implements rmi {
    public rmg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.input.ICarProjectionInputServiceCallback");
    }

    @Override // defpackage.rmi
    public final void e() throws RemoteException {
        gj(1, gh());
    }
}
