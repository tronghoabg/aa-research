package com.google.android.gms.internal.identity;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C1718g;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzeh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        long jH0 = Long.MAX_VALUE;
        LocationRequest locationRequest = null;
        ArrayList arrayListC = null;
        String strY = null;
        boolean Z10 = false;
        boolean Z11 = false;
        boolean Z12 = false;
        boolean Z13 = false;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            char c10 = (char) i5;
            if (c10 == 1) {
                locationRequest = (LocationRequest) v0.x(parcel, i5, LocationRequest.CREATOR);
            } else if (c10 == 5) {
                arrayListC = v0.C(parcel, i5, C1718g.CREATOR);
            } else if (c10 == '\b') {
                Z10 = v0.Z(i5, parcel);
            } else if (c10 != '\t') {
                switch (c10) {
                    case 11:
                        Z12 = v0.Z(i5, parcel);
                        break;
                    case '\f':
                        Z13 = v0.Z(i5, parcel);
                        break;
                    case '\r':
                        strY = v0.y(i5, parcel);
                        break;
                    case 14:
                        jH0 = v0.h0(i5, parcel);
                        break;
                    default:
                        v0.m0(i5, parcel);
                        break;
                }
            } else {
                Z11 = v0.Z(i5, parcel);
            }
        }
        v0.D(iO0, parcel);
        return new zzeg(locationRequest, arrayListC, Z10, Z11, Z12, Z13, strY, jH0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzeg[i5];
    }
}
