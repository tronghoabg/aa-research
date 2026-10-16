package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.sli;
import defpackage.spu;
import defpackage.srf;

/* loaded from: classes2.dex */
public class AuthAccountResult extends AbstractSafeParcelable implements sli {
    public static final Parcelable.Creator<AuthAccountResult> CREATOR = new srf(12);
    final int a;
    public int b;
    public Intent c;

    public AuthAccountResult(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.sli
    public final Status b() {
        return this.b == 0 ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.r(parcel, 1, this.a);
        spu.r(parcel, 2, this.b);
        spu.E(parcel, 3, this.c, i);
        spu.m(parcel, iL);
    }

    public AuthAccountResult() {
        this(2, 0, null);
    }
}
