package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.net.Uri;
import java.io.IOException;
import ka.AbstractC3256n;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes3.dex */
public final class zzcjq extends zzcjh implements zzchk {
    public static final /* synthetic */ int zzd = 0;
    private zzchl zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzciz zzi;
    private long zzj;
    private long zzk;

    public zzcjq(zzchu zzchuVar, zzcht zzchtVar) {
        super(zzchuVar);
        zzckj zzckjVar = new zzckj(zzchuVar.getContext(), zzchtVar, (zzchu) this.zzc.get(), null);
        int i5 = G6.L.f4523b;
        H6.l.e("ExoPlayerAdapter initialized.");
        this.zze = zzckjVar;
        zzckjVar.zzs(this);
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(H6.f.d(str, "MD5")));
    }

    private final void zzd(long j8) {
        U.f4562l.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb();
            }
        }, j8);
    }

    private static String zzx(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        AbstractC3256n.p(sb2, str, "/", canonicalName, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        sb2.append(message);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void release() {
        zzchl zzchlVar = this.zze;
        if (zzchlVar != null) {
            zzchlVar.zzs(null);
            this.zze.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzD() {
        int i5 = G6.L.f4523b;
        H6.l.f("Precache onRenderedFirstFrame");
    }

    public final zzchl zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzs(null);
        zzchl zzchlVar = this.zze;
        this.zze = null;
        return zzchlVar;
    }

    public final void zzb() {
        C0395s c0395s;
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        C0395s c0395s2;
        long j8;
        long j10;
        String strZzc = zzc(this.zzf);
        try {
            zzbio zzbioVar = zzbix.zzaq;
            c0395s = C0395s.f2489e;
            jLongValue = ((Long) c0395s.f2492c.zzd(zzbioVar)).longValue() * 1000;
            jIntValue = ((Integer) c0395s.f2492c.zzd(zzbix.zzA)).intValue();
            zBooleanValue = ((Boolean) c0395s.f2492c.zzd(zzbix.zzcG)).booleanValue();
        } catch (Exception e7) {
            String str = this.zzf;
            String message = e7.getMessage();
            String strH = AbstractC3256n.h(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i5 = G6.L.f4523b;
            H6.l.f(strH);
            C6.n.f1857D.f1868h.zzi(e7, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(this.zzf, strZzc, "error", zzx("error", e7));
        }
        synchronized (this) {
            try {
                C6.n.f1857D.k.getClass();
                if (System.currentTimeMillis() - this.zzj > jLongValue) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(jLongValue).length() + 27);
                    sb2.append("Timeout reached. Limit: ");
                    sb2.append(jLongValue);
                    sb2.append(" ms");
                    throw new IOException(sb2.toString());
                }
                if (this.zzg) {
                    throw new IOException("Abort requested before buffering finished. ");
                }
                if (!this.zzh) {
                    if (!this.zze.zzB()) {
                        throw new IOException("ExoPlayer was released during preloading.");
                    }
                    long jZzH = this.zze.zzH();
                    if (jZzH > 0) {
                        long jZzN = this.zze.zzN();
                        if (jZzN != this.zzk) {
                            boolean z2 = jZzN > 0;
                            String str2 = this.zzf;
                            long jZzI = zBooleanValue ? this.zze.zzI() : -1L;
                            long jZzJ = zBooleanValue ? this.zze.zzJ() : -1L;
                            long jZzK = zBooleanValue ? this.zze.zzK() : -1L;
                            j8 = jIntValue;
                            j10 = jZzN;
                            boolean z10 = z2;
                            c0395s2 = c0395s;
                            zzm(str2, strZzc, j10, jZzH, z10, jZzI, jZzJ, jZzK, zzchl.zzP(), zzchl.zzQ());
                            this.zzk = j10;
                        } else {
                            c0395s2 = c0395s;
                            j8 = jIntValue;
                            j10 = jZzN;
                        }
                        if (j10 >= jZzH) {
                            zzp(this.zzf, strZzc, jZzH);
                        } else if (this.zze.zzO() >= j8 && j10 > 0) {
                        }
                    } else {
                        c0395s2 = c0395s;
                    }
                    zzd(((Long) c0395s2.f2492c.zzd(zzbix.zzar)).longValue());
                    return;
                }
                C6.n.f1857D.f1859B.zzd(this.zzi);
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final boolean zze(String str) {
        return zzf(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final boolean zzf(String str, String[] strArr) {
        boolean z2;
        String str2;
        String str3;
        long j8;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        boolean z10;
        long jZzJ;
        this.zzf = str;
        String strZzc = zzc(str);
        String str4 = " ms";
        String str5 = "Timeout reached. Limit: ";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i5 = 0; i5 < strArr.length; i5++) {
                uriArr[i5] = Uri.parse(strArr[i5]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzchu zzchuVar = (zzchu) this.zzc.get();
            if (zzchuVar != null) {
                zzchuVar.zzt(strZzc, this);
            }
            C6.n.f1857D.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzbio zzbioVar = zzbix.zzar;
            C0395s c0395s = C0395s.f2489e;
            long jLongValue = ((Long) c0395s.f2492c.zzd(zzbioVar)).longValue();
            long jLongValue2 = ((Long) c0395s.f2492c.zzd(zzbix.zzaq)).longValue() * 1000;
            long jIntValue = ((Integer) c0395s.f2492c.zzd(zzbix.zzA)).intValue();
            boolean zBooleanValue = ((Boolean) c0395s.f2492c.zzd(zzbix.zzcG)).booleanValue();
            long j16 = -1;
            while (true) {
                synchronized (this) {
                    try {
                        if (System.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            long j17 = jLongValue2;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(j17).length() + 27);
                            sb2.append(str5);
                            sb2.append(j17);
                            sb2.append(str4);
                            throw new IOException(sb2.toString());
                        }
                        if (this.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (this.zzh) {
                            return true;
                        }
                        if (!this.zze.zzB()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jZzH = this.zze.zzH();
                        if (jZzH > 0) {
                            long jZzN = this.zze.zzN();
                            if (jZzN != j16) {
                                if (jZzN > 0) {
                                    j15 = jLongValue;
                                    z10 = true;
                                } else {
                                    j15 = jLongValue;
                                    z10 = false;
                                }
                                long jZzI = zBooleanValue ? this.zze.zzI() : -1L;
                                if (zBooleanValue) {
                                    z2 = zBooleanValue;
                                    jZzJ = this.zze.zzJ();
                                } else {
                                    z2 = zBooleanValue;
                                    jZzJ = -1;
                                }
                                long j18 = j15;
                                j13 = jZzH;
                                str3 = str5;
                                j12 = j18;
                                str2 = str4;
                                j14 = jZzN;
                                j8 = jLongValue2;
                                j10 = jIntValue;
                                zzm(str, strZzc, j14, j13, z10, jZzI, jZzJ, z2 ? this.zze.zzK() : -1L, zzchl.zzP(), zzchl.zzQ());
                                j16 = j14;
                            } else {
                                z2 = zBooleanValue;
                                str3 = str5;
                                j12 = jLongValue;
                                j10 = jIntValue;
                                j13 = jZzH;
                                str2 = str4;
                                j8 = jLongValue2;
                                j14 = jZzN;
                            }
                            if (j14 >= j13) {
                                zzp(str, strZzc, j13);
                                return true;
                            }
                            if (this.zze.zzO() >= j10 && j14 > 0) {
                                return true;
                            }
                            j11 = j12;
                        } else {
                            z2 = zBooleanValue;
                            str2 = str4;
                            str3 = str5;
                            j8 = jLongValue2;
                            j10 = jIntValue;
                            j11 = jLongValue;
                        }
                        try {
                            wait(j11);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } finally {
                    }
                }
                str5 = str3;
                jLongValue = j11;
                str4 = str2;
                jLongValue2 = j8;
                jIntValue = j10;
                zBooleanValue = z2;
            }
        } catch (Exception e7) {
            String message = e7.getMessage();
            String strH = AbstractC3256n.h(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i10 = G6.L.f4523b;
            H6.l.f(strH);
            C6.n.f1857D.f1868h.zzi(e7, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, strZzc, "error", zzx("error", e7));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final boolean zzg(String str, String[] strArr, zzciz zzcizVar) {
        this.zzf = str;
        this.zzi = zzcizVar;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i5 = 0; i5 < strArr.length; i5++) {
                uriArr[i5] = Uri.parse(strArr[i5]);
            }
            this.zze.zzq(uriArr, this.zzb);
            zzchu zzchuVar = (zzchu) this.zzc.get();
            if (zzchuVar != null) {
                zzchuVar.zzt(strZzc, this);
            }
            C6.n.f1857D.k.getClass();
            this.zzj = System.currentTimeMillis();
            this.zzk = -1L;
            zzd(0L);
            return true;
        } catch (Exception e7) {
            String message = e7.getMessage();
            String strH = AbstractC3256n.h(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i10 = G6.L.f4523b;
            H6.l.f(strH);
            C6.n.f1857D.f1868h.zzi(e7, "VideoStreamExoPlayerCache.preload");
            release();
            zzq(str, strZzc, "error", zzx("error", e7));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void zzh(int i5) {
        this.zze.zzG(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void zzi(int i5) {
        this.zze.zzF(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void zzj(int i5) {
        this.zze.zzy(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void zzk(int i5) {
        this.zze.zzz(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzcjh
    public final void zzl() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzq(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzr(final boolean z2, final long j8) {
        final zzchu zzchuVar = (zzchu) this.zzc.get();
        if (zzchuVar != null) {
            zzcfy.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzchuVar.zzu(z2, j8);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzs(int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzt(int i5, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzu(String str, Exception exc) {
        int i5 = G6.L.f4523b;
        H6.l.g("Precache error", exc);
        C6.n.f1857D.f1868h.zzi(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzv(String str, Exception exc) {
        int i5 = G6.L.f4523b;
        H6.l.g("Precache exception", exc);
        C6.n.f1857D.f1868h.zzi(exc, "VideoStreamExoPlayerCache.onException");
    }
}
