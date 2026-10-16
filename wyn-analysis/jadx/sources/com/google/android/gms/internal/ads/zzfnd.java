package com.google.android.gms.internal.ads;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class zzfnd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        int iF0 = 0;
        int iF02 = 0;
        int iF03 = 0;
        int iF04 = 0;
        int iF05 = 0;
        int iF06 = 0;
        String strY = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            switch ((char) i5) {
                case 1:
                    iF0 = v0.f0(i5, parcel);
                    break;
                case 2:
                    iF02 = v0.f0(i5, parcel);
                    break;
                case 3:
                    iF03 = v0.f0(i5, parcel);
                    break;
                case 4:
                    iF04 = v0.f0(i5, parcel);
                    break;
                case 5:
                    strY = v0.y(i5, parcel);
                    break;
                case 6:
                    iF05 = v0.f0(i5, parcel);
                    break;
                case 7:
                    iF06 = v0.f0(i5, parcel);
                    break;
                default:
                    v0.m0(i5, parcel);
                    break;
            }
        }
        v0.D(iO0, parcel);
        return new zzfnc(iF0, iF02, iF03, iF04, strY, iF05, iF06);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzfnc[i5];
    }
}
