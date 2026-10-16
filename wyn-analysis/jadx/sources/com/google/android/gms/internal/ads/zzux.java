package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
final class zzux implements zzvm {
    private final MediaCodec zza;
    private final zzvc zzb;
    private final zzvn zzc;
    private final zzvi zzd;
    private boolean zze;
    private int zzf = 0;

    public /* synthetic */ zzux(MediaCodec mediaCodec, HandlerThread handlerThread, zzvn zzvnVar, zzvi zzviVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = new zzvc(handlerThread);
        this.zzc = zzvnVar;
        this.zzd = zzviVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzw(int i5, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i5 == 1) {
            sb2.append("Audio");
        } else if (i5 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i5);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zza(int i5, int i10, int i11, long j8, int i12) {
        this.zzc.zzb(i5, 0, i11, j8, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzb(int i5, int i10, zziu zziuVar, long j8, int i11) {
        this.zzc.zzc(i5, 0, zziuVar, j8, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzc(int i5, boolean z2) {
        this.zza.releaseOutputBuffer(i5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzd(int i5, long j8) {
        this.zza.releaseOutputBuffer(i5, j8);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final int zze() {
        this.zzc.zzg();
        return this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzg();
        return this.zzb.zze(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final MediaFormat zzg() {
        return this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final ByteBuffer zzh(int i5) {
        return this.zza.getInputBuffer(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzi(final Runnable runnable) {
        this.zzb.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzut
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzs(runnable);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final ByteBuffer zzj(int i5) {
        return this.zza.getOutputBuffer(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzk() {
        this.zzc.zze();
        MediaCodec mediaCodec = this.zza;
        mediaCodec.flush();
        this.zzb.zzg();
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzl() {
        zzvi zzviVar;
        zzvi zzviVar2;
        zzvi zzviVar3;
        try {
            try {
                if (this.zzf == 1) {
                    this.zzc.zzf();
                    this.zzb.zzb();
                }
                this.zzf = 2;
                if (this.zze) {
                    return;
                }
                int i5 = Build.VERSION.SDK_INT;
                if (i5 >= 30 && i5 < 33) {
                    this.zza.stop();
                }
                if (i5 >= 35 && (zzviVar3 = this.zzd) != null) {
                    zzviVar3.zzc(this.zza);
                }
                this.zza.release();
                this.zze = true;
            } catch (Throwable th) {
                if (!this.zze) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.zza.stop();
                    }
                    if (i10 >= 35 && (zzviVar2 = this.zzd) != null) {
                        zzviVar2.zzc(this.zza);
                    }
                    this.zza.release();
                    this.zze = true;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (zzviVar = this.zzd) != null) {
                zzviVar.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final boolean zzm(zzvl zzvlVar) {
        this.zzb.zzh(zzvlVar);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzn(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzo() {
        this.zza.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzp(Bundle bundle) {
        this.zzc.zzd(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzq(int i5) {
        this.zza.setVideoScalingMode(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzr(List list) {
        this.zza.subscribeToVendorParameters(list);
    }

    public final /* synthetic */ void zzs(Runnable runnable) {
        this.zzc.zzg();
        this.zzb.zzc(runnable);
    }

    public final /* synthetic */ void zzt(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i5) {
        zzvi zzviVar;
        zzvc zzvcVar = this.zzb;
        MediaCodec mediaCodec = this.zza;
        zzvcVar.zza(mediaCodec);
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i5);
        Trace.endSection();
        this.zzc.zza();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (zzviVar = this.zzd) != null) {
            zzviVar.zzb(mediaCodec);
        }
        this.zzf = 1;
    }
}
