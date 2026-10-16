package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes3.dex */
public final class zzie extends zzhj {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzie() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j8 = this.zzc;
        if (j8 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            String str = zzfm.zza;
            int i11 = randomAccessFile.read(bArr, i5, (int) Math.min(j8, i10));
            if (i11 > 0) {
                this.zzc -= i11;
                zzh(i11);
            }
            return i11;
        } catch (IOException e7) {
            throw new zzid(e7, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final long zzb(zzhv zzhvVar) throws IOException {
        Uri uri = zzhvVar.zza;
        this.zzb = uri;
        zzf(zzhvVar);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            this.zza = randomAccessFile;
            try {
                long j8 = zzhvVar.zze;
                randomAccessFile.seek(j8);
                long length = zzhvVar.zzf;
                if (length == -1) {
                    length = this.zza.length() - j8;
                }
                this.zzc = length;
                if (length < 0) {
                    throw new zzid(null, null, 2008);
                }
                this.zzd = true;
                zzg(zzhvVar);
                return this.zzc;
            } catch (IOException e7) {
                throw new zzid(e7, 2000);
            }
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new zzid(e10, ((e10.getCause() instanceof ErrnoException) && ((ErrnoException) e10.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbR = AbstractC0279p0.r("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbR.append(fragment);
            throw new zzid(sbR.toString(), e10, 1004);
        } catch (SecurityException e11) {
            throw new zzid(e11, 2006);
        } catch (RuntimeException e12) {
            throw new zzid(e12, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzd() throws zzid {
        this.zzb = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzi();
                }
            } catch (IOException e7) {
                throw new zzid(e7, 2000);
            }
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzi();
            }
            throw th;
        }
    }
}
