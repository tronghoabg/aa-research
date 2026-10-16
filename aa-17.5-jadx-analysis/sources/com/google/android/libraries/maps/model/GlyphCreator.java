package com.google.android.libraries.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.maps.model.PinConfig;
import defpackage.spu;

/* loaded from: classes3.dex */
public final class GlyphCreator implements Parcelable.Creator<PinConfig.Glyph> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public PinConfig.Glyph createFromParcel(Parcel parcel) {
        int iP = spu.P(parcel);
        int iN = 0;
        String strX = null;
        IBinder iBinderS = null;
        int iN2 = 0;
        while (parcel.dataPosition() < iP) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strX = spu.X(parcel, i);
            } else if (c == 3) {
                iBinderS = spu.S(parcel, i);
            } else if (c == 4) {
                iN = spu.N(parcel, i);
            } else if (c != 5) {
                spu.ae(parcel, i);
            } else {
                iN2 = spu.N(parcel, i);
            }
        }
        spu.ac(parcel, iP);
        return new PinConfig.Glyph(strX, iBinderS, iN, iN2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public PinConfig.Glyph[] newArray(int i) {
        return new PinConfig.Glyph[i];
    }
}
