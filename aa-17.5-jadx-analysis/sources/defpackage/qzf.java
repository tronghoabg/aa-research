package defpackage;

import android.graphics.Point;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.KeyEvent;
import com.google.android.gms.car.CarWindowSpec;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes.dex */
public interface qzf extends IInterface {
    int e() throws RemoteException;

    Point f() throws RemoteException;

    qyz g(CarWindowSpec carWindowSpec, qzc qzcVar) throws RemoteException;

    void h(qyw qywVar) throws RemoteException;

    void i(CarRegionId carRegionId, KeyEvent keyEvent) throws RemoteException;

    void j(qwo qwoVar) throws RemoteException;

    void k(qyw qywVar) throws RemoteException;

    void l() throws RemoteException;

    void m(int i, int i2) throws RemoteException;

    void n(int i, int i2) throws RemoteException;

    void o(qwo qwoVar) throws RemoteException;

    boolean p() throws RemoteException;
}
