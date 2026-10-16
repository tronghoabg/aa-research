package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class ar extends com.google.android.a.b implements as {
    public ar() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            int i4 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) com.google.android.a.c.a(parcel, Bundle.CREATOR);
            enforceNoDataAvail(parcel);
            a(i4, strongBinder, bundle);
        } else if (i2 == 2) {
            parcel.readInt();
            enforceNoDataAvail(parcel);
            c();
        } else {
            if (i2 != 3) {
                return false;
            }
            int i5 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            t tVar = (t) com.google.android.a.c.a(parcel, t.CREATOR);
            enforceNoDataAvail(parcel);
            b(i5, strongBinder2, tVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
