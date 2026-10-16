package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.view.View;
import java.util.Iterator;
import x.C4412e;

/* loaded from: classes3.dex */
public final class zzdnx implements zzden, F6.o, zzddt {
    zzelv zza;
    private final Context zzb;
    private final zzclb zzc;
    private final zzfkn zzd;
    private final H6.a zze;
    private final zzelt zzf;

    public zzdnx(Context context, zzclb zzclbVar, zzfkn zzfknVar, H6.a aVar, zzelt zzeltVar) {
        this.zzb = context;
        this.zzc = zzclbVar;
        this.zzd = zzfknVar;
        this.zze = aVar;
        this.zzf = zzeltVar;
    }

    private final boolean zzl() {
        return ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgt)).booleanValue() && this.zzf.zzb();
    }

    @Override // F6.o
    public final void zzdT() {
    }

    @Override // F6.o
    public final void zzdU(int i5) {
        this.zza = null;
    }

    @Override // F6.o
    public final void zzdo() {
    }

    @Override // F6.o
    public final void zzdp() {
    }

    @Override // F6.o
    public final void zzdq() {
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        zzclb zzclbVar;
        if (zzl()) {
            this.zzf.zzd();
        } else {
            if (this.zza == null || (zzclbVar = this.zzc) == null) {
                return;
            }
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgw)).booleanValue()) {
                zzclbVar.zze("onSdkImpression", new C4412e(0));
            }
        }
    }

    @Override // F6.o
    public final void zzdv() {
    }

    @Override // F6.o
    public final void zzdw() {
    }

    @Override // F6.o
    public final void zzdx() {
    }

    @Override // F6.o
    public final void zzdy() {
    }

    @Override // F6.o
    public final void zzdz() {
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzg() {
        zzclb zzclbVar;
        zzels zzelsVar;
        zzelr zzelrVar;
        zzfkn zzfknVar = this.zzd;
        if (!zzfknVar.zzT || (zzclbVar = this.zzc) == null) {
            return;
        }
        Context context = this.zzb;
        C6.n nVar = C6.n.f1857D;
        if (nVar.f1884y.zza(context)) {
            if (zzl()) {
                this.zzf.zzc();
                return;
            }
            H6.a aVar = this.zze;
            int i5 = aVar.f4928b;
            int length = String.valueOf(i5).length();
            int i10 = aVar.f4929c;
            StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(i10).length());
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
                zzelsVar = zzfknVar.zzY == 2 ? zzels.UNSPECIFIED : zzels.BEGIN_TO_RENDER;
                zzelrVar = zzelr.HTML_DISPLAY;
            }
            zzelv zzelvVarZzc = nVar.f1884y.zzc(string, zzclbVar.zzD(), "", "javascript", strZza, zzelsVar, zzelrVar, zzfknVar.zzal);
            this.zza = zzelvVarZzc;
            if (zzelvVarZzc != null) {
                zzfuu zzfuuVarZza = zzelvVarZzc.zza();
                boolean zBooleanValue = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgs)).booleanValue();
                zzelp zzelpVar = nVar.f1884y;
                if (zBooleanValue) {
                    zzelpVar.zzh(zzfuuVarZza, zzclbVar.zzD());
                    Iterator it = zzclbVar.zzF().iterator();
                    while (it.hasNext()) {
                        C6.n.f1857D.f1884y.zzg(zzfuuVarZza, (View) it.next());
                    }
                } else {
                    zzelpVar.zzh(zzfuuVarZza, zzclbVar.zzE());
                }
                zzclbVar.zzak(this.zza);
                C6.n.f1857D.f1884y.zze(zzfuuVarZza);
                zzclbVar.zze("onSdkLoaded", new C4412e(0));
            }
        }
    }

    @Override // F6.o
    public final void zzh() {
        zzclb zzclbVar;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgw)).booleanValue() || (zzclbVar = this.zzc) == null) {
            return;
        }
        if (this.zza != null || zzl()) {
            if (this.zza != null) {
                zzclbVar.zze("onSdkImpression", new C4412e(0));
            } else {
                this.zzf.zzd();
            }
        }
    }
}
