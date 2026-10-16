package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzhx implements zzhr {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzhr zzc;
    private zzhr zzd;
    private zzhr zze;
    private zzhr zzf;
    private zzhr zzg;
    private zzhr zzh;
    private zzhr zzi;
    private zzhr zzj;
    private zzhr zzk;

    public zzhx(Context context, zzhr zzhrVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzhrVar;
    }

    private final zzhr zzf() {
        if (this.zze == null) {
            zzhi zzhiVar = new zzhi(this.zza);
            this.zze = zzhiVar;
            zzg(zzhiVar);
        }
        return this.zze;
    }

    private final void zzg(zzhr zzhrVar) {
        int i5 = 0;
        while (true) {
            List list = this.zzb;
            if (i5 >= list.size()) {
                return;
            }
            zzhrVar.zze((zzip) list.get(i5));
            i5++;
        }
    }

    private static final void zzh(zzhr zzhrVar, zzip zzipVar) {
        if (zzhrVar != null) {
            zzhrVar.zze(zzipVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i10) throws IOException {
        zzhr zzhrVar = this.zzk;
        zzhrVar.getClass();
        return zzhrVar.zza(bArr, i5, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final long zzb(zzhv zzhvVar) throws IOException {
        zzhr zzhrVar;
        zzgtr.zzi(this.zzk == null);
        Uri uri = zzhvVar.zza;
        String scheme = uri.getScheme();
        String str = zzfm.zza;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzie zzieVar = new zzie();
                    this.zzd = zzieVar;
                    zzg(zzieVar);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzf();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzf();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                zzho zzhoVar = new zzho(this.zza);
                this.zzf = zzhoVar;
                zzg(zzhoVar);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzhr zzhrVar2 = (zzhr) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.zzg = zzhrVar2;
                    zzg(zzhrVar2);
                } catch (ClassNotFoundException unused) {
                    zzeh.zzc("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e7) {
                    throw new RuntimeException("Error instantiating RTMP extension", e7);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzir zzirVar = new zzir(2000);
                this.zzh = zzirVar;
                zzg(zzirVar);
            }
            this.zzk = this.zzh;
        } else if (JsonStorageKeyNames.DATA_KEY.equals(scheme)) {
            if (this.zzi == null) {
                zzhp zzhpVar = new zzhp();
                this.zzi = zzhpVar;
                zzg(zzhpVar);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzin zzinVar = new zzin(this.zza);
                    this.zzj = zzinVar;
                    zzg(zzinVar);
                }
                zzhrVar = this.zzj;
            } else {
                zzhrVar = this.zzc;
            }
            this.zzk = zzhrVar;
        }
        return this.zzk.zzb(zzhvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        zzhr zzhrVar = this.zzk;
        if (zzhrVar == null) {
            return null;
        }
        return zzhrVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzd() throws IOException {
        zzhr zzhrVar = this.zzk;
        if (zzhrVar != null) {
            try {
                zzhrVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zze(zzip zzipVar) {
        zzipVar.getClass();
        this.zzc.zze(zzipVar);
        this.zzb.add(zzipVar);
        zzh(this.zzd, zzipVar);
        zzh(this.zze, zzipVar);
        zzh(this.zzf, zzipVar);
        zzh(this.zzg, zzipVar);
        zzh(this.zzh, zzipVar);
        zzh(this.zzi, zzipVar);
        zzh(this.zzj, zzipVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Map zzj() {
        zzhr zzhrVar = this.zzk;
        return zzhrVar == null ? Collections.EMPTY_MAP : zzhrVar.zzj();
    }
}
