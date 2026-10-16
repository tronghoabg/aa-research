package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.C0395s;
import D6.InterfaceC0358a;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbqk implements zzbpx {
    private final C6.b zza;
    private final zzdzt zzb;
    private final zzbyh zzd;
    private final zzeko zze;
    private final zzctq zzf;
    private final zzdca zzg;
    private H6.p zzc = null;
    private F6.a zzh = null;
    private final zzhcp zzi = zzcfy.zzh;

    public zzbqk(C6.b bVar, zzbyh zzbyhVar, zzeko zzekoVar, zzdzt zzdztVar, zzctq zzctqVar, zzdca zzdcaVar) {
        this.zza = bVar;
        this.zzd = zzbyhVar;
        this.zze = zzekoVar;
        this.zzb = zzdztVar;
        this.zzf = zzctqVar;
        this.zzg = zzdcaVar;
    }

    public static boolean zzb(Map map) {
        return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map.get("custom_close"));
    }

    public static int zzc(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri zzd(Context context, zzbaw zzbawVar, Uri uri, View view, Activity activity, zzflk zzflkVar) {
        if (zzbawVar != null) {
            try {
                if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznH)).booleanValue() || zzflkVar == null) {
                    if (zzbawVar.zze(uri)) {
                        return zzbawVar.zzd(uri, context, view, activity);
                    }
                } else if (zzbawVar.zze(uri)) {
                    return zzflkVar.zza(uri, context, view, activity);
                }
            } catch (zzbax unused) {
            } catch (Exception e7) {
                C6.n.f1857D.f1868h.zzh(e7, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    public static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e7) {
            String strValueOf = String.valueOf(uri.toString());
            int i5 = G6.L.f4523b;
            H6.l.d("Error adding click uptime parameter to url: ".concat(strValueOf), e7);
        }
        return uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0361  */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(java.lang.String r28, D6.InterfaceC0358a r29, java.util.Map r30, java.lang.String r31) throws java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 1171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqk.zzf(java.lang.String, D6.a, java.util.Map, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (((java.lang.Boolean) D6.C0395s.f2489e.f2492c.zzd(com.google.android.gms.internal.ads.zzbix.zzjU)).booleanValue() != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cd, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) D6.C0395s.f2489e.f2492c.zzd(com.google.android.gms.internal.ads.zzbix.zzjP)).booleanValue() : ((java.lang.Boolean) D6.C0395s.f2489e.f2492c.zzd(com.google.android.gms.internal.ads.zzbix.zzjO)).booleanValue()) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzi(D6.InterfaceC0358a r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.InstantiationException, java.lang.ClassNotFoundException, java.lang.SecurityException, F6.h, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqk.zzi(D6.a, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    private final void zzj(Context context, String str, String str2) {
        zzeko zzekoVar = this.zze;
        zzekoVar.zzd(str);
        zzdzt zzdztVar = this.zzb;
        if (zzdztVar != null) {
            zzekz.zzk(context, zzdztVar, zzekoVar, str, "dialog_not_shown", zzgww.zzb("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0152, code lost:
    
        r15 = r19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzk(D6.InterfaceC0358a r22, java.util.Map r23, boolean r24, java.lang.String r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbqk.zzk(D6.a, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void zzl(boolean z2) {
        zzbyh zzbyhVar = this.zzd;
        if (zzbyhVar != null) {
            zzbyhVar.zzb(z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzg(int i5) {
        zzdzt zzdztVar;
        String str;
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfH)).booleanValue() || (zzdztVar = this.zzb) == null) {
            return;
        }
        zzdzs zzdzsVarZza = zzdztVar.zza();
        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "cct_action");
        switch (i5) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zzdzsVarZza.zzc("cct_open_status", str);
        zzdzsVarZza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        zzctq zzctqVar;
        InterfaceC0358a interfaceC0358a = (InterfaceC0358a) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        zzclb zzclbVar = (zzclb) interfaceC0358a;
        if (zzclbVar.zzC() != null) {
            map2 = zzclbVar.zzC().zzaw;
        }
        String strZza = zzcei.zza(str, zzclbVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i5 = G6.L.f4523b;
            H6.l.f("Action missing from an open GMSG.");
            return;
        }
        C6.b bVar = this.zza;
        if (bVar == null || bVar.a()) {
            zzhcf.zzr((((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzlH)).booleanValue() && (zzctqVar = this.zzf) != null && zzctq.zzc(strZza)) ? zzctqVar.zzb(strZza, C0392q.f2477g.f2482e) : zzhcf.zza(strZza), new zzbqg(this, map, interfaceC0358a, str2), this.zzi);
        } else {
            bVar.b(strZza);
        }
    }
}
