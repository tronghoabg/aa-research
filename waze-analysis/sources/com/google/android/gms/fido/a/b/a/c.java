package com.google.android.gms.fido.a.b.a;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class c extends com.google.android.a.b implements d {
    public c() {
        super("com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        Status status = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) com.google.android.a.c.a(parcel, PendingIntent.CREATOR);
        k kVar = (k) com.google.android.a.c.a(parcel, k.CREATOR);
        enforceNoDataAvail(parcel);
        a(status, pendingIntent, kVar);
        return true;
    }
}
