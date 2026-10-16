package com.google.android.gms.common.api.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class al extends com.google.android.a.b implements am {
    public al() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        Status status = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
        enforceNoDataAvail(parcel);
        a(status);
        return true;
    }
}
