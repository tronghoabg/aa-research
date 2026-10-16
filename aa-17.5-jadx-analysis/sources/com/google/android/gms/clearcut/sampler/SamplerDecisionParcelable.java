package com.google.android.gms.clearcut.sampler;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.sht;
import defpackage.spu;

/* loaded from: classes2.dex */
public class SamplerDecisionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SamplerDecisionParcelable> CREATOR = new sht(5);
    public final boolean a;
    public final long b;

    public SamplerDecisionParcelable(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iL = spu.l(parcel, 20293);
        spu.n(parcel, 1, z);
        spu.s(parcel, 2, this.b);
        spu.m(parcel, iL);
    }
}
