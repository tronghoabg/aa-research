package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import k8.AbstractC3201j;
import k8.C3192a;
import k8.C3204m;
import org.apache.tika.utils.StringUtils;
import x.C4429v;

/* loaded from: classes4.dex */
public final class zzhg {

    public static class zza {
        private static volatile AbstractC3201j zza;

        private zza() {
        }

        public static AbstractC3201j zza(Context context) {
            AbstractC3201j abstractC3201j;
            AbstractC3201j abstractC3201jZza;
            AbstractC3201j abstractC3201j2 = zza;
            if (abstractC3201j2 != null) {
                return abstractC3201j2;
            }
            synchronized (zza.class) {
                try {
                    abstractC3201j = zza;
                    if (abstractC3201j == null) {
                        new zzhg();
                        if (zzhk.zza(Build.TYPE, Build.TAGS)) {
                            if (zzgs.zza() && !context.isDeviceProtectedStorage()) {
                                context = context.createDeviceProtectedStorageContext();
                            }
                            abstractC3201jZza = zzhg.zza(context);
                        } else {
                            abstractC3201jZza = C3192a.f39293a;
                        }
                        abstractC3201j = abstractC3201jZza;
                        zza = abstractC3201j;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return abstractC3201j;
        }
    }

    private static zzhh zza(Context context, File file) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                C4429v c4429v = new C4429v(0);
                HashMap map = new HashMap();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                        zzgy zzgyVar = new zzgy(c4429v);
                        bufferedReader.close();
                        return zzgyVar;
                    }
                    String[] strArrSplit = line.split(StringUtils.SPACE, 3);
                    if (strArrSplit.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + line);
                    } else {
                        String strZza = zza(strArrSplit[0]);
                        String strDecode = Uri.decode(zza(strArrSplit[1]));
                        String strDecode2 = (String) map.get(strArrSplit[2]);
                        if (strDecode2 == null) {
                            String strZza2 = zza(strArrSplit[2]);
                            strDecode2 = Uri.decode(strZza2);
                            if (strDecode2.length() < 1024 || strDecode2 == strZza2) {
                                map.put(strZza2, strDecode2);
                            }
                        }
                        C4429v c4429v2 = (C4429v) c4429v.get(strZza);
                        if (c4429v2 == null) {
                            c4429v2 = new C4429v(0);
                            c4429v.put(strZza, c4429v2);
                        }
                        c4429v2.put(strDecode, strDecode2);
                    }
                }
            } finally {
            }
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    private static AbstractC3201j zzb(Context context) {
        C3192a c3192a = C3192a.f39293a;
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? new C3204m(file) : c3192a;
        } catch (RuntimeException e7) {
            Log.e("HermeticFileOverrides", "no data dir", e7);
            return c3192a;
        }
    }

    public static AbstractC3201j zza(Context context) {
        AbstractC3201j c3204m;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            AbstractC3201j abstractC3201jZzb = zzb(context);
            if (abstractC3201jZzb.b()) {
                zzhh zzhhVarZza = zza(context, (File) abstractC3201jZzb.a());
                zzhhVarZza.getClass();
                c3204m = new C3204m(zzhhVarZza);
            } else {
                c3204m = C3192a.f39293a;
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return c3204m;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    private static final String zza(String str) {
        return new String(str);
    }
}
