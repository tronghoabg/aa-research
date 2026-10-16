package com.google.android.libraries.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLngBounds;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class GoogleMapOptionsCreator implements Parcelable.Creator<GoogleMapOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public GoogleMapOptions createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        byte bK = -1;
        byte bK2 = -1;
        byte bK3 = -1;
        byte bK4 = -1;
        byte bK5 = -1;
        byte bK6 = -1;
        byte bK7 = -1;
        byte bK8 = -1;
        byte bK9 = -1;
        byte bK10 = -1;
        byte bK11 = -1;
        byte bK12 = -1;
        byte bK13 = -1;
        int iN = -1;
        CameraPosition cameraPosition = null;
        Float fU = null;
        Float fU2 = null;
        LatLngBounds latLngBounds = null;
        Integer numV = null;
        String strX = null;
        int iN2 = 0;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    bK = spu.K(parcel, i);
                    break;
                case 3:
                    bK2 = spu.K(parcel, i);
                    break;
                case 4:
                    iN2 = spu.N(parcel, i);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) spu.T(parcel, i, CameraPosition.CREATOR);
                    break;
                case 6:
                    bK3 = spu.K(parcel, i);
                    break;
                case 7:
                    bK4 = spu.K(parcel, i);
                    break;
                case '\b':
                    bK5 = spu.K(parcel, i);
                    break;
                case '\t':
                    bK6 = spu.K(parcel, i);
                    break;
                case '\n':
                    bK7 = spu.K(parcel, i);
                    break;
                case 11:
                    bK8 = spu.K(parcel, i);
                    break;
                case '\f':
                    bK9 = spu.K(parcel, i);
                    break;
                case '\r':
                default:
                    spu.ae(parcel, i);
                    break;
                case 14:
                    bK10 = spu.K(parcel, i);
                    break;
                case 15:
                    bK11 = spu.K(parcel, i);
                    break;
                case 16:
                    fU = spu.U(parcel, i);
                    break;
                case 17:
                    fU2 = spu.U(parcel, i);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) spu.T(parcel, i, LatLngBounds.CREATOR);
                    break;
                case 19:
                    bK12 = spu.K(parcel, i);
                    break;
                case 20:
                    numV = spu.V(parcel, i);
                    break;
                case 21:
                    strX = spu.X(parcel, i);
                    break;
                case 22:
                    bK13 = spu.K(parcel, i);
                    break;
                case 23:
                    iN = spu.N(parcel, i);
                    break;
            }
        }
        spu.ac(parcel, iP);
        return new GoogleMapOptions(bK, bK2, iN2, cameraPosition, bK3, bK4, bK5, bK6, bK7, bK8, bK9, bK10, bK11, fU, fU2, latLngBounds, bK12, numV, strX, bK13, iN);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public GoogleMapOptions[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
