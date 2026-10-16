package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.car.display.CarDisplayId;
import java.util.List;

/* loaded from: classes.dex */
public interface rkj extends IInterface {
    rjx e(CarDisplayId carDisplayId) throws RemoteException;

    List f() throws RemoteException;

    boolean g() throws RemoteException;
}
