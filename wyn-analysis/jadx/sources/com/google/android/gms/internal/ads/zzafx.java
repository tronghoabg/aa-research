package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzafx implements zzahm {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzahm
    public final void zzA(zzv zzvVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final /* synthetic */ void zzP(long j8) {
        AbstractC1745i.a(this, j8);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final /* synthetic */ int zza(zzj zzjVar, int i5, boolean z2) {
        return AbstractC1745i.b(this, zzjVar, i5, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final int zzb(zzj zzjVar, int i5, boolean z2, int i10) throws IOException {
        int iZza = zzjVar.zza(this.zza, 0, Math.min(4096, i5));
        if (iZza != -1) {
            return iZza;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final /* synthetic */ void zzc(zzeu zzeuVar, int i5) {
        AbstractC1745i.c(this, zzeuVar, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final void zzd(zzeu zzeuVar, int i5, int i10) {
        zzeuVar.zzk(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final void zze(long j8, int i5, int i10, int i11, zzahl zzahlVar) {
    }
}
