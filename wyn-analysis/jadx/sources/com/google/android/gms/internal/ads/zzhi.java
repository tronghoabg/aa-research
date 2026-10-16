package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class zzhi extends zzhj {
    private final AssetManager zza;
    private Uri zzb;
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzhi(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j8 = this.zzd;
        if (j8 == 0) {
            return -1;
        }
        if (j8 != -1) {
            try {
                i10 = (int) Math.min(j8, i10);
            } catch (IOException e7) {
                throw new zzhh(e7, 2000);
            }
        }
        InputStream inputStream = this.zzc;
        String str = zzfm.zza;
        int i11 = inputStream.read(bArr, i5, i10);
        if (i11 == -1) {
            return -1;
        }
        long j10 = this.zzd;
        if (j10 != -1) {
            this.zzd = j10 - i11;
        }
        zzh(i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final long zzb(zzhv zzhvVar) throws IOException {
        try {
            Uri uri = zzhvVar.zza;
            this.zzb = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            zzf(zzhvVar);
            InputStream inputStreamOpen = this.zza.open(path, 1);
            this.zzc = inputStreamOpen;
            long j8 = zzhvVar.zze;
            if (inputStreamOpen.skip(j8) < j8) {
                throw new zzhh(null, 2008);
            }
            long j10 = zzhvVar.zzf;
            if (j10 != -1) {
                this.zzd = j10;
            } else {
                long jAvailable = this.zzc.available();
                this.zzd = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.zzd = -1L;
                }
            }
            this.zze = true;
            zzg(zzhvVar);
            return this.zzd;
        } catch (zzhh e7) {
            throw e7;
        } catch (IOException e10) {
            throw new zzhh(e10, true != (e10 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzd() throws zzhh {
        this.zzb = null;
        try {
            try {
                InputStream inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzc = null;
                if (this.zze) {
                    this.zze = false;
                    zzi();
                }
            } catch (IOException e7) {
                throw new zzhh(e7, 2000);
            }
        } catch (Throwable th) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzi();
            }
            throw th;
        }
    }
}
