package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* loaded from: classes3.dex */
final class zzadh extends HandlerThread implements Handler.Callback {
    private zzdw zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzadi zze;

    public zzadh() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        zzdw zzdwVar;
        int i5 = message.what;
        try {
            if (i5 == 1) {
                try {
                    try {
                        int i10 = message.arg1;
                        zzdw zzdwVar2 = this.zza;
                        if (zzdwVar2 == null) {
                            throw null;
                        }
                        zzdwVar2.zza(i10);
                        this.zze = new zzadi(this, this.zza.zzc(), i10 != 0, null);
                        synchronized (this) {
                            notify();
                        }
                    } catch (zzdx e7) {
                        zzeh.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                        this.zzd = new IllegalStateException(e7);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (Error e10) {
                    zzeh.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.zzc = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    zzeh.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.zzd = e11;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i5 == 2) {
                try {
                    zzdwVar = this.zza;
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                if (zzdwVar == null) {
                    throw null;
                }
                zzdwVar.zzb();
                return true;
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzadi zza(int i5) {
        boolean z2;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzdw(handler, null);
        synchronized (this) {
            z2 = false;
            this.zzb.obtainMessage(1, i5, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzadi zzadiVar = this.zze;
        zzadiVar.getClass();
        return zzadiVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
