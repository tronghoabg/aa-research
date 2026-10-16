package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzbdl {
    private final zzbbz zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    public zzbdl(zzbbz zzbbzVar, String str, String str2, Class... clsArr) {
        this.zza = zzbbzVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzbbzVar.zzd().submit(new zzbdk(this));
    }

    private final String zzc(byte[] bArr, String str) throws zzbbd, UnsupportedEncodingException {
        return new String(this.zza.zzf().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (this.zzf.await(2L, TimeUnit.SECONDS)) {
                return this.zzd;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final /* synthetic */ void zzb() {
        try {
            zzbbz zzbbzVar = this.zza;
            Class<?> clsLoadClass = zzbbzVar.zze().loadClass(zzc(zzbbzVar.zzg(), this.zzb));
            if (clsLoadClass != null) {
                this.zzd = clsLoadClass.getMethod(zzc(zzbbzVar.zzg(), this.zzc), this.zze);
            }
        } catch (zzbbd | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            this.zzf.countDown();
            throw th;
        }
        this.zzf.countDown();
    }
}
