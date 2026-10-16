package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzfsi {
    private final zzepl zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfkz zzf;
    private final zzfla zzg;
    private final InterfaceC3596a zzh;
    private final zzbaw zzi;

    public zzfsi(zzepl zzeplVar, H6.a aVar, String str, String str2, Context context, zzfkz zzfkzVar, zzfla zzflaVar, InterfaceC3596a interfaceC3596a, zzbaw zzbawVar) {
        this.zza = zzeplVar;
        this.zzb = aVar.f4927a;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfkzVar;
        this.zzg = zzflaVar;
        this.zzh = interfaceC3596a;
        this.zzi = zzbawVar;
    }

    public static String zzd(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzg(String str) {
        return TextUtils.isEmpty(str) ? "" : H6.i.c() ? "fakeForAdDebugLog" : str;
    }

    public final List zza(zzfky zzfkyVar, zzfkn zzfknVar, List list) {
        return zzb(zzfkyVar, zzfknVar, false, "", "", list, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzb(com.google.android.gms.internal.ads.zzfky r18, com.google.android.gms.internal.ads.zzfkn r19, boolean r20, java.lang.String r21, java.lang.String r22, java.util.List r23, com.google.android.gms.internal.ads.zzdbv r24, com.google.android.gms.internal.ads.zzcfl r25) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsi.zzb(com.google.android.gms.internal.ads.zzfky, com.google.android.gms.internal.ads.zzfkn, boolean, java.lang.String, java.lang.String, java.util.List, com.google.android.gms.internal.ads.zzdbv, com.google.android.gms.internal.ads.zzcfl):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[LOOP:0: B:13:0x005f->B:15:0x0065, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzc(com.google.android.gms.internal.ads.zzfkn r11, java.util.List r12, com.google.android.gms.internal.ads.zzcbw r13) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            n7.a r1 = r10.zzh
            n7.b r1 = (n7.C3597b) r1
            r1.getClass()
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = r13.zzb()     // Catch: android.os.RemoteException -> Lb0
            int r13 = r13.zzc()     // Catch: android.os.RemoteException -> Lb0
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch: android.os.RemoteException -> Lb0
            com.google.android.gms.internal.ads.zzbio r4 = com.google.android.gms.internal.ads.zzbix.zzeC
            D6.s r5 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r5 = r5.f2492c
            java.lang.Object r4 = r5.zzd(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L3e
            com.google.android.gms.internal.ads.zzfla r4 = r10.zzg
            if (r4 != 0) goto L37
            com.google.android.gms.internal.ads.zzgtp r4 = com.google.android.gms.internal.ads.zzgtp.zzc()
            goto L41
        L37:
            com.google.android.gms.internal.ads.zzfkz r4 = r4.zza
        L39:
            com.google.android.gms.internal.ads.zzgtp r4 = com.google.android.gms.internal.ads.zzgtp.zzd(r4)
            goto L41
        L3e:
            com.google.android.gms.internal.ads.zzfkz r4 = r10.zzf
            goto L39
        L41:
            com.google.android.gms.internal.ads.zzfsh r5 = com.google.android.gms.internal.ads.zzfsh.zza
            com.google.android.gms.internal.ads.zzgtp r5 = r4.zzb(r5)
            java.lang.String r6 = ""
            java.lang.Object r5 = r5.zza(r6)
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.gms.internal.ads.zzfsg r7 = com.google.android.gms.internal.ads.zzfsg.zza
            com.google.android.gms.internal.ads.zzgtp r4 = r4.zzb(r7)
            java.lang.Object r4 = r4.zza(r6)
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r12 = r12.iterator()
        L5f:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto Laf
            java.lang.Object r6 = r12.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = android.net.Uri.encode(r5)
            java.lang.String r8 = "@gw_rwd_userid@"
            java.lang.String r6 = zzd(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r4)
            java.lang.String r8 = "@gw_rwd_custom_data@"
            java.lang.String r6 = zzd(r6, r8, r7)
            java.lang.String r7 = java.lang.Long.toString(r1)
            java.lang.String r8 = "@gw_tmstmp@"
            java.lang.String r6 = zzd(r6, r8, r7)
            java.lang.String r7 = android.net.Uri.encode(r3)
            java.lang.String r8 = "@gw_rwd_itm@"
            java.lang.String r6 = zzd(r6, r8, r7)
            java.lang.String r7 = "@gw_rwd_amt@"
            java.lang.String r6 = zzd(r6, r7, r13)
            java.lang.String r7 = r10.zzb
            java.lang.String r8 = "@gw_sdkver@"
            java.lang.String r6 = zzd(r6, r8, r7)
            android.content.Context r7 = r10.zze
            boolean r8 = r11.zzW
            java.util.Map r9 = r11.zzaw
            java.lang.String r6 = com.google.android.gms.internal.ads.zzcei.zza(r6, r7, r8, r9)
            r0.add(r6)
            goto L5f
        Laf:
            return r0
        Lb0:
            r11 = move-exception
            int r12 = G6.L.f4523b
            java.lang.String r12 = "Unable to determine award type and amount."
            H6.l.d(r12, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsi.zzc(com.google.android.gms.internal.ads.zzfkn, java.util.List, com.google.android.gms.internal.ads.zzcbw):java.util.List");
    }
}
