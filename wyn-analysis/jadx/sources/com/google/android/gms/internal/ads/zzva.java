package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class zzva implements zzvn {
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzdt zzg;
    private boolean zzh;

    public zzva(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzdt zzdtVar = new zzdt(zzdp.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzdtVar;
        this.zzf = new AtomicReference();
    }

    private static zzuz zzi() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new zzuz();
                }
                return (zzuz) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static int[] zzj(int[] iArr, int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    private static byte[] zzk(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zza() {
        if (this.zzh) {
            return;
        }
        HandlerThread handlerThread = this.zzd;
        handlerThread.start();
        this.zze = new zzuy(this, handlerThread.getLooper());
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zzb(int i5, int i10, int i11, long j8, int i12) {
        zzg();
        zzuz zzuzVarZzi = zzi();
        zzuzVarZzi.zza(i5, 0, i11, j8, i12);
        Handler handler = this.zze;
        String str = zzfm.zza;
        handler.obtainMessage(1, zzuzVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zzc(int i5, int i10, zziu zziuVar, long j8, int i11) {
        zzg();
        zzuz zzuzVarZzi = zzi();
        zzuzVarZzi.zza(i5, 0, 0, j8, i11);
        MediaCodec.CryptoInfo cryptoInfo = zzuzVarZzi.zzd;
        cryptoInfo.numSubSamples = zziuVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zziuVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zziuVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] bArrZzk = zzk(zziuVar.zzb, cryptoInfo.key);
        bArrZzk.getClass();
        cryptoInfo.key = bArrZzk;
        byte[] bArrZzk2 = zzk(zziuVar.zza, cryptoInfo.iv);
        bArrZzk2.getClass();
        cryptoInfo.iv = bArrZzk2;
        cryptoInfo.mode = zziuVar.zzc;
        if (Build.VERSION.SDK_INT >= 24) {
            d2.b.o();
            cryptoInfo.setPattern(W1.p.l(zziuVar.zzg, zziuVar.zzh));
        }
        Handler handler = this.zze;
        String str = zzfm.zza;
        handler.obtainMessage(2, zzuzVarZzi).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zzd(Bundle bundle) {
        zzg();
        Handler handler = this.zze;
        String str = zzfm.zza;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zze() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                if (handler == null) {
                    throw null;
                }
                handler.removeCallbacksAndMessages(null);
                zzdt zzdtVar = this.zzg;
                zzdtVar.zzb();
                Handler handler2 = this.zze;
                if (handler2 == null) {
                    throw null;
                }
                handler2.obtainMessage(3).sendToTarget();
                zzdtVar.zzc();
            } catch (InterruptedException e7) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zzf() {
        if (this.zzh) {
            zze();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvn
    public final void zzg() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final /* synthetic */ void zzh(Message message) {
        int i5 = message.what;
        zzuz zzuzVar = null;
        if (i5 == 1) {
            zzuz zzuzVar2 = (zzuz) message.obj;
            try {
                this.zzc.queueInputBuffer(zzuzVar2.zza, 0, zzuzVar2.zzc, zzuzVar2.zze, zzuzVar2.zzf);
            } catch (RuntimeException e7) {
                AtomicReference atomicReference = this.zzf;
                while (!atomicReference.compareAndSet(null, e7) && atomicReference.get() == null) {
                }
            }
            zzuzVar = zzuzVar2;
        } else if (i5 == 2) {
            zzuz zzuzVar3 = (zzuz) message.obj;
            int i10 = zzuzVar3.zza;
            MediaCodec.CryptoInfo cryptoInfo = zzuzVar3.zzd;
            long j8 = zzuzVar3.zze;
            int i11 = zzuzVar3.zzf;
            try {
                synchronized (zzb) {
                    this.zzc.queueSecureInputBuffer(i10, 0, cryptoInfo, j8, i11);
                }
            } catch (RuntimeException e10) {
                AtomicReference atomicReference2 = this.zzf;
                while (!atomicReference2.compareAndSet(null, e10) && atomicReference2.get() == null) {
                }
            }
            zzuzVar = zzuzVar3;
        } else if (i5 == 3) {
            this.zzg.zza();
        } else if (i5 != 4) {
            AtomicReference atomicReference3 = this.zzf;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            try {
                this.zzc.setParameters((Bundle) message.obj);
            } catch (RuntimeException e11) {
                AtomicReference atomicReference4 = this.zzf;
                while (!atomicReference4.compareAndSet(null, e11) && atomicReference4.get() == null) {
                }
            }
        }
        if (zzuzVar != null) {
            ArrayDeque arrayDeque = zza;
            synchronized (arrayDeque) {
                arrayDeque.add(zzuzVar);
            }
        }
    }
}
