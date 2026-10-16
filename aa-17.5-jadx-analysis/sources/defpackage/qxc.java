package defpackage;

import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class qxc extends ijo implements qxd {
    private final WeakReference a;

    public qxc(roe roeVar) {
        super("com.google.android.gms.car.ICarMessageCallback");
        this.a = new WeakReference(roeVar);
    }

    @Override // defpackage.qxd
    public final void e(int i, int i2, int i3) {
        roe roeVar = (roe) this.a.get();
        if (roeVar == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(i3);
        Handler handler = roeVar.c;
        handler.sendMessage(handler.obtainMessage(1, i, i2, numValueOf));
    }

    @Override // defpackage.qxd
    public final void f(int i) {
        roe roeVar = (roe) this.a.get();
        if (roeVar == null) {
            return;
        }
        Handler handler = roeVar.c;
        handler.sendMessage(handler.obtainMessage(2, i, 0));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            ijp.d(parcel);
            e(i2, i3, i4);
        } else {
            if (i != 2) {
                return false;
            }
            int i5 = parcel.readInt();
            ijp.d(parcel);
            f(i5);
        }
        return true;
    }
}
