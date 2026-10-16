package com.google.android.gms.internal.ads;

import U8.v0;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzcbl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        Bundle bundleQ = null;
        H6.a aVar = null;
        ApplicationInfo applicationInfo = null;
        String strY = null;
        ArrayList arrayListA = null;
        PackageInfo packageInfo = null;
        String strY2 = null;
        String strY3 = null;
        zzfnc zzfncVar = null;
        String strY4 = null;
        Bundle bundleQ2 = null;
        boolean Z10 = false;
        boolean Z11 = false;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            switch ((char) i5) {
                case 1:
                    bundleQ = v0.q(i5, parcel);
                    break;
                case 2:
                    aVar = (H6.a) v0.x(parcel, i5, H6.a.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) v0.x(parcel, i5, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strY = v0.y(i5, parcel);
                    break;
                case 5:
                    arrayListA = v0.A(i5, parcel);
                    break;
                case 6:
                    packageInfo = (PackageInfo) v0.x(parcel, i5, PackageInfo.CREATOR);
                    break;
                case 7:
                    strY2 = v0.y(i5, parcel);
                    break;
                case '\b':
                default:
                    v0.m0(i5, parcel);
                    break;
                case '\t':
                    strY3 = v0.y(i5, parcel);
                    break;
                case '\n':
                    zzfncVar = (zzfnc) v0.x(parcel, i5, zzfnc.CREATOR);
                    break;
                case 11:
                    strY4 = v0.y(i5, parcel);
                    break;
                case '\f':
                    Z10 = v0.Z(i5, parcel);
                    break;
                case '\r':
                    Z11 = v0.Z(i5, parcel);
                    break;
                case 14:
                    bundleQ2 = v0.q(i5, parcel);
                    break;
            }
        }
        v0.D(iO0, parcel);
        return new zzcbk(bundleQ, aVar, applicationInfo, strY, arrayListA, packageInfo, strY2, strY3, zzfncVar, strY4, Z10, Z11, bundleQ2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzcbk[i5];
    }
}
