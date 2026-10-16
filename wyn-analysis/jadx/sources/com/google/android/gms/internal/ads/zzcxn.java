package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.view.View;
import java.util.Iterator;
import x.C4412e;

/* loaded from: classes3.dex */
public final class zzcxn implements zzden, zzddt {
    private final Context zza;
    private final zzclb zzb;
    private final zzfkn zzc;
    private final H6.a zzd;
    private zzelv zze;
    private boolean zzf;
    private final zzelt zzg;

    public zzcxn(Context context, zzclb zzclbVar, zzfkn zzfknVar, H6.a aVar, zzelt zzeltVar) {
        this.zza = context;
        this.zzb = zzclbVar;
        this.zzc = zzfknVar;
        this.zzd = aVar;
        this.zzg = zzeltVar;
    }

    private final synchronized void zza() {
        zzclb zzclbVar;
        zzels zzelsVar;
        zzelr zzelrVar;
        try {
            zzfkn zzfknVar = this.zzc;
            if (zzfknVar.zzT && (zzclbVar = this.zzb) != null) {
                Context context = this.zza;
                C6.n nVar = C6.n.f1857D;
                if (nVar.f1884y.zza(context)) {
                    H6.a aVar = this.zzd;
                    int i5 = aVar.f4928b;
                    int i10 = aVar.f4929c;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 1 + String.valueOf(i10).length());
                    sb2.append(i5);
                    sb2.append(".");
                    sb2.append(i10);
                    String string = sb2.toString();
                    zzflj zzfljVar = zzfknVar.zzV;
                    String strZza = zzfljVar.zza();
                    if (zzfljVar.zzc() == 1) {
                        zzelrVar = zzelr.VIDEO;
                        zzelsVar = zzels.DEFINED_BY_JAVASCRIPT;
                    } else {
                        int i11 = zzfknVar.zze;
                        zzelr zzelrVar2 = zzelr.HTML_DISPLAY;
                        zzelsVar = i11 == 1 ? zzels.ONE_PIXEL : zzels.BEGIN_TO_RENDER;
                        zzelrVar = zzelrVar2;
                    }
                    zzelv zzelvVarZzc = nVar.f1884y.zzc(string, zzclbVar.zzD(), "", "javascript", strZza, zzelsVar, zzelrVar, zzfknVar.zzal);
                    this.zze = zzelvVarZzc;
                    if (zzelvVarZzc != null) {
                        zzfuu zzfuuVarZza = zzelvVarZzc.zza();
                        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgs)).booleanValue()) {
                            nVar.f1884y.zzh(zzfuuVarZza, zzclbVar.zzD());
                            Iterator it = zzclbVar.zzF().iterator();
                            while (it.hasNext()) {
                                C6.n.f1857D.f1884y.zzg(zzfuuVarZza, (View) it.next());
                            }
                        } else {
                            nVar.f1884y.zzh(zzfuuVarZza, zzclbVar.zzE());
                        }
                        zzclbVar.zzak(this.zze);
                        C6.n.f1857D.f1884y.zze(zzfuuVarZza);
                        this.zzf = true;
                        zzclbVar.zze("onSdkLoaded", new C4412e(0));
                    }
                }
            }
        } finally {
        }
    }

    private final boolean zzb() {
        return ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgt)).booleanValue() && this.zzg.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final synchronized void zzdr() {
        zzclb zzclbVar;
        if (zzb()) {
            this.zzg.zzd();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzclbVar = this.zzb) == null) {
            return;
        }
        zzclbVar.zze("onSdkImpression", new C4412e(0));
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final synchronized void zzg() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}
