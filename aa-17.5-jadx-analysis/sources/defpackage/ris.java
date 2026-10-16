package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.car.control.CarProperty;
import com.google.android.gms.car.control.CarPropertySetError;

/* loaded from: classes2.dex */
public interface ris extends IInterface {
    void e(CarProperty carProperty, CarPropertySetError carPropertySetError) throws RemoteException;

    void f(CarProperty carProperty) throws RemoteException;
}
