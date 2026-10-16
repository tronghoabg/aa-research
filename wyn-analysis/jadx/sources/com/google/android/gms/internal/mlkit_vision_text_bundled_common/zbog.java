package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import a.AbstractC1304a;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.List;

/* loaded from: classes4.dex */
public final class zbog extends AbstractC2614a {
    public static final Parcelable.Creator<zbog> CREATOR = new zboh();
    private final String zba;
    private final Rect zbb;
    private final List zbc;
    private final String zbd;
    private final float zbe;
    private final float zbf;
    private final List zbg;

    public zbog(String str, Rect rect, List list, String str2, float f10, float f11, List list2) {
        this.zba = str;
        this.zbb = rect;
        this.zbc = list;
        this.zbd = str2;
        this.zbe = f10;
        this.zbf = f11;
        this.zbg = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zba;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, str, false);
        AbstractC1304a.Z(parcel, 2, this.zbb, i5, false);
        AbstractC1304a.e0(parcel, 3, this.zbc, false);
        AbstractC1304a.a0(parcel, 4, this.zbd, false);
        float f10 = this.zbe;
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeFloat(f10);
        float f11 = this.zbf;
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeFloat(f11);
        AbstractC1304a.e0(parcel, 7, this.zbg, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
