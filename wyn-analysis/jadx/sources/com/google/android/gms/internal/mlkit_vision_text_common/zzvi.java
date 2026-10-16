package com.google.android.gms.internal.mlkit_vision_text_common;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class zzvi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        boolean Z10 = false;
        int iF0 = 0;
        boolean Z11 = false;
        String strY = null;
        String strY2 = null;
        String strY3 = null;
        String strY4 = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            switch ((char) i5) {
                case 1:
                    strY = v0.y(i5, parcel);
                    break;
                case 2:
                    strY2 = v0.y(i5, parcel);
                    break;
                case 3:
                    strY3 = v0.y(i5, parcel);
                    break;
                case 4:
                    Z10 = v0.Z(i5, parcel);
                    break;
                case 5:
                    iF0 = v0.f0(i5, parcel);
                    break;
                case 6:
                    strY4 = v0.y(i5, parcel);
                    break;
                case 7:
                    Z11 = v0.Z(i5, parcel);
                    break;
                default:
                    v0.m0(i5, parcel);
                    break;
            }
        }
        v0.D(iO0, parcel);
        return new zzvh(strY, strY2, strY3, Z10, iF0, strY4, Z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzvh[i5];
    }
}
