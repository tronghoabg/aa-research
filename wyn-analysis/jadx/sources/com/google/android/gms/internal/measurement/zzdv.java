package com.google.android.gms.internal.measurement;

import U8.v0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class zzdv implements Parcelable.Creator<zzdw> {
    @Override // android.os.Parcelable.Creator
    public final zzdw createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        long jH0 = 0;
        long jH02 = 0;
        boolean Z10 = false;
        String strY = null;
        String strY2 = null;
        String strY3 = null;
        Bundle bundleQ = null;
        String strY4 = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            switch ((char) i5) {
                case 1:
                    jH0 = v0.h0(i5, parcel);
                    break;
                case 2:
                    jH02 = v0.h0(i5, parcel);
                    break;
                case 3:
                    Z10 = v0.Z(i5, parcel);
                    break;
                case 4:
                    strY = v0.y(i5, parcel);
                    break;
                case 5:
                    strY2 = v0.y(i5, parcel);
                    break;
                case 6:
                    strY3 = v0.y(i5, parcel);
                    break;
                case 7:
                    bundleQ = v0.q(i5, parcel);
                    break;
                case '\b':
                    strY4 = v0.y(i5, parcel);
                    break;
                default:
                    v0.m0(i5, parcel);
                    break;
            }
        }
        v0.D(iO0, parcel);
        return new zzdw(jH0, jH02, Z10, strY, strY2, strY3, bundleQ, strY4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzdw[] newArray(int i5) {
        return new zzdw[i5];
    }
}
