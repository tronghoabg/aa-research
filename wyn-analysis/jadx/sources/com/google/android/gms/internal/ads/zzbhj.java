package com.google.android.gms.internal.ads;

import U8.v0;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class zzbhj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        boolean Z10 = false;
        int iF0 = 0;
        String strY = null;
        String strY2 = null;
        String strY3 = null;
        String strY4 = null;
        Bundle bundleQ = null;
        String strY5 = null;
        long jH0 = 0;
        long jH02 = 0;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            switch ((char) i5) {
                case 2:
                    strY = v0.y(i5, parcel);
                    break;
                case 3:
                    jH0 = v0.h0(i5, parcel);
                    break;
                case 4:
                    strY2 = v0.y(i5, parcel);
                    break;
                case 5:
                    strY3 = v0.y(i5, parcel);
                    break;
                case 6:
                    strY4 = v0.y(i5, parcel);
                    break;
                case 7:
                    bundleQ = v0.q(i5, parcel);
                    break;
                case '\b':
                    Z10 = v0.Z(i5, parcel);
                    break;
                case '\t':
                    jH02 = v0.h0(i5, parcel);
                    break;
                case '\n':
                    strY5 = v0.y(i5, parcel);
                    break;
                case 11:
                    iF0 = v0.f0(i5, parcel);
                    break;
                default:
                    v0.m0(i5, parcel);
                    break;
            }
        }
        v0.D(iO0, parcel);
        return new zzbhi(strY, jH0, strY2, strY3, strY4, bundleQ, Z10, jH02, strY5, iF0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbhi[i5];
    }
}
