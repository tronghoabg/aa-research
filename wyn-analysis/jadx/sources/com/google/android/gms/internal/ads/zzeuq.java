package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.v1;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzeuq implements zzfcq {
    final zzflg zza;
    private final long zzb;
    private final long zzc;

    public zzeuq(zzflg zzflgVar, long j8, long j10) {
        this.zza = zzflgVar;
        this.zzb = j8;
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzflg zzflgVar = this.zza;
        v1 v1Var = zzflgVar.zzd;
        bundle.putInt("http_timeout_millis", v1Var.f2525w);
        bundle.putString("slotname", zzflgVar.zzg);
        int i5 = zzflgVar.zzp.zza;
        if (i5 == 0) {
            throw null;
        }
        int i10 = i5 - 1;
        if (i10 == 1) {
            bundle.putBoolean("is_new_rewarded", true);
        } else if (i10 == 2) {
            bundle.putBoolean("is_rewarded_interstitial", true);
        }
        long j8 = this.zzb;
        bundle.putLong("start_signals_timestamp", j8);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzpi)).booleanValue()) {
            bundle.putLong("tsi", j8 - this.zzc);
        }
        Bundle bundle2 = v1Var.f2506c;
        zzflv.zzd(bundle, "is_sdk_preload", true, bundle2.getBoolean("is_sdk_preload", false));
        zzflv.zzb(bundle, "prefetch_type", "zenith_v2", bundle2.getBoolean("zenith_v2", false));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.US);
        long j10 = v1Var.f2505b;
        zzflv.zzb(bundle, "cust_age", simpleDateFormat.format(new Date(j10)), j10 != -1);
        zzflv.zzf(bundle, HandleInvocationsFromAdViewer.KEY_EXTRAS, bundle2);
        int i11 = v1Var.f2507d;
        zzflv.zzc(bundle, "cust_gender", i11, i11 != -1);
        zzflv.zzg(bundle, "kw", v1Var.f2508e);
        int i12 = v1Var.f2510g;
        zzflv.zzc(bundle, "tag_for_child_directed_treatment", i12, i12 != -1);
        if (v1Var.f2509f) {
            bundle.putBoolean("test_request", true);
        }
        bundle.putInt("ppt_p13n", v1Var.f2527y);
        int i13 = v1Var.f2504a;
        zzflv.zzc(bundle, "d_imp_hdr", 1, i13 >= 2 && v1Var.f2511h);
        String str = v1Var.f2512i;
        zzflv.zzb(bundle, "ppid", str, i13 >= 2 && !TextUtils.isEmpty(str));
        Location location = v1Var.k;
        if (location != null) {
            float accuracy = location.getAccuracy() * 1000.0f;
            long time = location.getTime() * 1000;
            double latitude = location.getLatitude() * 1.0E7d;
            double longitude = 1.0E7d * location.getLongitude();
            Bundle bundle3 = new Bundle();
            bundle3.putFloat("radius", accuracy);
            bundle3.putLong("lat", (long) latitude);
            bundle3.putLong("long", (long) longitude);
            bundle3.putLong("time", time);
            bundle.putBundle("uule", bundle3);
        }
        zzflv.zze(bundle, "url", v1Var.f2514l);
        zzflv.zzg(bundle, "neighboring_content_urls", v1Var.f2524v);
        zzflv.zzf(bundle, "custom_targeting", v1Var.f2516n);
        zzflv.zzg(bundle, "category_exclusions", v1Var.f2517o);
        zzflv.zze(bundle, "request_agent", v1Var.f2518p);
        zzflv.zze(bundle, "request_pkg", v1Var.f2519q);
        zzflv.zzd(bundle, "is_designed_for_families", v1Var.f2520r, i13 >= 7);
        if (i13 >= 8) {
            int i14 = v1Var.f2522t;
            zzflv.zzc(bundle, "tag_for_under_age_of_consent", i14, i14 != -1);
            zzflv.zze(bundle, "max_ad_content_rating", v1Var.f2523u);
        }
        int i15 = v1Var.f2502B;
        zzflv.zzc(bundle, "tfat", i15, i15 != -1);
        Bundle bundle4 = zzflgVar.zze;
        zzflv.zzh(bundle, "plcs", Integer.valueOf(bundle4.getInt("plcs")));
        zzflv.zzh(bundle, "plbs", Integer.valueOf(bundle4.getInt("plbs")));
        zzflv.zze(bundle, "plid", bundle4.getString("plid"));
        zzflv.zzc(bundle, "s2s_rr", 1, zzflgVar.zzv && !(v1Var.f2521s == null && v1Var.f2526x == null));
    }
}
