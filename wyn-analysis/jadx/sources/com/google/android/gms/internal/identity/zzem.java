package com.google.android.gms.internal.identity;

import a.AbstractC1304a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC1732v;
import f7.AbstractC2614a;
import java.util.List;

/* loaded from: classes.dex */
public final class zzem extends AbstractC2614a {
    public static final Parcelable.Creator<zzem> CREATOR = new zzen();
    private final List zza;
    private final PendingIntent zzb;
    private final String zzc;

    public zzem(List list, PendingIntent pendingIntent, String str) {
        this.zza = list == null ? zzex.zzi() : zzex.zzj(list);
        this.zzb = pendingIntent;
        this.zzc = str;
    }

    public static zzem zza(List list) {
        AbstractC1732v.j(list, "geofence can't be null.");
        AbstractC1732v.a("Geofences must contains at least one id.", !list.isEmpty());
        return new zzem(list, null, "");
    }

    public static zzem zzb(PendingIntent pendingIntent) {
        AbstractC1732v.j(pendingIntent, "PendingIntent can not be null.");
        return new zzem(null, pendingIntent, "");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        List list = this.zza;
        int iL0 = AbstractC1304a.l0(20293, parcel);
        AbstractC1304a.c0(parcel, 1, list);
        AbstractC1304a.Z(parcel, 2, this.zzb, i5, false);
        AbstractC1304a.a0(parcel, 3, this.zzc, false);
        AbstractC1304a.m0(iL0, parcel);
    }
}
