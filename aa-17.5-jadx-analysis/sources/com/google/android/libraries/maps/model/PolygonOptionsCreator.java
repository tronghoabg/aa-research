package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class PolygonOptionsCreator implements Parcelable.Creator<PolygonOptions> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public PolygonOptions createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        ArrayList arrayList = new ArrayList();
        float fM = BitmapDescriptorFactory.HUE_RED;
        ArrayList arrayListAb = null;
        int iN = 0;
        int iN2 = 0;
        boolean zAf = false;
        boolean zAf2 = false;
        boolean zAf3 = false;
        int iN3 = 0;
        float fM2 = 0.0f;
        ArrayList arrayListAb2 = null;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    arrayListAb2 = spu.ab(parcel, i, LatLng.CREATOR);
                    break;
                case 3:
                    ClassLoader classLoader = getClass().getClassLoader();
                    int iO = spu.O(parcel, i);
                    int iDataPosition = parcel.dataPosition();
                    if (iO == 0) {
                        break;
                    } else {
                        parcel.readList(arrayList, classLoader);
                        parcel.setDataPosition(iDataPosition + iO);
                        break;
                    }
                case 4:
                    fM = spu.M(parcel, i);
                    break;
                case 5:
                    iN = spu.N(parcel, i);
                    break;
                case 6:
                    iN2 = spu.N(parcel, i);
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
                    iN3 = spu.N(parcel, i);
                    break;
                case '\f':
                    arrayListAb = spu.ab(parcel, i, PatternItem.CREATOR);
                    break;
                default:
                    spu.ae(parcel, i);
                    break;
            }
        }
        spu.ac(parcel, iP);
        return new PolygonOptions(arrayListAb2, arrayList, fM, iN, iN2, fM2, zAf, zAf2, zAf3, iN3, arrayListAb);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public PolygonOptions[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
