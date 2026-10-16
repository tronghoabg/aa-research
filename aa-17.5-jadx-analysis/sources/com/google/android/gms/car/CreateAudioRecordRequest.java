package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qte;
import defpackage.spu;

/* loaded from: classes2.dex */
public class CreateAudioRecordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateAudioRecordRequest> CREATOR = new qte(0);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public CreateAudioRecordRequest(boolean z, int i, int i2, int i3, int i4, int i5) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iL = spu.l(parcel, 20293);
        spu.n(parcel, 1, z);
        spu.r(parcel, 2, this.b);
        spu.r(parcel, 3, this.c);
        spu.r(parcel, 4, this.d);
        spu.r(parcel, 5, this.e);
        spu.r(parcel, 6, this.f);
        spu.m(parcel, iL);
    }
}
