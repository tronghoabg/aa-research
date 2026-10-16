package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class zzbia {
    final /* synthetic */ zzbib zza;
    private final byte[] zzb;
    private int zzc;

    public /* synthetic */ zzbia(zzbib zzbibVar, byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(zzbibVar);
        this.zza = zzbibVar;
        this.zzb = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        try {
            zzbib zzbibVar = this.zza;
            if (zzbibVar.zzb) {
                zzbibVar.zza.zzh(this.zzb);
                zzbibVar.zza.zzi(0);
                zzbibVar.zza.zzj(this.zzc);
                zzbibVar.zza.zzg(null);
                zzbibVar.zza.zzf();
            }
        } catch (RemoteException e7) {
            H6.l.b("Clearcut log failed", e7);
        }
    }

    public final synchronized void zza() {
        this.zza.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbhz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    public final zzbia zzb(int i5) {
        this.zzc = i5;
        return this;
    }
}
