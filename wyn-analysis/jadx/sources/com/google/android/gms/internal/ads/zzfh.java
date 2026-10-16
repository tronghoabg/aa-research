package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
final class zzfh implements zzea {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzfh(Handler handler) {
        this.zzb = handler;
    }

    public static /* synthetic */ void zzo(zzfg zzfgVar) {
        List list = zza;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(zzfgVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static zzfg zzp() {
        zzfg zzfgVar;
        List list = zza;
        synchronized (list) {
            try {
                zzfgVar = list.isEmpty() ? new zzfg(null) : (zzfg) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzb(int i5) {
        return this.zzb.hasMessages(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final zzdz zzc(int i5) {
        Handler handler = this.zzb;
        zzfg zzfgVarZzp = zzp();
        zzfgVarZzp.zzb(handler.obtainMessage(i5), this);
        return zzfgVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final zzdz zzd(int i5, Object obj) {
        Handler handler = this.zzb;
        zzfg zzfgVarZzp = zzp();
        zzfgVarZzp.zzb(handler.obtainMessage(i5, obj), this);
        return zzfgVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final zzdz zze(int i5, int i10, int i11) {
        Handler handler = this.zzb;
        zzfg zzfgVarZzp = zzp();
        zzfgVarZzp.zzb(handler.obtainMessage(i5, i10, i11), this);
        return zzfgVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final zzdz zzf(int i5, int i10, int i11, Object obj) {
        Handler handler = this.zzb;
        zzfg zzfgVarZzp = zzp();
        zzfgVarZzp.zzb(handler.obtainMessage(31, 0, 0, obj), this);
        return zzfgVarZzp;
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzg(zzdz zzdzVar) {
        return ((zzfg) zzdzVar).zzc(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzh(int i5) {
        return this.zzb.sendEmptyMessage(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzi(int i5, int i10) {
        return this.zzb.sendEmptyMessageDelayed(i5, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzj(int i5, long j8) {
        return this.zzb.sendEmptyMessageAtTime(2, j8);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final void zzk(int i5) {
        this.zzb.removeMessages(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final void zzl(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzm(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzea
    public final boolean zzn(Runnable runnable, long j8) {
        return this.zzb.postDelayed(runnable, 1000L);
    }
}
