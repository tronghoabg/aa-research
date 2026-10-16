package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import n7.AbstractC3598c;

/* loaded from: classes3.dex */
public final class zzcjw extends zzhj {
    private final Context zza;
    private final zzhr zzb;
    private final zzcju zzc;
    private final String zzd;
    private final int zze;
    private final boolean zzf;
    private InputStream zzg;
    private boolean zzh;
    private Uri zzi;
    private volatile zzbhi zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private long zzo;
    private p8.p zzp;
    private final AtomicLong zzq;

    public zzcjw(Context context, zzhr zzhrVar, String str, int i5, zzip zzipVar, zzcju zzcjuVar) {
        super(false);
        this.zza = context;
        this.zzb = zzhrVar;
        this.zzc = zzcjuVar;
        this.zzd = str;
        this.zze = i5;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = 0L;
        this.zzq = new AtomicLong(-1L);
        this.zzp = null;
        this.zzf = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcG)).booleanValue();
        zze(zzipVar);
    }

    private final boolean zzr() {
        if (!this.zzf) {
            return false;
        }
        zzbio zzbioVar = zzbix.zzfv;
        C0395s c0395s = C0395s.f2489e;
        if (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() || this.zzm) {
            return ((Boolean) c0395s.f2492c.zzd(zzbix.zzfw)).booleanValue() && !this.zzn;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i5, int i10) throws IOException {
        if (!this.zzh) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.zzg;
        int iZza = inputStream != null ? inputStream.read(bArr, i5, i10) : this.zzb.zza(bArr, i5, i10);
        if (this.zzf && this.zzg == null) {
            return iZza;
        }
        zzh(iZza);
        return iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021c  */
    /* JADX WARN: Type inference failed for: r5v18, types: [C6.n] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    @Override // com.google.android.gms.internal.ads.zzhr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzb(com.google.android.gms.internal.ads.zzhv r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjw.zzb(com.google.android.gms.internal.ads.zzhv):long");
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final Uri zzc() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public final void zzd() throws IOException {
        if (!this.zzh) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.zzh = false;
        this.zzi = null;
        boolean z2 = (this.zzf && this.zzg == null) ? false : true;
        InputStream inputStream = this.zzg;
        if (inputStream != null) {
            AbstractC3598c.d(inputStream);
            this.zzg = null;
        } else {
            this.zzb.zzd();
        }
        if (z2) {
            zzi();
        }
    }

    public final boolean zzk() {
        return this.zzk;
    }

    public final boolean zzl() {
        return this.zzl;
    }

    public final boolean zzm() {
        return this.zzm;
    }

    public final boolean zzn() {
        return this.zzn;
    }

    public final long zzo() {
        return this.zzo;
    }

    public final long zzp() {
        if (this.zzj != null) {
            AtomicLong atomicLong = this.zzq;
            if (atomicLong.get() != -1) {
                return atomicLong.get();
            }
            synchronized (this) {
                try {
                    if (this.zzp == null) {
                        this.zzp = zzcfy.zza.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzcjv
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return this.zza.zzq();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.zzp.isDone()) {
                try {
                    this.zzq.compareAndSet(-1L, ((Long) this.zzp.get()).longValue());
                    return this.zzq.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    public final Long zzq() {
        return Long.valueOf(C6.n.f1857D.f1870j.zzd(this.zzj));
    }
}
