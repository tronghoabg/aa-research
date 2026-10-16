package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.omc;
import defpackage.rcd;
import defpackage.spu;

/* loaded from: classes.dex */
public class GoogleCertificatesLookupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleCertificatesLookupResponse> CREATOR = new rcd(20);
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public GoogleCertificatesLookupResponse(boolean z, String str, int i, int i2, long j) {
        this.a = z;
        this.b = str;
        this.c = omc.f(i) - 1;
        this.d = omc.g(i2) - 1;
        this.e = j;
    }

    public final int a() {
        return omc.f(this.c);
    }

    public final void b() {
        omc.g(this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iL = spu.l(parcel, 20293);
        spu.n(parcel, 1, z);
        spu.F(parcel, 2, this.b);
        spu.r(parcel, 3, this.c);
        spu.r(parcel, 4, this.d);
        spu.s(parcel, 5, this.e);
        spu.m(parcel, iL);
    }
}
