package com.google.android.libraries.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class MarkerOptionsCreator implements Parcelable.Creator<MarkerOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public MarkerOptions createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        LatLng latLng = null;
        String strX = null;
        String strX2 = null;
        IBinder iBinderS = null;
        IBinder iBinderS2 = null;
        String strX3 = null;
        boolean zAf = false;
        boolean zAf2 = false;
        boolean zAf3 = false;
        int iN = 0;
        int iN2 = 0;
        float fM = 0.0f;
        float fM2 = 0.0f;
        float fM3 = 0.0f;
        float fM4 = 0.0f;
        float fM5 = 0.0f;
        float fM6 = 1.0f;
        float fM7 = 0.5f;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    latLng = (LatLng) spu.T(parcel, i, LatLng.CREATOR);
                    break;
                case 3:
                    strX = spu.X(parcel, i);
                    break;
                case 4:
                    strX2 = spu.X(parcel, i);
                    break;
                case 5:
                    iBinderS = spu.S(parcel, i);
                    break;
                case 6:
                    fM = spu.M(parcel, i);
                    break;
                case 7:
                    fM2 = spu.M(parcel, i);
                    break;
                case '\b':
                    zAf = spu.af(parcel, i);
                    break;
                case '\t':
                    zAf2 = spu.af(parcel, i);
                    break;
                case '\n':
                    zAf3 = spu.af(parcel, i);
                    break;
                case 11:
                    fM3 = spu.M(parcel, i);
                    break;
                case '\f':
                    fM7 = spu.M(parcel, i);
                    break;
                case '\r':
                    fM4 = spu.M(parcel, i);
                    break;
                case 14:
                    fM6 = spu.M(parcel, i);
                    break;
                case 15:
                    fM5 = spu.M(parcel, i);
                    break;
                case 16:
                default:
                    spu.ae(parcel, i);
                    break;
                case 17:
                    iN = spu.N(parcel, i);
                    break;
                case 18:
                    iBinderS2 = spu.S(parcel, i);
                    break;
                case 19:
                    iN2 = spu.N(parcel, i);
                    break;
                case 20:
                    strX3 = spu.X(parcel, i);
                    break;
            }
        }
        spu.ac(parcel, iP);
        return new MarkerOptions(latLng, strX, strX2, iBinderS, fM, fM2, zAf, zAf2, zAf3, fM3, fM7, fM4, fM6, fM5, iN, iBinderS2, iN2, strX3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public MarkerOptions[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
