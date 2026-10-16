package com.google.android.gms.internal.ads;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzcds implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        String strY = null;
        String strY2 = null;
        ArrayList arrayListA = null;
        ArrayList arrayListA2 = null;
        boolean Z10 = false;
        boolean Z11 = false;
        boolean Z12 = false;
        boolean Z13 = false;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            switch ((char) i5) {
                case 2:
                    strY = v0.y(i5, parcel);
                    break;
                case 3:
                    strY2 = v0.y(i5, parcel);
                    break;
                case 4:
                    Z10 = v0.Z(i5, parcel);
                    break;
                case 5:
                    Z11 = v0.Z(i5, parcel);
                    break;
                case 6:
                    arrayListA = v0.A(i5, parcel);
                    break;
                case 7:
                    Z12 = v0.Z(i5, parcel);
                    break;
                case '\b':
                    Z13 = v0.Z(i5, parcel);
                    break;
                case '\t':
                    arrayListA2 = v0.A(i5, parcel);
                    break;
                default:
                    v0.m0(i5, parcel);
                    break;
            }
        }
        v0.D(iO0, parcel);
        return new zzcdr(strY, strY2, Z10, Z11, arrayListA, Z12, Z13, arrayListA2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzcdr[i5];
    }
}
