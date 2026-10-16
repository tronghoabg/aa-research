package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public final class zzhp extends zzhj {
    private zzhv zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzhp() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.zzd;
        if (i11 == 0) {
            return -1;
        }
        int iMin = Math.min(i10, i11);
        byte[] bArr2 = this.zzb;
        String str = zzfm.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i5, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzh(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final long zzb(zzhv zzhvVar) throws IOException {
        zzf(zzhvVar);
        this.zza = zzhvVar;
        Uri uriNormalizeScheme = zzhvVar.zza.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        zzgtr.zzf(JsonStorageKeyNames.DATA_KEY.equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = zzfm.zza;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw zzat.zza("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e7) {
                throw zzat.zza("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e7);
            }
        } else {
            this.zzb = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j8 = zzhvVar.zze;
        int length = this.zzb.length;
        if (j8 > length) {
            this.zzb = null;
            throw new zzhs(2008);
        }
        int i5 = (int) j8;
        this.zzc = i5;
        int i10 = length - i5;
        this.zzd = i10;
        long j10 = zzhvVar.zzf;
        if (j10 != -1) {
            this.zzd = (int) Math.min(i10, j10);
        }
        zzg(zzhvVar);
        return j10 != -1 ? j10 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        zzhv zzhvVar = this.zza;
        if (zzhvVar != null) {
            return zzhvVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzi();
        }
        this.zza = null;
    }
}
