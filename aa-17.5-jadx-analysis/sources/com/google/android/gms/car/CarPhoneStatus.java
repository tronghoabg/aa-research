package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qoj;
import defpackage.spu;

/* loaded from: classes.dex */
public class CarPhoneStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarPhoneStatus> CREATOR = new qoj(19);
    public CarCall[] a;
    public int b;

    public static class CarCall extends AbstractSafeParcelable {
        public static final Parcelable.Creator<CarCall> CREATOR = new qoj(18);
        public int a;
        public int b;
        public String c;
        public String d;
        public String e;
        public byte[] f;

        public CarCall(int i, int i2, String str, String str2, String str3, byte[] bArr) {
            this.a = i;
            this.c = str;
            this.b = i2;
            this.d = str2;
            this.e = str3;
            this.f = bArr;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iL = spu.l(parcel, 20293);
            spu.r(parcel, 1, this.a);
            spu.r(parcel, 2, this.b);
            spu.F(parcel, 3, this.c);
            spu.F(parcel, 4, this.d);
            spu.F(parcel, 5, this.e);
            spu.v(parcel, 6, this.f);
            spu.m(parcel, iL);
        }
    }

    public CarPhoneStatus(CarCall[] carCallArr, int i) {
        this.a = carCallArr;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.I(parcel, 1, this.a, i);
        spu.r(parcel, 2, this.b);
        spu.m(parcel, iL);
    }

    public CarPhoneStatus() {
    }
}
