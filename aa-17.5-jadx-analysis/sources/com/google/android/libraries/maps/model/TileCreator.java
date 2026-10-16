package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class TileCreator implements Parcelable.Creator<Tile> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public Tile createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        byte[] bArrAg = null;
        int iN = 0;
        int iN2 = 0;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                iN = spu.N(parcel, i);
            } else if (c == 3) {
                iN2 = spu.N(parcel, i);
            } else if (c != 4) {
                spu.ae(parcel, i);
            } else {
                bArrAg = spu.ag(parcel, i);
            }
        }
        spu.ac(parcel, iP);
        return new Tile(iN, iN2, bArrAg);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public Tile[] newArray(int i) {
        return new Tile[i];
    }
}
