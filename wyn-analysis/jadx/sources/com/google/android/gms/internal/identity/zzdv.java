package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C1703q;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import x7.E;

/* loaded from: classes.dex */
final class zzdv extends E {
    private final zzdr zza;

    public zzdv(zzdr zzdrVar) {
        super("com.google.android.gms.location.ILocationCallback");
        this.zza = zzdrVar;
    }

    public final zzdv zzc(C1703q c1703q) {
        this.zza.zzb(c1703q);
        return this;
    }

    @Override // x7.F
    public final void zzd(LocationResult locationResult) throws RemoteException {
        this.zza.zza().b(new zzds(this, locationResult));
    }

    @Override // x7.F
    public final void zze(LocationAvailability locationAvailability) throws RemoteException {
        this.zza.zza().b(new zzdt(this, locationAvailability));
    }

    @Override // x7.F
    public final void zzf() {
        this.zza.zza().b(new zzdu(this));
    }

    public final void zzg() {
        this.zza.zza().a();
    }

    public final /* synthetic */ zzdr zzh() {
        return this.zza;
    }
}
