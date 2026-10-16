package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class zzfyn {
    public static boolean zza(zzbdz zzbdzVar) {
        int iOrdinal = zzbdzVar.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5;
    }

    public static final zzbdz zzb(Context context, zzfxq zzfxqVar) {
        zzbdz zzbdzVar;
        FileInputStream fileInputStream;
        byte[] bArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles(new zzhab(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                if (zzfxqVar != null) {
                    zzfxqVar.zze(5017, "No .so");
                } else {
                    zzfxqVar = null;
                }
                zzbdzVar = zzbdz.UNKNOWN;
            } else {
                try {
                    fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        bArr = new byte[20];
                    } finally {
                    }
                } catch (IOException e7) {
                    zzc(null, e7.toString(), context, zzfxqVar);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] == 2) {
                        zzc(bArr, null, context, zzfxqVar);
                        zzbdzVar = zzbdz.UNSUPPORTED;
                    } else {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s10 = ByteBuffer.wrap(bArr2).getShort();
                        if (s10 == 3) {
                            zzbdzVar = zzbdz.X86;
                        } else if (s10 == 40) {
                            zzbdzVar = zzbdz.ARM7;
                        } else if (s10 == 62) {
                            zzbdzVar = zzbdz.X86_64;
                        } else if (s10 == 183) {
                            zzbdzVar = zzbdz.ARM64;
                        } else if (s10 != 243) {
                            zzc(bArr, null, context, zzfxqVar);
                            zzbdzVar = zzbdz.UNSUPPORTED;
                        } else {
                            zzbdzVar = zzbdz.RISCV64;
                        }
                    }
                    fileInputStream.close();
                } else {
                    fileInputStream.close();
                    zzbdzVar = zzbdz.UNSUPPORTED;
                }
            }
        } else {
            if (zzfxqVar != null) {
                zzfxqVar.zze(5017, "No lib/");
            } else {
                zzfxqVar = null;
            }
            zzbdzVar = zzbdz.UNKNOWN;
        }
        if (zzbdzVar == zzbdz.UNKNOWN) {
            String strZzd = zzd(context, zzfxqVar);
            if (TextUtils.isEmpty(strZzd)) {
                zzc(null, "Empty dev arch", context, zzfxqVar);
                zzbdzVar = zzbdz.UNSUPPORTED;
            } else if (strZzd.equalsIgnoreCase("i686") || strZzd.equalsIgnoreCase("x86")) {
                zzbdzVar = zzbdz.X86;
            } else if (strZzd.equalsIgnoreCase("x86_64")) {
                zzbdzVar = zzbdz.X86_64;
            } else if (strZzd.equalsIgnoreCase("arm64-v8a")) {
                zzbdzVar = zzbdz.ARM64;
            } else if (strZzd.equalsIgnoreCase("armeabi-v7a") || strZzd.equalsIgnoreCase("armv71")) {
                zzbdzVar = zzbdz.ARM7;
            } else if (strZzd.equalsIgnoreCase("riscv64")) {
                zzbdzVar = zzbdz.RISCV64;
            } else {
                zzc(null, strZzd, context, zzfxqVar);
                zzbdzVar = zzbdz.UNSUPPORTED;
            }
        }
        if (zzfxqVar != null) {
            zzfxqVar.zze(5018, zzbdzVar.name());
        }
        return zzbdzVar;
    }

    private static final void zzc(byte[] bArr, String str, Context context, zzfxq zzfxqVar) {
        if (zzfxqVar == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("os.arch:");
        sb2.append(zzguh.OS_ARCH.zza());
        sb2.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb2.append("supported_abis:");
                sb2.append(Arrays.toString(strArr));
                sb2.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb2.append("CPU_ABI:");
        sb2.append(Build.CPU_ABI);
        sb2.append(";CPU_ABI2:");
        sb2.append(Build.CPU_ABI2);
        sb2.append(";");
        if (bArr != null) {
            sb2.append("ELF:");
            sb2.append(Arrays.toString(bArr));
            sb2.append(";");
        }
        if (str != null) {
            N0.a.r(sb2, "dbg:", str, ";");
        }
        zzfxqVar.zze(4007, sb2.toString());
    }

    private static final String zzd(Context context, zzfxq zzfxqVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String strZza = zzguh.OS_ARCH.zza();
        if (!TextUtils.isEmpty(strZza) && hashSet.contains(strZza)) {
            return strZza;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e7) {
            if (zzfxqVar != null) {
                zzfxqVar.zzc(2024, 0L, e7);
            }
        } catch (NoSuchFieldException e10) {
            if (zzfxqVar != null) {
                zzfxqVar.zzc(2024, 0L, e10);
            }
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }
}
