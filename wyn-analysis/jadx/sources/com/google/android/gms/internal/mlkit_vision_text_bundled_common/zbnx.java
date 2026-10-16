package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;

/* loaded from: classes4.dex */
public final class zbnx extends AbstractC2614a {
    public static final Parcelable.Creator<zbnx> CREATOR = new zbny();
    private final int zba;
    private final int zbb;
    private final int zbc;
    private final int zbd;
    private final long zbe;

    public zbnx(int i5, int i10, int i11, int i12, long j8) {
        this.zba = i5;
        this.zbb = i10;
        this.zbc = i11;
        this.zbd = i12;
        this.zbe = j8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int iL0 = AbstractC1304a.l0(20293, parcel);
        int i10 = this.zba;
        AbstractC1304a.k0(parcel, 1, 4);
        parcel.writeInt(i10);
        int i11 = this.zbb;
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(i11);
        int i12 = this.zbc;
        AbstractC1304a.k0(parcel, 3, 4);
        parcel.writeInt(i12);
        int i13 = this.zbd;
        AbstractC1304a.k0(parcel, 4, 4);
        parcel.writeInt(i13);
        long j8 = this.zbe;
        AbstractC1304a.k0(parcel, 5, 8);
        parcel.writeLong(j8);
        AbstractC1304a.m0(iL0, parcel);
    }

    public final int zba() {
        return this.zbc;
    }

    public final int zbb() {
        return this.zba;
    }

    public final int zbc() {
        return this.zbd;
    }

    public final int zbd() {
        return this.zbb;
    }

    public final long zbe() {
        return this.zbe;
    }
}
