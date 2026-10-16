package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import cb.AbstractC1593a;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzega {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzcnq zzb;
    private final Context zzc;
    private final H6.a zzd;
    private final zzflg zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzfqq zzi;
    private final zzdzo zzj;
    private final zzfsm zzk;
    private final zzdgd zzl;
    private final Object zzm = new Object();
    private String zzn;
    private List zzo;
    private Bundle zzp;
    private final zzcbs zzq;

    public zzega(zzcnq zzcnqVar, Context context, H6.a aVar, zzflg zzflgVar, Executor executor, String str, zzfqq zzfqqVar, zzdzo zzdzoVar, zzcbs zzcbsVar, zzeiv zzeivVar, ScheduledExecutorService scheduledExecutorService, zzfsm zzfsmVar, zzdgd zzdgdVar) {
        this.zzb = zzcnqVar;
        this.zzc = context;
        this.zzd = aVar;
        this.zze = zzflgVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfqqVar;
        zzcnqVar.zzB();
        this.zzj = zzdzoVar;
        this.zzq = zzcbsVar;
        this.zzg = scheduledExecutorService;
        this.zzk = zzfsmVar;
        this.zzl = zzdgdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final p8.p zzg(java.lang.String r18, final java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzega.zzg(java.lang.String, java.lang.String):p8.p");
    }

    private final void zzh(zzdzc zzdzcVar) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzin)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzj, zzdzcVar.zza());
        }
    }

    private final String zzi(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e7) {
            String strConcat = "Failed to update the ad types for rendering. ".concat(e7.toString());
            int i5 = G6.L.f4523b;
            H6.l.f(strConcat);
            return str;
        }
    }

    private static final String zzj(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01dc A[Catch: all -> 0x00d4, TryCatch #1 {all -> 0x00d4, blocks: (B:21:0x0076, B:23:0x0092, B:25:0x009a, B:27:0x00a7, B:29:0x00bf, B:33:0x00eb, B:36:0x00f7, B:38:0x00ff, B:40:0x0105, B:44:0x010e, B:53:0x0146, B:47:0x0122, B:52:0x0131, B:55:0x014b, B:32:0x00d7, B:56:0x015f, B:63:0x017c, B:66:0x0184, B:70:0x01a6, B:72:0x01bb, B:76:0x01dc, B:78:0x01f1, B:81:0x0205, B:83:0x020b, B:84:0x0218, B:86:0x021a, B:89:0x0223, B:88:0x0220, B:77:0x01e6, B:73:0x01ce, B:69:0x0192, B:60:0x016c, B:61:0x0171), top: B:114:0x0076, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e6 A[Catch: all -> 0x00d4, TryCatch #1 {all -> 0x00d4, blocks: (B:21:0x0076, B:23:0x0092, B:25:0x009a, B:27:0x00a7, B:29:0x00bf, B:33:0x00eb, B:36:0x00f7, B:38:0x00ff, B:40:0x0105, B:44:0x010e, B:53:0x0146, B:47:0x0122, B:52:0x0131, B:55:0x014b, B:32:0x00d7, B:56:0x015f, B:63:0x017c, B:66:0x0184, B:70:0x01a6, B:72:0x01bb, B:76:0x01dc, B:78:0x01f1, B:81:0x0205, B:83:0x020b, B:84:0x0218, B:86:0x021a, B:89:0x0223, B:88:0x0220, B:77:0x01e6, B:73:0x01ce, B:69:0x0192, B:60:0x016c, B:61:0x0171), top: B:114:0x0076, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0203 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0220 A[Catch: all -> 0x00d4, TryCatch #1 {all -> 0x00d4, blocks: (B:21:0x0076, B:23:0x0092, B:25:0x009a, B:27:0x00a7, B:29:0x00bf, B:33:0x00eb, B:36:0x00f7, B:38:0x00ff, B:40:0x0105, B:44:0x010e, B:53:0x0146, B:47:0x0122, B:52:0x0131, B:55:0x014b, B:32:0x00d7, B:56:0x015f, B:63:0x017c, B:66:0x0184, B:70:0x01a6, B:72:0x01bb, B:76:0x01dc, B:78:0x01f1, B:81:0x0205, B:83:0x020b, B:84:0x0218, B:86:0x021a, B:89:0x0223, B:88:0x0220, B:77:0x01e6, B:73:0x01ce, B:69:0x0192, B:60:0x016c, B:61:0x0171), top: B:114:0x0076, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p8.p zza() {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzega.zza():p8.p");
    }

    public final p8.p zzb(zzbuf zzbufVar, JSONObject jSONObject) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcU)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzj, zzdzc.SCAR_PRELOADER_PROCESSING_DONE.zza());
        }
        return zzbufVar.zzb(jSONObject);
    }

    public final /* synthetic */ p8.p zzc(JSONObject jSONObject) {
        zzfkv zzfkvVar = new zzfkv(this.zze);
        String string = jSONObject.toString();
        return zzhcf.zza(new zzfky(zzfkvVar, zzfkx.zza(new StringReader(string), this.zzp)));
    }

    public final String zzd(zzeis zzeisVar) throws zzepp {
        zzh(zzdzc.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i5 = 0;
        int i10 = -1;
        while (true) {
            try {
                zzbio zzbioVar = zzbix.zzim;
                C0395s c0395s = C0395s.f2489e;
                if (i5 >= ((Integer) c0395s.f2492c.zzd(zzbioVar)).intValue()) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 40);
                    sb2.append("Received HTTP error code from ad server:");
                    sb2.append(i10);
                    throw new zzepp(1, sb2.toString());
                }
                zzeit zzeitVarZzb = new zzeiu(this.zzc, this.zzd.f4927a, this.zzq, Binder.getCallingUid(), null).zza(zzeisVar);
                int i11 = zzeitVarZzb.zza;
                if (((Boolean) c0395s.f2492c.zzd(zzbix.zzin)).booleanValue()) {
                    this.zzj.zzd("fr", String.valueOf(i5));
                }
                if (i11 == 200) {
                    zzh(zzdzc.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zzeitVarZzb.zzc;
                }
                i5++;
                i10 = i11;
            } catch (Exception e7) {
                throw new zzepp(1, e7.getMessage() == null ? "Fetch failed." : e7.getMessage(), e7);
            }
        }
    }

    public final p8.p zze(List list, Exception exc) {
        zzepp zzeppVar;
        C6.n.f1857D.f1868h.zzi(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzeppVar = new zzepp(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzepp) {
            zzeppVar = (zzepp) exc;
        } else {
            zzeppVar = new zzepp(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        String message = zzeppVar.getMessage() == null ? "" : zzeppVar.getMessage();
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = "timeout";
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    List listZzg = zzgug.zza(zzgtf.zzd(':')).zzg(message);
                    if (listZzg.size() == 2) {
                        message = (String) listZzg.get(1);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfsi.zzd(zzfsi.zzd((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            this.zzk.zza(arrayList, null);
        }
        return zzhcf.zzc(zzeppVar);
    }

    public final /* synthetic */ zzdgd zzf() {
        return this.zzl;
    }
}
