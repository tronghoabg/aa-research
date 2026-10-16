package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.spu;
import defpackage.srf;

/* loaded from: classes2.dex */
public class DogfoodsToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DogfoodsToken> CREATOR = new srf(4);
    public final byte[] a;

    public DogfoodsToken(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iL = spu.l(parcel, 20293);
        spu.v(parcel, 2, this.a);
        spu.m(parcel, iL);
    }
}
