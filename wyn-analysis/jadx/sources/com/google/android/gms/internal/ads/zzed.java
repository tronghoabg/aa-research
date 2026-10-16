package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzed {
    public final Object zza;
    private zzr zzb = new zzr();
    private boolean zzc;
    private boolean zzd;

    public zzed(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzed.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzed) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i5, zzeb zzebVar) {
        if (this.zzd) {
            return;
        }
        if (i5 != -1) {
            this.zzb.zza(i5);
        }
        this.zzc = true;
        zzebVar.zza(this.zza);
    }

    public final void zzb(zzec zzecVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        zzs zzsVarZzb = this.zzb.zzb();
        this.zzb = new zzr();
        this.zzc = false;
        zzecVar.zza(this.zza, zzsVarZzb);
    }

    public final /* synthetic */ void zzc(zzec zzecVar) {
        this.zzd = true;
        if (zzecVar == null || !this.zzc) {
            return;
        }
        this.zzc = false;
        zzecVar.zza(this.zza, this.zzb.zzb());
    }
}
