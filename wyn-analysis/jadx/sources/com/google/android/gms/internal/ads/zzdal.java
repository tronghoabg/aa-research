package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzdal implements zzdgf, zzdls {
    private zzcbd zza;
    private final Context zzc;
    private final zzfqt zzd;
    private final H6.a zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    public zzdal(Context context, zzfqt zzfqtVar, H6.a aVar, Executor executor) {
        this.zzc = context;
        this.zzd = zzfqtVar;
        this.zze = aVar;
        this.zzf = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc() {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.zzb
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto Lb
            goto La9
        Lb:
            com.google.android.gms.internal.ads.zzbkh r0 = com.google.android.gms.internal.ads.zzbkx.zzo
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 2
            if (r0 == 0) goto L1c
        L1a:
            r3 = r2
            goto L6a
        L1c:
            com.google.android.gms.internal.ads.zzbkh r0 = com.google.android.gms.internal.ads.zzbkx.zzp
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 3
            if (r0 == 0) goto L2c
            goto L6a
        L2c:
            com.google.android.gms.internal.ads.zzbkh r0 = com.google.android.gms.internal.ads.zzbkx.zzn
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3c
        L3a:
            r3 = r1
            goto L6a
        L3c:
            C6.n r0 = C6.n.f1857D
            com.google.android.gms.internal.ads.zzcfk r0 = r0.f1868h
            G6.N r0 = r0.zzp()
            G6.O r0 = (G6.O) r0
            com.google.android.gms.internal.ads.zzcff r0 = r0.r()
            java.lang.String r0 = r0.zzd()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3a
            r4.<init>(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "local_flag_write"
            java.lang.String r0 = r4.optString(r0)     // Catch: org.json.JSONException -> L3a
            java.lang.String r4 = "client"
            boolean r4 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r4 == 0) goto L62
            goto L1a
        L62:
            java.lang.String r4 = "service"
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch: org.json.JSONException -> L3a
            if (r0 == 0) goto L3a
        L6a:
            int r3 = r3 + (-1)
            if (r3 == r1) goto L82
            if (r3 == r2) goto L71
            goto La9
        L71:
            android.content.Context r0 = r6.zzc
            com.google.android.gms.internal.ads.zzfqt r2 = r6.zzd
            C6.n r3 = C6.n.f1857D
            com.google.android.gms.internal.ads.zzbug r3 = r3.f1877r
            H6.a r4 = H6.a.V()
            com.google.android.gms.internal.ads.zzbup r0 = r3.zza(r0, r4, r2)
            goto L92
        L82:
            android.content.Context r0 = r6.zzc
            com.google.android.gms.internal.ads.zzfqt r2 = r6.zzd
            C6.n r3 = C6.n.f1857D
            com.google.android.gms.internal.ads.zzbug r3 = r3.f1877r
            H6.a r4 = H6.a.V()
            com.google.android.gms.internal.ads.zzbup r0 = r3.zzb(r0, r4, r2)
        L92:
            java.lang.String r2 = "google.afma.sdkConstants.getSdkConstants"
            com.google.android.gms.internal.ads.zzbuj r3 = com.google.android.gms.internal.ads.zzbum.zza
            com.google.android.gms.internal.ads.zzbuf r0 = r0.zza(r2, r3, r3)
            android.content.Context r2 = r6.zzc
            H6.a r3 = r6.zze
            java.util.concurrent.Executor r4 = r6.zzf
            com.google.android.gms.internal.ads.zzcbg r5 = new com.google.android.gms.internal.ads.zzcbg
            r5.<init>(r2, r0, r3, r4)
            r6.zza = r5
            r6.zzg = r1
        La9:
            boolean r0 = r6.zzg
            if (r0 != 0) goto Lae
            goto Ld9
        Lae:
            com.google.android.gms.internal.ads.zzcbd r0 = r6.zza
            if (r0 == 0) goto Ld9
            p8.p r0 = r0.zzb()
            boolean r1 = r6.zzh
            if (r1 != 0) goto Ld2
            com.google.android.gms.internal.ads.zzbkh r1 = com.google.android.gms.internal.ads.zzbkp.zzi
            java.lang.Object r1 = r1.zze()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Ld2
            com.google.android.gms.internal.ads.zzdak r1 = new com.google.android.gms.internal.ads.zzdak
            r1.<init>()
            java.util.concurrent.Executor r2 = r6.zzf
            r0.addListener(r1, r2)
        Ld2:
            java.lang.String r1 = "persistFlagsClient"
            com.google.android.gms.internal.ads.zzhcp r2 = com.google.android.gms.internal.ads.zzcfy.zzh
            com.google.android.gms.internal.ads.zzcgb.zza(r0, r1, r2)
        Ld9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdal.zzc():void");
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zzd(N6.s sVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdQ(zzfky zzfkyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zze(String str) {
        zzc();
    }

    public final /* synthetic */ void zzf() {
        zzbii.zze(this.zzc);
        this.zzh = true;
    }
}
