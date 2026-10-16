package defpackage;

import android.content.ComponentName;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public interface owc extends IInterface {
    @Deprecated
    void e(CharSequence charSequence, int i) throws RemoteException;

    void f(CharSequence charSequence, int i, ComponentName componentName) throws RemoteException;
}
