package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.y1;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p7.AbstractC3772b;

/* loaded from: classes3.dex */
public final class zzdfo extends zzdix implements zzddt, zzdey {
    private final zzfkn zzb;
    private final AtomicBoolean zzc;
    private final zzfky zzd;

    public zzdfo(Set set, zzfkn zzfknVar, zzfky zzfkyVar) {
        super(set);
        this.zzc = new AtomicBoolean();
        this.zzb = zzfknVar;
        this.zzd = zzfkyVar;
    }

    private final void zzb() {
        final y1 y1Var;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzjd)).booleanValue() && (y1Var = this.zzb.zzae) != null && y1Var.f2545a == 3 && this.zzc.compareAndSet(false, true)) {
            zzs(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdfn
                @Override // com.google.android.gms.internal.ads.zzdiw
                public final /* synthetic */ void zza(Object obj) {
                    ((zzdfq) obj).zzm(y1Var);
                }
            });
        }
    }

    public final void zza(final y1 y1Var) {
        if (AbstractC3772b.b0(this.zzd.zza.zza) != 1 && this.zzb.zzaB && this.zzc.compareAndSet(false, true)) {
            zzs(new zzdiw() { // from class: com.google.android.gms.internal.ads.zzdfm
                @Override // com.google.android.gms.internal.ads.zzdiw
                public final /* synthetic */ void zza(Object obj) {
                    ((zzdfq) obj).zzm(y1Var);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        int i5 = this.zzb.zzb;
        if (i5 == 2 || i5 == 5 || i5 == 4 || i5 == 6 || i5 == 7) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdey
    public final void zzl() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }
}
