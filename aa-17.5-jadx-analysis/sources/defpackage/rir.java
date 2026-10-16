package defpackage;

import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.control.CarProperty;
import com.google.android.gms.car.control.CarPropertySetError;

/* loaded from: classes2.dex */
public final class rir extends ijo implements ris {
    public final ajmd a;
    private final sss b;

    public rir(ajmd ajmdVar) {
        super("com.google.android.gms.car.control.ICarPropertySetResultCallback");
        this.b = new sss(Looper.getMainLooper());
        this.a = ajmdVar;
    }

    @Override // defpackage.ris
    public final void e(CarProperty carProperty, CarPropertySetError carPropertySetError) throws RemoteException {
        this.b.post(new rdz(this, carProperty, carPropertySetError, 2));
    }

    @Override // defpackage.ris
    public final void f(CarProperty carProperty) throws RemoteException {
        this.b.post(new rfc(this, carProperty, 11));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 2) {
            CarProperty carProperty = (CarProperty) ijp.a(parcel, CarProperty.CREATOR);
            ijp.d(parcel);
            f(carProperty);
        } else {
            if (i != 3) {
                return false;
            }
            CarProperty carProperty2 = (CarProperty) ijp.a(parcel, CarProperty.CREATOR);
            CarPropertySetError carPropertySetError = (CarPropertySetError) ijp.a(parcel, CarPropertySetError.CREATOR);
            ijp.d(parcel);
            e(carProperty2, carPropertySetError);
        }
        parcel2.writeNoException();
        return true;
    }
}
