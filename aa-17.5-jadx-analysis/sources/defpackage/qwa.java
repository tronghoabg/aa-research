package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.KeyEvent;
import com.google.android.gms.car.CarCall;
import java.util.List;

/* loaded from: classes2.dex */
public interface qwa extends IInterface {
    void e(KeyEvent keyEvent) throws RemoteException;

    void f(boolean z, int i, int i2) throws RemoteException;

    void g(CarCall carCall) throws RemoteException;

    void h(CarCall carCall) throws RemoteException;

    void i(CarCall carCall) throws RemoteException;

    void j(CarCall carCall, List list) throws RemoteException;

    void k(CarCall carCall, List list) throws RemoteException;

    void l(CarCall carCall, List list) throws RemoteException;

    void m(CarCall carCall, String str, Bundle bundle) throws RemoteException;

    void n(CarCall carCall, CarCall.Details details) throws RemoteException;

    void o(CarCall carCall, CarCall carCall2) throws RemoteException;

    void p(CarCall carCall, String str) throws RemoteException;

    void q(CarCall carCall, int i) throws RemoteException;
}
