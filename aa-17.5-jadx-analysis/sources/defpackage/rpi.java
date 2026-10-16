package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class rpi extends ijo implements rpj {
    private final lii a;

    public rpi(lii liiVar) {
        super("com.google.android.gms.car.lifetime.IProjectionLifetime");
        this.a = liiVar;
    }

    @Override // defpackage.rpj
    public final void e(rpm rpmVar) {
        lii liiVar = this.a;
        liiVar.sendMessage(liiVar.obtainMessage(0, Binder.getCallingUid(), 0, rpmVar));
    }

    @Override // defpackage.rpj
    public final void f(rpm rpmVar) {
        lii liiVar = this.a;
        liiVar.sendMessage(liiVar.obtainMessage(1, Binder.getCallingUid(), 0, rpmVar));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        rpm rpkVar = null;
        if (i == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.car.lifetime.IProjectionLifetimeCallback");
                rpkVar = iInterfaceQueryLocalInterface instanceof rpm ? (rpm) iInterfaceQueryLocalInterface : new rpk(strongBinder);
            }
            ijp.d(parcel);
            e(rpkVar);
        } else {
            if (i != 3) {
                return false;
            }
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.car.lifetime.IProjectionLifetimeCallback");
                rpkVar = iInterfaceQueryLocalInterface2 instanceof rpm ? (rpm) iInterfaceQueryLocalInterface2 : new rpk(strongBinder2);
            }
            ijp.d(parcel);
            f(rpkVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
