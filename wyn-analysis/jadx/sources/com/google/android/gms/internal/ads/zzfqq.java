package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.K0;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p7.AbstractC3772b;

/* loaded from: classes3.dex */
public final class zzfqq implements Runnable {
    private final zzfqt zzb;
    private String zzc;
    private String zze;
    private zzfkx zzf;
    private K0 zzg;
    private Future zzh;
    private final List zza = new ArrayList();
    private int zzi = 2;
    private zzfqv zzd = zzfqv.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public zzfqq(zzfqt zzfqtVar) {
        this.zzb = zzfqtVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzfqq zza(zzfqg zzfqgVar) {
        try {
            if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
                List list = this.zza;
                zzfqgVar.zzc();
                list.add(zzfqgVar);
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                this.zzh = zzcfy.zzd.schedule(this, ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzkh)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfqq zzb(ArrayList arrayList) {
        try {
            if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains("BANNER")) {
                    this.zzi = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains("INTERSTITIAL")) {
                    this.zzi = 4;
                } else if (arrayList.contains("native") || arrayList.contains("NATIVE")) {
                    this.zzi = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains("REWARDED")) {
                    this.zzi = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.zzi = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains("REWARDED_INTERSTITIAL")) {
                    this.zzi = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfqq zzc(String str) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue() && zzfqp.zza(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfqq zzd(Bundle bundle) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            this.zzd = AbstractC3772b.Z(bundle);
        }
        return this;
    }

    public final synchronized zzfqq zze(zzfkx zzfkxVar) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            this.zzf = zzfkxVar;
        }
        return this;
    }

    public final synchronized zzfqq zzf(K0 k02) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            this.zzg = k02;
        }
        return this;
    }

    public final synchronized zzfqq zzg(String str) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized void zzh() {
        try {
            if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                List<zzfqg> list = this.zza;
                for (zzfqg zzfqgVar : list) {
                    int i5 = this.zzi;
                    if (i5 != 2) {
                        zzfqgVar.zzp(i5);
                    }
                    if (!TextUtils.isEmpty(this.zzc)) {
                        zzfqgVar.zze(this.zzc);
                    }
                    if (!TextUtils.isEmpty(this.zze) && !zzfqgVar.zzl()) {
                        zzfqgVar.zzi(this.zze);
                    }
                    zzfkx zzfkxVar = this.zzf;
                    if (zzfkxVar != null) {
                        zzfqgVar.zzg(zzfkxVar);
                    } else {
                        K0 k02 = this.zzg;
                        if (k02 != null) {
                            zzfqgVar.zzh(k02);
                        }
                    }
                    zzfqgVar.zzf(this.zzd);
                    this.zzb.zzb(zzfqgVar.zzm());
                }
                list.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzfqq zzi(int i5) {
        if (((Boolean) zzbkq.zzc.zze()).booleanValue()) {
            this.zzi = i5;
        }
        return this;
    }
}
