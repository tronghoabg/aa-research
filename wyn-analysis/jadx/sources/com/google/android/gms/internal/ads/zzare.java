package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.apache.tika.pipes.PipesConfigBase;

/* loaded from: classes3.dex */
final class zzare implements zzafl {
    private final zzfj zza;
    private final zzeu zzb = new zzeu();
    private final int zzc;

    public zzare(int i5, zzfj zzfjVar, int i10) {
        this.zzc = i5;
        this.zza = zzfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final zzafk zza(zzagb zzagbVar, long j8) throws IOException {
        int iZza;
        int iZza2;
        long jZzn = zzagbVar.zzn();
        int iMin = (int) Math.min(112800L, zzagbVar.zzo() - jZzn);
        zzeu zzeuVar = this.zzb;
        zzeuVar.zza(iMin);
        zzagbVar.zzi(zzeuVar.zzi(), 0, iMin);
        int iZze = zzeuVar.zze();
        long j10 = -1;
        long j11 = -9223372036854775807L;
        long j12 = -1;
        while (zzeuVar.zzd() >= 188 && (iZza2 = (iZza = zzarq.zza(zzeuVar.zzi(), zzeuVar.zzg(), iZze)) + 188) <= iZze) {
            long jZzb = zzarq.zzb(zzeuVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZze = this.zza.zze(jZzb);
                if (jZze > j8) {
                    return j11 == -9223372036854775807L ? zzafk.zza(jZze, jZzn) : zzafk.zzc(jZzn + j12);
                }
                j12 = iZza;
                if (PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH + jZze > j8) {
                    return zzafk.zzc(jZzn + j12);
                }
                j11 = jZze;
            }
            zzeuVar.zzh(iZza2);
            j10 = iZza2;
        }
        return j11 != -9223372036854775807L ? zzafk.zzb(j11, jZzn + j10) : zzafk.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final void zzb() {
        byte[] bArr = zzfm.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
