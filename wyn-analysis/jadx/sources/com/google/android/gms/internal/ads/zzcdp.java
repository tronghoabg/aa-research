package com.google.android.gms.internal.ads;

import G6.C0558w;
import G6.C0560y;
import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.common.internal.AbstractC1732v;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p7.C3773c;

/* loaded from: classes3.dex */
public final class zzcdp implements zzcdu {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = DesugarCollections.synchronizedList(new ArrayList());
    boolean zza;
    private final zziit zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzcdr zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzcdp(Context context, H6.a aVar, zzcdr zzcdrVar, String str, zzcdq zzcdqVar) {
        AbstractC1732v.j(zzcdrVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzcdrVar;
        Iterator it = zzcdrVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zziit zziitVarZzg = zziks.zzg();
        zziitVarZzg.zzn(9);
        if (str != null) {
            zziitVarZzg.zzb(str);
            zziitVarZzg.zzc(str);
        }
        zziiu zziiuVarZzc = zziiv.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zziiuVarZzc.zza(str2);
        }
        zziitVarZzg.zzd((zziiv) zziiuVarZzc.zzbu());
        zzike zzikeVarZzc = zzikf.zzc();
        zzikeVarZzc.zzc(C3773c.a(this.zzh).e());
        String str3 = aVar.f4927a;
        if (str3 != null) {
            zzikeVarZzc.zza(str3);
        }
        d7.f fVar = d7.f.f34129b;
        Context context2 = this.zzh;
        fVar.getClass();
        long jA = d7.f.a(context2);
        if (jA > 0) {
            zzikeVarZzc.zzb(jA);
        }
        zziitVarZzg.zzk((zzikf) zzikeVarZzc.zzbu());
        this.zzd = zziitVarZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final zzcdr zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzb(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzi();
                } else {
                    this.zzd.zzh(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final boolean zzc() {
        return this.zzi.zzc && !this.zzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzcdu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(android.view.View r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzcdr r0 = r7.zzi
            boolean r0 = r0.zzc
            if (r0 != 0) goto L8
            goto L9d
        L8:
            boolean r0 = r7.zzl
            if (r0 != 0) goto L9d
            C6.n r0 = C6.n.f1857D
            G6.U r0 = r0.f1863c
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L16
            goto L77
        L16:
            boolean r2 = r8.isDrawingCacheEnabled()     // Catch: java.lang.RuntimeException -> L28
            r8.setDrawingCacheEnabled(r0)     // Catch: java.lang.RuntimeException -> L28
            android.graphics.Bitmap r3 = r8.getDrawingCache()     // Catch: java.lang.RuntimeException -> L28
            if (r3 == 0) goto L2a
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3)     // Catch: java.lang.RuntimeException -> L28
            goto L2b
        L28:
            r2 = move-exception
            goto L31
        L2a:
            r3 = r1
        L2b:
            r8.setDrawingCacheEnabled(r2)     // Catch: java.lang.RuntimeException -> L2f
            goto L39
        L2f:
            r2 = move-exception
            goto L32
        L31:
            r3 = r1
        L32:
            int r4 = G6.L.f4523b
            java.lang.String r4 = "Fail to capture the web view"
            H6.l.d(r4, r2)
        L39:
            if (r3 != 0) goto L76
            int r2 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L64
            int r3 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L64
            if (r2 == 0) goto L66
            if (r3 != 0) goto L48
            goto L66
        L48:
            int r4 = r8.getWidth()     // Catch: java.lang.RuntimeException -> L64
            int r5 = r8.getHeight()     // Catch: java.lang.RuntimeException -> L64
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.RuntimeException -> L64
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)     // Catch: java.lang.RuntimeException -> L64
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.RuntimeException -> L64
            r5.<init>(r4)     // Catch: java.lang.RuntimeException -> L64
            r6 = 0
            r8.layout(r6, r6, r2, r3)     // Catch: java.lang.RuntimeException -> L64
            r8.draw(r5)     // Catch: java.lang.RuntimeException -> L64
            r1 = r4
            goto L77
        L64:
            r8 = move-exception
            goto L6e
        L66:
            java.lang.String r8 = "Width or height of view is zero"
            int r2 = G6.L.f4523b     // Catch: java.lang.RuntimeException -> L64
            H6.l.f(r8)     // Catch: java.lang.RuntimeException -> L64
            goto L77
        L6e:
            int r2 = G6.L.f4523b
            java.lang.String r2 = "Fail to capture the webview"
            H6.l.d(r2, r8)
            goto L77
        L76:
            r1 = r3
        L77:
            if (r1 != 0) goto L7f
            java.lang.String r8 = "Failed to capture the webview bitmap."
            com.google.android.gms.internal.ads.zzcdt.zza(r8)
            return
        L7f:
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzcdo r8 = new com.google.android.gms.internal.ads.zzcdo
            r8.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L98
            r8.run()
            return
        L98:
            com.google.android.gms.internal.ads.zzhcp r0 = com.google.android.gms.internal.ads.zzcfy.zza
            r0.execute(r8)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdp.zzd(android.view.View):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zze(String str, Map map, int i5) {
        synchronized (this.zzj) {
            if (i5 == 3) {
                try {
                    this.zzm = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LinkedHashMap linkedHashMap = this.zze;
            if (linkedHashMap.containsKey(str)) {
                if (i5 == 3) {
                    ((zzikc) linkedHashMap.get(str)).zze(4);
                }
                return;
            }
            zzikc zzikcVarZze = zzikd.zze();
            int iZza = zzikb.zza(i5);
            if (iZza != 0) {
                zzikcVarZze.zze(iZza);
            }
            zzikcVarZze.zza(linkedHashMap.size());
            zzikcVarZze.zzb(str);
            zzijg zzijgVarZzc = zzijj.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzije zzijeVarZzc = zzijf.zzc();
                        zzijeVarZzc.zza(zzidl.zzx(str2));
                        zzijeVarZzc.zzb(zzidl.zzx(str3));
                        zzijgVarZzc.zza((zzijf) zzijeVarZzc.zzbu());
                    }
                }
            }
            zzikcVarZze.zzc((zzijj) zzijgVarZzc.zzbu());
            linkedHashMap.put(str, zzikcVarZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            p8.p pVarZza = zzhcf.zza(Collections.EMPTY_MAP);
            zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzcdl
                @Override // com.google.android.gms.internal.ads.zzhbn
                public final /* synthetic */ p8.p zza(Object obj) {
                    return this.zza.zzh((Map) obj);
                }
            };
            zzhcp zzhcpVar = zzcfy.zzh;
            p8.p pVarZzj = zzhcf.zzj(pVarZza, zzhbnVar, zzhcpVar);
            p8.p pVarZzi = zzhcf.zzi(pVarZzj, 10L, TimeUnit.SECONDS, zzcfy.zzd);
            zzhcf.zzr(pVarZzj, new zzcdk(this, pVarZzi), zzhcpVar);
            zzc.add(pVarZzi);
        }
    }

    public final /* synthetic */ void zzg(Bitmap bitmap) {
        zzidk zzidkVarZzC = zzidl.zzC();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzidkVarZzC);
        synchronized (this.zzj) {
            zziit zziitVar = this.zzd;
            zzijw zzijwVarZzc = zzijy.zzc();
            zzijwVarZzc.zzb(zzidkVarZzC.zza());
            zzijwVarZzc.zza("image/png");
            zzijwVarZzc.zzc(2);
            zziitVar.zzj((zzijy) zzijwVarZzc.zzbu());
        }
    }

    public final /* synthetic */ p8.p zzh(Map map) {
        int length;
        zzikc zzikcVar;
        p8.p pVarZzk;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        Object obj = this.zzj;
                        synchronized (obj) {
                            try {
                                length = jSONArrayOptJSONArray.length();
                                synchronized (obj) {
                                    zzikcVar = (zzikc) this.zze.get(str);
                                }
                            } finally {
                            }
                        }
                        if (zzikcVar == null) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 50);
                            sb2.append("Cannot find the corresponding resource object for ");
                            sb2.append(str);
                            zzcdt.zza(sb2.toString());
                        } else {
                            for (int i5 = 0; i5 < length; i5++) {
                                zzikcVar.zzd(jSONArrayOptJSONArray.getJSONObject(i5).getString("threat_type"));
                            }
                            this.zza = (length > 0) | this.zza;
                        }
                    }
                }
            } catch (JSONException e7) {
                if (((Boolean) zzblf.zza.zze()).booleanValue()) {
                    int i10 = G6.L.f4523b;
                    H6.l.b("Failed to get SafeBrowsing metadata", e7);
                }
                return zzhcf.zzc(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z2 = this.zza;
        if (!(z2 && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z2 || !this.zzi.zzd))) {
            return zzhcf.zza(null);
        }
        synchronized (this.zzj) {
            try {
                Iterator it = this.zze.values().iterator();
                while (it.hasNext()) {
                    this.zzd.zzf((zzikd) ((zzikc) it.next()).zzbu());
                }
                zziit zziitVar = this.zzd;
                zziitVar.zzl(this.zzf);
                zziitVar.zzm(this.zzg);
                if (zzcdt.zzb()) {
                    String strZza = zziitVar.zza();
                    String strZzg = zziitVar.zzg();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(strZza).length() + 38 + String.valueOf(strZzg).length() + 15);
                    sb3.append("Sending SB report\n  url: ");
                    sb3.append(strZza);
                    sb3.append("\n  clickUrl: ");
                    sb3.append(strZzg);
                    sb3.append("\n  resources: \n");
                    StringBuilder sb4 = new StringBuilder(sb3.toString());
                    for (zzikd zzikdVar : zziitVar.zze()) {
                        sb4.append("    [");
                        sb4.append(zzikdVar.zzd());
                        sb4.append("] ");
                        sb4.append(zzikdVar.zzc());
                    }
                    zzcdt.zza(sb4.toString());
                }
                C0558w c0558wA = new C0560y(this.zzh).a(1, this.zzi.zzb, null, ((zziks) zziitVar.zzbu()).zzaN());
                if (zzcdt.zzb()) {
                    c0558wA.addListener(zzcdn.zza, zzcfy.zza);
                }
                pVarZzk = zzhcf.zzk(c0558wA, zzcdm.zza, zzcfy.zzh);
            } finally {
            }
        }
        return pVarZzk;
    }
}
