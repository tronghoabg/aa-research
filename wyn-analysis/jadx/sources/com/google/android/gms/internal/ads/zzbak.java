package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class zzbak {
    public static final String zza(Context context, String str, long j8, boolean z2) {
        try {
            zzaze zzazeVarZza = zzazf.zza();
            zzazeVarZza.zzb(str);
            zzazeVarZza.zza("0.828153725");
            zzazeVarZza.zzd(context.getPackageName());
            zzazeVarZza.zzf((System.currentTimeMillis() - j8) / 1000);
            zzazeVarZza.zzc(System.currentTimeMillis() / 1000);
            try {
                zzazeVarZza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                zzazeVarZza.zze(-1L);
            }
            zzazl zzazlVarZzc = zzazv.zzc(((zzazf) zzazeVarZza.zzbu()).zzaN(), null);
            zzazlVarZzc.zzc(5);
            zzazlVarZzc.zzd(2);
            return Base64.encodeToString(((zzazm) zzazlVarZzc.zzbu()).zzaN(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}
