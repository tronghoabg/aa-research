package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.sqy;

/* loaded from: classes2.dex */
public final class InProductHelp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InProductHelp> CREATOR = new sqy(6);
    public GoogleHelp a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final int f;
    public final String g;

    public InProductHelp(GoogleHelp googleHelp, String str, String str2, int i, String str3, int i2, String str4) {
        this.a = googleHelp;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = i2;
        this.g = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.E(parcel, 1, this.a, i);
        spu.F(parcel, 2, this.b);
        spu.F(parcel, 3, this.c);
        spu.r(parcel, 4, this.d);
        spu.F(parcel, 5, this.e);
        spu.r(parcel, 6, this.f);
        spu.F(parcel, 7, this.g);
        spu.m(parcel, iL);
    }
}
