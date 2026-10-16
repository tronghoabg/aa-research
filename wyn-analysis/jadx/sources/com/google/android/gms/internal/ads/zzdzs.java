package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.text.TextUtils;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdzs {
    final /* synthetic */ zzdzt zza;
    private final Map zzb;

    public zzdzs(zzdzt zzdztVar) {
        Objects.requireNonNull(zzdztVar);
        this.zza = zzdztVar;
        this.zzb = new ConcurrentHashMap();
    }

    public final zzdzs zza(zzfkq zzfkqVar) {
        zzc("gqi", zzfkqVar.zzb);
        return this;
    }

    public final zzdzs zzb(zzfkn zzfknVar) {
        zzc("aai", zzfknVar.zzw);
        zzc("request_id", zzfknVar.zzan);
        zzc("ad_format", zzfkn.zza(zzfknVar.zzb));
        return this;
    }

    public final zzdzs zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final void zzd() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzh();
            }
        });
    }

    public final H6.o zze() {
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzpU)).booleanValue()) {
            zzd();
            return H6.o.f4961a;
        }
        zzdzt zzdztVar = this.zza;
        return zzdztVar.zzc().zze(this.zzb);
    }

    public final void zzf() {
        this.zza.zzd().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzi();
            }
        });
    }

    public final String zzg() {
        return this.zza.zzc().zzc(this.zzb);
    }

    public final /* synthetic */ void zzh() {
        this.zza.zzc().zzb(this.zzb);
    }

    public final /* synthetic */ void zzi() {
        this.zza.zzc().zzf(this.zzb);
    }

    public final /* synthetic */ zzdzs zzj() {
        this.zzb.putAll(this.zza.zze());
        return this;
    }
}
