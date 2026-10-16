package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* loaded from: classes2.dex */
public interface stk extends IInterface {
    void e(FusedLocationProviderResult fusedLocationProviderResult, ApiMetadata apiMetadata) throws RemoteException;

    void f() throws RemoteException;
}
