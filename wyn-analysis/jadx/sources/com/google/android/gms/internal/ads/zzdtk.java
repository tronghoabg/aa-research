package com.google.android.gms.internal.ads;

import D6.BinderC0363b1;
import D6.C0395s;
import D6.x1;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Base64;
import cb.AbstractC1593a;
import com.google.android.gms.ads.AdSize;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdtk {
    private final Context zza;
    private final zzdsq zzb;
    private final zzbaw zzc;
    private final H6.a zzd;
    private final C6.a zze;
    private final zzbhw zzf;
    private final Executor zzg;
    private final zzbma zzh;
    private final zzduc zzi;
    private final zzdwq zzj;
    private final ScheduledExecutorService zzk;
    private final zzdvl zzl;
    private final zzdzt zzm;
    private final zzfsm zzn;
    private final zzeko zzo;
    private final zzekz zzp;
    private final zzflk zzq;
    private final zzdzo zzr;
    private final zzeaw zzs;

    public zzdtk(Context context, zzdsq zzdsqVar, zzbaw zzbawVar, H6.a aVar, C6.a aVar2, zzbhw zzbhwVar, Executor executor, zzflg zzflgVar, zzduc zzducVar, zzdwq zzdwqVar, ScheduledExecutorService scheduledExecutorService, zzdzt zzdztVar, zzfsm zzfsmVar, zzeko zzekoVar, zzdvl zzdvlVar, zzekz zzekzVar, zzflk zzflkVar, zzdzo zzdzoVar, zzeaw zzeawVar) {
        this.zza = context;
        this.zzb = zzdsqVar;
        this.zzc = zzbawVar;
        this.zzd = aVar;
        this.zze = aVar2;
        this.zzf = zzbhwVar;
        this.zzg = executor;
        this.zzh = zzflgVar.zzj;
        this.zzi = zzducVar;
        this.zzj = zzdwqVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdztVar;
        this.zzn = zzfsmVar;
        this.zzo = zzekoVar;
        this.zzl = zzdvlVar;
        this.zzp = zzekzVar;
        this.zzq = zzflkVar;
        this.zzr = zzdzoVar;
        this.zzs = zzeawVar;
    }

    public static final BinderC0363b1 zzk(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzs(jSONObjectOptJSONObject);
    }

    public static final List zzl(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return zzgwt.zzi();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgwt.zzi();
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
            BinderC0363b1 binderC0363b1Zzs = zzs(jSONArrayOptJSONArray.optJSONObject(i5));
            if (binderC0363b1Zzs != null) {
                arrayList.add(binderC0363b1Zzs);
            }
        }
        return zzgwt.zzq(arrayList);
    }

    private final p8.p zzm(JSONArray jSONArray, boolean z2, boolean z10, zzdzc zzdzcVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzhcf.zza(Collections.EMPTY_LIST);
        }
        ArrayList arrayList = new ArrayList();
        int length = z10 ? jSONArray.length() : 1;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcZ)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzr, zzdzcVar.zza());
        }
        for (int i5 = 0; i5 < length; i5++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i5), z2, null));
        }
        return zzhcf.zzk(zzhcf.zzm(arrayList), zzdtj.zza, this.zzg);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final p8.p zzn(org.json.JSONObject r14, boolean r15, com.google.android.gms.internal.ads.zzdzc r16) {
        /*
            r13 = this;
            r0 = 0
            if (r14 != 0) goto L8
            p8.p r14 = com.google.android.gms.internal.ads.zzhcf.zza(r0)
            return r14
        L8:
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zzeX
            D6.s r2 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r3 = r2.f2492c
            java.lang.Object r1 = r3.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L4f
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zzeY
            com.google.android.gms.internal.ads.zzbiv r2 = r2.f2492c
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r14.has(r1)
            if (r1 == 0) goto L4f
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.android.gms.internal.ads.zzbio r3 = com.google.android.gms.internal.ads.zzbix.zzeZ
            java.lang.Object r2 = r2.zzd(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = ","
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            r4 = 0
        L3f:
            if (r4 >= r3) goto L4d
            r5 = r2[r4]
            java.lang.String r6 = r14.getString(r5)     // Catch: org.json.JSONException -> L4a
            r1.put(r5, r6)     // Catch: org.json.JSONException -> L4a
        L4a:
            int r4 = r4 + 1
            goto L3f
        L4d:
            r12 = r1
            goto L50
        L4f:
            r12 = r0
        L50:
            java.lang.String r1 = "url"
            java.lang.String r3 = r14.optString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L64
            if (r12 == 0) goto L5f
            goto L64
        L5f:
            p8.p r14 = com.google.android.gms.internal.ads.zzhcf.zza(r0)
            return r14
        L64:
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zzcZ
            D6.s r2 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r2 = r2.f2492c
            java.lang.Object r1 = r2.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L85
            if (r16 == 0) goto L85
            com.google.android.gms.internal.ads.zzdzo r1 = r13.zzr
            java.lang.String r2 = r16.zza()
            C6.n r4 = C6.n.f1857D
            n7.b r4 = r4.k
            cb.AbstractC1593a.y(r4, r1, r2)
        L85:
            java.lang.String r1 = "scale"
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r14.optDouble(r1, r4)
            java.lang.String r1 = "is_transparent"
            r2 = 1
            boolean r1 = r14.optBoolean(r1, r2)
            java.lang.String r2 = "width"
            r6 = -1
            int r10 = r14.optInt(r2, r6)
            java.lang.String r2 = "height"
            int r7 = r14.optInt(r2, r6)
            if (r15 != 0) goto Lc7
            if (r12 == 0) goto La8
            r8 = r4
            r6 = r10
            goto Lc9
        La8:
            com.google.android.gms.internal.ads.zzdsq r2 = r13.zzb
            p8.p r1 = r2.zza(r3, r4, r1)
            com.google.android.gms.internal.ads.zzdsz r2 = new com.google.android.gms.internal.ads.zzdsz
            r6 = r10
            r2.<init>()
            java.util.concurrent.Executor r3 = r13.zzg
            p8.p r1 = com.google.android.gms.internal.ads.zzhcf.zzk(r1, r2, r3)
            java.lang.String r2 = "require"
            boolean r14 = r14.optBoolean(r2)
            java.lang.String r2 = "NativeAssetsLoader.loadImage"
            p8.p r14 = r13.zzq(r2, r14, r1, r0)
            return r14
        Lc7:
            r6 = r10
            r8 = r4
        Lc9:
            com.google.android.gms.internal.ads.zzblw r5 = new com.google.android.gms.internal.ads.zzblw
            r10 = r6
            r6 = 0
            android.net.Uri r14 = android.net.Uri.parse(r3)
            r11 = r7
            r7 = r14
            r5.<init>(r6, r7, r8, r10, r11, r12)
            p8.p r14 = com.google.android.gms.internal.ads.zzhcf.zza(r5)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdtk.zzn(org.json.JSONObject, boolean, com.google.android.gms.internal.ads.zzdzc):p8.p");
    }

    private static Integer zzo(JSONObject jSONObject, String str) throws JSONException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final p8.p zzp(JSONObject jSONObject, zzfkn zzfknVar, zzfkq zzfkqVar, C6.b bVar, zzcdu zzcduVar) {
        final p8.p pVarZzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfknVar, zzfkqVar, zzr(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), bVar, zzcduVar);
        return zzhcf.zzj(pVarZzb, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdte
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) throws zzepp {
                zzclb zzclbVar = (zzclb) obj;
                if (zzclbVar == null || zzclbVar.zzh() == null) {
                    throw new zzepp(1, "Retrieve video view in html5 ad response failed.");
                }
                return pVarZzb;
            }
        }, zzcfy.zzh);
    }

    private final p8.p zzq(String str, boolean z2, final p8.p pVar, Object obj) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzda)).booleanValue()) {
            zzcgb.zza(pVar, str, this.zzg);
        }
        if (z2) {
            return zzhcf.zzj(pVar, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtg
                @Override // com.google.android.gms.internal.ads.zzhbn
                public final /* synthetic */ p8.p zza(Object obj2) {
                    return obj2 != null ? pVar : zzhcf.zzc(new zzepp(1, "Retrieve required value in native ad response failed."));
                }
            }, zzcfy.zzh);
        }
        final Object obj2 = null;
        return zzhcf.zzh(pVar, Exception.class, new zzhbn(obj2) { // from class: com.google.android.gms.internal.ads.zzdtf
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj3) {
                G6.L.l("Error during loading assets.", (Exception) obj3);
                return zzhcf.zza(null);
            }
        }, zzcfy.zzh);
    }

    private final x1 zzr(int i5, int i10) {
        if (i5 == 0) {
            if (i10 == 0) {
                return x1.V();
            }
            i5 = 0;
        }
        return new x1(this.zza, new AdSize(i5, i10));
    }

    private static final BinderC0363b1 zzs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new BinderC0363b1(strOptString, strOptString2);
    }

    public final p8.p zza(JSONObject jSONObject, String str, zzdzc zzdzcVar) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb, zzdzcVar);
    }

    public final p8.p zzb(JSONObject jSONObject, String str, zzdzc zzdzcVar) {
        zzbma zzbmaVar = this.zzh;
        return zzm(jSONObject.optJSONArray("images"), zzbmaVar.zzb, zzbmaVar.zzd, zzdzcVar);
    }

    public final p8.p zzc(JSONObject jSONObject, String str, final zzfkn zzfknVar, final zzfkq zzfkqVar, final C6.b bVar, final zzcdu zzcduVar) {
        zzbio zzbioVar = zzbix.zzlG;
        C0395s c0395s = C0395s.f2489e;
        if (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            return zzhcf.zza(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzhcf.zza(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzhcf.zza(null);
        }
        zzbio zzbioVar2 = zzbix.zzeX;
        zzbiv zzbivVar = c0395s.f2492c;
        if (((Boolean) zzbivVar.zzd(zzbioVar2)).booleanValue() && jSONObjectOptJSONObject.has((String) zzbivVar.zzd(zzbix.zzeY))) {
            return zzhcf.zza(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final x1 x1VarZzr = zzr(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzhcf.zza(null);
        }
        if (((Boolean) zzbivVar.zzd(zzbix.zzcZ)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzr, zzdzc.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.zza());
        }
        final p8.p pVarZzj = zzhcf.zzj(zzhcf.zza(null), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdta
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzh(x1VarZzr, zzfknVar, zzfkqVar, bVar, zzcduVar, strOptString, strOptString2, obj);
            }
        }, zzcfy.zzf);
        p8.p pVarZzj2 = zzhcf.zzj(pVarZzj, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtb
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) throws zzepp {
                if (((zzclb) obj) != null) {
                    return pVarZzj;
                }
                throw new zzepp(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcfy.zzh);
        if (((Boolean) zzbivVar.zzd(zzbix.zzda)).booleanValue()) {
            zzcgb.zza(pVarZzj2, "NativeAssetsLoader.loadImageHtml", this.zzg);
        }
        return pVarZzj2;
    }

    public final p8.p zzd(JSONObject jSONObject, String str, zzdzc zzdzcVar) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return zzhcf.zza(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzq("NativeAssetsLoader.loadAttributionInfo", jSONObjectOptJSONObject.optBoolean("require"), zzhcf.zzk(zzm(jSONArrayOptJSONArray, false, true, zzdzcVar), new zzgti() { // from class: com.google.android.gms.internal.ads.zzdtc
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzi(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final p8.p zze(JSONObject jSONObject, final C6.b bVar, final zzcdu zzcduVar) {
        if (!jSONObject.optBoolean("enable_omid")) {
            return zzhcf.zza(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        if (jSONObjectOptJSONObject == null) {
            return zzhcf.zza(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
        if (TextUtils.isEmpty(strOptString)) {
            return zzhcf.zza(null);
        }
        zzbio zzbioVar = zzbix.zzcZ;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzr, zzdzc.NATIVE_ASSETS_LOADING_OMID_START.zza());
        }
        p8.p pVarZzj = zzhcf.zzj(zzhcf.zza(null), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtd
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzj(strOptString, zzcduVar, bVar, obj);
            }
        }, zzcfy.zzf);
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzda)).booleanValue()) {
            zzcgb.zza(pVarZzj, "NativeAssetsLoader.omidWebView", this.zzg);
        }
        return pVarZzj;
    }

    public final p8.p zzf(p8.p pVar) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcZ)).booleanValue()) {
            AbstractC1593a.y(C6.n.f1857D.k, this.zzr, zzdzc.NATIVE_ASSETS_LOADING_MEDIA_START.zza());
        }
        zzcgd zzcgdVar = new zzcgd();
        zzhcf.zzr(pVar, new zzdsy(this, zzcgdVar), zzcfy.zzf);
        return zzcgdVar;
    }

    public final p8.p zzg(JSONObject jSONObject, zzfkn zzfknVar, zzfkq zzfkqVar, C6.b bVar, zzcdu zzcduVar) {
        String[] strArr = {"html_containers", "instream"};
        JSONObject jSONObjectG0 = Fe.e.g0(jSONObject, strArr);
        JSONObject jSONObjectOptJSONObject = jSONObjectG0 == null ? null : jSONObjectG0.optJSONObject(strArr[1]);
        if (jSONObjectOptJSONObject != null) {
            return zzp(jSONObjectOptJSONObject, zzfknVar, zzfkqVar, bVar, zzcduVar);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(MimeTypes.BASE_TYPE_VIDEO);
        if (jSONObjectOptJSONObject2 == null) {
            return zzhcf.zza(null);
        }
        String strOptString = jSONObjectOptJSONObject2.optString("vast_xml");
        zzbio zzbioVar = zzbix.zzlF;
        boolean z2 = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbioVar)).booleanValue() && jSONObjectOptJSONObject2.has("html");
        if (!TextUtils.isEmpty(strOptString) || z2) {
            return zzq(true != z2 ? "NativeAssetsLoader.loadVideoView" : "NativeAssetsLoader.loadVideoHtml", false, zzhcf.zzi(z2 ? zzp(jSONObjectOptJSONObject2, zzfknVar, zzfkqVar, bVar, zzcduVar) : this.zzi.zza(jSONObjectOptJSONObject2, bVar, zzcduVar), ((Integer) r1.f2492c.zzd(zzbix.zzeP)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        int i5 = G6.L.f4523b;
        H6.l.f("Required field 'vast_xml' or 'html' is missing");
        return zzhcf.zza(null);
    }

    public final p8.p zzh(x1 x1Var, zzfkn zzfknVar, zzfkq zzfkqVar, C6.b bVar, zzcdu zzcduVar, String str, String str2, Object obj) throws zzclq {
        zzeaw zzeawVar;
        zzclb zzclbVarZza = this.zzj.zza(x1Var, zzfknVar, zzfkqVar);
        final zzcgc zzcgcVarZza = zzcgc.zza((Object) zzclbVarZza);
        zzdvi zzdviVarZza = this.zzl.zza();
        zzcmz zzcmzVarZzP = zzclbVarZza.zzP();
        zzbio zzbioVar = zzbix.zzpr;
        C0395s c0395s = C0395s.f2489e;
        C6.b bVar2 = !((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() ? new C6.b(this.zza, null) : bVar;
        zzbiv zzbivVar = c0395s.f2492c;
        zzcmzVarZzP.zzab(zzdviVarZza, zzdviVarZza, zzdviVarZza, zzdviVarZza, zzdviVarZza, false, null, bVar2, null, true != ((Boolean) zzbivVar.zzd(zzbioVar)).booleanValue() ? null : zzcduVar, this.zzo, this.zzn, this.zzm, null, zzdviVarZza, null, null, null, null, null, null, null);
        zzclbVarZza.zzab("/getNativeAdViewSignals", zzbpw.zzs);
        zzclbVarZza.zzab("/getNativeClickMeta", zzbpw.zzt);
        if (((Boolean) zzbivVar.zzd(zzbix.zziQ)).booleanValue() && ((Boolean) zzbivVar.zzd(zzbix.zziS)).booleanValue() && (zzeawVar = this.zzs) != null) {
            zzclbVarZza.zzab("/onDeviceStorageEvent", new zzbqf(zzeawVar));
        }
        zzclbVarZza.zzP().zzS(true);
        zzclbVarZza.zzP().zzG(new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdti
            @Override // com.google.android.gms.internal.ads.zzcmx
            public final /* synthetic */ void zza(boolean z2, int i5, String str3, String str4) {
                zzcgc zzcgcVar = zzcgcVarZza;
                if (z2) {
                    zzcgcVar.zzb();
                    return;
                }
                int length = String.valueOf(i5).length();
                StringBuilder sb2 = new StringBuilder(length + 58 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb2.append("Image Web View failed to load. Error code: ");
                sb2.append(i5);
                sb2.append(", Description: ");
                sb2.append(str3);
                zzcgcVar.zzd(new zzepp(1, wg.b.c(sb2, ", Failing URL: ", str4)));
            }
        });
        zzclbVarZza.zzau(str, str2, null);
        return zzcgcVarZza;
    }

    public final /* synthetic */ zzblt zzi(JSONObject jSONObject, List list) throws JSONException {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numZzo = zzo(jSONObject, "bg_color");
        Integer numZzo2 = zzo(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzblt(strOptString, list, numZzo, numZzo2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.zzh.zze, zOptBoolean);
    }

    public final p8.p zzj(String str, zzcdu zzcduVar, C6.b bVar, Object obj) throws zzclq {
        zzclr zzclrVar = C6.n.f1857D.f1864d;
        Context context = this.zza;
        zzekz zzekzVar = this.zzp;
        zzclb zzclbVarZza = zzclr.zza(context, zzcnl.zzb(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, zzekzVar, this.zzq, this.zzm);
        final zzcgc zzcgcVarZza = zzcgc.zza((Object) zzclbVarZza);
        zzclbVarZza.zzP().zzG(new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdth
            @Override // com.google.android.gms.internal.ads.zzcmx
            public final /* synthetic */ void zza(boolean z2, int i5, String str2, String str3) {
                zzcgcVarZza.zzb();
            }
        });
        zzclbVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzpr)).booleanValue()) {
            if (zzcduVar != null) {
                zzclbVarZza.zzP().zzj(zzcduVar);
            }
            zzclbVarZza.zzP().zzi(bVar);
        }
        return zzcgcVarZza;
    }
}
