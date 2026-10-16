package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.C0395s;
import D6.InterfaceC0404w0;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinMediationProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzecz implements zzeeb, zzeck {
    private final zzedk zza;
    private final zzeec zzb;
    private final zzecl zzc;
    private final zzecu zzd;
    private final zzecj zze;
    private final zzedw zzf;
    private final zzedg zzg;
    private final zzedg zzh;
    private final String zzi;
    private final Context zzj;
    private final String zzk;
    private JSONObject zzp;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private final Map zzl = new HashMap();
    private final Map zzm = new HashMap();
    private final Map zzn = new HashMap();
    private String zzo = JsonUtils.EMPTY_JSON;
    private long zzq = Long.MAX_VALUE;
    private zzecv zzr = zzecv.NONE;
    private zzecy zzv = zzecy.UNKNOWN;
    private long zzw = 0;
    private String zzx = "";

    public zzecz(zzedk zzedkVar, zzeec zzeecVar, zzecl zzeclVar, Context context, H6.a aVar, zzecu zzecuVar, zzedw zzedwVar, zzedg zzedgVar, zzedg zzedgVar2, String str) {
        this.zza = zzedkVar;
        this.zzb = zzeecVar;
        this.zzc = zzeclVar;
        this.zze = new zzecj(context);
        this.zzi = aVar.f4927a;
        this.zzk = str;
        this.zzd = zzecuVar;
        this.zzf = zzedwVar;
        this.zzg = zzedgVar;
        this.zzh = zzedgVar2;
        this.zzj = context;
        C6.n.f1857D.f1874o.f4624g = this;
    }

    private final synchronized void zzA(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzt(jSONObject.optBoolean("isTestMode", false), false);
            zzu((zzecv) Enum.valueOf(zzecv.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzo = jSONObject.optString("networkExtras", JsonUtils.EMPTY_JSON);
            this.zzq = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void zzt(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.zzs     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.zzs = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.zzbio r2 = com.google.android.gms.internal.ads.zzbix.zzkK     // Catch: java.lang.Throwable -> L27
            D6.s r0 = D6.C0395s.f2489e     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.zzbiv r0 = r0.f2492c     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.zzd(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            C6.n r2 = C6.n.f1857D     // Catch: java.lang.Throwable -> L27
            G6.m r2 = r2.f1874o     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.g()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2d
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            r1.zzx()     // Catch: java.lang.Throwable -> L27
            goto L36
        L2d:
            boolean r2 = r1.zzs()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            r1.zzy()     // Catch: java.lang.Throwable -> L27
        L36:
            if (r3 == 0) goto L3d
            r1.zzz()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecz.zzt(boolean, boolean):void");
    }

    private final synchronized void zzu(zzecv zzecvVar, boolean z2) {
        try {
            if (this.zzr != zzecvVar) {
                if (zzs()) {
                    zzy();
                }
                this.zzr = zzecvVar;
                if (zzs()) {
                    zzx();
                }
                if (z2) {
                    zzz();
                }
            }
        } finally {
        }
    }

    private final synchronized JSONObject zzv() throws JSONException {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.zzl.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (zzecn zzecnVar : (List) entry.getValue()) {
                    if (zzecnVar.zzc()) {
                        jSONArray.put(zzecnVar.zzg());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    private final void zzw() throws JSONException {
        String str;
        this.zzu = true;
        this.zzd.zza();
        this.zza.zzl(this);
        this.zzb.zza(this);
        this.zzc.zza(this);
        this.zzf.zzb(this);
        zzbio zzbioVar = zzbix.zzkZ;
        C0395s c0395s = C0395s.f2489e;
        if (!TextUtils.isEmpty((CharSequence) c0395s.f2492c.zzd(zzbioVar))) {
            this.zzg.zza(PreferenceManager.getDefaultSharedPreferences(this.zzj), Arrays.asList(((String) c0395s.f2492c.zzd(zzbioVar)).split(",")));
        }
        zzbio zzbioVar2 = zzbix.zzla;
        if (!TextUtils.isEmpty((CharSequence) c0395s.f2492c.zzd(zzbioVar2))) {
            this.zzh.zza(this.zzj.getSharedPreferences(AppLovinMediationProvider.ADMOB, 0), Arrays.asList(((String) c0395s.f2492c.zzd(zzbioVar2)).split(",")));
        }
        C6.n nVar = C6.n.f1857D;
        zzA(((G6.O) nVar.f1868h.zzp()).e());
        G6.O o7 = (G6.O) nVar.f1868h.zzp();
        o7.l();
        synchronized (o7.f4531a) {
            str = o7.f4524A;
        }
        this.zzx = str;
    }

    private final synchronized void zzx() {
        int iOrdinal = this.zzr.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzb();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzb();
        }
    }

    private final synchronized void zzy() {
        int iOrdinal = this.zzr.ordinal();
        if (iOrdinal == 1) {
            this.zzb.zzc();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.zzc.zzc();
        }
    }

    private final void zzz() {
        G6.N nZzp = C6.n.f1857D.f1868h.zzp();
        String strZzh = zzh();
        G6.O o7 = (G6.O) nZzp;
        o7.getClass();
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkv)).booleanValue()) {
            o7.l();
            synchronized (o7.f4531a) {
                try {
                    if (o7.f4553x.equals(strZzh)) {
                        return;
                    }
                    o7.f4553x = strZzh;
                    SharedPreferences.Editor editor = o7.f4537g;
                    if (editor != null) {
                        editor.putString("inspector_info", strZzh);
                        o7.f4537g.apply();
                    }
                    o7.m();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void zza() throws JSONException {
        zzbio zzbioVar = zzbix.zzkv;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzkK)).booleanValue() && ((G6.O) C6.n.f1857D.f1868h.zzp()).f()) {
                zzw();
                return;
            }
            String strE = ((G6.O) C6.n.f1857D.f1868h.zzp()).e();
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            try {
                if (new JSONObject(strE).optBoolean("isTestMode", false)) {
                    zzw();
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(boolean r2) throws org.json.JSONException {
        /*
            r1 = this;
            boolean r0 = r1.zzu
            if (r0 != 0) goto La
            if (r2 == 0) goto L14
            r1.zzw()
            goto Lc
        La:
            if (r2 == 0) goto L14
        Lc:
            boolean r2 = r1.zzs
            if (r2 != 0) goto L14
            r1.zzx()
            return
        L14:
            boolean r2 = r1.zzs()
            if (r2 != 0) goto L1d
            r1.zzy()
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzecz.zzb(boolean):void");
    }

    public final void zzc(boolean z2) throws JSONException {
        if (!this.zzu && z2) {
            zzw();
        }
        zzt(z2, true);
    }

    public final synchronized boolean zzd() {
        return this.zzs;
    }

    public final void zze(zzecv zzecvVar) {
        zzu(zzecvVar, true);
    }

    public final zzecv zzf() {
        return this.zzr;
    }

    public final synchronized String zzg() {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkv)).booleanValue() && zzs()) {
            long j8 = this.zzq;
            C6.n.f1857D.k.getClass();
            if (j8 < System.currentTimeMillis() / 1000) {
                this.zzo = JsonUtils.EMPTY_JSON;
                this.zzq = Long.MAX_VALUE;
                return "";
            }
            if (!this.zzo.equals(JsonUtils.EMPTY_JSON)) {
                return this.zzo;
            }
        }
        return "";
    }

    public final synchronized String zzh() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzs);
            jSONObject.put("gesture", this.zzr);
            long j8 = this.zzq;
            C6.n.f1857D.k.getClass();
            if (j8 > System.currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("networkExtrasExpirationSecs", this.zzq);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized void zzi(String str, long j8) {
        this.zzo = str;
        this.zzq = j8;
        zzz();
    }

    public final synchronized void zzj(String str) {
        this.zzx = str;
        ((G6.O) C6.n.f1857D.f1868h.zzp()).i(this.zzx);
    }

    public final synchronized void zzk(String str, zzecn zzecnVar) {
        zzbio zzbioVar = zzbix.zzkv;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && zzs()) {
            if (this.zzt >= ((Integer) c0395s.f2492c.zzd(zzbix.zzkx)).intValue()) {
                int i5 = G6.L.f4523b;
                H6.l.f("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            Map map = this.zzl;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            this.zzt++;
            ((List) map.get(str)).add(zzecnVar);
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzkT)).booleanValue()) {
                String strZzd = zzecnVar.zzd();
                this.zzm.put(strZzd, zzecnVar);
                Map map2 = this.zzn;
                if (map2.containsKey(strZzd)) {
                    List list = (List) map2.get(strZzd);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzcgd) it.next()).zzc(zzecnVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized void zzl(long j8) {
        this.zzw += j8;
    }

    public final boolean zzm() {
        return this.zzw < ((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzkQ)).longValue();
    }

    public final synchronized p8.p zzn(String str) {
        zzcgd zzcgdVar;
        try {
            zzcgdVar = new zzcgd();
            Map map = this.zzm;
            if (map.containsKey(str)) {
                zzcgdVar.zzc((zzecn) map.get(str));
            } else {
                Map map2 = this.zzn;
                if (!map2.containsKey(str)) {
                    map2.put(str, new ArrayList());
                }
                ((List) map2.get(str)).add(zzcgdVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzcgdVar;
    }

    public final synchronized void zzo(InterfaceC0404w0 interfaceC0404w0, zzecy zzecyVar) {
        if (!zzs()) {
            try {
                interfaceC0404w0.zze(zzfmi.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i5 = G6.L.f4523b;
                H6.l.f("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkv)).booleanValue()) {
            this.zzv = zzecyVar;
            this.zza.zzm(interfaceC0404w0, new zzbqs(this), new zzbql(this.zzf), new zzbpy(this));
            return;
        } else {
            try {
                interfaceC0404w0.zze(zzfmi.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i10 = G6.L.f4523b;
                H6.l.f("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void zzp(JSONObject jSONObject) {
        this.zzp = jSONObject;
    }

    public final boolean zzq() {
        return this.zzp != null;
    }

    public final synchronized JSONObject zzr() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                String str = this.zzk;
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12);
                    sb2.append("afma-sdk-a-v");
                    sb2.append(str);
                    jSONObject.put("sdkVersion", sb2.toString());
                }
                jSONObject.put("internalSdkVersion", this.zzi);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.zzd.zzb());
                zzbio zzbioVar = zzbix.zzkW;
                C0395s c0395s = C0395s.f2489e;
                if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                    String strZzv = C6.n.f1857D.f1868h.zzv();
                    if (!TextUtils.isEmpty(strZzv)) {
                        jSONObject.put("plugin", strZzv);
                    }
                }
                long j8 = this.zzq;
                C6.n nVar = C6.n.f1857D;
                nVar.k.getClass();
                if (j8 < System.currentTimeMillis() / 1000) {
                    this.zzo = JsonUtils.EMPTY_JSON;
                }
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("adSlots", zzv());
                jSONObject.put("appInfo", this.zze.zza());
                String strZzd = ((G6.O) nVar.f1868h.zzp()).r().zzd();
                if (!TextUtils.isEmpty(strZzd)) {
                    jSONObject.put("cld", new JSONObject(strZzd));
                }
                if (((Boolean) c0395s.f2492c.zzd(zzbix.zzkL)).booleanValue() && (jSONObject2 = this.zzp) != null) {
                    String string = jSONObject2.toString();
                    StringBuilder sb3 = new StringBuilder(string.length() + 13);
                    sb3.append("Server data: ");
                    sb3.append(string);
                    String string2 = sb3.toString();
                    int i5 = G6.L.f4523b;
                    H6.l.a(string2);
                    jSONObject.put("serverData", this.zzp);
                }
                if (((Boolean) c0395s.f2492c.zzd(zzbix.zzkK)).booleanValue()) {
                    jSONObject.put("openAction", this.zzv);
                    jSONObject.put("gesture", this.zzr);
                }
                jSONObject.put("isGamRegisteredTestDevice", nVar.f1874o.g());
                H6.f fVar = C0392q.f2477g.f2478a;
                jSONObject.put("isSimulator", H6.f.t());
                if (((Boolean) c0395s.f2492c.zzd(zzbix.zzkY)).booleanValue()) {
                    jSONObject.put("uiStorage", new JSONObject(this.zzx));
                }
                if (!TextUtils.isEmpty((CharSequence) c0395s.f2492c.zzd(zzbix.zzla))) {
                    jSONObject.put("gmaDisk", this.zzh.zzb());
                }
                if (!TextUtils.isEmpty((CharSequence) c0395s.f2492c.zzd(zzbix.zzkZ))) {
                    jSONObject.put("userDisk", this.zzg.zzb());
                }
            } catch (JSONException e7) {
                C6.n.f1857D.f1868h.zzi(e7, "Inspector.toJson");
                int i10 = G6.L.f4523b;
                H6.l.g("Ad inspector encountered an error", e7);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final synchronized boolean zzs() {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkK)).booleanValue()) {
            return this.zzs || C6.n.f1857D.f1874o.g();
        }
        return this.zzs;
    }
}
