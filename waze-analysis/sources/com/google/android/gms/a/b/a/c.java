package com.google.android.gms.a.b.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class c extends com.google.android.a.b implements d {
    public static d b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new b(iBinder);
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        throw null;
    }
}
