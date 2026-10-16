package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.sqy;

/* loaded from: classes2.dex */
public class LogOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LogOptions> CREATOR = new sqy(3);
    final String a;
    final boolean b;
    final boolean c;
    final boolean d;
    final boolean e;
    final ServiceDumpRequest[] f;
    final boolean g;

    public LogOptions(String str, boolean z, boolean z2, boolean z3, boolean z4, ServiceDumpRequest[] serviceDumpRequestArr, boolean z5) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = serviceDumpRequestArr;
        this.g = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.F(parcel, 2, this.a);
        spu.n(parcel, 3, this.b);
        spu.n(parcel, 4, this.c);
        spu.n(parcel, 5, this.d);
        spu.n(parcel, 6, this.e);
        spu.I(parcel, 7, this.f, i);
        spu.n(parcel, 8, this.g);
        spu.m(parcel, iL);
    }
}
