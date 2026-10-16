package defpackage;

import android.graphics.Point;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import com.google.android.gms.car.CarWindowSpec;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes.dex */
public final class qzd extends ijn implements qzf {
    public qzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.car.ICarWindowManager");
    }

    @Override // defpackage.qzf
    public final int e() throws RemoteException {
        Parcel parcelGi = gi(10, gh());
        int i = parcelGi.readInt();
        parcelGi.recycle();
        return i;
    }

    @Override // defpackage.qzf
    public final Point f() throws RemoteException {
        Parcel parcelGi = gi(9, gh());
        Point point = (Point) ijp.a(parcelGi, Point.CREATOR);
        parcelGi.recycle();
        return point;
    }

    @Override // defpackage.qzf
    public final qyz g(CarWindowSpec carWindowSpec, qzc qzcVar) throws RemoteException {
        qyz qyxVar;
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carWindowSpec);
        ijp.i(parcelGh, qzcVar);
        Parcel parcelGi = gi(11, parcelGh);
        IBinder strongBinder = parcelGi.readStrongBinder();
        if (strongBinder == null) {
            qyxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.ICarWindow");
            qyxVar = iInterfaceQueryLocalInterface instanceof qyz ? (qyz) iInterfaceQueryLocalInterface : new qyx(strongBinder);
        }
        parcelGi.recycle();
        return qyxVar;
    }

    @Override // defpackage.qzf
    public final void h(qyw qywVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qywVar);
        gj(2, parcelGh);
    }

    @Override // defpackage.qzf
    public final void i(CarRegionId carRegionId, KeyEvent keyEvent) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.g(parcelGh, carRegionId);
        ijp.g(parcelGh, keyEvent);
        gj(15, parcelGh);
    }

    @Override // defpackage.qzf
    public final void j(qwo qwoVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qwoVar);
        gj(16, parcelGh);
    }

    @Override // defpackage.qzf
    public final void k(qyw qywVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qywVar);
        gj(3, parcelGh);
    }

    @Override // defpackage.qzf
    public final void l() throws RemoteException {
        gj(7, gh());
    }

    @Override // defpackage.qzf
    public final void m(int i, int i2) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(i);
        parcelGh.writeInt(i2);
        gj(14, parcelGh);
    }

    @Override // defpackage.qzf
    public final void n(int i, int i2) throws RemoteException {
        Parcel parcelGh = gh();
        parcelGh.writeInt(0);
        parcelGh.writeInt(i2);
        gj(18, parcelGh);
    }

    @Override // defpackage.qzf
    public final void o(qwo qwoVar) throws RemoteException {
        Parcel parcelGh = gh();
        ijp.i(parcelGh, qwoVar);
        gj(17, parcelGh);
    }

    @Override // defpackage.qzf
    public final boolean p() throws RemoteException {
        Parcel parcelGi = gi(1, gh());
        boolean zJ = ijp.j(parcelGi);
        parcelGi.recycle();
        return zJ;
    }
}
