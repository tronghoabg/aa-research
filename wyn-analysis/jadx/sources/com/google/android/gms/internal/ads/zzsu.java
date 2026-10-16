package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzsu implements zzth {
    final /* synthetic */ zztb zza;

    public /* synthetic */ zzsu(zztb zztbVar, byte[] bArr) {
        Objects.requireNonNull(zztbVar);
        this.zza = zztbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzth
    public final void zza(long j8) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + 41);
        sb2.append("Ignoring impossibly large audio latency: ");
        sb2.append(j8);
        zzeh.zzc("AudioTrackAudioOutput", sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzth
    public final void zzb(final long j8) {
        zztb zztbVar = this.zza;
        if (zztbVar.zzu().zzb()) {
            zzeg zzegVarZzu = zztbVar.zzu();
            zzegVarZzu.zze(-1, new zzeb() { // from class: com.google.android.gms.internal.ads.zzst
                @Override // com.google.android.gms.internal.ads.zzeb
                public final /* synthetic */ void zza(Object obj) {
                    ((zzqv) obj).zza(j8);
                }
            });
            zzegVarZzu.zzf();
        }
    }
}
