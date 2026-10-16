package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.InterfaceC0358a;
import D6.K0;
import D6.v1;
import G6.U;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import p7.AbstractC3772b;
import u.AbstractC4159a;

/* loaded from: classes3.dex */
public final class zzdyy implements zzdib, InterfaceC0358a, zzddt, zzddd, zzdfu {
    private final Context zzc;
    private final zzflz zzd;
    private final zzdzt zze;
    private final zzfky zzf;
    private final zzfkn zzg;
    private final zzeko zzh;
    private final String zzi;
    private Boolean zzk;
    private long zzj = -1;
    final AtomicBoolean zza = new AtomicBoolean(false);
    final AtomicBoolean zzb = new AtomicBoolean(false);
    private final boolean zzl = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhS)).booleanValue();

    public zzdyy(Context context, zzflz zzflzVar, zzdzt zzdztVar, zzfky zzfkyVar, zzfkn zzfknVar, zzeko zzekoVar, String str) {
        this.zzc = context;
        this.zzd = zzflzVar;
        this.zze = zzdztVar;
        this.zzf = zzfkyVar;
        this.zzg = zzfknVar;
        this.zzh = zzekoVar;
        this.zzi = str;
    }

    private final boolean zzf() {
        String strM;
        if (this.zzk == null) {
            synchronized (this) {
                if (this.zzk == null) {
                    String str = (String) C0395s.f2489e.f2492c.zzd(zzbix.zzcj);
                    U u10 = C6.n.f1857D.f1863c;
                    try {
                        strM = U.M(this.zzc);
                    } catch (RemoteException unused) {
                        strM = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strM != null) {
                        try {
                            zMatches = Pattern.matches(str, strM);
                        } catch (RuntimeException e7) {
                            C6.n.f1857D.f1868h.zzh(e7, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzk = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzk.booleanValue();
    }

    private final zzdzs zzg(String str) {
        zzfky zzfkyVar = this.zzf;
        zzfkx zzfkxVar = zzfkyVar.zzb;
        zzdzs zzdzsVarZza = this.zze.zza();
        zzdzsVarZza.zza(zzfkxVar.zzb);
        zzfkn zzfknVar = this.zzg;
        zzdzsVarZza.zzb(zzfknVar);
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, str);
        zzdzsVarZza.zzc("ad_format", this.zzi.toUpperCase(Locale.ROOT));
        List list = zzfknVar.zzt;
        if (!list.isEmpty()) {
            zzdzsVarZza.zzc("ancn", (String) list.get(0));
        }
        if (zzfknVar.zzb()) {
            Context context = this.zzc;
            C6.n nVar = C6.n.f1857D;
            zzdzsVarZza.zzc("device_connectivity", true != nVar.f1868h.zzt(context) ? "offline" : AbstractC4159a.ONLINE_EXTRAS_KEY);
            nVar.k.getClass();
            zzdzsVarZza.zzc("event_timestamp", String.valueOf(System.currentTimeMillis()));
            zzdzsVarZza.zzc("offline_ad", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhZ)).booleanValue()) {
            boolean z2 = AbstractC3772b.b0(zzfkyVar.zza.zza) != 1;
            zzdzsVarZza.zzc("scar", String.valueOf(z2));
            if (z2) {
                v1 v1Var = zzfkyVar.zza.zza.zzd;
                zzdzsVarZza.zzc("ragent", v1Var.f2518p);
                zzdzsVarZza.zzc("rtype", AbstractC3772b.X(AbstractC3772b.Y(v1Var)));
            }
        }
        return zzdzsVarZza;
    }

    private final void zzi(zzdzs zzdzsVar) {
        if (!this.zzg.zzb()) {
            zzdzsVar.zzd();
            return;
        }
        String strZzg = zzdzsVar.zzg();
        C6.n.f1857D.k.getClass();
        this.zzh.zze(new zzekq(System.currentTimeMillis(), this.zzf.zzb.zzb.zzb, strZzg, 2));
    }

    private final boolean zzj() {
        int i5 = this.zzg.zzb;
        return i5 == 2 || i5 == 5 || i5 == 6 || i5 == 7;
    }

    @Override // D6.InterfaceC0358a
    public final void onAdClicked() {
        if (this.zzg.zzb()) {
            zzi(zzg("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zzc(K0 k02) {
        K0 k03;
        if (this.zzl) {
            zzdzs zzdzsVarZzg = zzg("ifts");
            zzdzsVarZzg.zzc("reason", "adapter");
            int i5 = k02.f2338a;
            if (k02.f2340c.equals(MobileAds.ERROR_DOMAIN) && (k03 = k02.f2341d) != null && !k03.f2340c.equals(MobileAds.ERROR_DOMAIN)) {
                k02 = k02.f2341d;
                i5 = k02.f2338a;
            }
            String str = k02.f2339b;
            if (i5 >= 0) {
                zzdzsVarZzg.zzc("arec", String.valueOf(i5));
            }
            String strZza = this.zzd.zza(str);
            if (strZza != null) {
                zzdzsVarZzg.zzc("areec", strZza);
            }
            zzdzsVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zzd(zzdnv zzdnvVar) {
        if (this.zzl) {
            zzdzs zzdzsVarZzg = zzg("ifts");
            zzdzsVarZzg.zzc("reason", "exception");
            if (!TextUtils.isEmpty(zzdnvVar.getMessage())) {
                zzdzsVarZzg.zzc("msg", zzdnvVar.getMessage());
            }
            zzdzsVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    public final void zzdH() {
        if (zzf()) {
            zzdzs zzdzsVarZzg = zzg("adapter_impression");
            zzdzsVarZzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzb.get()) {
                zzdzsVarZzg.zzc("po", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                C6.n.f1857D.k.getClass();
                zzdzsVarZzg.zzc("pil", String.valueOf(System.currentTimeMillis() - this.zzj));
            } else {
                zzdzsVarZzg.zzc("po", "0");
            }
            zzbio zzbioVar = zzbix.zzpl;
            C0395s c0395s = C0395s.f2489e;
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && zzj()) {
                U u10 = C6.n.f1857D.f1863c;
                zzdzsVarZzg.zzc("foreground", true != U.g(this.zzc) ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : "0");
                zzdzsVarZzg.zzc("fg_show", true != this.zza.get() ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            }
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzpm)).booleanValue() && zzj()) {
                zzdzsVarZzg.zzc("fg_al", true == C6.n.f1857D.f1867g.zzf() ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : "0");
            }
            zzdzsVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    public final void zzdI() {
        if (zzf()) {
            zzg("adapter_shown").zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final void zzdr() {
        if (zzf() || this.zzg.zzb()) {
            zzdzs zzdzsVarZzg = zzg("impression");
            zzdzsVarZzg.zzc("imp_type", String.valueOf(this.zzg.zze));
            if (this.zzj > 0) {
                C6.n.f1857D.k.getClass();
                zzdzsVarZzg.zzc("p_imp_l", String.valueOf(System.currentTimeMillis() - this.zzj));
            }
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzpl)).booleanValue() && zzj()) {
                U u10 = C6.n.f1857D.f1863c;
                zzdzsVarZzg.zzc("foreground", true != U.g(this.zzc) ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : "0");
                zzdzsVarZzg.zzc("fg_show", true == this.zza.get() ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : "0");
            }
            zzi(zzdzsVarZzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddd
    public final void zze() {
        if (this.zzl) {
            zzdzs zzdzsVarZzg = zzg("ifts");
            zzdzsVarZzg.zzc("reason", "blocked");
            zzdzsVarZzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfu
    public final void zzk() {
        if (zzf()) {
            this.zzb.set(true);
            C6.n nVar = C6.n.f1857D;
            nVar.k.getClass();
            this.zzj = System.currentTimeMillis();
            zzdzs zzdzsVarZzg = zzg("presentation");
            zzbio zzbioVar = zzbix.zzpl;
            C0395s c0395s = C0395s.f2489e;
            boolean zBooleanValue = ((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue();
            String str = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
            if (zBooleanValue && zzj()) {
                AtomicBoolean atomicBoolean = this.zza;
                atomicBoolean.set(!U.g(this.zzc));
                zzdzsVarZzg.zzc("foreground", true != atomicBoolean.get() ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            }
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzpm)).booleanValue() && zzj()) {
                if (true != nVar.f1867g.zzf()) {
                    str = "0";
                }
                zzdzsVarZzg.zzc("fg_al", str);
            }
            zzdzsVarZzg.zzd();
        }
    }
}
