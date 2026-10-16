package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.sht;
import defpackage.soj;
import defpackage.spu;

@Deprecated
/* loaded from: classes2.dex */
public class GoogleCertificatesQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleCertificatesQuery> CREATOR = new sht(6);
    public final String a;
    public final IBinder b;
    public final boolean c;
    public final boolean d;
    private soj e;

    public GoogleCertificatesQuery(String str, soj sojVar, boolean z, boolean z2) {
        this.a = str;
        this.e = sojVar;
        this.b = sojVar == null ? null : sojVar;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iL = spu.l(parcel, 20293);
        spu.F(parcel, 1, str);
        spu.y(parcel, 2, this.b);
        spu.n(parcel, 3, this.c);
        spu.n(parcel, 4, this.d);
        spu.m(parcel, iL);
    }

    public GoogleCertificatesQuery(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        this.b = iBinder;
        this.c = z;
        this.d = z2;
    }
}
