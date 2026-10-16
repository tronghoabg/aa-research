package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.sqy;

/* loaded from: classes2.dex */
public class ThemeSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ThemeSettings> CREATOR = new sqy(4);
    public int a;
    int b;

    public ThemeSettings(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 2, this.a);
        spu.r(parcel, 3, this.b);
        spu.m(parcel, iL);
    }

    public ThemeSettings() {
        throw null;
    }
}
