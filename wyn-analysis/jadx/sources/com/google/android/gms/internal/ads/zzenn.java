package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.Executor;
import p9.C3778C;

/* loaded from: classes3.dex */
public final class zzenn implements zzema {
    private final Context zza;
    private final zzdno zzb;
    private final Executor zzc;
    private final zzfkm zzd;
    private final zzdzt zze;

    public zzenn(Context context, Executor executor, zzdno zzdnoVar, zzfkm zzfkmVar, zzdzt zzdztVar) {
        this.zza = context;
        this.zzb = zzdnoVar;
        this.zzc = executor;
        this.zzd = zzfkmVar;
        this.zze = zzdztVar;
    }

    private static String zze(zzfkn zzfknVar) {
        try {
            return zzfknVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final boolean zza(zzfky zzfkyVar, zzfkn zzfknVar) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbjy.zza(context) && !TextUtils.isEmpty(zze(zzfknVar));
    }

    @Override // com.google.android.gms.internal.ads.zzema
    public final p8.p zzb(final zzfky zzfkyVar, final zzfkn zzfknVar) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoN)).booleanValue()) {
            zzdzs zzdzsVarZza = this.zze.zza();
            zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "cstm_tbs_rndr");
            zzdzsVarZza.zzd();
        }
        String strZze = zze(zzfknVar);
        final Uri uri = strZze != null ? Uri.parse(strZze) : null;
        final zzfkq zzfkqVar = zzfkyVar.zzb.zzb;
        return zzhcf.zzj(zzhcf.zza(null), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzenm
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzc(uri, zzfkyVar, zzfknVar, zzfkqVar, obj);
            }
        }, this.zzc);
    }

    public final p8.p zzc(Uri uri, zzfky zzfkyVar, zzfkn zzfknVar, zzfkq zzfkqVar, Object obj) {
        try {
            Intent intent = new C3778C().b().f46072a;
            intent.setData(uri);
            F6.e eVar = new F6.e(intent, null);
            zzcgd zzcgdVar = new zzcgd();
            zzdmi zzdmiVarZzd = this.zzb.zzd(new zzcyq(zzfkyVar, zzfknVar, null), new zzdml(new zzenl(this, zzcgdVar, zzfknVar), null));
            zzcgdVar.zzc(new AdOverlayInfoParcel(eVar, null, zzdmiVarZzd.zzi(), null, new H6.a(0, 0, false, false), null, null, zzfkqVar.zzb));
            this.zzd.zzd();
            return zzhcf.zza(zzdmiVarZzd.zzh());
        } catch (Throwable th) {
            int i5 = G6.L.f4523b;
            H6.l.d("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }

    public final /* synthetic */ zzdzt zzd() {
        return this.zze;
    }
}
