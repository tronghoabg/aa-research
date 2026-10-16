package com.google.android.gms.internal.p002firebaseauthapi;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzahu implements Parcelable.Creator<zzahr> {
    @Override // android.os.Parcelable.Creator
    public final zzahr createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        String strY = null;
        String strY2 = null;
        String strY3 = null;
        String strY4 = null;
        String strY5 = null;
        String strY6 = null;
        String strY7 = null;
        String strY8 = null;
        String strY9 = null;
        String strY10 = null;
        String strY11 = null;
        String strY12 = null;
        String strY13 = null;
        boolean Z10 = false;
        boolean Z11 = false;
        boolean Z12 = false;
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
                    strY3 = v0.y(i5, parcel);
                    break;
                case 5:
                    strY4 = v0.y(i5, parcel);
                    break;
                case 6:
                    strY5 = v0.y(i5, parcel);
                    break;
                case 7:
                    strY6 = v0.y(i5, parcel);
                    break;
                case '\b':
                    strY7 = v0.y(i5, parcel);
                    break;
                case '\t':
                    strY8 = v0.y(i5, parcel);
                    break;
                case '\n':
                    Z10 = v0.Z(i5, parcel);
                    break;
                case 11:
                    Z11 = v0.Z(i5, parcel);
                    break;
                case '\f':
                    strY9 = v0.y(i5, parcel);
                    break;
                case '\r':
                    strY10 = v0.y(i5, parcel);
                    break;
                case 14:
                    strY11 = v0.y(i5, parcel);
                    break;
                case 15:
                    strY12 = v0.y(i5, parcel);
                    break;
                case 16:
                    Z12 = v0.Z(i5, parcel);
                    break;
                case 17:
                    strY13 = v0.y(i5, parcel);
                    break;
                default:
                    v0.m0(i5, parcel);
                    break;
            }
        }
        v0.D(iO0, parcel);
        return new zzahr(strY, strY2, strY3, strY4, strY5, strY6, strY7, strY8, Z10, Z11, strY9, strY10, strY11, strY12, Z12, strY13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahr[] newArray(int i5) {
        return new zzahr[i5];
    }
}
