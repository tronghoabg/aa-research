package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class zbk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        boolean Z10 = false;
        zbh[] zbhVarArr = null;
        zbd zbdVar = null;
        zbd zbdVar2 = null;
        String strY = null;
        String strY2 = null;
        float fC0 = 0.0f;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            switch ((char) i5) {
                case 2:
                    zbhVarArr = (zbh[]) v0.B(parcel, i5, zbh.CREATOR);
                    break;
                case 3:
                    zbdVar = (zbd) v0.x(parcel, i5, zbd.CREATOR);
                    break;
                case 4:
                    zbdVar2 = (zbd) v0.x(parcel, i5, zbd.CREATOR);
                    break;
                case 5:
                    strY = v0.y(i5, parcel);
                    break;
                case 6:
                    fC0 = v0.c0(i5, parcel);
                    break;
                case 7:
                    strY2 = v0.y(i5, parcel);
                    break;
                case '\b':
                    Z10 = v0.Z(i5, parcel);
                    break;
                default:
                    v0.m0(i5, parcel);
                    break;
            }
        }
        v0.D(iO0, parcel);
        return new zbj(zbhVarArr, zbdVar, zbdVar2, strY, fC0, strY2, Z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zbj[i5];
    }
}
