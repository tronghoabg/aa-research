package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.car.RadioConfiguration;
import com.google.android.gms.car.RadioProgramSelector;

/* loaded from: classes.dex */
public interface qyb extends IInterface {
    RadioConfiguration f() throws RemoteException;

    void n(boolean z) throws RemoteException;

    void o(String str) throws RemoteException;

    void s(qye qyeVar) throws RemoteException;

    void t(qye qyeVar) throws RemoteException;

    void u(boolean z) throws RemoteException;

    void v(int i) throws RemoteException;

    void w(RadioProgramSelector radioProgramSelector) throws RemoteException;

    void x(qye qyeVar) throws RemoteException;
}
