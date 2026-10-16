package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.C0395s;
import android.net.Uri;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbpw {
    public static final zzbpx zza = zzbpv.zza;
    public static final zzbpx zzb = zzbpm.zza;
    public static final zzbpx zzc = zzbpn.zza;
    public static final zzbpx zzd = new zzbpe();
    public static final zzbpx zze = new zzbpf();
    public static final zzbpx zzf = zzbps.zza;
    public static final zzbpx zzg = new zzbpg();
    public static final zzbpx zzh = new zzbph();
    public static final zzbpx zzi = zzbpt.zza;
    public static final zzbpx zzj = new zzbpi();
    public static final zzbpx zzk = new zzbpj();
    public static final zzbpx zzl = new zzciv();
    public static final zzbpx zzm = new zzciw();
    public static final zzbpx zzn = new zzboq();
    public static final zzbqo zzo = new zzbqo();
    public static final zzbpx zzp = new zzbpk();
    public static final zzbpx zzq = new zzbpl();
    public static final zzbpx zzr = new zzbor();
    public static final zzbpx zzs = new zzbos();
    public static final zzbpx zzt = new zzbot();
    public static final zzbpx zzu = new zzbou();
    public static final zzbpx zzv = new zzbov();
    public static final zzbpx zzw = new zzbow();
    public static final zzbpx zzx = new zzbox();
    public static final zzbpx zzy = new zzboy();
    public static final zzbpx zzz = new zzboz();
    public static final zzbpx zzA = new zzbpa();
    public static final zzbpx zzB = new zzbpc();
    public static final zzbpx zzC = new zzbpd();

    public static p8.p zza(zzclb zzclbVar, String str) {
        Uri uriZzd = Uri.parse(str);
        try {
            zzbaw zzbawVarZzS = zzclbVar.zzS();
            zzflk zzflkVarZzT = zzclbVar.zzT();
            if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznH)).booleanValue() || zzflkVarZzT == null) {
                if (zzbawVarZzS != null && zzbawVarZzS.zza(uriZzd)) {
                    uriZzd = zzbawVarZzS.zzd(uriZzd, zzclbVar.getContext(), zzclbVar.zzE(), zzclbVar.zzj());
                }
            } else if (zzbawVarZzS != null && zzbawVarZzS.zza(uriZzd)) {
                uriZzd = zzflkVarZzT.zza(uriZzd, zzclbVar.getContext(), zzclbVar.zzE(), zzclbVar.zzj());
            }
        } catch (zzbax unused) {
            String strConcat = "Unable to append parameter to URL: ".concat(str);
            int i5 = G6.L.f4523b;
            H6.l.f(strConcat);
        }
        Map map = new HashMap();
        if (zzclbVar.zzC() != null) {
            map = zzclbVar.zzC().zzaw;
        }
        final String strZzb = zzcei.zzb(uriZzd, zzclbVar.getContext(), map);
        long jLongValue = ((Long) zzbkw.zze.zze()).longValue();
        if (jLongValue <= 0 || jLongValue > 254730000) {
            return zzhcf.zza(strZzb);
        }
        zzhbx zzhbxVarZzw = zzhbx.zzw(zzclbVar.zzaF());
        zzbpo zzbpoVar = zzbpo.zza;
        zzhcp zzhcpVar = zzcfy.zzh;
        return (zzhbx) zzhcf.zzg((zzhbx) zzhcf.zzk((zzhbx) zzhcf.zzg(zzhbxVarZzw, Throwable.class, zzbpoVar, zzhcpVar), new zzgti() { // from class: com.google.android.gms.internal.ads.zzbpp
            /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
            @Override // com.google.android.gms.internal.ads.zzgti
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.String r6 = (java.lang.String) r6
                    com.google.android.gms.internal.ads.zzbpx r0 = com.google.android.gms.internal.ads.zzbpw.zza
                    java.lang.String r0 = r1
                    if (r6 != 0) goto L9
                    goto L74
                L9:
                    com.google.android.gms.internal.ads.zzbkh r1 = com.google.android.gms.internal.ads.zzbkw.zzf
                    java.lang.Object r1 = r1.zze()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L18
                    goto L39
                L18:
                    java.lang.String r1 = ".googleadservices.com"
                    java.lang.String r2 = ".googlesyndication.com"
                    java.lang.String r3 = ".doubleclick.net"
                    java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
                    android.net.Uri r2 = android.net.Uri.parse(r0)
                    java.lang.String r2 = r2.getHost()
                    r3 = 0
                L2b:
                    r4 = 3
                    if (r3 >= r4) goto L74
                    r4 = r1[r3]
                    boolean r4 = r2.endsWith(r4)
                    if (r4 != 0) goto L39
                    int r3 = r3 + 1
                    goto L2b
                L39:
                    com.google.android.gms.internal.ads.zzbkh r1 = com.google.android.gms.internal.ads.zzbkw.zza
                    java.lang.Object r1 = r1.zze()
                    java.lang.String r1 = (java.lang.String) r1
                    com.google.android.gms.internal.ads.zzbkh r2 = com.google.android.gms.internal.ads.zzbkw.zzb
                    java.lang.Object r2 = r2.zze()
                    java.lang.String r2 = (java.lang.String) r2
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L53
                    java.lang.String r0 = r0.replace(r1, r6)
                L53:
                    boolean r1 = android.text.TextUtils.isEmpty(r2)
                    if (r1 != 0) goto L74
                    android.net.Uri r1 = android.net.Uri.parse(r0)
                    java.lang.String r3 = r1.getQueryParameter(r2)
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 == 0) goto L74
                    android.net.Uri$Builder r0 = r1.buildUpon()
                    android.net.Uri$Builder r6 = r0.appendQueryParameter(r2, r6)
                    java.lang.String r6 = r6.toString()
                    return r6
                L74:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbpp.apply(java.lang.Object):java.lang.Object");
            }
        }, zzhcpVar), Throwable.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzbpq
            @Override // com.google.android.gms.internal.ads.zzgti
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbpx zzbpxVar = zzbpw.zza;
                if (((Boolean) zzbkw.zzi.zze()).booleanValue()) {
                    C6.n.f1857D.f1868h.zzh(th, "prepareClickUrl.attestation2");
                }
                return strZzb;
            }
        }, zzhcpVar);
    }

    public static zzbpx zzb(final zzdlg zzdlgVar, final zzctq zzctqVar) {
        return new zzbpx() { // from class: com.google.android.gms.internal.ads.zzbpr
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzclb zzclbVar = (zzclb) obj;
                zzbpw.zzc(map, zzdlgVar);
                final String str = (String) map.get("u");
                if (str == null) {
                    int i5 = G6.L.f4523b;
                    H6.l.f("URL missing from click GMSG.");
                    return;
                }
                final zzctq zzctqVar2 = zzctqVar;
                zzhbx zzhbxVarZzw = zzhbx.zzw(zzbpw.zza(zzclbVar, str));
                zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzbpu
                    @Override // com.google.android.gms.internal.ads.zzhbn
                    public final p8.p zza(Object obj2) {
                        zzctq zzctqVar3;
                        String str2 = (String) obj2;
                        zzbpx zzbpxVar = zzbpw.zza;
                        return (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzlH)).booleanValue() && (zzctqVar3 = zzctqVar2) != null && zzctq.zzc(str)) ? zzctqVar3.zzb(str2, C0392q.f2477g.f2482e) : zzhcf.zza(str2);
                    }
                };
                zzhcp zzhcpVar = zzcfy.zza;
                zzhcf.zzr((zzhbx) zzhcf.zzj(zzhbxVarZzw, zzhbnVar, zzhcpVar), new zzbpb(zzclbVar), zzhcpVar);
            }
        };
    }

    public static void zzc(Map map, zzdlg zzdlgVar) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmr)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION) && zzdlgVar != null) {
            zzdlgVar.zzdu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(15:56|8|9|(12:66|11|12|(10:18|(1:20)|21|(1:23)|24|(1:26)|27|(1:29)|30|(2:32|(1:34)))|35|60|36|(1:41)(1:42)|64|43|71|49)(1:16)|15|(0)|35|60|36|(0)(0)|64|43|71|49|6) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d3, code lost:
    
        C6.n.f1857D.f1868h.zzh(r0, r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
    
        r1 = G6.L.f4523b;
        H6.l.d("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zze(com.google.android.gms.internal.ads.zzcmn r17, java.util.Map r18) throws org.json.JSONException, java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbpw.zze(com.google.android.gms.internal.ads.zzcmn, java.util.Map):void");
    }
}
