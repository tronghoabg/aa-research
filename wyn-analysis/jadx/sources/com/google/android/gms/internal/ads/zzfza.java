package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import n7.AbstractC3598c;

/* loaded from: classes3.dex */
public final class zzfza {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzbdz zzd;

    public zzfza(Context context, zzbdz zzbdzVar) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfzb.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfzb.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzbdzVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd.zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int iZza = this.zzd.zza();
        return N0.a.d(iZza, "FBAMTD", new StringBuilder(String.valueOf(iZza).length() + 6));
    }

    private final String zzf() {
        int iZza = this.zzd.zza();
        return N0.a.d(iZza, "LATMTD", new StringBuilder(String.valueOf(iZza).length() + 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzbeb r9, com.google.android.gms.internal.ads.zzfzg r10) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfza.zza(com.google.android.gms.internal.ads.zzbeb, com.google.android.gms.internal.ads.zzfzg):boolean");
    }

    public final zzfyz zzb(int i5) {
        zzbei zzbeiVarZzc = zzc(1);
        if (zzbeiVarZzc == null) {
            return null;
        }
        String strZza = zzbeiVarZzc.zza();
        File fileZza = zzfzb.zza(strZza, "pcam.jar", zzd());
        if (!fileZza.exists()) {
            fileZza = zzfzb.zza(strZza, "pcam", zzd());
        }
        return new zzfyz(zzbeiVarZzc, fileZza, zzfzb.zza(strZza, "pcbc", zzd()), zzfzb.zza(strZza, "pcopt", zzd()));
    }

    public final zzbei zzc(int i5) {
        String string = i5 == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrM = AbstractC3598c.m(string);
            zzbei zzbeiVarZzg = zzbei.zzg(zzidl.zzt(bArrM, 0, bArrM.length));
            String strZza = zzbeiVarZzg.zza();
            File fileZza = zzfzb.zza(strZza, "pcam.jar", zzd());
            if (!fileZza.exists()) {
                fileZza = zzfzb.zza(strZza, "pcam", zzd());
            }
            File fileZza2 = zzfzb.zza(strZza, "pcbc", zzd());
            if (fileZza.exists()) {
                if (fileZza2.exists()) {
                    return zzbeiVarZzg;
                }
            }
        } catch (zzifh unused) {
        }
        return null;
    }
}
