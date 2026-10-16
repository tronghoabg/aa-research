package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qte;
import defpackage.spu;

/* loaded from: classes2.dex */
public class KillOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KillOptions> CREATOR = new qte(7);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public KillOptions(String str, boolean z, boolean z2, String str2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.F(parcel, 1, this.a);
        spu.n(parcel, 2, this.b);
        spu.n(parcel, 3, this.c);
        spu.F(parcel, 4, this.d);
        spu.m(parcel, iL);
    }
}
