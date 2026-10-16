package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.car.CarAudioConfiguration;

/* loaded from: classes.dex */
public interface qvb extends IInterface {
    int b(int i, int i2) throws RemoteException;

    int c(int i, int i2) throws RemoteException;

    CarAudioConfiguration d(int i, int i2) throws RemoteException;

    CarAudioConfiguration f(int i, int i2) throws RemoteException;

    void g(qvn qvnVar) throws RemoteException;

    void h(qxg qxgVar) throws RemoteException;

    void k(qvn qvnVar) throws RemoteException;

    void l(qxg qxgVar) throws RemoteException;

    boolean m(long j) throws RemoteException;

    boolean n(long j) throws RemoteException;

    int[] o() throws RemoteException;

    int[] p() throws RemoteException;

    CarAudioConfiguration[] q(int i) throws RemoteException;

    CarAudioConfiguration[] r(int i) throws RemoteException;

    qvh s(qve qveVar, int i) throws RemoteException;

    qvo t() throws RemoteException;
}
