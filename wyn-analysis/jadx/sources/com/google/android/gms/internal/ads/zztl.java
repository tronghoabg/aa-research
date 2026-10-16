package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zztl implements zzqv {
    final /* synthetic */ zztu zza;
    private final zzrg zzb;

    public /* synthetic */ zztl(zztu zztuVar, zzrg zzrgVar, byte[] bArr) {
        Objects.requireNonNull(zztuVar);
        this.zza = zztuVar;
        this.zzb = zzrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zza(long j8) {
        zztu zztuVar = this.zza;
        if (equals(zztuVar.zzK()) && zztuVar.zzL() != null) {
            zzua zzuaVar = ((zztz) zztuVar.zzL()).zza;
            zzuaVar.zzaE(true);
            zzuaVar.zzaB().zzd(j8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzb() {
        zznb zznbVarZzbe;
        zztu zztuVar = this.zza;
        if (equals(zztuVar.zzK()) && zztuVar.zzL() != null && zztuVar.zzQ() && (zznbVarZzbe = ((zztz) zztuVar.zzL()).zza.zzbe()) != null) {
            zznbVarZzbe.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzc() {
        zztu zztuVar = this.zza;
        if (equals(zztuVar.zzK()) && zztuVar.zzO()) {
            zztuVar.zzP(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zzd() {
        long jZzu;
        zztu zztuVar = this.zza;
        if (equals(zztuVar.zzK()) && zztuVar.zzL() != null) {
            if (zztuVar.zzM().zzi() != -1) {
                long jZzi = zztuVar.zzM().zzj().zze / zztuVar.zzM().zzi();
                zzqx zzqxVarZzN = zztuVar.zzN();
                zzqxVarZzN.getClass();
                jZzu = zzfm.zzu(jZzi, zzqxVarZzN.zzi());
            } else {
                jZzu = -9223372036854775807L;
            }
            ((zztz) zztuVar.zzL()).zza.zzaB().zze(zztuVar.zzM().zzj().zze, zzfm.zzs(jZzu), SystemClock.elapsedRealtime() - zztuVar.zzR());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqv
    public final void zze() {
        zztu.zza.getAndDecrement();
        zztu zztuVar = this.zza;
        if (zztuVar.zzL() != null) {
            zzrg zzrgVar = this.zzb;
            ((zztz) zztuVar.zzL()).zza.zzaB().zzl(new zzsa(zzrgVar.zza, zzrgVar.zzb, zzrgVar.zzc, false, false, zzrgVar.zze));
        }
    }
}
