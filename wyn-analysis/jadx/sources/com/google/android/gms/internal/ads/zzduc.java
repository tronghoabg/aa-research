package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.r1;
import D6.x1;
import android.content.Context;
import cb.AbstractC1593a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzduc {
    private final zzflg zza;
    private final Executor zzb;
    private final zzdwq zzc;
    private final zzdvl zzd;
    private final Context zze;
    private final zzdzt zzf;
    private final zzfsm zzg;
    private final zzeko zzh;
    private final zzdzo zzi;
    private final zzeaw zzj;

    public zzduc(zzflg zzflgVar, Executor executor, zzdwq zzdwqVar, Context context, zzdzt zzdztVar, zzfsm zzfsmVar, zzeko zzekoVar, zzdvl zzdvlVar, zzdzo zzdzoVar, zzeaw zzeawVar) {
        this.zza = zzflgVar;
        this.zzb = executor;
        this.zzc = zzdwqVar;
        this.zze = context;
        this.zzf = zzdztVar;
        this.zzg = zzfsmVar;
        this.zzh = zzekoVar;
        this.zzd = zzdvlVar;
        this.zzi = zzdzoVar;
        this.zzj = zzeawVar;
    }

    private final void zzh(zzclb zzclbVar, zzcgc zzcgcVar) {
        r1 r1Var = this.zza.zza;
        if (r1Var != null && zzclbVar.zzh() != null) {
            zzclbVar.zzh().zzc(r1Var);
        }
        zzcgcVar.zzb();
    }

    private final void zzi(zzclb zzclbVar, C6.b bVar, zzcdu zzcduVar) {
        zzeaw zzeawVar;
        zzj(zzclbVar);
        zzclbVar.zzab("/video", zzbpw.zzl);
        zzclbVar.zzab("/videoMeta", zzbpw.zzm);
        zzclbVar.zzab("/precache", new zzcji());
        zzclbVar.zzab("/delayPageLoaded", zzbpw.zzp);
        zzclbVar.zzab("/instrument", zzbpw.zzn);
        zzclbVar.zzab("/log", zzbpw.zzg);
        zzclbVar.zzab("/click", zzbpw.zzb(null, null));
        if (this.zza.zzb != null) {
            zzclbVar.zzP().zzT(true);
            zzclbVar.zzab("/open", new zzbqk(true != ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzpr)).booleanValue() ? null : bVar, null, null, null, null, null));
        } else {
            zzclbVar.zzP().zzT(false);
        }
        if (C6.n.f1857D.f1885z.zzb(zzclbVar.getContext())) {
            Map map = new HashMap();
            if (zzclbVar.zzC() != null) {
                map = zzclbVar.zzC().zzaw;
            }
            zzclbVar.zzab("/logScionEvent", new zzbqd(zzclbVar.getContext(), map));
        }
        zzbio zzbioVar = zzbix.zzpr;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            zzclbVar.zzP().zzi(bVar);
            zzclbVar.zzP().zzj(zzcduVar);
        }
        if (!((Boolean) c0395s.f2492c.zzd(zzbix.zziQ)).booleanValue() || (zzeawVar = this.zzj) == null) {
            return;
        }
        zzclbVar.zzab("/onDeviceStorageEvent", new zzbqf(zzeawVar));
    }

    private static final void zzj(zzclb zzclbVar) {
        zzclbVar.zzab("/videoClicked", zzbpw.zzh);
        zzclbVar.zzP().zzR(true);
        zzclbVar.zzab("/getNativeAdViewSignals", zzbpw.zzs);
        zzclbVar.zzab("/getNativeClickMeta", zzbpw.zzt);
    }

    public final p8.p zza(final JSONObject jSONObject, final C6.b bVar, final zzcdu zzcduVar) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcZ)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzi, zzdzc.NATIVE_ASSETS_LOADING_VIDEO_START.zza());
        }
        p8.p pVarZza = zzhcf.zza(null);
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtx
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zze(bVar, zzcduVar, obj);
            }
        };
        Executor executor = this.zzb;
        return zzhcf.zzj(zzhcf.zzj(pVarZza, zzhbnVar, executor), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdub
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzc(jSONObject, (zzclb) obj);
            }
        }, executor);
    }

    public final p8.p zzb(final String str, final String str2, final zzfkn zzfknVar, final zzfkq zzfkqVar, final x1 x1Var, final C6.b bVar, final zzcdu zzcduVar) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcZ)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzi, zzdzc.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START.zza());
        }
        return zzhcf.zzj(zzhcf.zza(null), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtw
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzd(x1Var, zzfknVar, zzfkqVar, bVar, zzcduVar, str, str2, obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ p8.p zzc(JSONObject jSONObject, final zzclb zzclbVar) {
        zzbsi zzbsiVar = this.zza.zzb;
        final zzcgc zzcgcVarZza = zzcgc.zza((Object) zzclbVar);
        if (zzbsiVar != null) {
            zzclbVar.zzaf(zzcnl.zze());
        } else {
            zzclbVar.zzaf(zzcnl.zzd());
        }
        zzclbVar.zzP().zzG(new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdua
            @Override // com.google.android.gms.internal.ads.zzcmx
            public final /* synthetic */ void zza(boolean z2, int i5, String str, String str2) {
                this.zza.zzg(zzclbVar, zzcgcVarZza, z2, i5, str, str2);
            }
        });
        zzclbVar.zzb("google.afma.nativeAds.renderVideo", jSONObject);
        return zzcgcVarZza;
    }

    public final p8.p zzd(x1 x1Var, zzfkn zzfknVar, zzfkq zzfkqVar, C6.b bVar, zzcdu zzcduVar, String str, String str2, Object obj) throws zzclq {
        final zzclb zzclbVarZza = this.zzc.zza(x1Var, zzfknVar, zzfkqVar);
        final zzcgc zzcgcVarZza = zzcgc.zza((Object) zzclbVarZza);
        if (this.zza.zzb != null) {
            zzi(zzclbVarZza, bVar, zzcduVar);
            zzclbVarZza.zzaf(zzcnl.zze());
        } else {
            zzdvi zzdviVarZza = this.zzd.zza();
            zzcmz zzcmzVarZzP = zzclbVarZza.zzP();
            zzbio zzbioVar = zzbix.zzpr;
            C0395s c0395s = C0395s.f2489e;
            zzcmzVarZzP.zzab(zzdviVarZza, zzdviVarZza, zzdviVarZza, zzdviVarZza, zzdviVarZza, false, null, !((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() ? new C6.b(this.zze, null) : bVar, null, true != ((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() ? null : zzcduVar, this.zzh, this.zzg, this.zzf, null, zzdviVarZza, null, null, null, null, this.zzj, null, null);
            zzj(zzclbVarZza);
        }
        zzclbVarZza.zzP().zzG(new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdtz
            @Override // com.google.android.gms.internal.ads.zzcmx
            public final /* synthetic */ void zza(boolean z2, int i5, String str3, String str4) {
                this.zza.zzf(zzclbVarZza, zzcgcVarZza, z2, i5, str3, str4);
            }
        });
        zzclbVarZza.zzau(str, str2, null);
        return zzcgcVarZza;
    }

    public final p8.p zze(C6.b bVar, zzcdu zzcduVar, Object obj) throws zzclq {
        zzclb zzclbVarZza = this.zzc.zza(x1.V(), null, null);
        final zzcgc zzcgcVarZza = zzcgc.zza((Object) zzclbVarZza);
        zzi(zzclbVarZza, bVar, zzcduVar);
        zzclbVarZza.zzP().zzH(new zzcmy() { // from class: com.google.android.gms.internal.ads.zzdty
            @Override // com.google.android.gms.internal.ads.zzcmy
            public final /* synthetic */ void zza() {
                zzcgcVarZza.zzb();
            }
        });
        zzclbVarZza.loadUrl((String) C0395s.f2489e.f2492c.zzd(zzbix.zzeO));
        return zzcgcVarZza;
    }

    public final /* synthetic */ void zzf(zzclb zzclbVar, zzcgc zzcgcVar, boolean z2, int i5, String str, String str2) {
        if (z2) {
            r1 r1Var = this.zza.zza;
            if (r1Var != null && zzclbVar.zzh() != null) {
                zzclbVar.zzh().zzc(r1Var);
            }
            zzcgcVar.zzb();
            return;
        }
        int length = String.valueOf(i5).length();
        StringBuilder sb2 = new StringBuilder(length + 63 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb2.append("Html video Web View failed to load. Error code: ");
        sb2.append(i5);
        sb2.append(", Description: ");
        sb2.append(str);
        zzcgcVar.zzd(new zzepp(1, wg.b.c(sb2, ", Failing URL: ", str2)));
    }

    public final void zzg(zzclb zzclbVar, zzcgc zzcgcVar, boolean z2, int i5, String str, String str2) {
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzeW)).booleanValue()) {
            zzh(zzclbVar, zzcgcVar);
            return;
        }
        if (z2) {
            zzh(zzclbVar, zzcgcVar);
            return;
        }
        int length = String.valueOf(i5).length();
        StringBuilder sb2 = new StringBuilder(length + 64 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb2.append("Native Video WebView failed to load. Error code: ");
        sb2.append(i5);
        sb2.append(", Description: ");
        sb2.append(str);
        zzcgcVar.zzd(new zzepp(1, wg.b.c(sb2, ", Failing URL: ", str2)));
    }
}
