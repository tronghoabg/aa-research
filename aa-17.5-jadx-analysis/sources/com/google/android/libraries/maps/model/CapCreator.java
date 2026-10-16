package com.google.android.libraries.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;
import defpackage.sqh;
import defpackage.sqj;

/* loaded from: classes3.dex */
public final class CapCreator implements Parcelable.Creator<Cap> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public Cap createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        BitmapDescriptor bitmapDescriptor = null;
        int iN = 0;
        IBinder iBinderS = null;
        Float fU = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                iN = spu.N(parcel, i);
            } else if (c == 3) {
                iBinderS = spu.S(parcel, i);
            } else if (c != 4) {
                spu.ae(parcel, i);
            } else {
                fU = spu.U(parcel, i);
            }
        }
        spu.ac(parcel, iP);
        if (iBinderS != null) {
            IInterface iInterfaceQueryLocalInterface = iBinderS.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bitmapDescriptor = new BitmapDescriptor(iInterfaceQueryLocalInterface instanceof sqj ? (sqj) iInterfaceQueryLocalInterface : new sqh(iBinderS));
        }
        return new Cap(iN, bitmapDescriptor, fU);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public Cap[] newArray(int i) {
        return new Cap[i];
    }
}
