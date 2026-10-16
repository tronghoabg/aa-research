package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzwj implements zzvm {
    private final MediaCodec zza;
    private final zzvi zzb;

    public /* synthetic */ zzwj(MediaCodec mediaCodec, zzvi zzviVar, byte[] bArr) {
        this.zza = mediaCodec;
        this.zzb = zzviVar;
        if (Build.VERSION.SDK_INT < 35 || zzviVar == null) {
            return;
        }
        zzviVar.zzb(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zza(int i5, int i10, int i11, long j8, int i12) throws MediaCodec.CryptoException {
        this.zza.queueInputBuffer(i5, 0, i11, j8, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzb(int i5, int i10, zziu zziuVar, long j8, int i11) throws MediaCodec.CryptoException {
        this.zza.queueSecureInputBuffer(i5, 0, zziuVar.zzb(), j8, i11);
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
        return this.zza.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final int zzf(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final MediaFormat zzg() {
        return this.zza.getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final ByteBuffer zzh(int i5) {
        return this.zza.getInputBuffer(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final /* synthetic */ void zzi(Runnable runnable) {
        P.a(this, runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final ByteBuffer zzj(int i5) {
        return this.zza.getOutputBuffer(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzk() {
        this.zza.flush();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzl() {
        zzvi zzviVar;
        zzvi zzviVar2;
        try {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30 && i5 < 33) {
                this.zza.stop();
            }
            if (i5 >= 35 && (zzviVar2 = this.zzb) != null) {
                zzviVar2.zzc(this.zza);
            }
            this.zza.release();
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 35 && (zzviVar = this.zzb) != null) {
                zzviVar.zzc(this.zza);
            }
            this.zza.release();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final /* synthetic */ boolean zzm(zzvl zzvlVar) {
        return P.b(this, zzvlVar);
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
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzq(int i5) {
        this.zza.setVideoScalingMode(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzr(List list) {
        this.zza.subscribeToVendorParameters(list);
    }
}
