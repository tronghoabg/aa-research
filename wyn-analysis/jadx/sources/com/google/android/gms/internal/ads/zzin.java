package com.google.android.gms.internal.ads;

import Va.M6;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes3.dex */
public final class zzin extends zzhj {
    private final Context zza;
    private zzhv zzb;
    private AssetFileDescriptor zzc;
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzin(Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i5) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 15);
        sb2.append("rawresource:///");
        sb2.append(i5);
        return Uri.parse(sb2.toString());
    }

    private static AssetFileDescriptor zzk(Context context, zzhv zzhvVar) throws Resources.NotFoundException, PackageManager.NameNotFoundException, zzim {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = zzhvVar.zza.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                int size = pathSegments.size();
                throw new zzim(N0.a.d(size, "rawresource:// URI must have exactly one path element, found ", new StringBuilder(String.valueOf(size).length() + 61)));
            }
            identifier = zzl(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                String scheme = uriNormalizeScheme.getScheme();
                throw new zzim(M6.t(new StringBuilder(String.valueOf(scheme).length() + 62), "Unsupported URI scheme (", scheme, "). Only android.resource is supported."), null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e7) {
                    throw new zzim("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e7, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = zzl(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(M6.t(new StringBuilder(packageName.length() + 1 + path.length()), packageName, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, path), "raw", null);
                if (identifier == 0) {
                    throw new zzim("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new zzim("Resource is compressed: ".concat(String.valueOf(uriNormalizeScheme)), null, 2000);
        } catch (Resources.NotFoundException e10) {
            throw new zzim(null, e10, 2005);
        }
    }

    private static int zzl(String str) throws zzim {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzim("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j8 = this.zze;
        if (j8 == 0) {
            return -1;
        }
        if (j8 != -1) {
            try {
                i10 = (int) Math.min(j8, i10);
            } catch (IOException e7) {
                throw new zzim(null, e7, 2000);
            }
        }
        InputStream inputStream = this.zzd;
        String str = zzfm.zza;
        int i11 = inputStream.read(bArr, i5, i10);
        if (i11 == -1) {
            if (this.zze == -1) {
                return -1;
            }
            throw new zzim("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j10 = this.zze;
        if (j10 != -1) {
            this.zze = j10 - i11;
        }
        zzh(i11);
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final long zzb(zzhv zzhvVar) throws zzhs, Resources.NotFoundException, PackageManager.NameNotFoundException {
        long size;
        this.zzb = zzhvVar;
        zzf(zzhvVar);
        AssetFileDescriptor assetFileDescriptorZzk = zzk(this.zza, zzhvVar);
        this.zzc = assetFileDescriptorZzk;
        long length = assetFileDescriptorZzk.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        if (length != -1) {
            try {
                if (zzhvVar.zze > length) {
                    throw new zzim(null, null, 2008);
                }
            } catch (zzim e7) {
                throw e7;
            } catch (IOException e10) {
                throw new zzim(null, e10, 2000);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long j8 = zzhvVar.zze;
        long jSkip = fileInputStream.skip(startOffset + j8) - startOffset;
        if (jSkip != j8) {
            throw new zzim(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.zze = -1L;
                size = -1;
            } else {
                size = channel.size() - channel.position();
                this.zze = size;
                if (size < 0) {
                    throw new zzim(null, null, 2008);
                }
            }
        } else {
            long j10 = length - jSkip;
            this.zze = j10;
            if (j10 < 0) {
                throw new zzhs(2008);
            }
            size = j10;
        }
        long j11 = zzhvVar.zzf;
        if (j11 != -1) {
            this.zze = size == -1 ? j11 : Math.min(size, j11);
        }
        this.zzf = true;
        zzg(zzhvVar);
        return j11 != -1 ? j11 : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        zzhv zzhvVar = this.zzb;
        if (zzhvVar != null) {
            return zzhvVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzd() throws zzim {
        this.zzb = null;
        try {
            try {
                try {
                    InputStream inputStream = this.zzd;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzi();
                        }
                    } catch (IOException e7) {
                        throw new zzim(null, e7, 2000);
                    }
                } catch (IOException e10) {
                    throw new zzim(null, e10, 2000);
                }
            } catch (Throwable th) {
                this.zzd = null;
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.zzc = null;
                    if (this.zzf) {
                        this.zzf = false;
                        zzi();
                    }
                    throw th;
                } catch (IOException e11) {
                    throw new zzim(null, e11, 2000);
                }
            }
        } catch (Throwable th2) {
            this.zzc = null;
            if (this.zzf) {
                this.zzf = false;
                zzi();
            }
            throw th2;
        }
    }
}
