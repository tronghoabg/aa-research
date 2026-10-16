package defpackage;

import android.graphics.Rect;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.car.CarUiInfo;
import com.google.android.gms.car.display.CarDisplay;
import com.google.android.gms.car.display.CarDisplayUiFeatures;
import java.util.List;

/* loaded from: classes.dex */
public interface rjx extends IInterface {
    Rect a() throws RemoteException;

    CarUiInfo c() throws RemoteException;

    qzf d() throws RemoteException;

    CarDisplay g() throws RemoteException;

    CarDisplayUiFeatures h() throws RemoteException;

    List i() throws RemoteException;

    void k(rkd rkdVar) throws RemoteException;

    void l(rkg rkgVar) throws RemoteException;

    void m(rkp rkpVar) throws RemoteException;

    void n(qyn qynVar) throws RemoteException;

    void o() throws RemoteException;

    void p(rkd rkdVar) throws RemoteException;

    void q(rkg rkgVar) throws RemoteException;

    void r(rkp rkpVar) throws RemoteException;

    void s(qyn qynVar) throws RemoteException;
}
