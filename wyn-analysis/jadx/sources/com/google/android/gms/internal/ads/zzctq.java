package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.unity3d.services.UnityAdsConstants;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzctq {
    zzcah zza;
    zzcah zzb;
    private final Context zzc;
    private final G6.N zzd;
    private final zzelw zze;
    private final zzdwv zzf;
    private final zzhcp zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    public zzctq(Context context, G6.N n10, zzelw zzelwVar, zzdwv zzdwvVar, zzhcp zzhcpVar, zzhcp zzhcpVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = n10;
        this.zze = zzelwVar;
        this.zzf = zzdwvVar;
        this.zzg = zzhcpVar;
        this.zzh = zzhcpVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzc(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) C0395s.f2489e.f2492c.zzd(zzbix.zzlO));
    }

    private final p8.p zzk(final String str, final InputEvent inputEvent, Random random) {
        try {
            zzbio zzbioVar = zzbix.zzlO;
            C0395s c0395s = C0395s.f2489e;
            if (!str.contains((CharSequence) c0395s.f2492c.zzd(zzbioVar)) || ((G6.O) this.zzd).D()) {
                return zzhcf.zza(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) c0395s.f2492c.zzd(zzbix.zzlP), String.valueOf(random.nextInt(com.google.android.gms.common.api.f.API_PRIORITY_OTHER)));
            if (inputEvent != null) {
                return (zzhbx) zzhcf.zzh((zzhbx) zzhcf.zzj(zzhbx.zzw(this.zze.zza()), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzctk
                    @Override // com.google.android.gms.internal.ads.zzhbn
                    public final /* synthetic */ p8.p zza(Object obj) {
                        return this.zza.zze(builderBuildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzctl
                    @Override // com.google.android.gms.internal.ads.zzhbn
                    public final /* synthetic */ p8.p zza(Object obj) {
                        return this.zza.zzf(builderBuildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            builderBuildUpon.appendQueryParameter((String) c0395s.f2492c.zzd(zzbix.zzlQ), "11");
            return zzhcf.zza(builderBuildUpon.toString());
        } catch (Exception e7) {
            return zzhcf.zzc(e7);
        }
    }

    public final void zza(String str, zzfsm zzfsmVar, Random random, H6.q qVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzhcf.zzr(zzhcf.zzi(zzk(str, this.zzf.zzb(), random), ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzlU)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzctj(this, zzfsmVar, str, qVar), this.zzg);
    }

    public final p8.p zzb(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zzhcf.zza(str) : zzhcf.zzh(zzk(str, this.zzf.zzb(), random), Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzctp
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzd(str, (Throwable) obj);
            }
        }, this.zzg);
    }

    public final /* synthetic */ p8.p zzd(String str, final Throwable th) {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcto
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzh(th);
            }
        });
        return zzhcf.zza(str);
    }

    public final p8.p zze(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) C0395s.f2489e.f2492c.zzd(zzbix.zzlQ), "10");
            return zzhcf.zza(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        zzbio zzbioVar = zzbix.zzlR;
        C0395s c0395s = C0395s.f2489e;
        builderBuildUpon.appendQueryParameter((String) c0395s.f2492c.zzd(zzbioVar), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        builderBuildUpon.appendQueryParameter((String) c0395s.f2492c.zzd(zzbix.zzlQ), "12");
        if (str.contains((CharSequence) c0395s.f2492c.zzd(zzbix.zzlS))) {
            builderBuildUpon.authority((String) c0395s.f2492c.zzd(zzbix.zzlT));
        }
        return (zzhbx) zzhcf.zzj(zzhbx.zzw(this.zze.zzb(builderBuildUpon.build(), inputEvent)), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzctm
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final p8.p zza(Object obj) {
                String str2 = (String) C0395s.f2489e.f2492c.zzd(zzbix.zzlQ);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zzhcf.zza(builder2.toString());
            }
        }, this.zzh);
    }

    public final p8.p zzf(Uri.Builder builder, final Throwable th) {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(th);
            }
        });
        builder.appendQueryParameter((String) C0395s.f2489e.f2492c.zzd(zzbix.zzlQ), "9");
        return zzhcf.zza(builder.toString());
    }

    public final void zzg(Throwable th) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzlV)).booleanValue()) {
            zzcah zzcahVarZzc = zzcaf.zzc(this.zzc);
            this.zzb = zzcahVarZzc;
            zzcahVarZzc.zzh(th, "AttributionReporting");
        } else {
            zzcah zzcahVarZza = zzcaf.zza(this.zzc);
            this.zza = zzcahVarZza;
            zzcahVarZza.zzh(th, "AttributionReportingSampled");
        }
    }

    public final void zzh(Throwable th) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzlV)).booleanValue()) {
            zzcah zzcahVarZzc = zzcaf.zzc(this.zzc);
            this.zzb = zzcahVarZzc;
            zzcahVarZzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzcah zzcahVarZza = zzcaf.zza(this.zzc);
            this.zza = zzcahVarZza;
            zzcahVarZza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    public final /* synthetic */ Context zzi() {
        return this.zzc;
    }

    public final /* synthetic */ zzhcp zzj() {
        return this.zzg;
    }
}
