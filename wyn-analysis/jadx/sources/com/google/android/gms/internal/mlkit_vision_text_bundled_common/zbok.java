package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.List;

/* loaded from: classes4.dex */
public final class zbok extends AbstractC2614a {
    public static final Parcelable.Creator<zbok> CREATOR = new zbol();
    private final String zba;
    private final List zbb;

    public zbok(String str, List list) {
        this.zba = str;
        this.zbb = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zba;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, str, false);
        AbstractC1304a.e0(parcel, 2, this.zbb, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
