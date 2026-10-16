package com.google.android.gms.internal.ads;

import D6.r1;
import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class zzbmb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        int iF0 = 0;
        boolean Z10 = false;
        int iF02 = 0;
        boolean Z11 = false;
        int iF03 = 0;
        boolean Z12 = false;
        int iF04 = 0;
        int iF05 = 0;
        boolean Z13 = false;
        int iF06 = 0;
        r1 r1Var = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            switch ((char) i5) {
                case 1:
                    iF0 = v0.f0(i5, parcel);
                    break;
                case 2:
                    Z10 = v0.Z(i5, parcel);
                    break;
                case 3:
                    iF02 = v0.f0(i5, parcel);
                    break;
                case 4:
                    Z11 = v0.Z(i5, parcel);
                    break;
                case 5:
                    iF03 = v0.f0(i5, parcel);
                    break;
                case 6:
                    r1Var = (r1) v0.x(parcel, i5, r1.CREATOR);
                    break;
                case 7:
                    Z12 = v0.Z(i5, parcel);
                    break;
                case '\b':
                    iF04 = v0.f0(i5, parcel);
                    break;
                case '\t':
                    iF05 = v0.f0(i5, parcel);
                    break;
                case '\n':
                    Z13 = v0.Z(i5, parcel);
                    break;
                case 11:
                    iF06 = v0.f0(i5, parcel);
                    break;
                default:
                    v0.m0(i5, parcel);
                    break;
            }
        }
        v0.D(iO0, parcel);
        return new zzbma(iF0, Z10, iF02, Z11, iF03, r1Var, Z12, iF04, iF05, Z13, iF06);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzbma[i5];
    }
}
