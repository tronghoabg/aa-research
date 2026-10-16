package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;

/* loaded from: classes3.dex */
public final class zzfig implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzfig(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzfig zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzfig(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzfie zzb() {
        zzcff zzcffVarR;
        Context context = (Context) this.zza.zzb();
        zzfmr zzfmrVar = (zzfmr) this.zzb.zzb();
        zzfnj zzfnjVar = (zzfnj) this.zzc.zzb();
        zzbio zzbioVar = zzbix.zzhs;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            zzcffVarR = ((G6.O) C6.n.f1857D.f1868h.zzp()).r();
        } else {
            G6.O o7 = (G6.O) C6.n.f1857D.f1868h.zzp();
            synchronized (o7.f4531a) {
                zzcffVarR = o7.f4543n;
            }
        }
        boolean z2 = false;
        if (zzcffVarR != null && zzcffVarR.zzi()) {
            z2 = true;
        }
        if (((Integer) c0395s.f2492c.zzd(zzbix.zzhI)).intValue() > 0) {
            if (!((Boolean) c0395s.f2492c.zzd(zzbix.zzhr)).booleanValue() || z2) {
                zzfni zzfniVarZza = zzfnjVar.zza(zzfmz.AppOpen, context, zzfmrVar, new zzfhh(new zzfhg()));
                zzfhv zzfhvVar = new zzfhv(new zzfhu());
                zzfmv zzfmvVar = zzfniVarZza.zza;
                zzhcp zzhcpVar = zzcfy.zza;
                return new zzfhl(zzfhvVar, new zzfhr(zzfmvVar, zzhcpVar), zzfniVarZza.zzb, zzfmvVar.zze().zzf, zzhcpVar);
            }
        }
        return new zzfhu();
    }
}
