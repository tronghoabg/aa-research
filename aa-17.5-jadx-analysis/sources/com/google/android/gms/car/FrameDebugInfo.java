package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qte;
import defpackage.spu;

/* loaded from: classes.dex */
public class FrameDebugInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FrameDebugInfo> CREATOR = new qte(4);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public FrameDebugInfo(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int iL = spu.l(parcel, 20293);
        spu.s(parcel, 1, j);
        spu.s(parcel, 2, this.b);
        spu.s(parcel, 3, this.c);
        spu.s(parcel, 4, this.d);
        spu.s(parcel, 5, this.e);
        spu.m(parcel, iL);
    }
}
