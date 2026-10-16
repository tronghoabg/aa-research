package com.google.android.gms.auth.a.a;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class c extends com.google.android.a.b implements IInterface {
    public c() {
        super("com.google.android.gms.auth.blockstore.internal.IRetrieveBytesCallback");
    }

    public void a(Status status, com.google.android.gms.auth.a.f fVar) {
        throw null;
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            parcel.createByteArray();
            enforceNoDataAvail(parcel);
            throw new UnsupportedOperationException();
        }
        if (i2 != 2) {
            return false;
        }
        Status status = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
        com.google.android.gms.auth.a.f fVar = (com.google.android.gms.auth.a.f) com.google.android.a.c.a(parcel, com.google.android.gms.auth.a.f.CREATOR);
        enforceNoDataAvail(parcel);
        a(status, fVar);
        return true;
    }
}
