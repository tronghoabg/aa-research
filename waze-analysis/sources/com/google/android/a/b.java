package com.google.android.a;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class b extends Binder implements IInterface {
    private static d globalInterceptor;

    protected b(String str) {
        attachInterface(this, str);
    }

    static synchronized void installTransactionInterceptorPackagePrivate(d dVar) {
        try {
            if (dVar == null) {
                throw new IllegalArgumentException("null interceptor");
            }
            if (globalInterceptor != null) {
                throw new IllegalStateException("Duplicate TransactionInterceptor installation.");
            }
            globalInterceptor = dVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean routeToSuperOrEnforceInterface(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 > 16777215) {
            return super.onTransact(i2, parcel, parcel2, i3);
        }
        parcel.enforceInterface(getInterfaceDescriptor());
        return false;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    protected boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        return false;
    }

    protected void enforceNoDataAvail(Parcel parcel) {
        d dVar = globalInterceptor;
        if (dVar != null) {
            dVar.a();
            return;
        }
        int i2 = c.f3833a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + iDataAvail);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (routeToSuperOrEnforceInterface(i2, parcel, parcel2, i3)) {
            return true;
        }
        d dVar = globalInterceptor;
        return dVar == null ? dispatchTransaction(i2, parcel, parcel2, i3) : dVar.b();
    }
}
