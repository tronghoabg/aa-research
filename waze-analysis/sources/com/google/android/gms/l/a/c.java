package com.google.android.gms.l.a;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class c extends com.google.android.a.b implements d {
    public c() {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 2) {
            return false;
        }
        Status status = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
        byte[] bArrCreateByteArray = parcel.createByteArray();
        enforceNoDataAvail(parcel);
        a(status, bArrCreateByteArray);
        return true;
    }
}
