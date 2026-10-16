package com.google.android.gms.feedback;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.sqy;

/* loaded from: classes2.dex */
public class AdditionalConsentConfig extends AbstractSafeParcelable {
    public static final sqy CREATOR = new sqy(0);
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final Bundle f;

    public AdditionalConsentConfig(String str, String str2, String str3, String str4, String str5, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.F(parcel, 2, this.a);
        spu.F(parcel, 3, this.b);
        spu.F(parcel, 4, this.c);
        spu.F(parcel, 5, this.d);
        spu.F(parcel, 6, this.e);
        spu.u(parcel, 7, this.f);
        spu.m(parcel, iL);
    }
}
