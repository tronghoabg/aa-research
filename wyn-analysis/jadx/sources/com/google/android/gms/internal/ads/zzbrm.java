package com.google.android.gms.internal.ads;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class zzbrm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        long jH0 = 0;
        boolean Z10 = false;
        int iF0 = 0;
        boolean Z11 = false;
        String strY = null;
        byte[] bArrR = null;
        String[] strArrZ = null;
        String[] strArrZ2 = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            switch ((char) i5) {
                case 1:
                    Z10 = v0.Z(i5, parcel);
                    break;
                case 2:
                    strY = v0.y(i5, parcel);
                    break;
                case 3:
                    iF0 = v0.f0(i5, parcel);
                    break;
                case 4:
                    bArrR = v0.r(i5, parcel);
                    break;
                case 5:
                    strArrZ = v0.z(i5, parcel);
                    break;
                case 6:
                    strArrZ2 = v0.z(i5, parcel);
                    break;
                case 7:
                    Z11 = v0.Z(i5, parcel);
                    break;
                case '\b':
                    jH0 = v0.h0(i5, parcel);
                    break;
                default:
                    v0.m0(i5, parcel);
                    break;
            }
        }
        v0.D(iO0, parcel);
        return new zzbrl(Z10, strY, iF0, bArrR, strArrZ, strArrZ2, Z11, jH0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbrl[i5];
    }
}
