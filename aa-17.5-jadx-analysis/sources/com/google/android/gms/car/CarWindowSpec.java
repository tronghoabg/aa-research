package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ea;
import defpackage.spu;

/* loaded from: classes.dex */
public class CarWindowSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CarWindowSpec> CREATOR = new ea(16);
    public final String a;
    public final String b;
    public final CarWindowLayoutParams c;
    public final int d;

    public CarWindowSpec(String str, String str2, CarWindowLayoutParams carWindowLayoutParams, int i) {
        this.a = str;
        this.b = str2;
        this.c = carWindowLayoutParams;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        String str = this.a;
        if (str != null) {
            int iL2 = spu.l(parcel, 1);
            parcel.writeString(str);
            spu.m(parcel, iL2);
        }
        String str2 = this.b;
        if (str2 != null) {
            int iL3 = spu.l(parcel, 2);
            parcel.writeString(str2);
            spu.m(parcel, iL3);
        }
        spu.E(parcel, 3, this.c, i);
        int i2 = this.d;
        parcel.writeInt(262148);
        parcel.writeInt(i2);
        spu.m(parcel, iL);
    }
}
