package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class zbf extends AbstractC2614a {
    public static final Parcelable.Creator<zbf> CREATOR = new zbg();
    public final zbj[] zba;
    public final zbd zbb;
    public final zbd zbc;
    public final zbd zbd;
    public final String zbe;
    public final float zbf;
    public final String zbg;
    public final int zbh;
    public final boolean zbi;
    public final int zbj;
    public final int zbk;

    public zbf(zbj[] zbjVarArr, zbd zbdVar, zbd zbdVar2, zbd zbdVar3, String str, float f10, String str2, int i5, boolean z2, int i10, int i11) {
        this.zba = zbjVarArr;
        this.zbb = zbdVar;
        this.zbc = zbdVar2;
        this.zbd = zbdVar3;
        this.zbe = str;
        this.zbf = f10;
        this.zbg = str2;
        this.zbh = i5;
        this.zbi = z2;
        this.zbj = i10;
        this.zbk = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        zbj[] zbjVarArr = this.zba;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.d0(parcel, 2, zbjVarArr, i5);
        AbstractC1304a.Z(parcel, 3, this.zbb, i5, false);
        AbstractC1304a.Z(parcel, 4, this.zbc, i5, false);
        AbstractC1304a.Z(parcel, 5, this.zbd, i5, false);
        AbstractC1304a.a0(parcel, 6, this.zbe, false);
        float f10 = this.zbf;
        AbstractC1304a.k0(parcel, 7, 4);
        parcel.writeFloat(f10);
        AbstractC1304a.a0(parcel, 8, this.zbg, false);
        int i10 = this.zbh;
        AbstractC1304a.k0(parcel, 9, 4);
        parcel.writeInt(i10);
        boolean z2 = this.zbi;
        AbstractC1304a.k0(parcel, 10, 4);
        parcel.writeInt(z2 ? 1 : 0);
        int i11 = this.zbj;
        AbstractC1304a.k0(parcel, 11, 4);
        parcel.writeInt(i11);
        int i12 = this.zbk;
        AbstractC1304a.k0(parcel, 12, 4);
        parcel.writeInt(i12);
        AbstractC1304a.m0(iL0, parcel);
    }
}
