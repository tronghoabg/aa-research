package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class zzgfm extends zzgfe {
    private final ExecutorService zzb;
    private final zzgfl zzc;
    private final zzgti zzd;

    public zzgfm(File file, ExecutorService executorService, zzgfl zzgflVar, zzgti zzgtiVar) {
        super(file);
        this.zzb = executorService;
        this.zzc = zzgflVar;
        this.zzd = zzgtiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final p8.p zzb() {
        return zzhcf.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgfj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzd();
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgfe
    public final p8.p zzc(final Object obj) {
        return zzhcf.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgfi
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zze(obj);
                return null;
            }
        }, this.zzb);
    }

    public final /* synthetic */ Object zzd() {
        Object objApply;
        Object objZzb;
        synchronized (this) {
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream(this.zza);
                    try {
                        objZzb = this.zzc.zzb(fileInputStream);
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (FileNotFoundException unused) {
                    objApply = this.zzc.zzc();
                    return objApply;
                }
            } catch (zzgfh e7) {
                objApply = this.zzd.apply(e7);
                return objApply;
            } catch (IOException e10) {
                objApply = this.zzd.apply(new zzgfh(e10));
                return objApply;
            }
        }
        return objZzb;
    }

    public final /* synthetic */ Void zze(Object obj) {
        synchronized (this) {
            File file = this.zza;
            zzhaa.zzb(file);
            String parent = file.getParent();
            String name = file.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 5);
            sb2.append(name);
            sb2.append(".temp");
            File file2 = new File(parent, sb2.toString());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    this.zzc.zza(obj, fileOutputStream);
                    fileOutputStream.close();
                    if (!file2.renameTo(this.zza)) {
                        throw new IOException("Failed to rename file.");
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e7) {
                file2.delete();
                throw e7;
            }
        }
        return null;
    }
}
