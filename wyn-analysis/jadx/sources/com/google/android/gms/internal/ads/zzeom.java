package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import cb.AbstractC1593a;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import n7.AbstractC3598c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzeom implements zzeog {
    private final zzdok zza;
    private final zzhcp zzb;
    private final zzdsv zzc;
    private final zzfmf zzd;
    private final zzdvl zze;
    private final zzdzo zzf;
    private final H6.a zzg;
    private final Context zzh;
    private final zzcdq zzi;

    public zzeom(zzdok zzdokVar, zzhcp zzhcpVar, zzdsv zzdsvVar, zzfmf zzfmfVar, zzdvl zzdvlVar, zzdzo zzdzoVar, H6.a aVar, Context context, zzcdq zzcdqVar) {
        this.zzg = aVar;
        this.zzh = context;
        this.zzi = zzcdqVar;
        this.zza = zzdokVar;
        this.zzb = zzhcpVar;
        this.zzc = zzdsvVar;
        this.zzd = zzfmfVar;
        this.zze = zzdvlVar;
        this.zzf = zzdzoVar;
    }

    private final p8.p zzg(final zzfky zzfkyVar, final zzfkn zzfknVar, final JSONObject jSONObject) {
        C6.b bVar;
        zzcdu zzcduVarZza;
        zzbio zzbioVar = zzbix.zzcV;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzf, zzdzc.RENDERING_WEBVIEW_CREATION_START.zza());
        }
        final p8.p pVarZzb = this.zzd.zzb();
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzpr)).booleanValue()) {
            Context context = this.zzh;
            zzcduVarZza = zzdcu.zza(context, this.zzg, zzfknVar, this.zzi);
            bVar = new C6.b(context, zzcduVarZza);
        } else {
            zzcduVarZza = null;
            bVar = new C6.b(this.zzh, null);
        }
        final zzcdu zzcduVar = zzcduVarZza;
        final C6.b bVar2 = bVar;
        final p8.p pVarZza = this.zzc.zza(zzfkyVar, zzfknVar, jSONObject, bVar2, zzcduVar);
        return zzhcf.zzo(pVarZzb, pVarZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeok
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzf(pVarZza, pVarZzb, zzfkyVar, zzfknVar, jSONObject, bVar2, zzcduVar);
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final boolean zza(zzfky zzfkyVar, zzfkn zzfknVar) {
        zzfks zzfksVar = zzfknVar.zzs;
        return (zzfksVar == null || zzfksVar.zzc == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final p8.p zzb(final zzfky zzfkyVar, final zzfkn zzfknVar) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcU)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzf, zzdzc.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START.zza());
        }
        p8.p pVarZzb = this.zzd.zzb();
        zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeol
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzc(zzfknVar, (zzdvf) obj);
            }
        };
        zzhcp zzhcpVar = this.zzb;
        return zzhcf.zzj(zzhcf.zzj(pVarZzb, zzhbnVar, zzhcpVar), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeoh
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzd(zzfkyVar, zzfknVar, (JSONArray) obj);
            }
        }, zzhcpVar);
    }

    public final p8.p zzc(zzfkn zzfknVar, final zzdvf zzdvfVar) throws JSONException {
        zzbio zzbioVar = zzbix.zzcU;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzf, zzdzc.RENDERING_NATIVE_ADS_PREPROCESS_START.zza());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzkb)).booleanValue() && AbstractC3598c.i()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfknVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzhcf.zzj(zzdvfVar.zzc("google.afma.nativeAds.preProcessJson", jSONObject2), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeoi
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zze(zzdvfVar, (JSONObject) obj);
            }
        }, this.zzb);
    }

    public final p8.p zzd(zzfky zzfkyVar, zzfkn zzfknVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzhcf.zzc(new zzeel(3));
        }
        int i5 = zzfkyVar.zza.zza.zzl;
        if (i5 <= 1) {
            return zzhcf.zzk(zzg(zzfkyVar, zzfknVar, jSONArray.getJSONObject(0)), zzeoj.zza, this.zzb);
        }
        int length = jSONArray.length();
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcW)).booleanValue()) {
            this.zzf.zzd("nsl", String.valueOf(length));
        }
        this.zzd.zza(Math.min(length, i5));
        ArrayList arrayList = new ArrayList(i5);
        for (int i10 = 0; i10 < i5; i10++) {
            if (i10 < length) {
                arrayList.add(zzg(zzfkyVar, zzfknVar, jSONArray.getJSONObject(i10)));
            } else {
                arrayList.add(zzhcf.zzc(new zzeel(3)));
            }
        }
        return zzhcf.zza(arrayList);
    }

    public final p8.p zze(zzdvf zzdvfVar, JSONObject jSONObject) throws zzbue {
        this.zzd.zzc(zzhcf.zza(zzdvfVar));
        if (!jSONObject.optBoolean("success")) {
            throw new zzbue("process json failed");
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcU)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzf, zzdzc.RENDERING_NATIVE_ADS_PREPROCESS_END.zza());
        }
        return zzhcf.zza(jSONObject.getJSONObject("json").getJSONArray("ads"));
    }

    public final zzdpw zzf(p8.p pVar, p8.p pVar2, zzfky zzfkyVar, zzfkn zzfknVar, JSONObject jSONObject, C6.b bVar, zzcdu zzcduVar) throws Throwable {
        zzdqb zzdqbVar = (zzdqb) pVar.get();
        zzdvf zzdvfVar = (zzdvf) pVar2.get();
        zzbio zzbioVar = zzbix.zzcV;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzf, zzdzc.RENDERING_WEBVIEW_CREATION_END.zza());
        }
        zzdqc zzdqcVarZzd = this.zza.zzd(new zzcyq(zzfkyVar, zzfknVar, null), new zzdqm(zzdqbVar), new zzdox(jSONObject, zzdvfVar, bVar, zzcduVar));
        zzbiv zzbivVar = c0395s.f2492c;
        if (((Boolean) zzbivVar.zzd(zzbioVar)).booleanValue()) {
            C6.n.f1857D.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            zzdzo zzdzoVar = this.zzf;
            zzdzoVar.zzf(zzdzc.RENDERING_AD_COMPONENT_CREATION_END.zza(), jCurrentTimeMillis);
            zzdzoVar.zzf(zzdzc.RENDERING_CONFIGURE_WEBVIEW_START.zza(), jCurrentTimeMillis);
        }
        zzdqcVarZzd.zzi().zzb();
        zzdqcVarZzd.zzj().zza(zzdvfVar);
        zzdqcVarZzd.zzk().zza(zzdqbVar.zzT());
        zzdqcVarZzd.zzl().zza(this.zze, zzdqbVar.zzU());
        if (((Boolean) zzbivVar.zzd(zzbioVar)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzf, zzdzc.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
        return zzdqcVarZzd.zzh();
    }
}
