package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.G0;
import D6.z1;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class zzdcs extends G0 {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    private final zzemf zzh;
    private final Bundle zzi;
    private final double zzj;
    private final int zzk;

    public zzdcs(zzfkn zzfknVar, String str, zzemf zzemfVar, zzfkq zzfkqVar, String str2) throws JSONException {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
        String string = null;
        this.zzb = zzfknVar == null ? null : zzfknVar.zzab;
        this.zzc = str2;
        this.zzd = zzfkqVar == null ? null : zzfkqVar.zzb;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzfknVar != null) {
            try {
                string = zzfknVar.zzv.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = string != null ? string : str;
        this.zze = zzemfVar.zzh();
        this.zzh = zzemfVar;
        this.zzj = zzfknVar == null ? 0.0d : zzfknVar.zzaz;
        this.zzk = zzfknVar == null ? 2 : zzfknVar.zzaI;
        C6.n.f1857D.k.getClass();
        this.zzf = System.currentTimeMillis() / 1000;
        zzbio zzbioVar = zzbix.zzw;
        C0395s c0395s = C0395s.f2489e;
        boolean zBooleanValue = ((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue();
        zzbiv zzbivVar = c0395s.f2492c;
        if (zBooleanValue) {
            Bundle bundle = new Bundle();
            if (((Boolean) zzbivVar.zzd(zzbix.zzhQ)).booleanValue() && zzfkqVar != null) {
                bundle.putAll(zzfkqVar.zzk);
            }
            if (((Boolean) zzbivVar.zzd(zzbix.zzhR)).booleanValue() && zzfknVar != null) {
                bundle.putAll(zzfknVar.zzaF);
            }
            this.zzi = bundle;
        } else {
            if (!((Boolean) zzbivVar.zzd(zzbix.zzhQ)).booleanValue() || zzfkqVar == null) {
                this.zzi = new Bundle();
            } else {
                this.zzi = zzfkqVar.zzk;
            }
            if (((Boolean) zzbivVar.zzd(zzbix.zzhR)).booleanValue() && zzfknVar != null) {
                Bundle bundle2 = zzfknVar.zzaF;
                Bundle bundle3 = this.zzi;
                if (bundle3 != null) {
                    bundle3.putAll(bundle2);
                }
            }
        }
        this.zzg = (!((Boolean) zzbivVar.zzd(zzbix.zzkM)).booleanValue() || zzfkqVar == null || TextUtils.isEmpty(zzfkqVar.zzi)) ? "" : zzfkqVar.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // D6.H0
    public final String zze() {
        return this.zza;
    }

    @Override // D6.H0
    public final String zzf() {
        return this.zzb;
    }

    @Override // D6.H0
    public final List zzg() {
        return this.zze;
    }

    @Override // D6.H0
    public final z1 zzh() {
        zzemf zzemfVar = this.zzh;
        if (zzemfVar != null) {
            return zzemfVar.zzg();
        }
        return null;
    }

    @Override // D6.H0
    public final Bundle zzi() {
        return this.zzi;
    }

    @Override // D6.H0
    public final String zzj() {
        return this.zzc;
    }

    public final String zzk() {
        return this.zzd;
    }

    public final double zzl() {
        return this.zzj;
    }

    public final int zzm() {
        return this.zzk;
    }
}
