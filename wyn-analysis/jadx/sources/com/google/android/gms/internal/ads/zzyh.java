package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class zzyh extends zzagq {
    private final zzzc zza;
    private final zzafx zzb;
    private final AtomicReference zzc;

    public zzyh(zzzc zzzcVar) {
        super(zzzcVar);
        this.zza = zzzcVar;
        this.zzb = new zzafx();
        this.zzc = new AtomicReference(zzyg.PASS_THROUGH);
    }

    private final zzahm zzh() {
        return this.zzc.get() == zzyg.DISCARDING ? this.zzb : this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzagq, com.google.android.gms.internal.ads.zzahm
    public final int zza(zzj zzjVar, int i5, boolean z2) throws IOException {
        return zzh().zza(zzjVar, i5, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzagq, com.google.android.gms.internal.ads.zzahm
    public final int zzb(zzj zzjVar, int i5, boolean z2, int i10) throws IOException {
        return zzh().zzb(zzjVar, i5, z2, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzagq, com.google.android.gms.internal.ads.zzahm
    public final void zzc(zzeu zzeuVar, int i5) {
        zzh().zzc(zzeuVar, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzagq, com.google.android.gms.internal.ads.zzahm
    public final void zzd(zzeu zzeuVar, int i5, int i10) {
        zzh().zzd(zzeuVar, i5, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzagq, com.google.android.gms.internal.ads.zzahm
    public final void zze(long j8, int i5, int i10, int i11, zzahl zzahlVar) {
        zzh().zze(j8, i5, i10, i11, zzahlVar);
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() == zzyg.DISCARD_AFTER_NEXT_SAMPLE_METADATA) {
            this.zza.zzg(false);
            atomicReference.set(zzyg.DISCARDING);
        }
    }

    public final boolean zzf() {
        return this.zzc.get() == zzyg.PASS_THROUGH;
    }
}
