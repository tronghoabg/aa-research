package defpackage;

import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class qww extends ijo implements qwx {
    private final WeakReference a;

    public qww(qrx qrxVar) {
        super("com.google.android.gms.car.ICarMediaPlaybackStatusEventListener");
        this.a = new WeakReference(qrxVar);
    }

    @Override // defpackage.qwx
    public final void e(int i) {
        qrx qrxVar = (qrx) this.a.get();
        if (qrxVar != null) {
            Handler handler = (Handler) qrxVar.b;
            handler.sendMessage(handler.obtainMessage(3, i, 0));
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        int i2 = parcel.readInt();
        ijp.d(parcel);
        e(i2);
        return true;
    }
}
