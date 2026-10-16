package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzelt {
    private final Context zza;
    private final H6.a zzb;
    private final zzfkn zzc;
    private final zzclb zzd;
    private final zzdzt zze;
    private zzfvg zzf;

    public zzelt(Context context, H6.a aVar, zzfkn zzfknVar, zzclb zzclbVar, zzdzt zzdztVar) {
        this.zza = context;
        this.zzb = aVar;
        this.zzc = zzfknVar;
        this.zzd = zzclbVar;
        this.zze = zzdztVar;
    }

    public final synchronized boolean zza(boolean z2) {
        zzclb zzclbVar;
        zzfkn zzfknVar = this.zzc;
        if (zzfknVar.zzT) {
            zzbio zzbioVar = zzbix.zzgq;
            C0395s c0395s = C0395s.f2489e;
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                if (((Boolean) c0395s.f2492c.zzd(zzbix.zzgt)).booleanValue() && (zzclbVar = this.zzd) != null) {
                    if (this.zzf != null) {
                        int i5 = G6.L.f4523b;
                        H6.l.f("Omid javascript session service already started for ad.");
                        return false;
                    }
                    Context context = this.zza;
                    C6.n nVar = C6.n.f1857D;
                    if (!nVar.f1884y.zza(context)) {
                        int i10 = G6.L.f4523b;
                        H6.l.f("Unable to initialize omid.");
                        return false;
                    }
                    if (zzfknVar.zzV.zzb()) {
                        zzfvg zzfvgVarZzi = nVar.f1884y.zzi(this.zzb, zzclbVar.zzD(), true);
                        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzgu)).booleanValue()) {
                            zzdzt zzdztVar = this.zze;
                            String str = zzfvgVarZzi != null ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : "0";
                            zzdzs zzdzsVarZza = zzdztVar.zza();
                            zzdzsVarZza.zzc("omid_js_session_success", str);
                            zzdzsVarZza.zzd();
                        }
                        if (zzfvgVarZzi == null) {
                            int i11 = G6.L.f4523b;
                            H6.l.f("Unable to create javascript session service.");
                            return false;
                        }
                        int i12 = G6.L.f4523b;
                        H6.l.e("Created omid javascript session service.");
                        this.zzf = zzfvgVarZzi;
                        zzclbVar.zzal(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized boolean zzb() {
        return this.zzf != null;
    }

    public final synchronized void zzc() {
        zzclb zzclbVar;
        try {
            zzfvg zzfvgVar = this.zzf;
            if (zzfvgVar == null || (zzclbVar = this.zzd) == null) {
                return;
            }
            Iterator it = zzclbVar.zzF().iterator();
            while (it.hasNext()) {
                C6.n.f1857D.f1884y.zzk(zzfvgVar, (View) it.next());
            }
            zzclbVar.zze("onSdkLoaded", zzgww.zza());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd() {
        zzclb zzclbVar;
        if (this.zzf == null || (zzclbVar = this.zzd) == null) {
            return;
        }
        zzclbVar.zze("onSdkImpression", zzgww.zza());
    }

    public final synchronized void zze(zzfvf zzfvfVar) {
        zzclb zzclbVar;
        zzfvg zzfvgVar = this.zzf;
        if (zzfvgVar == null || (zzclbVar = this.zzd) == null) {
            return;
        }
        C6.n.f1857D.f1884y.zzj(zzfvgVar, zzfvfVar);
        this.zzf = null;
        zzclbVar.zzal(null);
    }

    public final synchronized void zzf(View view) {
        zzfvg zzfvgVar = this.zzf;
        if (zzfvgVar != null) {
            C6.n.f1857D.f1884y.zzk(zzfvgVar, view);
        }
    }
}
