package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public interface rab extends IInterface {
    void e() throws RemoteException;

    void f(int i) throws RemoteException;

    void g(CharSequence charSequence, int i, ComponentName componentName) throws RemoteException;

    void h(Intent intent) throws RemoteException;

    boolean i() throws RemoteException;
}
