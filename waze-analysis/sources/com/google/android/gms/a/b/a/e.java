package com.google.android.gms.a.b.a;

import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class e extends com.google.android.a.b implements f {
    public e() {
        super("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    @Override // com.google.android.a.b
    protected final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            String string = parcel.readString();
            a aVar = (a) com.google.android.a.c.a(parcel, a.CREATOR);
            enforceNoDataAvail(parcel);
            b(string, aVar);
        } else {
            if (i2 != 2) {
                return false;
            }
            com.google.android.gms.a.b.b.a aVar2 = (com.google.android.gms.a.b.b.a) com.google.android.a.c.a(parcel, com.google.android.gms.a.b.b.a.CREATOR);
            enforceNoDataAvail(parcel);
            a(aVar2);
        }
        parcel2.writeNoException();
        return true;
    }
}
