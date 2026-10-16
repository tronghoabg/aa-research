package defpackage;

import android.os.RemoteException;
import androidx.car.app.IAppHost;
import androidx.car.app.ICarHost;
import androidx.car.app.hardware.ICarHardwareHost;

/* loaded from: classes2.dex */
public final /* synthetic */ class qh implements qo {
    private final /* synthetic */ int a;

    @Override // defpackage.qo
    public final Object a(Object obj) throws RemoteException {
        int i = this.a;
        if (i == 0) {
            ((ICarHost) obj).finish();
            return null;
        }
        if (i != 1) {
            return ICarHardwareHost.Stub.asInterface(((ICarHost) obj).getHost("hardware"));
        }
        ((IAppHost) obj).invalidate();
        return null;
    }
}
