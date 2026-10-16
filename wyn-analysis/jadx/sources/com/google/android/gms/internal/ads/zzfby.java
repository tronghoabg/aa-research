package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p7.AbstractC3772b;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class zzfby implements zzfcs {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfbz zzc = new zzfbz(new JSONArray().toString(), new Bundle(), "");
    final String zza;
    private final zzhcp zzd;
    private final ScheduledExecutorService zze;
    private final zzese zzf;
    private final Context zzg;
    private final zzflg zzh;
    private final zzerz zzi;
    private final zzdxk zzj;
    private final zzecg zzk;

    public zzfby(zzhcp zzhcpVar, ScheduledExecutorService scheduledExecutorService, String str, zzese zzeseVar, Context context, zzflg zzflgVar, zzerz zzerzVar, zzdxk zzdxkVar, zzecg zzecgVar) {
        this.zzd = zzhcpVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzeseVar;
        this.zzg = context;
        this.zzh = zzflgVar;
        this.zzi = zzerzVar;
        this.zzj = zzdxkVar;
        this.zzk = zzecgVar;
    }

    private final void zzf(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzesi zzesiVar = (zzesi) ((Map.Entry) it.next()).getValue();
            String str = zzesiVar.zza;
            list.add(zzh(str, Collections.singletonList(zzesiVar.zze), zzg(str), zzesiVar.zzb, zzesiVar.zzc));
        }
    }

    private final Bundle zzg(String str) {
        Bundle bundle = this.zzh.zzd.f2515m;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzhbx zzh(final String str, final List list, final Bundle bundle, final boolean z2, final boolean z10) {
        zzhbm zzhbmVar = new zzhbm() { // from class: com.google.android.gms.internal.ads.zzfbt
            @Override // com.google.android.gms.internal.ads.zzhbm
            public final /* synthetic */ p8.p zza() {
                return this.zza.zzd(str, list, bundle, z2, z10);
            }
        };
        zzhcp zzhcpVar = this.zzd;
        zzhbx zzhbxVarZzw = zzhbx.zzw(zzhcf.zzf(zzhbmVar, zzhcpVar));
        zzbio zzbioVar = zzbix.zzcp;
        C0395s c0395s = C0395s.f2489e;
        if (!((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            zzhbxVarZzw = (zzhbx) zzhcf.zzi(zzhbxVarZzw, ((Long) c0395s.f2492c.zzd(zzbix.zzci)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzhbx) zzhcf.zzg(zzhbxVarZzw, Throwable.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzfbu
            @Override // com.google.android.gms.internal.ads.zzgti
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                int i5 = zzfby.zzb;
                String str2 = str;
                int i10 = G6.L.f4523b;
                H6.l.c("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoL)).booleanValue()) {
                    C6.n.f1857D.f1868h.zzi(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                C6.n.f1857D.f1868h.zzh(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, zzhcpVar);
    }

    private final void zzi(zzbxi zzbxiVar, Bundle bundle, List list, zzesh zzeshVar) throws RemoteException {
        zzbxiVar.zze(new BinderC3877b(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zzf, zzeshVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        zzflg zzflgVar = this.zzh;
        if (zzflgVar.zzs) {
            if (!Arrays.asList(((String) C0395s.f2489e.f2492c.zzd(zzbix.zzcv)).split(",")).contains(AbstractC3772b.X(AbstractC3772b.Y(zzflgVar.zzd)))) {
                return zzhcf.zza(zzc);
            }
        }
        return zzhcf.zzf(new zzhbm() { // from class: com.google.android.gms.internal.ads.zzfbw
            @Override // com.google.android.gms.internal.ads.zzhbm
            public final /* synthetic */ p8.p zza() {
                return this.zza.zzc();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 32;
    }

    public final p8.p zzc() throws JSONException {
        final String str;
        zzfby zzfbyVar;
        zzbio zzbioVar = zzbix.zzmA;
        C0395s c0395s = C0395s.f2489e;
        String lowerCase = ((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() ? this.zzh.zzg.toLowerCase(Locale.ROOT) : this.zzh.zzg;
        final Bundle bundleZzg = ((Boolean) c0395s.f2492c.zzd(zzbix.zzct)).booleanValue() ? this.zzk.zzg() : new Bundle();
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzfl)).booleanValue()) {
            int iZzk = ((G6.O) C6.n.f1857D.f1868h.zzp()).r().zzk();
            str = iZzk != 1 ? iZzk != 2 ? "EMPTY" : "INVALID" : "VALID";
        } else {
            str = "";
        }
        final ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = this.zzh.zzw;
        if (jSONArray != null) {
            HashMap map = new HashMap();
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i5);
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                    String string = (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) ? "" : jSONArrayOptJSONArray.getString(0);
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(JsonStorageKeyNames.DATA_KEY);
                        Bundle bundle = new Bundle();
                        if (jSONObjectOptJSONObject != null) {
                            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                bundle.putString(next, jSONObjectOptJSONObject.optString(next, ""));
                            }
                        }
                        map.put(string, new zzesi(string, true, true, false, bundle));
                    }
                } catch (JSONException e7) {
                    C6.n.f1857D.f1868h.zzh(new JSONException("Malformed RTB adapter config."), "RecursiveRtbAdapterMap.parseAdapters");
                    G6.L.l("Malformed RTB adapter config.", e7);
                }
            }
            zzf(arrayList, map);
            zzfbyVar = this;
        } else if (((Boolean) c0395s.f2492c.zzd(zzbix.zzcC)).booleanValue()) {
            zzfbyVar = this;
            zzf(arrayList, zzfbyVar.zzf.zzd(zzfbyVar.zza, lowerCase));
        } else {
            zzese zzeseVar = this.zzf;
            for (Map.Entry entry : zzeseVar.zzc(this.zza, lowerCase).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzh(str2, (List) entry.getValue(), zzg(str2), true, true));
            }
            zzfbyVar = this;
            zzf(arrayList, zzeseVar.zzb());
        }
        return zzhcf.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfbs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i10 = zzfby.zzb;
                JSONArray jSONArray2 = new JSONArray();
                for (p8.p pVar : arrayList) {
                    if (((JSONObject) pVar.get()) != null) {
                        jSONArray2.put(pVar.get());
                    }
                }
                String str3 = str;
                Bundle bundle2 = bundleZzg;
                if (jSONArray2.length() != 0) {
                    return new zzfbz(jSONArray2.toString(), bundle2, str3);
                }
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfl)).booleanValue()) {
                    return new zzfbz(new JSONArray().toString(), bundle2, str3);
                }
                return null;
            }
        }, zzfbyVar.zzd);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p8.p zzd(java.lang.String r8, final java.util.List r9, final android.os.Bundle r10, boolean r11, boolean r12) throws android.os.RemoteException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzcgd r3 = new com.google.android.gms.internal.ads.zzcgd
            r3.<init>()
            r1 = 0
            if (r12 == 0) goto L25
            com.google.android.gms.internal.ads.zzbio r12 = com.google.android.gms.internal.ads.zzbix.zzcu
            D6.s r0 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r0 = r0.f2492c
            java.lang.Object r12 = r0.zzd(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L25
            com.google.android.gms.internal.ads.zzerz r12 = r7.zzi
            r12.zza(r8)
            com.google.android.gms.internal.ads.zzbxi r12 = r12.zzb(r8)
        L23:
            r2 = r12
            goto L34
        L25:
            com.google.android.gms.internal.ads.zzdxk r12 = r7.zzj     // Catch: android.os.RemoteException -> L2c
            com.google.android.gms.internal.ads.zzbxi r12 = r12.zzb(r8)     // Catch: android.os.RemoteException -> L2c
            goto L23
        L2c:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = "Couldn't create RTB adapter : "
            G6.L.l(r0, r12)
            r2 = r1
        L34:
            if (r2 != 0) goto L4f
            com.google.android.gms.internal.ads.zzbio r9 = com.google.android.gms.internal.ads.zzbix.zzck
            D6.s r10 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r10 = r10.f2492c
            java.lang.Object r9 = r10.zzd(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L4e
            com.google.android.gms.internal.ads.zzesh.zzd(r8, r3)
            r1 = r7
            goto Lb8
        L4e:
            throw r1
        L4f:
            com.google.android.gms.internal.ads.zzesh r0 = new com.google.android.gms.internal.ads.zzesh
            C6.n r12 = C6.n.f1857D
            n7.b r12 = r12.k
            r12.getClass()
            long r4 = android.os.SystemClock.elapsedRealtime()
            r1 = r8
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbio r8 = com.google.android.gms.internal.ads.zzbix.zzcp
            D6.s r12 = D6.C0395s.f2489e
            com.google.android.gms.internal.ads.zzbiv r1 = r12.f2492c
            java.lang.Object r8 = r1.zzd(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            com.google.android.gms.internal.ads.zzbiv r12 = r12.f2492c
            if (r8 == 0) goto L8c
            java.util.concurrent.ScheduledExecutorService r8 = r7.zze
            com.google.android.gms.internal.ads.zzfbx r1 = new com.google.android.gms.internal.ads.zzfbx
            r1.<init>()
            com.google.android.gms.internal.ads.zzbio r4 = com.google.android.gms.internal.ads.zzbix.zzci
            java.lang.Object r4 = r12.zzd(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            r8.schedule(r1, r4, r6)
        L8c:
            if (r11 == 0) goto Lb4
            com.google.android.gms.internal.ads.zzbio r8 = com.google.android.gms.internal.ads.zzbix.zzcw
            java.lang.Object r8 = r12.zzd(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lad
            com.google.android.gms.internal.ads.zzhcp r8 = r7.zzd
            r5 = r0
            com.google.android.gms.internal.ads.zzfbv r0 = new com.google.android.gms.internal.ads.zzfbv
            r1 = r7
            r4 = r9
            r6 = r3
            r3 = r10
            r0.<init>()
            r3 = r6
            r8.zza(r0)
            goto Lb8
        Lad:
            r1 = r7
            r4 = r9
            r8 = r10
            r7.zzi(r2, r8, r4, r0)
            goto Lb8
        Lb4:
            r1 = r7
            r0.zzb()
        Lb8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfby.zzd(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):p8.p");
    }

    public final /* synthetic */ void zze(zzbxi zzbxiVar, Bundle bundle, List list, zzesh zzeshVar, zzcgd zzcgdVar) {
        try {
            zzi(zzbxiVar, bundle, list, zzeshVar);
        } catch (RemoteException e7) {
            zzcgdVar.zzd(e7);
        }
    }
}
