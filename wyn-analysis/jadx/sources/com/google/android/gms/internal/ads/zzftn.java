package com.google.android.gms.internal.ads;

import D6.K0;
import android.content.Context;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;
import java.util.Map;
import x6.EnumC4471b;

/* loaded from: classes3.dex */
public final class zzftn {
    private final zzdzt zza;

    public zzftn(zzdzt zzdztVar, Context context) {
        this.zza = zzdztVar;
    }

    private final void zzw(String str, long j8, String str2, String str3, EnumC4471b enumC4471b, int i5, int i10, int i11, String str4) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, str);
        zzdzsVarZza.zzc("pat", Long.toString(j8));
        zzdzsVarZza.zzc("ad_format", enumC4471b.name().toLowerCase(Locale.ENGLISH));
        zzdzsVarZza.zzc("max_ads", Integer.toString(i5));
        zzdzsVarZza.zzc("cache_size", Integer.toString(i10));
        zzdzsVarZza.zzc("pas", Integer.toString(i11));
        zzdzsVarZza.zzc("pv", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
        zzdzsVarZza.zzc("ad_unit_id", str3);
        zzdzsVarZza.zzc("pid", str2);
        zzdzsVarZza.zzd();
    }

    private final void zzx(String str, String str2, long j8, int i5, int i10, String str3, zzftu zzftuVar, String str4) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc(str2, Long.toString(j8));
        if (zzftuVar != null) {
            zzdzsVarZza.zzc("ad_unit_id", zzftuVar.zza());
            zzdzsVarZza.zzc("ad_format", zzftuVar.zzb());
            zzdzsVarZza.zzc("pid", zzftuVar.zzc());
        }
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, str);
        if (str3 != null) {
            zzdzsVarZza.zzc("gqi", str3);
        }
        if (i5 >= 0) {
            zzdzsVarZza.zzc("max_ads", Integer.toString(i5));
        }
        if (i10 >= 0) {
            zzdzsVarZza.zzc("cache_size", Integer.toString(i10));
        }
        zzdzsVarZza.zzc("pv", str4);
        zzdzsVarZza.zzd();
    }

    private final void zzy(String str, long j8, String str2, String str3, EnumC4471b enumC4471b, int i5, int i10, int i11, int i12, int i13) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, str);
        zzdzsVarZza.zzc("pat", Long.toString(j8));
        zzdzsVarZza.zzc("pid", str2);
        zzdzsVarZza.zzc("ad_unit_id", str3);
        zzdzsVarZza.zzc("max_ads", Integer.toString(i5));
        zzdzsVarZza.zzc("cache_size", Integer.toString(i10));
        zzdzsVarZza.zzc("tpcnt", Integer.toString(i12));
        zzdzsVarZza.zzc("mpl", Integer.toString(i13));
        if (enumC4471b != null) {
            zzdzsVarZza.zzc("ad_format", enumC4471b.name().toLowerCase(Locale.ENGLISH));
        }
        if (i11 > 0) {
            zzdzsVarZza.zzc("nptr", Integer.toString(i11));
        }
        zzdzsVarZza.zzd();
    }

    public final void zza(int i5, long j8, zzftu zzftuVar, String str) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "start_preload");
        zzdzsVarZza.zzc("sp_ts", Long.toString(j8));
        zzdzsVarZza.zzc("ad_format", zzftuVar.zzb());
        zzdzsVarZza.zzc("ad_unit_id", zzftuVar.zza());
        zzdzsVarZza.zzc("pid", zzftuVar.zzc());
        zzdzsVarZza.zzc("max_ads", Integer.toString(i5));
        zzdzsVarZza.zzc("pv", str);
        zzdzsVarZza.zzd();
    }

    public final void zzb(Map map, long j8, String str) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "start_preload");
        zzdzsVarZza.zzc("sp_ts", Long.toString(j8));
        zzdzsVarZza.zzc("pv", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        for (EnumC4471b enumC4471b : map.keySet()) {
            String strValueOf = String.valueOf(enumC4471b.name().toLowerCase(Locale.ENGLISH));
            zzdzsVarZza.zzc(strValueOf.concat("_count"), Integer.toString(((Integer) map.get(enumC4471b)).intValue()));
        }
        zzdzsVarZza.zzd();
    }

    public final void zzc(int i5, int i10, long j8, zzftu zzftuVar) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "cache_resize");
        zzdzsVarZza.zzc("cs_ts", Long.toString(j8));
        zzdzsVarZza.zzc("orig_ma", Integer.toString(i5));
        zzdzsVarZza.zzc("max_ads", Integer.toString(i10));
        zzdzsVarZza.zzc("ad_format", zzftuVar.zzb());
        zzdzsVarZza.zzc("ad_unit_id", zzftuVar.zza());
        zzdzsVarZza.zzc("pid", zzftuVar.zzc());
        zzdzsVarZza.zzc("pv", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        zzdzsVarZza.zzd();
    }

    public final void zzd(int i5, int i10, long j8, Long l10, String str, zzftu zzftuVar, String str2) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc("plaac_ts", Long.toString(j8));
        zzdzsVarZza.zzc("max_ads", Integer.toString(i5));
        zzdzsVarZza.zzc("cache_size", Integer.toString(i10));
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "is_ad_available");
        if (zzftuVar != null) {
            zzdzsVarZza.zzc("ad_unit_id", zzftuVar.zza());
            zzdzsVarZza.zzc("pid", zzftuVar.zzc());
            zzdzsVarZza.zzc("ad_format", zzftuVar.zzb());
        }
        if (l10 != null) {
            zzdzsVarZza.zzc("plaay_ts", Long.toString(l10.longValue()));
        }
        if (str != null) {
            zzdzsVarZza.zzc("gqi", str);
        }
        zzdzsVarZza.zzc("pv", str2);
        zzdzsVarZza.zzd();
    }

    public final void zze(long j8, String str) {
        zzx("poll_ad", "ppacwe_ts", j8, -1, -1, null, null, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
    }

    public final void zzf(long j8, zzftu zzftuVar, int i5, int i10, String str) {
        zzx("poll_ad", "ppac_ts", j8, i5, i10, null, zzftuVar, str);
    }

    public final void zzg(long j8, int i5, int i10, String str, zzftu zzftuVar, String str2) {
        zzx("poll_ad", "psvroc_ts", j8, i5, i10, str, zzftuVar, str2);
    }

    public final void zzh(long j8, int i5, int i10, String str, zzftu zzftuVar, String str2) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc("ppla_ts", Long.toString(j8));
        zzdzsVarZza.zzc("ad_format", zzftuVar.zzb());
        zzdzsVarZza.zzc("ad_unit_id", zzftuVar.zza());
        zzdzsVarZza.zzc("pid", zzftuVar.zzc());
        zzdzsVarZza.zzc("max_ads", Integer.toString(i5));
        zzdzsVarZza.zzc("cache_size", Integer.toString(i10));
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "poll_ad");
        if (str != null) {
            zzdzsVarZza.zzc("gqi", str);
        }
        zzdzsVarZza.zzc("pv", str2);
        zzdzsVarZza.zzd();
    }

    public final void zzi(long j8, String str, zzftu zzftuVar, int i5, int i10, String str2) {
        zzx("paa", "pano_ts", j8, i5, i10, str, zzftuVar, str2);
    }

    public final void zzj(long j8, zzftu zzftuVar, int i5, String str) {
        zzx("pae", "paeo_ts", j8, i5, 0, null, zzftuVar, str);
    }

    public final void zzk(long j8, zzftu zzftuVar, K0 k02, int i5, int i10, String str) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "pftla");
        zzdzsVarZza.zzc("pftlat_ts", Long.toString(j8));
        zzdzsVarZza.zzc("pftlaec", Integer.toString(k02.f2338a));
        zzdzsVarZza.zzc("ad_format", zzftuVar.zzb());
        zzdzsVarZza.zzc("max_ads", Integer.toString(i5));
        zzdzsVarZza.zzc("cache_size", Integer.toString(i10));
        zzdzsVarZza.zzc("ad_unit_id", zzftuVar.zza());
        zzdzsVarZza.zzc("pid", zzftuVar.zzc());
        zzdzsVarZza.zzc("pv", str);
        zzdzsVarZza.zzd();
    }

    public final void zzl(long j8, EnumC4471b enumC4471b, int i5) {
        zzw("pda", j8, null, null, enumC4471b, -1, -1, i5, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
    }

    public final void zzm(long j8, String str, String str2, EnumC4471b enumC4471b, int i5, int i10) {
        zzw("pd", j8, str, str2, enumC4471b, i5, i10, 1, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
    }

    public final void zzn(EnumC4471b enumC4471b, long j8, int i5) {
        zzw("pgcs", j8, null, null, enumC4471b, -1, -1, i5, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
    }

    public final void zzo(long j8, String str, String str2, EnumC4471b enumC4471b, int i5, int i10) {
        zzw("pgc", j8, str, str2, enumC4471b, i5, i10, 1, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
    }

    public final void zzp(int i5, long j8, String str, String str2, EnumC4471b enumC4471b, int i10) {
        zzw("pnav", j8, str, str2, enumC4471b, i10, i5, 1, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
    }

    public final void zzq(long j8, String str, String str2, EnumC4471b enumC4471b, int i5, int i10, int i11, int i12) {
        zzy("acmpa", j8, str, str2, enumC4471b, i5, i10, 0, i11, i12);
    }

    public final void zzr(long j8, String str, String str2, EnumC4471b enumC4471b, int i5, int i10, int i11, int i12, int i13) {
        zzy("acmpr", j8, str, str2, enumC4471b, i5, i10, i11, i12, i13);
    }

    public final void zzs(long j8, int i5, int i10) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "acmlr");
        zzdzsVarZza.zzc("pat", Long.toString(j8));
        zzdzsVarZza.zzc("mpl", Integer.toString(i5));
        zzdzsVarZza.zzc("pas", Integer.toString(i10));
        zzdzsVarZza.zzd();
    }

    public final void zzt(long j8, long j10, long j11, long j12, long j13) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "iic");
        zzdzsVarZza.zzc("pat", Long.toString(j8));
        zzdzsVarZza.zzc("bot", Long.toString(j10));
        zzdzsVarZza.zzc("cim", Long.toString(j11));
        zzdzsVarZza.zzc("mbot", Long.toString(j12));
        zzdzsVarZza.zzc("mim", Long.toString(j13));
        zzdzsVarZza.zzd();
    }

    public final void zzu(long j8, EnumC4471b enumC4471b, String str, String str2) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "poact");
        zzdzsVarZza.zzc("ad_unit_id", str2);
        zzdzsVarZza.zzc("pid", str);
        zzdzsVarZza.zzc("poact_ts", Long.toString(j8));
        if (enumC4471b != null) {
            zzdzsVarZza.zzc("ad_format", enumC4471b.name().toLowerCase(Locale.ENGLISH));
        }
        zzdzsVarZza.zzd();
    }

    public final void zzv(long j8, EnumC4471b enumC4471b, String str, String str2) {
        zzdzs zzdzsVarZza = this.zza.zza();
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "poac");
        zzdzsVarZza.zzc("ad_unit_id", str2);
        zzdzsVarZza.zzc("pid", str);
        if (enumC4471b != null) {
            zzdzsVarZza.zzc("ad_format", enumC4471b.name().toLowerCase(Locale.ENGLISH));
        }
        zzdzsVarZza.zzd();
    }
}
