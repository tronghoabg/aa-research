package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzxb implements zzhr {
    private final zzhr zza;
    private final int zzb;
    private final zzxa zzc;
    private final byte[] zzd;
    private int zze;

    public zzxb(zzhr zzhrVar, int i5, zzxa zzxaVar) {
        zzgtr.zza(i5 > 0);
        this.zza = zzhrVar;
        this.zzb = i5;
        this.zzc = zzxaVar;
        this.zzd = new byte[1];
        this.zze = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i10) throws IOException {
        int i11 = this.zze;
        if (i11 == 0) {
            zzhr zzhrVar = this.zza;
            byte[] bArr2 = this.zzd;
            int i12 = 0;
            if (zzhrVar.zza(bArr2, 0, 1) != -1) {
                int i13 = (bArr2[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int iZza = zzhrVar.zza(bArr3, i12, i14);
                        if (iZza != -1) {
                            i12 += iZza;
                            i14 -= iZza;
                        }
                    }
                    while (i13 > 0) {
                        int i15 = i13 - 1;
                        if (bArr3[i15] != 0) {
                            break;
                        }
                        i13 = i15;
                    }
                    if (i13 > 0) {
                        this.zzc.zza(new zzeu(bArr3, i13));
                    }
                }
                i11 = this.zzb;
                this.zze = i11;
            }
            return -1;
        }
        int iZza2 = this.zza.zza(bArr, i5, Math.min(i11, i10));
        if (iZza2 != -1) {
            this.zze -= iZza2;
        }
        return iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final long zzb(zzhv zzhvVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zze(zzip zzipVar) {
        zzipVar.getClass();
        this.zza.zze(zzipVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Map zzj() {
        return this.zza.zzj();
    }
}
