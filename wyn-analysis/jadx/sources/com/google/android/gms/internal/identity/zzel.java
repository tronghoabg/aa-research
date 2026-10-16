package com.google.android.gms.internal.identity;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzel implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        int iF0 = -1;
        int iF02 = 0;
        short s10 = 0;
        int iF03 = 0;
        long jH0 = 0;
        float fC0 = 0.0f;
        double d3 = 0.0d;
        double d5 = 0.0d;
        String strY = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            switch ((char) i5) {
                case 1:
                    strY = v0.y(i5, parcel);
                    break;
                case 2:
                    jH0 = v0.h0(i5, parcel);
                    break;
                case 3:
                    v0.r0(parcel, i5, 4);
                    s10 = (short) parcel.readInt();
                    break;
                case 4:
                    v0.r0(parcel, i5, 8);
                    d3 = parcel.readDouble();
                    break;
                case 5:
                    v0.r0(parcel, i5, 8);
                    d5 = parcel.readDouble();
                    break;
                case 6:
                    fC0 = v0.c0(i5, parcel);
                    break;
                case 7:
                    iF02 = v0.f0(i5, parcel);
                    break;
                case '\b':
                    iF03 = v0.f0(i5, parcel);
                    break;
                case '\t':
                    iF0 = v0.f0(i5, parcel);
                    break;
                default:
                    v0.m0(i5, parcel);
                    break;
            }
        }
        v0.D(iO0, parcel);
        return new zzek(strY, iF02, s10, d3, d5, fC0, jH0, iF03, iF0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzek[i5];
    }
}
