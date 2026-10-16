package com.google.android.gms.internal.ads;

import a.AbstractC1304a;
import android.os.Parcel;
import android.os.Parcelable;
import f7.AbstractC2614a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzcar extends AbstractC2614a {
    public static final Parcelable.Creator<zzcar> CREATOR = new zzcas();
    public final boolean zza;
    public final List zzb;

    public zzcar(boolean z2, List list) {
        this.zza = z2;
        this.zzb = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        boolean z2 = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.k0(parcel, 2, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC1304a.c0(parcel, 3, this.zzb);
        AbstractC1304a.m0(iL0, parcel);
    }

    public zzcar() {
        this(false, Collections.EMPTY_LIST);
    }
}
