package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class zbom extends AbstractC2614a {
    public static final Parcelable.Creator<zbom> CREATOR = new zbon();
    private final String zba;
    private final String zbb;
    private final String zbc;
    private final boolean zbd;
    private final int zbe;
    private final String zbf;
    private final boolean zbg;

    public zbom(String str, String str2, String str3, boolean z2, int i5, String str4, boolean z10) {
        this.zba = str;
        this.zbb = str2;
        this.zbc = str3;
        this.zbf = str4;
        this.zbe = i5;
        this.zbd = z2;
        this.zbg = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        String str = this.zba;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.a0(parcel, 1, str, false);
        AbstractC1304a.a0(parcel, 2, this.zbb, false);
        AbstractC1304a.a0(parcel, 3, this.zbc, false);
        boolean z2 = this.zbd;
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int i10 = this.zbe;
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(i10);
        AbstractC1304a.a0(parcel, 6, this.zbf, false);
        boolean z10 = this.zbg;
        AbstractC1304a.k0(parcel, 7, 4);
        parcel.writeInt(z10 ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }

    public final String zba() {
        return this.zba;
    }

    public final String zbb() {
        return this.zbf;
    }

    public final String zbc() {
        return this.zbc;
    }

    public final boolean zbd() {
        return this.zbg;
    }
}
