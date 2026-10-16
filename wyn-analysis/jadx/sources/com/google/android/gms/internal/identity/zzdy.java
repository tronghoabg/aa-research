package com.google.android.gms.internal.identity;

import android.location.Location;
import com.google.android.gms.common.api.internal.C1703q;
import x7.H;

/* loaded from: classes.dex */
final class zzdy extends H {
    private final zzdr zza;

    public zzdy(zzdr zzdrVar) {
        super("com.google.android.gms.location.ILocationListener");
        this.zza = zzdrVar;
    }

    public final zzdy zzc(C1703q c1703q) {
        this.zza.zzb(c1703q);
        return this;
    }

    @Override // x7.I
    public final void zzd(Location location) {
        this.zza.zza().b(new zzdw(this, location));
    }

    @Override // x7.I
    public final void zze() {
        this.zza.zza().b(new zzdx(this));
    }

    public final void zzf() {
        this.zza.zza().a();
    }

    public final /* synthetic */ zzdr zzg() {
        return this.zza;
    }
}
