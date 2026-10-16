package com.google.android.gms.internal.ads;

import a.AbstractC1304a;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import f7.AbstractC2614a;
import java.util.Map;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class zzcaa extends AbstractC2614a {
    public static final Parcelable.Creator<zzcaa> CREATOR = new zzcab();
    public final View zza;
    public final Map zzb;

    public zzcaa(IBinder iBinder, IBinder iBinder2) {
        this.zza = (View) BinderC3877b.S(BinderC3877b.R(iBinder));
        this.zzb = (Map) BinderC3877b.S(BinderC3877b.R(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        View view = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.V(parcel, 1, new BinderC3877b(view).asBinder());
        AbstractC1304a.V(parcel, 2, new BinderC3877b(this.zzb).asBinder());
        AbstractC1304a.m0(iL0, parcel);
    }
}
