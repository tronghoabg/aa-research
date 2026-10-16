package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class zzdbg implements zzdgf, zzdls {
    private final Context zza;
    private final zzflg zzb;
    private final H6.a zzc;
    private final G6.N zzd;
    private final zzece zze;
    private final zzfqt zzf;
    private final zzecz zzg;

    public zzdbg(Context context, zzflg zzflgVar, H6.a aVar, G6.N n10, zzece zzeceVar, zzfqt zzfqtVar, zzecz zzeczVar) {
        this.zza = context;
        this.zzb = zzflgVar;
        this.zzc = aVar;
        this.zzd = n10;
        this.zze = zzeceVar;
        this.zzf = zzfqtVar;
        this.zzg = zzeczVar;
    }

    private final void zzc() throws JSONException {
        String strZze;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfb)).booleanValue()) {
            G6.N n10 = this.zzd;
            Context context = this.zza;
            H6.a aVar = this.zzc;
            zzflg zzflgVar = this.zzb;
            zzfqt zzfqtVar = this.zzf;
            zzecz zzeczVar = this.zzg;
            String str = zzflgVar.zzg;
            zzcff zzcffVarR = ((G6.O) n10).r();
            A2.d dVar = C6.n.f1857D.f1871l;
            boolean zZzs = zzeczVar.zzs();
            if (zzcffVarR != null) {
                dVar.getClass();
                strZze = zzcffVarR.zze();
            } else {
                strZze = null;
            }
            dVar.Q(context, aVar, false, zzcffVarR, strZze, str, null, zzfqtVar, null, null, zZzs);
        }
        this.zze.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zzd(N6.s sVar) throws JSONException {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfc)).booleanValue()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) throws JSONException {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdQ(zzfky zzfkyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zze(String str) {
    }
}
