package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.car.control.CarAction;
import com.google.android.gms.car.control.CarProperty;
import com.google.android.gms.car.control.CarPropertyState;
import com.google.android.gms.car.control.CarPropertyValue;
import java.util.List;

/* loaded from: classes.dex */
public interface rim extends IInterface {
    CarPropertyState f(CarProperty carProperty) throws RemoteException;

    List i() throws RemoteException;

    List j() throws RemoteException;

    List k() throws RemoteException;

    void l() throws RemoteException;

    void n(CarAction carAction) throws RemoteException;

    void t(int i, rip ripVar) throws RemoteException;

    void u(riv rivVar, List list) throws RemoteException;

    void v(CarProperty carProperty, CarPropertyValue carPropertyValue, ris risVar) throws RemoteException;

    void w(rip ripVar) throws RemoteException;

    void x(riv rivVar) throws RemoteException;
}
