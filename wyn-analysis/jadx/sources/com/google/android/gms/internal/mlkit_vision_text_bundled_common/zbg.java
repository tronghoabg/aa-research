package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class zbg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        int iF0 = 0;
        boolean Z10 = false;
        int iF02 = 0;
        int iF03 = 0;
        zbj[] zbjVarArr = null;
        zbd zbdVar = null;
        zbd zbdVar2 = null;
        zbd zbdVar3 = null;
        String strY = null;
        String strY2 = null;
        float fC0 = 0.0f;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            switch ((char) i5) {
                case 2:
                    zbjVarArr = (zbj[]) v0.B(parcel, i5, zbj.CREATOR);
                    break;
                case 3:
                    zbdVar = (zbd) v0.x(parcel, i5, zbd.CREATOR);
                    break;
                case 4:
                    zbdVar2 = (zbd) v0.x(parcel, i5, zbd.CREATOR);
                    break;
                case 5:
                    zbdVar3 = (zbd) v0.x(parcel, i5, zbd.CREATOR);
                    break;
                case 6:
                    strY = v0.y(i5, parcel);
                    break;
                case 7:
                    fC0 = v0.c0(i5, parcel);
                    break;
                case '\b':
                    strY2 = v0.y(i5, parcel);
                    break;
                case '\t':
                    iF0 = v0.f0(i5, parcel);
                    break;
                case '\n':
                    Z10 = v0.Z(i5, parcel);
                    break;
                case 11:
                    iF02 = v0.f0(i5, parcel);
                    break;
                case '\f':
                    iF03 = v0.f0(i5, parcel);
                    break;
                default:
                    v0.m0(i5, parcel);
                    break;
            }
        }
        v0.D(iO0, parcel);
        return new zbf(zbjVarArr, zbdVar, zbdVar2, zbdVar3, strY, fC0, strY2, iF0, Z10, iF02, iF03);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zbf[i5];
    }
}
