package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.car.CarPhoneStatus;

/* loaded from: classes.dex */
public interface qxp extends IInterface {
    void g(CarPhoneStatus carPhoneStatus) throws RemoteException;

    void h(qxs qxsVar, CarPhoneStatus carPhoneStatus) throws RemoteException;

    boolean i() throws RemoteException;

    boolean j(int i, qxs qxsVar) throws RemoteException;

    boolean k(qxs qxsVar) throws RemoteException;

    boolean l(qxs qxsVar) throws RemoteException;
}
