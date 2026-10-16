package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class zbd extends AbstractC2614a {
    public static final Parcelable.Creator<zbd> CREATOR = new zbe();
    public final int zba;
    public final int zbb;
    public final int zbc;
    public final int zbd;
    public final float zbe;

    public zbd(int i5, int i10, int i11, int i12, float f10) {
        this.zba = i5;
        this.zbb = i10;
        this.zbc = i11;
        this.zbd = i12;
        this.zbe = f10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i10 = this.zba;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(i10);
        int i11 = this.zbb;
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(i11);
        int i12 = this.zbc;
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(i12);
        int i13 = this.zbd;
        AbstractC1304a.k0(parcel, 5, 4);
        parcel.writeInt(i13);
        float f10 = this.zbe;
        AbstractC1304a.k0(parcel, 6, 4);
        parcel.writeFloat(f10);
        AbstractC1304a.m0(iL0, parcel);
    }
}
