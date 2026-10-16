package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public interface qdf extends IInterface {
    void e(long j, int i, int i2, byte[] bArr) throws RemoteException;

    byte[] f(long j, int i, long j2, int i2, byte[] bArr, qdc qdcVar) throws RemoteException;

    byte[] g(long j, int i) throws RemoteException;

    Bundle h(long j) throws RemoteException;

    void i(long j, Bundle bundle) throws RemoteException;
}
