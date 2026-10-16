package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qoj;
import defpackage.spu;
import java.util.List;

/* loaded from: classes2.dex */
public final class Oauth2TokenMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Oauth2TokenMetadata> CREATOR = new qoj(8);
    public final Long a;
    public final List b;

    public Oauth2TokenMetadata(Long l, List list) {
        this.a = l;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int iL = spu.l(parcel, 20293);
        spu.D(parcel, 1, l);
        spu.H(parcel, 2, this.b);
        spu.m(parcel, iL);
    }
}
