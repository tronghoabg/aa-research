package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.util.HashSet;
import n7.AbstractC3598c;

/* loaded from: classes3.dex */
public final class zzfzh {
    private static final Object zzf = new Object();
    private final Context zza;
    private final SharedPreferences zzb;
    private final String zzc;
    private final zzfyo zzd;
    private boolean zze;

    public zzfzh(Context context, zzbdz zzbdzVar, zzfyo zzfyoVar, boolean z2) {
        this.zze = false;
        this.zza = context;
        this.zzc = Integer.toString(zzbdzVar.zza());
        this.zzb = context.getSharedPreferences("pcvmspf", 0);
        this.zzd = zzfyoVar;
        this.zze = z2;
    }

    private final File zze(String str) {
        return new File(new File(this.zza.getDir("pccache", 0), this.zzc), str);
    }

    private final String zzf() {
        return "FBAMTD".concat(String.valueOf(this.zzc));
    }

    private final String zzg() {
        return "LATMTD".concat(String.valueOf(this.zzc));
    }

    private static String zzh(zzbeb zzbebVar) {
        zzbeh zzbehVarZzi = zzbei.zzi();
        zzbehVarZzi.zza(zzbebVar.zza().zza());
        zzbehVarZzi.zzb(zzbebVar.zza().zzb());
        zzbehVarZzi.zzd(zzbebVar.zza().zzd());
        zzbehVarZzi.zze(zzbebVar.zza().zze());
        zzbehVarZzi.zzc(zzbebVar.zza().zzc());
        return AbstractC3598c.b(((zzbei) zzbehVarZzi.zzbu()).zzaN());
    }

    private final void zzi(int i5, long j8) {
        this.zzd.zza(i5, j8);
    }

    private final void zzj(int i5, long j8, String str) {
        this.zzd.zzb(i5, j8, str);
    }

    private final zzbei zzk(int i5) {
        String string = i5 == 1 ? this.zzb.getString(zzg(), null) : this.zzb.getString(zzf(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrM = AbstractC3598c.m(string);
            return zzbei.zzh(zzidl.zzt(bArrM, 0, bArrM.length), this.zze ? zzidz.zzb() : zzidz.zzc());
        } catch (zzifh unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzbeb zzbebVar, zzfzg zzfzgVar) {
        boolean z2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzbei zzbeiVarZzk = zzk(1);
                String strZza = zzbebVar.zza().zza();
                if (zzbeiVarZzk != null && zzbeiVarZzk.zza().equals(strZza)) {
                    zzi(4014, jCurrentTimeMillis);
                    return false;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File fileZze = zze(strZza);
                if (fileZze.exists()) {
                    boolean zIsDirectory = fileZze.isDirectory();
                    String str = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                    if (true != zIsDirectory) {
                        str = "0";
                    }
                    boolean zIsFile = fileZze.isFile();
                    String str2 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                    if (true != zIsFile) {
                        str2 = "0";
                    }
                    z2 = false;
                    StringBuilder sb2 = new StringBuilder(7);
                    sb2.append("d:");
                    sb2.append(str);
                    sb2.append(",f:");
                    sb2.append(str2);
                    zzj(4023, jCurrentTimeMillis2, sb2.toString());
                    zzi(4015, jCurrentTimeMillis2);
                } else {
                    z2 = false;
                    if (!fileZze.mkdirs()) {
                        boolean zCanWrite = fileZze.canWrite();
                        String str3 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                        if (true != zCanWrite) {
                            str3 = "0";
                        }
                        zzj(4024, jCurrentTimeMillis2, "cw:".concat(str3));
                        zzi(4015, jCurrentTimeMillis2);
                        return false;
                    }
                }
                File fileZze2 = zze(strZza);
                File file = new File(fileZze2, "pcam.jar");
                File file2 = new File(fileZze2, "pcbc");
                if (!zzfzb.zzb(file, zzbebVar.zzb().zzA())) {
                    zzi(4016, jCurrentTimeMillis);
                    return z2;
                }
                if (!zzfzb.zzb(file2, zzbebVar.zzc().zzA())) {
                    zzi(4017, jCurrentTimeMillis);
                    return z2;
                }
                if (zzfzgVar != null && !zzfzgVar.zza(file)) {
                    zzi(4018, jCurrentTimeMillis);
                    zzfzb.zze(fileZze2);
                    return z2;
                }
                String strZzh = zzh(zzbebVar);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                SharedPreferences sharedPreferences = this.zzb;
                String string = sharedPreferences.getString(zzg(), null);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(zzg(), strZzh);
                if (string != null) {
                    editorEdit.putString(zzf(), string);
                }
                if (!editorEdit.commit()) {
                    zzi(4019, jCurrentTimeMillis3);
                    return z2;
                }
                HashSet hashSet = new HashSet();
                zzbei zzbeiVarZzk2 = zzk(1);
                if (zzbeiVarZzk2 != null) {
                    hashSet.add(zzbeiVarZzk2.zza());
                }
                zzbei zzbeiVarZzk3 = zzk(2);
                if (zzbeiVarZzk3 != null) {
                    hashSet.add(zzbeiVarZzk3.zza());
                }
                boolean z10 = z2;
                File[] fileArrListFiles = new File(this.zza.getDir("pccache", z10 ? 1 : 0), this.zzc).listFiles();
                int length = fileArrListFiles.length;
                for (int i5 = z10 ? 1 : 0; i5 < length; i5++) {
                    File file3 = fileArrListFiles[i5];
                    if (!hashSet.contains(file3.getName())) {
                        zzfzb.zze(file3);
                    }
                }
                zzi(5014, jCurrentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb(zzbeb zzbebVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                if (!zzfzb.zzb(new File(zze(zzbebVar.zza().zza()), "pcbc"), zzbebVar.zzc().zzA())) {
                    zzi(4020, jCurrentTimeMillis);
                    return false;
                }
                String strZzh = zzh(zzbebVar);
                SharedPreferences.Editor editorEdit = this.zzb.edit();
                editorEdit.putString(zzg(), strZzh);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    zzi(5015, jCurrentTimeMillis);
                } else {
                    zzi(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzfyz zzc(int i5) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzbei zzbeiVarZzk = zzk(1);
                if (zzbeiVarZzk == null) {
                    zzi(4022, jCurrentTimeMillis);
                    return null;
                }
                File fileZze = zze(zzbeiVarZzk.zza());
                File file = new File(fileZze, "pcam.jar");
                if (!file.exists()) {
                    file = new File(fileZze, "pcam");
                }
                File file2 = new File(fileZze, "pcbc");
                File file3 = new File(fileZze, "pcopt");
                zzi(5016, jCurrentTimeMillis);
                return new zzfyz(zzbeiVarZzk, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd(int i5) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            try {
                zzbei zzbeiVarZzk = zzk(1);
                if (zzbeiVarZzk == null) {
                    zzi(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileZze = zze(zzbeiVarZzk.zza());
                if (!new File(fileZze, "pcam.jar").exists()) {
                    zzi(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileZze, "pcbc").exists()) {
                    zzi(5019, jCurrentTimeMillis);
                    return true;
                }
                zzi(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
