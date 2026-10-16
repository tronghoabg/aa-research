package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import cb.AbstractC1593a;
import j$.util.Objects;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzeps implements zzhbn {
    private final zzfps zza;
    private final zzddb zzb;
    private final zzfsi zzc;
    private final zzfsm zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcyd zzg;
    private final zzepl zzh;
    private final zzemf zzi;
    private final Context zzj;
    private final zzfqq zzk;
    private final zzeov zzl;
    private final zzdzo zzm;

    public zzeps(Context context, zzfps zzfpsVar, zzepl zzeplVar, zzddb zzddbVar, zzfsi zzfsiVar, zzfsm zzfsmVar, zzcyd zzcydVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzemf zzemfVar, zzfqq zzfqqVar, zzeov zzeovVar, zzdzo zzdzoVar) {
        this.zzj = context;
        this.zza = zzfpsVar;
        this.zzh = zzeplVar;
        this.zzb = zzddbVar;
        this.zzc = zzfsiVar;
        this.zzd = zzfsmVar;
        this.zzg = zzcydVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzemfVar;
        this.zzk = zzfqqVar;
        this.zzl = zzeovVar;
        this.zzm = zzdzoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String zzb(com.google.android.gms.internal.ads.zzfky r6) {
        /*
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zzgH
            D6.s r1 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r2 = r1.f2492c
            java.lang.Object r0 = r2.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r2 = "No fill."
            r3 = 1
            if (r3 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r2
        L19:
            com.google.android.gms.internal.ads.zzfkx r6 = r6.zzb
            com.google.android.gms.internal.ads.zzfkq r6 = r6.zzb
            int r3 = r6.zzf
            if (r3 == 0) goto L59
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 300(0x12c, float:4.2E-43)
            if (r3 < r4) goto L3a
            if (r3 >= r5) goto L3a
            com.google.android.gms.internal.ads.zzbio r3 = com.google.android.gms.internal.ads.zzbix.zzgG
            com.google.android.gms.internal.ads.zzbiv r1 = r1.f2492c
            java.lang.Object r1 = r1.zzd(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L59
            goto L5a
        L3a:
            if (r3 < r5) goto L43
            r0 = 400(0x190, float:5.6E-43)
            if (r3 >= r0) goto L43
            java.lang.String r2 = "No location header to follow redirect or too many redirects."
            goto L5a
        L43:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 35
            r1.<init>(r0)
            java.lang.String r0 = "Received error HTTP response code: "
            java.lang.String r2 = N0.a.d(r3, r0, r1)
            goto L5a
        L59:
            r2 = r0
        L5a:
            com.google.android.gms.internal.ads.zzfkp r6 = r6.zzj
            if (r6 == 0) goto L63
            java.lang.String r6 = r6.zza()
            return r6
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeps.zzb(com.google.android.gms.internal.ads.zzfky):java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final p8.p zza(Object obj) throws Exception {
        int i5;
        Bundle bundle;
        final zzfky zzfkyVar = (zzfky) obj;
        zzbio zzbioVar = zzbix.zzcS;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && (bundle = zzfkyVar.zzb.zzd) != null) {
            this.zzm.zzg(bundle);
        }
        zzbio zzbioVar2 = zzbix.zzcT;
        zzbiv zzbivVar = c0395s.f2492c;
        if (((Boolean) zzbivVar.zzd(zzbioVar2)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzm, zzdzc.RENDERING_START.zza());
        }
        String strZzb = zzb(zzfkyVar);
        zzemf zzemfVar = this.zzi;
        zzfkx zzfkxVar = zzfkyVar.zzb;
        zzfkq zzfkqVar = zzfkxVar.zzb;
        zzemfVar.zza(zzfkqVar);
        if (((Boolean) zzbivVar.zzd(zzbix.zzjI)).booleanValue() && (i5 = zzfkqVar.zzf) != 0 && (i5 < 200 || i5 >= 300)) {
            return zzhcf.zzc(new zzepp(3, strZzb));
        }
        String str = zzfkqVar.zzq;
        if (!((Boolean) zzbivVar.zzd(zzbix.zzeE)).booleanValue() || TextUtils.isEmpty(str)) {
            for (zzfkn zzfknVar : zzfkxVar.zza) {
                zzemfVar.zzb(zzfknVar);
                Iterator it = zzfknVar.zza.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzemfVar.zze(zzfknVar, 0L, zzfmi.zzd(1, null, null));
                        break;
                    }
                    zzema zzemaVarZza = this.zzg.zza(zzfknVar.zzb, (String) it.next());
                    if (zzemaVarZza == null || !zzemaVarZza.zza(zzfkyVar, zzfknVar)) {
                    }
                }
            }
        } else {
            zzemfVar.zzc(str, zzfkxVar.zza);
        }
        zzddb zzddbVar = this.zzb;
        zzctu zzctuVar = new zzctu(zzfkyVar, this.zzd, this.zzc);
        Executor executor = this.zze;
        zzddbVar.zzq(zzctuVar, executor);
        if (zzfkqVar.zzr > 1) {
            return this.zzl.zza(zzfkyVar);
        }
        String strZzb2 = zzb(zzfkyVar);
        zzfps zzfpsVar = this.zza;
        zzfpm zzfpmVar = zzfpm.RENDER_CONFIG_INIT;
        Objects.requireNonNull(zzfpsVar);
        zzfoz zzfozVarZzi = zzfpd.zza(zzhcf.zzc(new zzepp(3, strZzb2)), zzfpmVar, zzfpsVar).zzi();
        final zzepl zzeplVar = this.zzh;
        zzeplVar.zza();
        int i10 = 0;
        for (final zzfkn zzfknVar2 : zzfkxVar.zza) {
            Iterator it2 = zzfknVar2.zza.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                final zzema zzemaVarZza2 = this.zzg.zza(zzfknVar2.zzb, str2);
                if (zzemaVarZza2 != null && zzemaVarZza2.zza(zzfkyVar, zzfknVar2)) {
                    zzfpj zzfpjVarZza = zzfpsVar.zza(zzfpm.RENDER_CONFIG_WATERFALL, zzfozVarZzi);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15 + String.valueOf(str2).length());
                    sb2.append("render-config-");
                    sb2.append(i10);
                    sb2.append("-");
                    sb2.append(str2);
                    zzfozVarZzi = zzfpjVarZza.zza(sb2.toString()).zzg(Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzepr
                        @Override // com.google.android.gms.internal.ads.zzhbn
                        public final /* synthetic */ p8.p zza(Object obj2) {
                            return this.zza.zzc(zzfknVar2, zzfkyVar, zzemaVarZza2, (Throwable) obj2);
                        }
                    }).zzi();
                    break;
                }
            }
            i10++;
        }
        zzfozVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzepq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzeplVar.zzb();
            }
        }, executor);
        return zzfozVarZzi;
    }

    public final /* synthetic */ p8.p zzc(zzfkn zzfknVar, zzfky zzfkyVar, zzema zzemaVar, Throwable th) {
        zzfqg zzfqgVarA = u.a(this.zzj, 12);
        zzfqgVarA.zzi(zzfknVar.zzE);
        zzfqgVarA.zza();
        p8.p pVarZzi = zzhcf.zzi(zzemaVar.zzb(zzfkyVar, zzfknVar), zzfknVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zze(zzfkyVar, zzfknVar, pVarZzi, this.zzc);
        zzfqp.zzd(pVarZzi, this.zzk, zzfqgVarA);
        return pVarZzi;
    }
}
