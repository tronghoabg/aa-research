package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public abstract class zzabi {
    private zzabh zza;
    private zzabr zzb;

    public void zzb() {
        this.zza = null;
        this.zzb = null;
    }

    public boolean zzd() {
        throw null;
    }

    public void zze(zzd zzdVar) {
        throw null;
    }

    public zznd zzg() {
        throw null;
    }

    public abstract void zzq(Object obj);

    public abstract zzabj zzr(zzne[] zzneVarArr, zzzo zzzoVar, zzxl zzxlVar, zzbf zzbfVar) throws zzjm;

    public final void zzs(zzabh zzabhVar, zzabr zzabrVar) {
        zzgtr.zzi(this.zza == null);
        this.zza = zzabhVar;
        this.zzb = zzabrVar;
    }

    public final void zzt() {
        zzabh zzabhVar = this.zza;
        if (zzabhVar != null) {
            zzabhVar.zzq();
        }
    }

    public final zzabr zzu() {
        zzabr zzabrVar = this.zzb;
        zzabrVar.getClass();
        return zzabrVar;
    }
}
