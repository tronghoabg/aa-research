package com.google.android.gms.internal.identity;

import U8.v0;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class zzej implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        zzeg zzegVar = null;
        IBinder iBinderE0 = null;
        IBinder iBinderE02 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderE03 = null;
        String strY = null;
        int iF0 = 1;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            switch ((char) i5) {
                case 1:
                    iF0 = v0.f0(i5, parcel);
                    break;
                case 2:
                    zzegVar = (zzeg) v0.x(parcel, i5, zzeg.CREATOR);
                    break;
                case 3:
                    iBinderE0 = v0.e0(i5, parcel);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) v0.x(parcel, i5, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderE02 = v0.e0(i5, parcel);
                    break;
                case 6:
                    iBinderE03 = v0.e0(i5, parcel);
                    break;
                case 7:
                default:
                    v0.m0(i5, parcel);
                    break;
                case '\b':
                    strY = v0.y(i5, parcel);
                    break;
            }
        }
        v0.D(iO0, parcel);
        return new zzei(iF0, zzegVar, iBinderE0, iBinderE02, pendingIntent, iBinderE03, strY);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzei[i5];
    }
}
