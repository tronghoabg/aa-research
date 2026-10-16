package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.tika.utils.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzece {
    private final long zzd;
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdxk zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzeae zzl;
    private final H6.a zzm;
    private final zzdkf zzo;
    private final zzfqt zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzcgd zze = new zzcgd();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;

    public zzece(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdxk zzdxkVar, ScheduledExecutorService scheduledExecutorService, zzeae zzeaeVar, H6.a aVar, zzdkf zzdkfVar, zzfqt zzfqtVar) {
        this.zzh = zzdxkVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzeaeVar;
        this.zzm = aVar;
        this.zzo = zzdkfVar;
        this.zzp = zzfqtVar;
        C6.n.f1857D.k.getClass();
        this.zzd = SystemClock.elapsedRealtime();
        zzm("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    private final synchronized p8.p zzu() {
        C6.n nVar = C6.n.f1857D;
        String strZzd = ((G6.O) nVar.f1868h.zzp()).r().zzd();
        if (!TextUtils.isEmpty(strZzd)) {
            return zzhcf.zza(strZzd);
        }
        final zzcgd zzcgdVar = new zzcgd();
        G6.N nZzp = nVar.f1868h.zzp();
        ((G6.O) nZzp).f4533c.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzg(zzcgdVar);
            }
        });
        return zzcgdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzv, reason: merged with bridge method [inline-methods] */
    public final void zzm(String str, boolean z2, String str2, int i5) {
        this.zzn.put(str, new zzbrw(str, z2, i5, str2));
    }

    public final void zza() {
        this.zzq = false;
    }

    public final void zzb(final zzbsd zzbsdVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    zzbsdVar.zzb(this.zza.zzd());
                } catch (RemoteException e7) {
                    int i5 = G6.L.f4523b;
                    H6.l.d("", e7);
                }
            }
        }, this.zzj);
    }

    public final void zzc() {
        if (!((Boolean) zzbld.zza.zze()).booleanValue()) {
            int i5 = this.zzm.f4929c;
            zzbio zzbioVar = zzbix.zzcD;
            C0395s c0395s = C0395s.f2489e;
            if (i5 >= ((Integer) c0395s.f2492c.zzd(zzbioVar)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.zza) {
                            return;
                        }
                        this.zzl.zze();
                        this.zzo.zze();
                        zzcgd zzcgdVar = this.zze;
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzebw
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzf();
                            }
                        };
                        Executor executor = this.zzi;
                        zzcgdVar.addListener(runnable, executor);
                        this.zza = true;
                        p8.p pVarZzu = zzu();
                        this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeby
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzh();
                            }
                        }, ((Long) c0395s.f2492c.zzd(zzbix.zzcF)).longValue(), TimeUnit.SECONDS);
                        zzhcf.zzr(pVarZzu, new zzebu(this), executor);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzm("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final List zzd() {
        ArrayList arrayList = new ArrayList();
        Map map = this.zzn;
        for (String str : map.keySet()) {
            zzbrw zzbrwVar = (zzbrw) map.get(str);
            arrayList.add(new zzbrw(str, zzbrwVar.zzb, zzbrwVar.zzc, zzbrwVar.zzd));
        }
        return arrayList;
    }

    public final boolean zze() {
        return this.zzb;
    }

    public final /* synthetic */ void zzf() {
        this.zzl.zzf();
        this.zzo.zzf();
        this.zzb = true;
    }

    public final /* synthetic */ void zzg(final zzcgd zzcgdVar) {
        this.zzi.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzecc
            @Override // java.lang.Runnable
            public final void run() {
                String strZzd = ((G6.O) C6.n.f1857D.f1868h.zzp()).r().zzd();
                boolean zIsEmpty = TextUtils.isEmpty(strZzd);
                zzcgd zzcgdVar2 = zzcgdVar;
                if (zIsEmpty) {
                    zzcgdVar2.zzd(new Exception());
                } else {
                    zzcgdVar2.zzc(strZzd);
                }
            }
        });
    }

    public final void zzh() {
        synchronized (this) {
            try {
                if (this.zzc) {
                    return;
                }
                C6.n.f1857D.k.getClass();
                zzm("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (SystemClock.elapsedRealtime() - this.zzd));
                this.zzl.zzc("com.google.android.gms.ads.MobileAds", "timeout");
                this.zzo.zzc("com.google.android.gms.ads.MobileAds", "timeout");
                this.zze.zzd(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzi(Object obj, zzcgd zzcgdVar, String str, long j8, zzfqg zzfqgVar) {
        synchronized (obj) {
            try {
                if (!zzcgdVar.isDone()) {
                    C6.n.f1857D.k.getClass();
                    zzm(str, false, "Timeout.", (int) (SystemClock.elapsedRealtime() - j8));
                    this.zzl.zzc(str, "timeout");
                    this.zzo.zzc(str, "timeout");
                    zzfqt zzfqtVar = this.zzp;
                    zzfqgVar.zzk(AndroidInitializeBoldSDK.MSG_TIMEOUT);
                    zzfqgVar.zzd(false);
                    zzfqtVar.zzb(zzfqgVar.zzm());
                    zzcgdVar.zzc(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Object zzj(zzfqg zzfqgVar) {
        this.zze.zzc(Boolean.TRUE);
        zzfqgVar.zzd(true);
        this.zzp.zzb(zzfqgVar.zzm());
        return null;
    }

    public final /* synthetic */ void zzk(String str, zzbsa zzbsaVar, zzfme zzfmeVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzbsaVar.zze();
                    return;
                }
                Context context = (Context) this.zzg.get();
                if (context == null) {
                    context = this.zzf;
                }
                zzfmeVar.zzA(context, zzbsaVar, list);
            } catch (RemoteException e7) {
                int i5 = G6.L.f4523b;
                H6.l.d("", e7);
            }
        } catch (RemoteException e10) {
            throw new zzguo(e10);
        } catch (zzfln unused) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 74);
            sb2.append("Failed to initialize adapter. ");
            sb2.append(str);
            sb2.append(" does not implement the initialize() method.");
            zzbsaVar.zzf(sb2.toString());
        }
    }

    public final void zzl(String str) throws JSONException {
        final zzece zzeceVar = this;
        Context context = zzeceVar.zzf;
        int i5 = 5;
        final zzfqg zzfqgVarA = u.a(context, 5);
        zzfqgVarA.zza();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final zzfqg zzfqgVarA2 = u.a(context, i5);
                zzfqgVarA2.zza();
                zzfqgVarA2.zzi(next);
                final Object obj = new Object();
                final zzcgd zzcgdVar = new zzcgd();
                p8.p pVarZzi = zzhcf.zzi(zzcgdVar, ((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzcE)).longValue(), TimeUnit.SECONDS, zzeceVar.zzk);
                zzeceVar.zzl.zza(next);
                zzeceVar.zzo.zza(next);
                C6.n.f1857D.k.getClass();
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                pVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebz
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzi(obj, zzcgdVar, next, jElapsedRealtime, zzfqgVarA2);
                    }
                }, zzeceVar.zzi);
                arrayList.add(pVarZzi);
                try {
                } catch (JSONException e7) {
                    e = e7;
                    zzeceVar = this;
                }
                try {
                    final zzebv zzebvVar = new zzebv(this, obj, next, jElapsedRealtime, zzfqgVarA2, zzcgdVar);
                    zzeceVar = this;
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    final ArrayList arrayList2 = new ArrayList();
                    if (jSONObjectOptJSONObject != null) {
                        try {
                            JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray(JsonStorageKeyNames.DATA_KEY);
                            int i10 = 0;
                            while (i10 < jSONArray.length()) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                                String strOptString = jSONObject2.optString("format", "");
                                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject(JsonStorageKeyNames.DATA_KEY);
                                Bundle bundle = new Bundle();
                                if (jSONObjectOptJSONObject2 != null) {
                                    Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                    while (itKeys2.hasNext()) {
                                        String next2 = itKeys2.next();
                                        bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                        jSONArray = jSONArray;
                                    }
                                }
                                JSONArray jSONArray2 = jSONArray;
                                arrayList2.add(new zzbsg(strOptString, bundle));
                                i10++;
                                jSONArray = jSONArray2;
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    zzeceVar.zzm(next, false, "", 0);
                    try {
                        final zzfme zzfmeVarZza = zzeceVar.zzh.zza(next, new JSONObject());
                        zzeceVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecb
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzk(next, zzebvVar, zzfmeVarZza, arrayList2);
                            }
                        });
                    } catch (zzfln e10) {
                        try {
                            String string = "Failed to create Adapter.";
                            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoJ)).booleanValue()) {
                                String message = e10.getMessage();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 26);
                                sb2.append("Failed to create Adapter.");
                                sb2.append(StringUtils.SPACE);
                                sb2.append(message);
                                string = sb2.toString();
                            }
                            zzebvVar.zzf(string);
                        } catch (RemoteException e11) {
                            int i11 = G6.L.f4523b;
                            H6.l.d("", e11);
                        }
                    }
                    i5 = 5;
                } catch (JSONException e12) {
                    e = e12;
                    zzeceVar = this;
                    G6.L.l("Malformed CLD response", e);
                    zzeceVar.zzo.zzd("MalformedJson");
                    zzeceVar.zzl.zzd("MalformedJson");
                    zzeceVar.zze.zzd(e);
                    C6.n.f1857D.f1868h.zzh(e, "AdapterInitializer.updateAdapterStatus");
                    zzfqt zzfqtVar = zzeceVar.zzp;
                    zzfqgVarA.zzj(e);
                    zzfqgVarA.zzd(false);
                    zzfqtVar.zzb(zzfqgVarA.zzm());
                }
            }
            zzhcf.zzn(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeca
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    this.zza.zzj(zzfqgVarA);
                    return null;
                }
            }, zzeceVar.zzi);
        } catch (JSONException e13) {
            e = e13;
            G6.L.l("Malformed CLD response", e);
            zzeceVar.zzo.zzd("MalformedJson");
            zzeceVar.zzl.zzd("MalformedJson");
            zzeceVar.zze.zzd(e);
            C6.n.f1857D.f1868h.zzh(e, "AdapterInitializer.updateAdapterStatus");
            zzfqt zzfqtVar2 = zzeceVar.zzp;
            zzfqgVarA.zzj(e);
            zzfqgVarA.zzd(false);
            zzfqtVar2.zzb(zzfqgVarA.zzm());
        }
    }

    public final /* synthetic */ void zzn(boolean z2) {
        this.zzc = true;
    }

    public final /* synthetic */ long zzo() {
        return this.zzd;
    }

    public final /* synthetic */ zzcgd zzp() {
        return this.zze;
    }

    public final /* synthetic */ Executor zzq() {
        return this.zzi;
    }

    public final /* synthetic */ zzeae zzr() {
        return this.zzl;
    }

    public final /* synthetic */ zzdkf zzs() {
        return this.zzo;
    }

    public final /* synthetic */ zzfqt zzt() {
        return this.zzp;
    }
}
