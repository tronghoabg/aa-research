package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzhm extends zzhj {
    private final zzhl zza;
    private Uri zzb;
    private byte[] zzc;
    private int zzd;
    private int zze;
    private boolean zzf;

    public zzhm(final byte[] bArr) {
        zzhl zzhlVar = new zzhl() { // from class: com.google.android.gms.internal.ads.zzhk
            @Override // com.google.android.gms.internal.ads.zzhl
            public final /* synthetic */ byte[] zza(Uri uri) {
                return bArr;
            }
        };
        super(false);
        this.zza = zzhlVar;
        zzgtr.zza(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.zze;
        if (i11 == 0) {
            return -1;
        }
        int iMin = Math.min(i10, i11);
        byte[] bArr2 = this.zzc;
        bArr2.getClass();
        System.arraycopy(bArr2, this.zzd, bArr, i5, iMin);
        this.zzd += iMin;
        this.zze -= iMin;
        zzh(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final long zzb(zzhv zzhvVar) throws IOException {
        zzf(zzhvVar);
        Uri uri = zzhvVar.zza;
        this.zzb = uri;
        byte[] bArrZza = this.zza.zza(uri);
        this.zzc = bArrZza;
        long j8 = zzhvVar.zze;
        int length = bArrZza.length;
        if (j8 > length) {
            throw new zzhs(2008);
        }
        int i5 = (int) j8;
        this.zzd = i5;
        int i10 = length - i5;
        this.zze = i10;
        long j10 = zzhvVar.zzf;
        if (j10 != -1) {
            this.zze = (int) Math.min(i10, j10);
        }
        this.zzf = true;
        zzg(zzhvVar);
        return j10 != -1 ? j10 : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
            zzi();
        }
        this.zzb = null;
        this.zzc = null;
    }
}
