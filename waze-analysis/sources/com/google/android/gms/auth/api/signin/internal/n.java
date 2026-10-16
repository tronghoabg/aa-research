package com.google.android.gms.auth.api.signin.internal;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class n extends com.google.android.a.b implements IInterface {
    public n() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    public void a(Status status) {
        throw new UnsupportedOperationException();
    }

    public void b(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 101:
                enforceNoDataAvail(parcel);
                throw new UnsupportedOperationException();
            case 102:
                Status status = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                a(status);
                break;
            case 103:
                Status status2 = (Status) com.google.android.a.c.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                b(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
