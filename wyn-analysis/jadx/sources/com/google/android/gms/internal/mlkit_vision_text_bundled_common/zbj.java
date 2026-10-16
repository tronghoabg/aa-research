package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class zbj extends AbstractC2614a {
    public static final Parcelable.Creator<zbj> CREATOR = new zbk();
    public final zbh[] zba;
    public final zbd zbb;
    public final zbd zbc;
    public final String zbd;
    public final float zbe;
    public final String zbf;
    public final boolean zbg;

    public zbj(zbh[] zbhVarArr, zbd zbdVar, zbd zbdVar2, String str, float f10, String str2, boolean z2) {
        this.zba = zbhVarArr;
        this.zbb = zbdVar;
        this.zbc = zbdVar2;
        this.zbd = str;
        this.zbe = f10;
        this.zbf = str2;
        this.zbg = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        zbh[] zbhVarArr = this.zba;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.d0(parcel, 2, zbhVarArr, i5);
        AbstractC1304a.Z(parcel, 3, this.zbb, i5, false);
        AbstractC1304a.Z(parcel, 4, this.zbc, i5, false);
        AbstractC1304a.a0(parcel, 5, this.zbd, false);
        float f10 = this.zbe;
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeFloat(f10);
        AbstractC1304a.a0(parcel, 7, this.zbf, false);
        boolean z2 = this.zbg;
        AbstractC1304a.k0(parcel, 8, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC1304a.m0(iL0, parcel);
    }
}
