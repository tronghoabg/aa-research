package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import n7.AbstractC3598c;

/* loaded from: classes3.dex */
public final class zzcio implements zzhr {
    private final Context zza;
    private final zzhr zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbhi zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzhv zzl;

    public zzcio(Context context, zzhr zzhrVar, String str, int i5, zzip zzipVar, zzcin zzcinVar) {
        this.zza = context;
        this.zzb = zzhrVar;
        this.zzc = str;
        this.zzd = i5;
        new AtomicLong(-1L);
        this.zze = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcG)).booleanValue();
    }

    private final boolean zzf() {
        if (!this.zze) {
            return false;
        }
        zzbio zzbioVar = zzbix.zzfv;
        C0395s c0395s = C0395s.f2489e;
        if (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() || this.zzj) {
            return ((Boolean) c0395s.f2492c.zzd(zzbix.zzfw)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i10) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i5, i10) : this.zzb.zza(bArr, i5, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final long zzb(zzhv zzhvVar) throws IOException {
        Long l10;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        Uri uri = zzhvVar.zza;
        this.zzh = uri;
        this.zzl = zzhvVar;
        this.zzi = zzbhi.zza(uri);
        zzbio zzbioVar = zzbix.zzfs;
        C0395s c0395s = C0395s.f2489e;
        zzbhf zzbhfVarZzc = null;
        if (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzhvVar.zze;
                this.zzi.zzi = zzgui.zza(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbhfVarZzc = C6.n.f1857D.f1870j.zzc(this.zzi);
            }
            if (zzbhfVarZzc != null && zzbhfVarZzc.zza()) {
                this.zzj = zzbhfVarZzc.zzg();
                this.zzk = zzbhfVarZzc.zze();
                if (!zzf()) {
                    this.zzf = zzbhfVarZzc.zzb();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzhvVar.zze;
            this.zzi.zzi = zzgui.zza(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l10 = (Long) c0395s.f2492c.zzd(zzbix.zzfu);
            } else {
                l10 = (Long) c0395s.f2492c.zzd(zzbix.zzft);
            }
            long jLongValue = l10.longValue();
            C6.n.f1857D.k.getClass();
            SystemClock.elapsedRealtime();
            Future futureZza = zzbht.zza(this.zza, this.zzi);
            try {
                try {
                    try {
                        zzbhu zzbhuVar = (zzbhu) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                        zzbhuVar.zzc();
                        this.zzj = zzbhuVar.zzd();
                        this.zzk = zzbhuVar.zzf();
                        zzbhuVar.zze();
                        if (!zzf()) {
                            this.zzf = zzbhuVar.zzb();
                        }
                    } catch (ExecutionException | TimeoutException unused) {
                        futureZza.cancel(false);
                    }
                } catch (InterruptedException unused2) {
                    futureZza.cancel(false);
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable unused3) {
            }
            C6.n.f1857D.k.getClass();
            SystemClock.elapsedRealtime();
            throw null;
        }
        if (this.zzi != null) {
            zzhu zzhuVarZzb = zzhvVar.zzb();
            zzhuVarZzb.zza(Uri.parse(this.zzi.zza));
            this.zzl = zzhuVarZzb.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            AbstractC3598c.d(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zze(zzip zzipVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final /* synthetic */ Map zzj() {
        return z.a(this);
    }
}
