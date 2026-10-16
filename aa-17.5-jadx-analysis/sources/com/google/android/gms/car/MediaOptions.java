package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.qte;
import defpackage.spu;

/* loaded from: classes2.dex */
public class MediaOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MediaOptions> CREATOR = new qte(8);
    public final boolean a;

    public MediaOptions(boolean z) {
        this.a = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iL = spu.l(parcel, 20293);
        spu.n(parcel, 1, z);
        spu.m(parcel, iL);
    }
}
