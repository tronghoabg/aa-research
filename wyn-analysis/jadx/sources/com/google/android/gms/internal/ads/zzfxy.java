package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.internal.InterfaceC1713b;
import com.google.android.gms.common.internal.InterfaceC1714c;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class zzfxy implements InterfaceC1713b, InterfaceC1714c {
    protected final zzfys zza;
    private final String zzb;
    private final String zzc;
    private final zzbdz zzd;
    private final LinkedBlockingQueue zze;
    private final HandlerThread zzf;
    private final zzfxq zzg;
    private final long zzh;

    public zzfxy(Context context, int i5, zzbdz zzbdzVar, String str, String str2, String str3, zzfxq zzfxqVar) {
        this.zzb = str;
        this.zzd = zzbdzVar;
        this.zzc = str2;
        this.zzg = zzfxqVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zzf = handlerThread;
        handlerThread.start();
        this.zzh = System.currentTimeMillis();
        zzfys zzfysVar = new zzfys(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfysVar;
        this.zze = new LinkedBlockingQueue();
        zzfysVar.checkAvailabilityAndConnect();
    }

    private final void zzd(int i5, long j8, Exception exc) {
        zzfxq zzfxqVar = this.zzg;
        if (zzfxqVar != null) {
            zzfxqVar.zzc(i5, System.currentTimeMillis() - j8, exc);
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1713b
    public final void onConnected(Bundle bundle) {
        zzfyx zzfyxVarZzc = zzc();
        if (zzfyxVarZzc != null) {
            try {
                zzfze zzfzeVarZzg = zzfyxVarZzc.zzg(new zzfzc(1, this.zzd, this.zzb, this.zzc));
                zzd(5011, this.zzh, null);
                this.zze.put(zzfzeVarZzg);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1714c
    public final void onConnectionFailed(d7.b bVar) throws InterruptedException {
        try {
            zzd(4012, this.zzh, null);
            this.zze.put(new zzfze(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.InterfaceC1713b
    public final void onConnectionSuspended(int i5) throws InterruptedException {
        try {
            zzd(4011, this.zzh, null);
            this.zze.put(new zzfze(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final zzfze zza(int i5) {
        zzfze zzfzeVar;
        try {
            zzfzeVar = (zzfze) this.zze.poll(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e7) {
            zzd(2009, this.zzh, e7);
            zzfzeVar = null;
        }
        zzd(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS_VALUE, this.zzh, null);
        if (zzfzeVar != null) {
            if (zzfzeVar.zzc == 7) {
                zzfxq.zzg(3);
            } else {
                zzfxq.zzg(2);
            }
        }
        return zzfzeVar == null ? new zzfze(null, 1) : zzfzeVar;
    }

    public final void zzb() {
        zzfys zzfysVar = this.zza;
        if (zzfysVar != null) {
            if (zzfysVar.isConnected() || zzfysVar.isConnecting()) {
                zzfysVar.disconnect();
            }
        }
    }

    public final zzfyx zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
