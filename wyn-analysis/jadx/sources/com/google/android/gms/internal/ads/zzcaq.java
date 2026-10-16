package com.google.android.gms.internal.ads;

import D6.O0;
import D6.v1;
import D6.x1;
import U8.v0;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzcaq implements Parcelable.Creator {
    public static final zzcap zza(Parcel parcel) {
        int iO0 = v0.o0(parcel);
        float fC0 = 0.0f;
        float fC02 = 0.0f;
        long jH0 = 0;
        long jH02 = 0;
        int iF0 = 0;
        Bundle bundleQ = null;
        v1 v1Var = null;
        x1 x1Var = null;
        String strY = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strY2 = null;
        String strY3 = null;
        String strY4 = null;
        H6.a aVar = null;
        Bundle bundleQ2 = null;
        int iF02 = 0;
        ArrayList arrayListA = null;
        Bundle bundleQ3 = null;
        boolean Z10 = false;
        int iF03 = 0;
        int iF04 = 0;
        String strY5 = null;
        String strY6 = null;
        ArrayList arrayListA2 = null;
        String strY7 = null;
        zzbma zzbmaVar = null;
        ArrayList arrayListA3 = null;
        String strY8 = null;
        boolean Z11 = false;
        int iF05 = 0;
        int iF06 = 0;
        boolean Z12 = false;
        String strY9 = null;
        String strY10 = null;
        boolean Z13 = false;
        int iF07 = 0;
        Bundle bundleQ4 = null;
        String strY11 = null;
        O0 o02 = null;
        boolean Z14 = false;
        Bundle bundleQ5 = null;
        String strY12 = null;
        String strY13 = null;
        String strY14 = null;
        boolean Z15 = false;
        ArrayList arrayList = null;
        String strY15 = null;
        ArrayList arrayListA4 = null;
        int iF08 = 0;
        boolean Z16 = false;
        boolean Z17 = false;
        boolean Z18 = false;
        ArrayList arrayListA5 = null;
        String strY16 = null;
        zzbsi zzbsiVar = null;
        String strY17 = null;
        Bundle bundleQ6 = null;
        while (parcel.dataPosition() < iO0) {
            int i5 = parcel.readInt();
            switch ((char) i5) {
                case 1:
                    iF0 = v0.f0(i5, parcel);
                    break;
                case 2:
                    bundleQ = v0.q(i5, parcel);
                    break;
                case 3:
                    v1Var = (v1) v0.x(parcel, i5, v1.CREATOR);
                    break;
                case 4:
                    x1Var = (x1) v0.x(parcel, i5, x1.CREATOR);
                    break;
                case 5:
                    strY = v0.y(i5, parcel);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) v0.x(parcel, i5, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) v0.x(parcel, i5, PackageInfo.CREATOR);
                    break;
                case '\b':
                    strY2 = v0.y(i5, parcel);
                    break;
                case '\t':
                    strY3 = v0.y(i5, parcel);
                    break;
                case '\n':
                    strY4 = v0.y(i5, parcel);
                    break;
                case 11:
                    aVar = (H6.a) v0.x(parcel, i5, H6.a.CREATOR);
                    break;
                case '\f':
                    bundleQ2 = v0.q(i5, parcel);
                    break;
                case '\r':
                    iF02 = v0.f0(i5, parcel);
                    break;
                case 14:
                    arrayListA = v0.A(i5, parcel);
                    break;
                case 15:
                    bundleQ3 = v0.q(i5, parcel);
                    break;
                case 16:
                    Z10 = v0.Z(i5, parcel);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case ' ':
                case '&':
                case '>':
                default:
                    v0.m0(i5, parcel);
                    break;
                case 18:
                    iF03 = v0.f0(i5, parcel);
                    break;
                case 19:
                    iF04 = v0.f0(i5, parcel);
                    break;
                case 20:
                    fC0 = v0.c0(i5, parcel);
                    break;
                case 21:
                    strY5 = v0.y(i5, parcel);
                    break;
                case 25:
                    jH0 = v0.h0(i5, parcel);
                    break;
                case 26:
                    strY6 = v0.y(i5, parcel);
                    break;
                case 27:
                    arrayListA2 = v0.A(i5, parcel);
                    break;
                case 28:
                    strY7 = v0.y(i5, parcel);
                    break;
                case 29:
                    zzbmaVar = (zzbma) v0.x(parcel, i5, zzbma.CREATOR);
                    break;
                case 30:
                    arrayListA3 = v0.A(i5, parcel);
                    break;
                case 31:
                    jH02 = v0.h0(i5, parcel);
                    break;
                case '!':
                    strY8 = v0.y(i5, parcel);
                    break;
                case '\"':
                    fC02 = v0.c0(i5, parcel);
                    break;
                case '#':
                    iF05 = v0.f0(i5, parcel);
                    break;
                case '$':
                    iF06 = v0.f0(i5, parcel);
                    break;
                case '%':
                    Z12 = v0.Z(i5, parcel);
                    break;
                case '\'':
                    strY9 = v0.y(i5, parcel);
                    break;
                case '(':
                    Z11 = v0.Z(i5, parcel);
                    break;
                case ')':
                    strY10 = v0.y(i5, parcel);
                    break;
                case '*':
                    Z13 = v0.Z(i5, parcel);
                    break;
                case '+':
                    iF07 = v0.f0(i5, parcel);
                    break;
                case ',':
                    bundleQ4 = v0.q(i5, parcel);
                    break;
                case '-':
                    strY11 = v0.y(i5, parcel);
                    break;
                case '.':
                    o02 = (O0) v0.x(parcel, i5, O0.CREATOR);
                    break;
                case '/':
                    Z14 = v0.Z(i5, parcel);
                    break;
                case '0':
                    bundleQ5 = v0.q(i5, parcel);
                    break;
                case '1':
                    strY12 = v0.y(i5, parcel);
                    break;
                case '2':
                    strY13 = v0.y(i5, parcel);
                    break;
                case '3':
                    strY14 = v0.y(i5, parcel);
                    break;
                case '4':
                    Z15 = v0.Z(i5, parcel);
                    break;
                case '5':
                    int iK0 = v0.k0(i5, parcel);
                    int iDataPosition = parcel.dataPosition();
                    if (iK0 == 0) {
                        arrayList = null;
                        break;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        int i10 = parcel.readInt();
                        for (int i11 = 0; i11 < i10; i11++) {
                            arrayList2.add(Integer.valueOf(parcel.readInt()));
                        }
                        parcel.setDataPosition(iDataPosition + iK0);
                        arrayList = arrayList2;
                        break;
                    }
                case '6':
                    strY15 = v0.y(i5, parcel);
                    break;
                case '7':
                    arrayListA4 = v0.A(i5, parcel);
                    break;
                case '8':
                    iF08 = v0.f0(i5, parcel);
                    break;
                case '9':
                    Z16 = v0.Z(i5, parcel);
                    break;
                case ':':
                    Z17 = v0.Z(i5, parcel);
                    break;
                case ';':
                    Z18 = v0.Z(i5, parcel);
                    break;
                case '<':
                    arrayListA5 = v0.A(i5, parcel);
                    break;
                case '=':
                    strY16 = v0.y(i5, parcel);
                    break;
                case '?':
                    zzbsiVar = (zzbsi) v0.x(parcel, i5, zzbsi.CREATOR);
                    break;
                case '@':
                    strY17 = v0.y(i5, parcel);
                    break;
                case 'A':
                    bundleQ6 = v0.q(i5, parcel);
                    break;
            }
        }
        v0.D(iO0, parcel);
        return new zzcap(iF0, bundleQ, v1Var, x1Var, strY, applicationInfo, packageInfo, strY2, strY3, strY4, aVar, bundleQ2, iF02, arrayListA, bundleQ3, Z10, iF03, iF04, fC0, strY5, jH0, strY6, arrayListA2, strY7, zzbmaVar, arrayListA3, jH02, strY8, fC02, Z11, iF05, iF06, Z12, strY9, strY10, Z13, iF07, bundleQ4, strY11, o02, Z14, bundleQ5, strY12, strY13, strY14, Z15, arrayList, strY15, arrayListA4, iF08, Z16, Z17, Z18, arrayListA5, strY16, zzbsiVar, strY17, bundleQ6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zza(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i5) {
        return new zzcap[i5];
    }
}
