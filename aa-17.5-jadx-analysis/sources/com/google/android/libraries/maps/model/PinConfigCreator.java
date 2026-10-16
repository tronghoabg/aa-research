package com.google.android.libraries.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.maps.model.PinConfig;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class PinConfigCreator implements Parcelable.Creator<PinConfig> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public PinConfig createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        PinConfig.Glyph glyph = null;
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
                glyph = (PinConfig.Glyph) spu.T(parcel, i, PinConfig.Glyph.CREATOR);
            }
        }
        spu.ac(parcel, iP);
        return new PinConfig(iN, iN2, glyph);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public PinConfig[] newArray(int i) {
        return new PinConfig[i];
    }
}
