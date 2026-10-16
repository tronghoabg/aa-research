package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.srf;

/* loaded from: classes2.dex */
public class SafetyOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SafetyOptions> CREATOR = new srf(19);
    public final boolean a;
    public final boolean b;
    public final int c;

    public SafetyOptions(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.n(parcel, 2, this.a);
        spu.n(parcel, 3, this.b);
        spu.r(parcel, 4, this.c);
        spu.m(parcel, iL);
    }
}
