package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import android.view.inputmethod.EditorInfo;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes2.dex */
public interface rmf extends IInterface {
    void e() throws RemoteException;

    void f(rmi rmiVar) throws RemoteException;

    void g(rml rmlVar, EditorInfo editorInfo, CarRegionId carRegionId) throws RemoteException;
}
