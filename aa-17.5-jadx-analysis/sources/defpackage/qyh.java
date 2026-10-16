package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.car.CarSensorEvent;

/* loaded from: classes.dex */
public interface qyh extends IInterface {
    int g() throws RemoteException;

    void gd(int i, qyk qykVar) throws RemoteException;

    CarSensorEvent h(int i) throws RemoteException;

    boolean o(int i, int i2, qyk qykVar) throws RemoteException;

    int[] p() throws RemoteException;

    int[] s() throws RemoteException;

    int[] t() throws RemoteException;
}
