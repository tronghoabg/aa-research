package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import java.util.HashSet;
import n7.AbstractC3598c;

/* loaded from: classes3.dex */
public final class zzglk {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final zzimt zzd;
    private final zzgqo zze;

    public zzglk(Context context, SharedPreferences sharedPreferences, zzimt zzimtVar, zzgqo zzgqoVar) {
        this.zzc = sharedPreferences;
        File dir = context.getDir("pccache2", 0);
        zzfzb.zzd(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache2", 0);
        zzfzb.zzd(dir2, true);
        this.zza = dir2;
        this.zzd = zzimtVar;
        this.zze = zzgqoVar;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(((zzbdz) this.zzd.zzb()).zza()));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        int iZza = ((zzbdz) this.zzd.zzb()).zza();
        return N0.a.d(iZza, "FBAMTD", new StringBuilder(String.valueOf(iZza).length() + 6));
    }

    private final String zzf() {
        int iZza = ((zzbdz) this.zzd.zzb()).zza();
        return N0.a.d(iZza, "LATMTD", new StringBuilder(String.valueOf(iZza).length() + 6));
    }

    public final boolean zza(zzggb zzggbVar, byte[] bArr, byte[] bArr2) {
        boolean z2;
        String strZza = zzggbVar.zza().zza();
        if (!TextUtils.isEmpty(strZza) && bArr2.length != 0) {
            File file = this.zza;
            zzfzb.zze(file);
            file.mkdirs();
            File fileZzc = zzfzb.zzc(strZza, file);
            fileZzc.getClass();
            fileZzc.mkdirs();
            File fileZza = zzfzb.zza(strZza, "pcam.jar", file);
            fileZza.getClass();
            if (bArr == null || bArr.length <= 0 || zzfzb.zzb(fileZza, bArr)) {
                File fileZza2 = zzfzb.zza(strZza, "pcbc", file);
                fileZza2.getClass();
                if (zzfzb.zzb(fileZza2, bArr2)) {
                    String strZza2 = zzggbVar.zza().zza();
                    if (TextUtils.isEmpty(strZza2)) {
                        z2 = false;
                    } else {
                        File fileZza3 = zzfzb.zza(strZza2, "pcam.jar", file);
                        fileZza3.getClass();
                        File fileZza4 = zzfzb.zza(strZza2, "pcbc", file);
                        fileZza4.getClass();
                        File fileZza5 = zzfzb.zza(strZza2, "pcam.jar", zzd());
                        fileZza5.getClass();
                        File fileZza6 = zzfzb.zza(strZza2, "pcbc", zzd());
                        fileZza6.getClass();
                        if (fileZza3.exists() && !fileZza3.renameTo(fileZza5)) {
                            this.zze.zzb(15318);
                        } else if (fileZza4.exists() && fileZza4.renameTo(fileZza6)) {
                            zzggb zzggbVarZzc = zzc(1);
                            SharedPreferences.Editor editorEdit = this.zzc.edit();
                            if (zzggbVarZzc != null && !zzggbVar.zza().zza().equals(zzggbVarZzc.zza().zza())) {
                                editorEdit.putString(zze(), AbstractC3598c.b(zzggbVarZzc.zzaN()));
                            }
                            editorEdit.putString(zzf(), AbstractC3598c.b(zzggbVar.zzaN()));
                            if (editorEdit.commit()) {
                                z2 = true;
                            } else {
                                this.zze.zzb(15320);
                            }
                        } else {
                            this.zze.zzb(15319);
                        }
                        z2 = false;
                    }
                    HashSet hashSet = new HashSet();
                    zzggb zzggbVarZzc2 = zzc(1);
                    if (zzggbVarZzc2 != null) {
                        hashSet.add(zzggbVarZzc2.zza().zza());
                    }
                    zzggb zzggbVarZzc3 = zzc(2);
                    if (zzggbVarZzc3 != null) {
                        hashSet.add(zzggbVarZzc3.zza().zza());
                    }
                    File[] fileArrListFiles = zzd().listFiles();
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            String name = file2.getName();
                            if (!hashSet.contains(name)) {
                                File fileZzc2 = zzfzb.zzc(name, zzd());
                                fileZzc2.getClass();
                                zzfzb.zze(fileZzc2);
                            }
                        }
                    }
                    return z2;
                }
            }
        }
        this.zze.zzb(15316);
        return false;
    }

    public final zzfyz zzb(int i5) {
        zzggb zzggbVarZzc = zzc(1);
        if (zzggbVarZzc == null) {
            this.zze.zzb(15315);
            return null;
        }
        String strZza = zzggbVarZzc.zza().zza();
        File fileZza = zzfzb.zza(strZza, "pcam.jar", zzd());
        fileZza.getClass();
        if (!fileZza.exists()) {
            fileZza = zzfzb.zza(strZza, "pcam", zzd());
            fileZza.getClass();
        }
        File fileZza2 = zzfzb.zza(strZza, "pcopt", zzd());
        fileZza2.getClass();
        File fileZza3 = zzfzb.zza(strZza, "pcbc", zzd());
        fileZza3.getClass();
        return new zzfyz(zzggbVarZzc.zza(), fileZza, fileZza3, fileZza2);
    }

    public final zzggb zzc(int i5) {
        zzggb zzggbVarZze;
        String strZza;
        File fileZza;
        String string = i5 == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrM = AbstractC3598c.m(string);
            zzggbVarZze = zzggb.zze(zzidl.zzt(bArrM, 0, bArrM.length));
            strZza = zzggbVarZze.zza().zza();
            fileZza = zzfzb.zza(strZza, "pcam.jar", zzd());
        } catch (zzifh unused) {
            this.zze.zzb(15317);
        }
        if (fileZza == null) {
            throw null;
        }
        if (!fileZza.exists() && (fileZza = zzfzb.zza(strZza, "pcam", zzd())) == null) {
            throw null;
        }
        File fileZza2 = zzfzb.zza(strZza, "pcbc", zzd());
        if (fileZza2 == null) {
            throw null;
        }
        if (fileZza.exists() && fileZza2.exists()) {
            return zzggbVarZze;
        }
        return null;
    }
}
