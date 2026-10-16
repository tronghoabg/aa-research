package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zztb implements zzqx {
    private static final Object zza = new Object();
    private static ScheduledExecutorService zzb;
    private static int zzc;
    private final AudioTrack zzd;
    private final zzrg zze;
    private final float zzf;
    private final zzso zzg;
    private zzss zzh;
    private final zzti zzi;
    private final boolean zzj;
    private final int zzk;
    private final zzta zzl;
    private final zzeg zzm = new zzeg(Thread.currentThread());
    private boolean zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;

    /* JADX WARN: Multi-variable type inference failed */
    public zztb(AudioTrack audioTrack, zzrg zzrgVar, zzso zzsoVar, float f10, zzdp zzdpVar) {
        this.zzd = audioTrack;
        this.zze = zzrgVar;
        this.zzf = f10;
        this.zzg = zzsoVar;
        boolean zZzE = zzfm.zzE(zzrgVar.zza);
        this.zzj = zZzE;
        if (zZzE) {
            this.zzk = zzfm.zzI(zzrgVar.zza) * Integer.bitCount(zzrgVar.zzc);
        } else {
            this.zzk = -1;
        }
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        this.zzi = new zzti(new zzsu(this, null), zzdpVar, audioTrack, zzrgVar.zza, this.zzk, zzrgVar.zze);
        if (Build.VERSION.SDK_INT >= 24 && zzsoVar != null) {
            this.zzh = new zzss(audioTrack, zzsoVar, objArr2 == true ? 1 : 0);
        }
        this.zzl = zzg() ? new zzta(this, objArr == true ? 1 : 0) : null;
    }

    public static /* synthetic */ void zzp(AudioTrack audioTrack, Handler handler, final zzeg zzegVar) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsl
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zztb.zzw(zzegVar);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i5 = zzc - 1;
                    zzc = i5;
                    if (i5 == 0) {
                        ScheduledExecutorService scheduledExecutorService = zzb;
                        if (scheduledExecutorService == null) {
                            throw null;
                        }
                        scheduledExecutorService.shutdown();
                        zzb = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (handler.getLooper().getThread().isAlive()) {
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsm
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zztb.zzw(zzegVar);
                    }
                });
            }
            synchronized (zza) {
                try {
                    int i10 = zzc - 1;
                    zzc = i10;
                    if (i10 == 0) {
                        ScheduledExecutorService scheduledExecutorService2 = zzb;
                        if (scheduledExecutorService2 == null) {
                            throw null;
                        }
                        scheduledExecutorService2.shutdown();
                        zzb = null;
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final long zzs() {
        if (!this.zzj) {
            return this.zzp;
        }
        long j8 = this.zzo;
        int i5 = this.zzk;
        String str = zzfm.zza;
        return ((j8 + r2) - 1) / i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzw(zzeg zzegVar) {
        if (zzegVar.zzb()) {
            zzegVar.zze(-1, zzsj.zza);
            zzegVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zza() throws IllegalStateException {
        this.zzi.zzb();
        if (!this.zzn || zzg()) {
            this.zzd.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zzb() throws IllegalStateException {
        this.zzi.zzf();
        if (!this.zzn || zzg()) {
            this.zzd.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final boolean zzc(ByteBuffer byteBuffer, int i5, long j8) throws zzqw {
        boolean z2;
        zzso zzsoVar;
        int underrunCount;
        boolean z10 = this.zzj;
        if (!z10 && this.zzq == 0) {
            this.zzq = zztu.zzF(this.zze.zza, byteBuffer);
        }
        zzeg zzegVar = this.zzm;
        if (zzegVar.zzb()) {
            long jZzs = zzs();
            if (Build.VERSION.SDK_INT >= 24) {
                underrunCount = this.zzd.getUnderrunCount();
            } else {
                boolean z11 = this.zzs;
                zzti zztiVar = this.zzi;
                AudioTrack audioTrack = this.zzd;
                boolean z12 = jZzs > zzfm.zzv(zztiVar.zza(), audioTrack.getSampleRate());
                this.zzs = z12;
                underrunCount = (!z11 || z12 || audioTrack.getPlayState() == 1) ? this.zzr : this.zzr + 1;
            }
            int i10 = this.zzr;
            this.zzr = underrunCount;
            if (underrunCount > i10) {
                zzegVar.zze(-1, zzsk.zza);
                zzegVar.zzf();
            }
        }
        int iRemaining = byteBuffer.remaining();
        int iWrite = this.zzd.write(byteBuffer, byteBuffer.remaining(), 1);
        if (iWrite >= 0) {
            z2 = iWrite == iRemaining;
            if (z10) {
                this.zzo += iWrite;
                return z2;
            }
            if (z2) {
                this.zzp = (this.zzq * i5) + this.zzp;
            }
            return z2;
        }
        z2 = (Build.VERSION.SDK_INT >= 24 && iWrite == -6) || iWrite == -32;
        if (z2 && (zzsoVar = this.zzg) != null) {
            zztg zztgVar = ((zztf) zzsoVar).zza;
            if (zztgVar.zzj() != null) {
                zzqj zzqjVar = zzqj.zza;
                zztgVar.zzi(zzqjVar);
                zztgVar.zzj().zza(zzqjVar);
            }
        }
        throw new zzqw(iWrite, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zzd() throws IllegalStateException {
        if (this.zzn) {
            return;
        }
        this.zzn = true;
        this.zzi.zze(zzs());
        this.zzd.stop();
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zze() throws IllegalStateException {
        zzss zzssVar;
        if (this.zzi.zzc()) {
            this.zzd.pause();
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29 && zzg()) {
            zzta zztaVar = this.zzl;
            zztaVar.getClass();
            zztaVar.zza();
        }
        if (i5 >= 24 && (zzssVar = this.zzh) != null) {
            zzssVar.zzd();
            this.zzh = null;
        }
        final AudioTrack audioTrack = this.zzd;
        final zzeg zzegVar = this.zzm;
        final Handler handlerZzd = zzfm.zzd(null);
        synchronized (zza) {
            try {
                if (zzb == null) {
                    zzb = zzfm.zzh("ExoPlayer:AudioTrackReleaseThread");
                }
                zzc++;
                zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsn
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zztb.zzp(audioTrack, handlerZzd, zzegVar);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zzf(float f10) {
        this.zzd.setVolume(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final boolean zzg() {
        return Build.VERSION.SDK_INT >= 29 && this.zzd.isOffloadedPlayback();
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final int zzh() {
        return this.zzd.getAudioSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final int zzi() {
        return this.zzd.getSampleRate();
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final long zzj() {
        return this.zzd.getBufferSizeInFrames();
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final long zzk() {
        return this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final boolean zzl() {
        return this.zzi.zzd(zzs());
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zzm(zzqv zzqvVar) {
        this.zzm.zzc(zzqvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zzn(zzqh zzqhVar) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId logSessionIdZza = zzqhVar.zza();
        LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
        if (logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.zzd.setLogSessionId(logSessionIdZza);
    }

    @Override // com.google.android.gms.internal.ads.zzqx
    public final void zzo(AudioDeviceInfo audioDeviceInfo) {
        this.zzd.setPreferredDevice(audioDeviceInfo);
    }

    public final /* synthetic */ AudioTrack zzt() {
        return this.zzd;
    }

    public final /* synthetic */ zzeg zzu() {
        return this.zzm;
    }
}
