package com.google.android.gms.internal.ads;

import Va.M6;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzwp implements zzye {
    private final zzagg zza;
    private zzaga zzb;
    private zzagb zzc;

    public zzwp(zzagg zzaggVar) {
        this.zza = zzaggVar;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void zza(zzj zzjVar, Uri uri, Map map, long j8, long j10, zzagd zzagdVar) throws IOException {
        zzafr zzafrVar = new zzafr(zzjVar, j8, j10);
        this.zzc = zzafrVar;
        if (this.zzb != null) {
            return;
        }
        zzaga[] zzagaVarArrZzb = this.zza.zzb(uri, map);
        int length = zzagaVarArrZzb.length;
        zzgwq zzgwqVarZzv = zzgwt.zzv(length);
        boolean z2 = true;
        if (length == 1) {
            this.zzb = zzagaVarArrZzb[0];
        } else {
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                zzaga zzagaVar = zzagaVarArrZzb[i5];
                try {
                } catch (EOFException unused) {
                    if (this.zzb != null || zzafrVar.zzn() == j8) {
                    }
                } catch (Throwable th) {
                    if (this.zzb == null && zzafrVar.zzn() != j8) {
                        z2 = false;
                    }
                    zzgtr.zzi(z2);
                    zzafrVar.zzl();
                    throw th;
                }
                if (zzagaVar.zza(zzafrVar)) {
                    this.zzb = zzagaVar;
                    zzgtr.zzi(true);
                    zzafrVar.zzl();
                    break;
                } else {
                    zzgwqVarZzv.zzh(zzagaVar.zzb());
                    boolean z10 = this.zzb != null || zzafrVar.zzn() == j8;
                    zzgtr.zzi(z10);
                    zzafrVar.zzl();
                    i5++;
                }
            }
            if (this.zzb == null) {
                String strZzd = zzgtl.zzd(zzgxt.zzc(zzgwt.zzr(zzagaVarArrZzb), zzwo.zza), ", ");
                throw new zzzp(M6.t(new StringBuilder(strZzd.length() + 58), "None of the available extractors (", strZzd, ") could read the stream."), uri, zzgwqVarZzv.zzi());
            }
        }
        this.zzb.zzc(zzagdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void zzb() {
        zzaga zzagaVar = this.zzb;
        if (zzagaVar != null) {
            zzagaVar.zzf();
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void zzc() {
        zzaga zzagaVar = this.zzb;
        if (zzagaVar != null && (zzagaVar instanceof zzaku)) {
            ((zzaku) zzagaVar).zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final long zzd() {
        zzagb zzagbVar = this.zzc;
        if (zzagbVar != null) {
            return zzagbVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final void zze(long j8, long j10) {
        zzaga zzagaVar = this.zzb;
        zzagaVar.getClass();
        zzagaVar.zze(j8, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final int zzf(zzaha zzahaVar) throws IOException {
        zzagb zzagbVar;
        zzaga zzagaVar = this.zzb;
        if (zzagaVar == null || (zzagbVar = this.zzc) == null) {
            throw null;
        }
        return zzagaVar.zzd(zzagbVar, zzahaVar);
    }
}
