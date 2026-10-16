package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import a.AbstractC1304a;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.List;

/* loaded from: classes4.dex */
public final class zboe extends AbstractC2614a {
    public static final Parcelable.Creator<zboe> CREATOR = new zbof();
    private final String zba;
    private final Rect zbb;
    private final List zbc;
    private final String zbd;
    private final List zbe;

    public zboe(String str, Rect rect, List list, String str2, List list2) {
        this.zba = str;
        this.zbb = rect;
        this.zbc = list;
        this.zbd = str2;
        this.zbe = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zba;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, str, false);
        AbstractC1304a.Z(parcel, 2, this.zbb, i5, false);
        AbstractC1304a.e0(parcel, 3, this.zbc, false);
        AbstractC1304a.a0(parcel, 4, this.zbd, false);
        AbstractC1304a.e0(parcel, 5, this.zbe, false);
        AbstractC1304a.m0(iL0, parcel);
    }

    public final String zba() {
        return this.zba;
    }
}
