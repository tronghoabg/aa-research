package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzboi {
    private final A6.m zza;
    private final A6.l zzb;
    private zzbnd zzc;

    public zzboi(A6.m mVar, A6.l lVar) {
        this.zza = mVar;
        this.zzb = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized zzbnd zze(zzbnc zzbncVar) {
        zzbnd zzbndVar = this.zzc;
        if (zzbndVar != null) {
            return zzbndVar;
        }
        zzbnd zzbndVar2 = new zzbnd(zzbncVar);
        this.zzc = zzbndVar2;
        return zzbndVar2;
    }

    public final zzbnp zza() {
        return new zzboh(this, null);
    }

    public final zzbnm zzb() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbog(this, null);
    }

    public final /* synthetic */ A6.m zzc() {
        return this.zza;
    }

    public final /* synthetic */ A6.l zzd() {
        return this.zzb;
    }
}
