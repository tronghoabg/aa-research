package com.google.android.gms.internal.mlkit_vision_text_common;

import U8.v0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        boolean Z10 = false;
        zzn[] zznVarArr = null;
        zzf zzfVar = null;
        zzf zzfVar2 = null;
        String strY = null;
        String strY2 = null;
        float fC0 = 0.0f;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            switch ((char) i5) {
                case 2:
                    zznVarArr = (zzn[]) v0.B(parcel, i5, zzn.CREATOR);
                    break;
                case 3:
                    zzfVar = (zzf) v0.x(parcel, i5, zzf.CREATOR);
                    break;
                case 4:
                    zzfVar2 = (zzf) v0.x(parcel, i5, zzf.CREATOR);
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
        return new zzr(zznVarArr, zzfVar, zzfVar2, strY, fC0, strY2, Z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzr[i5];
    }
}
