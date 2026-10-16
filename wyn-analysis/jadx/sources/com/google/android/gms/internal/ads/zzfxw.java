package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.InterfaceC1713b;
import com.google.android.gms.common.internal.InterfaceC1714c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class zzfxw implements InterfaceC1713b, InterfaceC1714c {
    protected final zzfys zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfxw(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfys zzfysVar = new zzfys(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfysVar;
        this.zzd = new LinkedBlockingQueue();
        zzfysVar.checkAvailabilityAndConnect();
    }

    public static zzayt zzc() {
        zzaxt zzaxtVarZzj = zzayt.zzj();
        zzaxtVarZzj.zzl(32768L);
        return (zzayt) zzaxtVarZzj.zzbu();
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1713b
    public final void onConnected(Bundle bundle) {
        zzfyx zzfyxVarZzd = zzd();
        if (zzfyxVarZzd != null) {
            try {
                try {
                    this.zzd.put(zzfyxVarZzd.zze(new zzfyt(this.zzb, this.zzc)).zza());
                } catch (Throwable unused) {
                    this.zzd.put(zzc());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th) {
                zzb();
                this.zze.quit();
                throw th;
            }
            zzb();
            this.zze.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1714c
    public final void onConnectionFailed(d7.b bVar) throws InterruptedException {
        try {
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1713b
    public final void onConnectionSuspended(int i5) throws InterruptedException {
        try {
            this.zzd.put(zzc());
        } catch (InterruptedException unused) {
        }
    }

    public final zzayt zza(int i5) {
        zzayt zzaytVar;
        try {
            zzaytVar = (zzayt) this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzaytVar = null;
        }
        return zzaytVar == null ? zzc() : zzaytVar;
    }

    public final void zzb() {
        zzfys zzfysVar = this.zza;
        if (zzfysVar != null) {
            if (zzfysVar.isConnected() || zzfysVar.isConnecting()) {
                zzfysVar.disconnect();
            }
        }
    }

    public final zzfyx zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
