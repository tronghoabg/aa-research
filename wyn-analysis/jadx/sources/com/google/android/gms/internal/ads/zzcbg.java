package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import j$.util.Objects;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import r7.C3934d;

/* loaded from: classes3.dex */
public final class zzcbg extends zzcbd {
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbuf zzd;
    private final H6.a zze;
    private final Executor zzg;
    private final Object zza = new Object();
    private final AtomicBoolean zzf = new AtomicBoolean(false);

    public zzcbg(Context context, zzbuf zzbufVar, H6.a aVar, Executor executor) {
        this.zzb = context.getApplicationContext();
        this.zze = aVar;
        this.zzd = zzbufVar;
        this.zzg = executor;
    }

    public static JSONObject zzc(Context context, H6.a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzbkx.zzf.zze()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", aVar.f4927a);
            jSONObject.put("mf", zzbkx.zzg.zze());
            jSONObject.put("cl", "910357297");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", C3934d.d(context, ModuleDescriptor.MODULE_ID, false));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final p8.p zza() {
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
                }
            } finally {
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        long j8 = sharedPreferences != null ? sharedPreferences.getLong("js_last_update", 0L) : 0L;
        C6.n.f1857D.k.getClass();
        if (System.currentTimeMillis() - j8 < ((Long) zzbkx.zzh.zze()).longValue()) {
            return zzhcf.zza(null);
        }
        return zzhcf.zzk(this.zzd.zzb(zzc(this.zzb, this.zze)), new zzgti() { // from class: com.google.android.gms.internal.ads.zzcbe
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) throws JSONException {
                this.zza.zze((JSONObject) obj);
                return null;
            }
        }, ((Boolean) zzbkx.zzm.zze()).booleanValue() ? this.zzg : zzcfy.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzcbd
    public final p8.p zzb() {
        if (!((Boolean) zzbkx.zza.zze()).booleanValue()) {
            return zza();
        }
        if (!this.zzf.compareAndSet(false, true)) {
            return zzhcf.zzb();
        }
        p8.p pVarZza = zza();
        pVarZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        }, zzcfy.zzh);
        return pVarZza;
    }

    public final /* synthetic */ void zzd() {
        this.zzf.set(false);
    }

    public final Void zze(JSONObject jSONObject) throws JSONException {
        SharedPreferences sharedPreferencesZza;
        zzbio zzbioVar = zzbix.zza;
        C0395s c0395s = C0395s.f2489e;
        zzbiq zzbiqVar = c0395s.f2491b;
        Context context = this.zzb;
        SharedPreferences sharedPreferencesZzb = zzbiq.zzb(context);
        if (sharedPreferencesZzb == null) {
            return null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesZzb.edit();
        zzbip zzbipVar = c0395s.f2490a;
        Objects.requireNonNull(zzbipVar);
        int i5 = zzbkn.zza;
        zzbipVar.zzd(editorEdit, 1, jSONObject);
        if (((Boolean) zzbkx.zzo.zze()).booleanValue() || ((Boolean) zzbkx.zzp.zze()).booleanValue()) {
            editorEdit.apply();
        } else {
            editorEdit.commit();
        }
        if (((Boolean) zzbkx.zze.zze()).booleanValue() && !TextUtils.equals(context.getPackageName(), "com.google.android.gms") && (sharedPreferencesZza = zzbiq.zza(context)) != null) {
            SharedPreferences.Editor editorEdit2 = sharedPreferencesZza.edit();
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.startsWith("adapter:")) {
                    try {
                        jSONObject2.put(next, jSONObject.get(next));
                    } catch (JSONException unused) {
                    }
                }
            }
            editorEdit2.putString("flag_configuration", jSONObject2.toString());
            editorEdit2.apply();
        }
        SharedPreferences sharedPreferences = this.zzc;
        if (sharedPreferences == null) {
            return null;
        }
        SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
        C6.n.f1857D.k.getClass();
        editorEdit3.putLong("js_last_update", System.currentTimeMillis()).apply();
        return null;
    }
}
