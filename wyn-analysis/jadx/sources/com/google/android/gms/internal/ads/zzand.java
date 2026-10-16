package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes3.dex */
final class zzand extends zzang {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzeu zzeuVar) {
        return zzk(zzeuVar, zza);
    }

    private static boolean zzk(zzeu zzeuVar, byte[] bArr) {
        if (zzeuVar.zzd() < 8) {
            return false;
        }
        int iZzg = zzeuVar.zzg();
        byte[] bArr2 = new byte[8];
        zzeuVar.zzm(bArr2, 0, 8);
        zzeuVar.zzh(iZzg);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final void zza(boolean z2) {
        super.zza(z2);
        if (z2) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final long zzb(zzeu zzeuVar) {
        return zzi(zzgx.zzd(zzeuVar.zzi()));
    }

    @Override // com.google.android.gms.internal.ads.zzang
    public final boolean zzc(zzeu zzeuVar, long j8, zzane zzaneVar) throws zzat {
        if (zzk(zzeuVar, zza)) {
            byte[] bArrCopyOf = Arrays.copyOf(zzeuVar.zzi(), zzeuVar.zze());
            int i5 = bArrCopyOf[9] & ForkServer.ERROR;
            List listZza = zzgx.zza(bArrCopyOf);
            if (zzaneVar.zza != null) {
                return true;
            }
            zzt zztVar = new zzt();
            zztVar.zzn("audio/ogg");
            zztVar.zzo("audio/opus");
            zztVar.zzG(i5);
            zztVar.zzI(48000);
            zztVar.zzr(listZza);
            zzaneVar.zza = zztVar.zzP();
            return true;
        }
        if (!zzk(zzeuVar, zzb)) {
            zzaneVar.zza.getClass();
            return false;
        }
        zzaneVar.zza.getClass();
        if (this.zzc) {
            return true;
        }
        this.zzc = true;
        zzeuVar.zzk(8);
        zzap zzapVarZzb = zzaho.zzb(zzgwt.zzr(zzhg.zzb(zzeuVar, false, false).zza));
        if (zzapVarZzb == null) {
            return true;
        }
        zzt zztVarZza = zzaneVar.zza.zza();
        zztVarZza.zzl(zzapVarZzb.zzf(zzaneVar.zza.zzl));
        zzaneVar.zza = zztVarZza.zzP();
        return true;
    }
}
