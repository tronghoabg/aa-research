package com.google.android.gms.internal.mlkit_vision_text_common;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        int iF0 = 0;
        boolean Z10 = false;
        int iF02 = 0;
        int iF03 = 0;
        zzr[] zzrVarArr = null;
        zzf zzfVar = null;
        zzf zzfVar2 = null;
        zzf zzfVar3 = null;
        String strY = null;
        String strY2 = null;
        float fC0 = 0.0f;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            switch ((char) i5) {
                case 2:
                    zzrVarArr = (zzr[]) v0.B(parcel, i5, zzr.CREATOR);
                    break;
                case 3:
                    zzfVar = (zzf) v0.x(parcel, i5, zzf.CREATOR);
                    break;
                case 4:
                    zzfVar2 = (zzf) v0.x(parcel, i5, zzf.CREATOR);
                    break;
                case 5:
                    zzfVar3 = (zzf) v0.x(parcel, i5, zzf.CREATOR);
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
        return new zzl(zzrVarArr, zzfVar, zzfVar2, zzfVar3, strY, fC0, strY2, iF0, Z10, iF02, iF03);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzl[i5];
    }
}
