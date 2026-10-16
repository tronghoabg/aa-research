package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.sqy;

/* loaded from: classes2.dex */
public final class OfflineSuggestion extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OfflineSuggestion> CREATOR = new sqy(8);
    final String a;
    final String b;
    final String c;
    final String d;

    public OfflineSuggestion(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str4;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.F(parcel, 2, this.a);
        spu.F(parcel, 3, this.b);
        spu.F(parcel, 4, this.c);
        spu.F(parcel, 5, this.d);
        spu.m(parcel, iL);
    }
}
