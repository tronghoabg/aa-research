package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.car.RadioProgramInfo;
import java.util.List;

/* loaded from: classes2.dex */
public interface qye extends IInterface {
    void e(List list) throws RemoteException;

    void f(boolean z) throws RemoteException;

    void g(RadioProgramInfo radioProgramInfo, boolean z, boolean z2) throws RemoteException;

    void h(List list) throws RemoteException;

    void i(int i) throws RemoteException;
}
