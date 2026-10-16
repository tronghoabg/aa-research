package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.srf;

/* loaded from: classes2.dex */
public class ElCapitanOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ElCapitanOptions> CREATOR = new srf(18);
    public final boolean a;
    public final int b;

    public ElCapitanOptions(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.n(parcel, 2, this.a);
        spu.r(parcel, 3, this.b);
        spu.m(parcel, iL);
    }
}
