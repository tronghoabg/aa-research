package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import android.telecom.PhoneAccountHandle;
import com.google.android.gms.car.CarCall;
import java.util.List;

/* loaded from: classes2.dex */
public interface qvx extends IInterface {
    void A() throws RemoteException;

    void B() throws RemoteException;

    int e() throws RemoteException;

    int f() throws RemoteException;

    List g() throws RemoteException;

    void h(CarCall carCall) throws RemoteException;

    void i(CarCall carCall, CarCall carCall2) throws RemoteException;

    void j(CarCall carCall) throws RemoteException;

    void k() throws RemoteException;

    void l(CarCall carCall) throws RemoteException;

    void m(String str) throws RemoteException;

    void n(CarCall carCall, char c) throws RemoteException;

    void o(int i) throws RemoteException;

    void p(boolean z) throws RemoteException;

    void q(CarCall carCall) throws RemoteException;

    void r(CarCall carCall) throws RemoteException;

    boolean s() throws RemoteException;

    boolean t(qwa qwaVar) throws RemoteException;

    boolean u(qwa qwaVar) throws RemoteException;

    void v(CarCall carCall, PhoneAccountHandle phoneAccountHandle) throws RemoteException;

    void w() throws RemoteException;

    void x() throws RemoteException;

    void y() throws RemoteException;

    void z(CarCall carCall) throws RemoteException;
}
