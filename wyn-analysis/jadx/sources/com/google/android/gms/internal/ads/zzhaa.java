package com.google.android.gms.internal.ads;

import com.applovin.shadow.okio.Segment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class zzhaa {
    public static void zza(byte[] bArr, File file) throws IOException {
        zzgzp zzgzpVar = new zzgzp();
        file.getClass();
        FileOutputStream fileOutputStreamZza = zzgzy.zza(file, zzgxd.zzq(new zzgzx[0]), zzgzpVar);
        try {
            fileOutputStreamZza.write(bArr);
            fileOutputStreamZza.close();
        } catch (Throwable th) {
            try {
                fileOutputStreamZza.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void zzb(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static void zzc(File file, File file2) throws Throwable {
        file.getClass();
        file2.getClass();
        zzgtr.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        zzgtr.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        zzgzz zzgzzVar = new zzgzz(file, null);
        zzgzp zzgzpVar = new zzgzp();
        zzgxd zzgxdVarZzq = zzgxd.zzq(new zzgzx[0]);
        zzgzw zzgzwVarZza = zzgzw.zza();
        try {
            InputStream inputStreamZza = zzgzzVar.zza();
            zzgzwVarZza.zzb(inputStreamZza);
            FileOutputStream fileOutputStreamZza = zzgzy.zza(file2, zzgxdVarZzq, zzgzpVar);
            zzgzwVarZza.zzb(fileOutputStreamZza);
            int i5 = zzgzt.zza;
            byte[] bArr = new byte[Segment.SIZE];
            while (true) {
                int i10 = inputStreamZza.read(bArr);
                if (i10 == -1) {
                    break;
                } else {
                    fileOutputStreamZza.write(bArr, 0, i10);
                }
            }
            zzgzwVarZza.close();
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                throw new IOException("Unable to delete ".concat(file2.toString()));
            }
            throw new IOException("Unable to delete ".concat(file.toString()));
        } catch (Throwable th) {
            try {
                throw zzgzwVarZza.zzc(th);
            } catch (Throwable th2) {
                zzgzwVarZza.close();
                throw th2;
            }
        }
    }
}
