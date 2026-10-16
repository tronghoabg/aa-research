package com.google.android.gms.m.a;

import android.os.IInterface;
import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class b extends com.google.android.a.b implements IInterface {
    public b() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        switch (i2) {
            case 3:
                enforceNoDataAvail(parcel);
                break;
            case 4:
                enforceNoDataAvail(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                enforceNoDataAvail(parcel);
                break;
            case 7:
                enforceNoDataAvail(parcel);
                break;
            case 8:
                h hVar = (h) com.google.android.a.c.a(parcel, h.CREATOR);
                enforceNoDataAvail(parcel);
                e(hVar);
                break;
            case 9:
                enforceNoDataAvail(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public void e(h hVar) {
    }
}
