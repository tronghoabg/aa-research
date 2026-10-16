package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import j$.util.Objects;
import java.io.IOException;

/* loaded from: classes3.dex */
final class zzaca extends Handler implements Runnable {
    final /* synthetic */ zzacf zza;
    private final zzacb zzb;
    private final long zzc;
    private zzabx zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaca(zzacf zzacfVar, Looper looper, zzacb zzacbVar, zzabx zzabxVar, int i5, long j8) {
        super(looper);
        Objects.requireNonNull(zzacfVar);
        this.zza = zzacfVar;
        this.zzb = zzacbVar;
        this.zzd = zzabxVar;
        this.zzc = j8;
    }

    private final void zzd() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j8 = jElapsedRealtime - this.zzc;
        zzabx zzabxVar = this.zzd;
        zzabxVar.getClass();
        zzabxVar.zzC(this.zzb, jElapsedRealtime, j8, this.zzf);
        this.zze = null;
        zzacf zzacfVar = this.zza;
        zzaca zzacaVarZzj = zzacfVar.zzj();
        zzacaVarZzj.getClass();
        zzacfVar.zzi().execute(zzacaVarZzj);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        int i5 = message.what;
        if (i5 == 1) {
            zzd();
            return;
        }
        if (i5 == 4) {
            throw ((Error) message.obj);
        }
        zzacf zzacfVar = this.zza;
        zzacfVar.zzk(null);
        long j8 = this.zzc;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - j8;
        zzabx zzabxVar = this.zzd;
        zzabxVar.getClass();
        if (this.zzh) {
            zzabxVar.zzA(this.zzb, jElapsedRealtime, j10, false);
            return;
        }
        int i10 = message.what;
        if (i10 == 2) {
            try {
                zzabxVar.zzB(this.zzb, jElapsedRealtime, j10);
                return;
            } catch (RuntimeException e7) {
                zzeh.zzf("LoadTask", "Unexpected exception handling load completed", e7);
                this.zza.zzl(new zzace(e7));
                return;
            }
        }
        if (i10 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i11 = this.zzf + 1;
        this.zzf = i11;
        zzabz zzabzVarZzz = zzabxVar.zzz(this.zzb, jElapsedRealtime, j10, iOException, i11);
        if (zzabzVarZzz.zzb() == 3) {
            zzacfVar.zzl(this.zze);
        } else if (zzabzVarZzz.zzb() != 2) {
            if (zzabzVarZzz.zzb() == 1) {
                this.zzf = 1;
            }
            zzb(zzabzVarZzz.zzc() != -9223372036854775807L ? zzabzVarZzz.zzc() : Math.min((this.zzf - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        try {
            synchronized (this) {
                z2 = this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (!z2) {
                zzacb zzacbVar = this.zzb;
                String simpleName = zzacbVar.getClass().getSimpleName();
                StringBuilder sb2 = new StringBuilder(simpleName.length() + 5);
                sb2.append("load:");
                sb2.append(simpleName);
                Trace.beginSection(sb2.toString());
                try {
                    zzacbVar.zzc();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e7) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e7).sendToTarget();
        } catch (Exception e10) {
            if (this.zzi) {
                return;
            }
            zzeh.zzf("LoadTask", "Unexpected exception loading stream", e10);
            obtainMessage(3, new zzace(e10)).sendToTarget();
        } catch (OutOfMemoryError e11) {
            if (this.zzi) {
                return;
            }
            zzeh.zzf("LoadTask", "OutOfMemory error loading stream", e11);
            obtainMessage(3, new zzace(e11)).sendToTarget();
        } catch (Error e12) {
            if (!this.zzi) {
                zzeh.zzf("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(4, e12).sendToTarget();
            }
            throw e12;
        }
    }

    public final void zza(int i5) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i5) {
            throw iOException;
        }
    }

    public final void zzb(long j8) {
        zzacf zzacfVar = this.zza;
        zzgtr.zzi(zzacfVar.zzj() == null);
        zzacfVar.zzk(this);
        if (j8 > 0) {
            sendEmptyMessageDelayed(1, j8);
        } else {
            zzd();
        }
    }

    public final void zzc(boolean z2) {
        this.zzi = z2;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z2) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.zzh = true;
                    this.zzb.zzb();
                    Thread thread = this.zzg;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z2) {
            this.zza.zzk(null);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzabx zzabxVar = this.zzd;
            zzabxVar.getClass();
            zzabxVar.zzA(this.zzb, jElapsedRealtime, jElapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }
}
