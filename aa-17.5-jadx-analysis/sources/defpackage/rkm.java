package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.car.display.UiStyle;

/* loaded from: classes.dex */
public interface rkm extends IInterface {
    int a() throws RemoteException;

    void b(boolean z) throws RemoteException;

    void c(UiStyle uiStyle) throws RemoteException;
}
