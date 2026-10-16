package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
final class zzamx extends zzang {
    private zzagn zza;
    private zzamw zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zza(boolean z2) {
        super.zza(z2);
        if (z2) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final long zzb(zzeu zzeuVar) {
        if (!zzd(zzeuVar.zzi())) {
            return -1L;
        }
        int i5 = (zzeuVar.zzi()[2] & ForkServer.ERROR) >> 4;
        if (i5 == 6) {
            zzeuVar.zzk(4);
            zzeuVar.zzO();
        } else if (i5 == 7) {
            i5 = 7;
            zzeuVar.zzk(4);
            zzeuVar.zzO();
        }
        int iZzc = zzagi.zzc(zzeuVar, i5);
        zzeuVar.zzh(0);
        return iZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final boolean zzc(zzeu zzeuVar, long j8, zzane zzaneVar) {
        byte[] bArrZzi = zzeuVar.zzi();
        zzagn zzagnVar = this.zza;
        if (zzagnVar == null) {
            zzagn zzagnVar2 = new zzagn(bArrZzi, 17);
            this.zza = zzagnVar2;
            zzt zztVarZza = zzagnVar2.zzc(Arrays.copyOfRange(bArrZzi, 9, zzeuVar.zze()), null).zza();
            zztVarZza.zzn("audio/ogg");
            zzaneVar.zza = zztVarZza.zzP();
            return true;
        }
        if ((bArrZzi[0] & 127) == 3) {
            zzagm zzagmVarZzc = zzagk.zzc(zzeuVar);
            zzagn zzagnVarZze = zzagnVar.zze(zzagmVarZzc);
            this.zza = zzagnVarZze;
            this.zzb = new zzamw(zzagnVarZze, zzagmVarZzc);
            return true;
        }
        if (!zzd(bArrZzi)) {
            return true;
        }
        zzamw zzamwVar = this.zzb;
        if (zzamwVar != null) {
            zzamwVar.zzd(j8);
            zzaneVar.zzb = this.zzb;
        }
        zzaneVar.zza.getClass();
        return false;
    }
}
