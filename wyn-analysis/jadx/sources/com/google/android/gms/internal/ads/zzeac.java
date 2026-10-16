package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class zzeac {
    protected final Map zza;
    protected final Context zzb;
    protected final Executor zzc;
    protected final H6.p zzd;
    protected final boolean zze;
    private final O6.c zzf;
    private final boolean zzg;
    private final AtomicBoolean zzh;
    private final AtomicReference zzi;

    public zzeac(Executor executor, H6.p pVar, O6.c cVar, Context context) {
        this.zza = new HashMap();
        this.zzh = new AtomicBoolean();
        this.zzi = new AtomicReference(new Bundle());
        this.zzc = executor;
        this.zzd = pVar;
        zzbio zzbioVar = zzbix.zzcN;
        C0395s c0395s = C0395s.f2489e;
        this.zze = ((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue();
        this.zzf = cVar;
        this.zzg = ((Boolean) c0395s.f2492c.zzd(zzbix.zzia)).booleanValue();
        this.zzb = context;
    }

    private final void zza(Map map) {
        Bundle bundleK;
        if (map == null || map.isEmpty()) {
            int i5 = G6.L.f4523b;
            H6.l.a("Empty or null paramMap.");
            return;
        }
        if (!this.zzh.getAndSet(true)) {
            final String str = (String) C0395s.f2489e.f2492c.zzd(zzbix.zzmg);
            Context context = this.zzb;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.ads.zzeaa
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                    this.zza.zzg(str, sharedPreferences, str2);
                }
            };
            if (TextUtils.isEmpty(str)) {
                bundleK = Bundle.EMPTY;
            } else {
                PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                bundleK = Fe.c.K(context, str);
            }
            this.zzi.set(bundleK);
        }
        Bundle bundle = (Bundle) this.zzi.get();
        for (String str2 : bundle.keySet()) {
            map.put(str2, String.valueOf(bundle.get(str2)));
        }
    }

    public final void zzb(Map map) {
        if (map.isEmpty()) {
            int i5 = G6.L.f4523b;
            H6.l.a("Empty paramMap.");
            return;
        }
        zza(map);
        final String strA = this.zzf.a(map);
        G6.L.k(strA);
        boolean z2 = Boolean.parseBoolean((String) map.get("scar"));
        if (this.zze) {
            if (!z2 || this.zzg) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeab
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzd.a(null, strA);
                    }
                });
            }
        }
    }

    public final String zzc(Map map) {
        return this.zzf.a(map);
    }

    public final ConcurrentHashMap zzd() {
        return new ConcurrentHashMap(this.zza);
    }

    public final H6.o zze(Map map) {
        if (map.isEmpty()) {
            int i5 = G6.L.f4523b;
            H6.l.a("Empty paramMap.");
            return H6.o.f4961a;
        }
        String strA = this.zzf.a(map);
        G6.L.k(strA);
        return this.zzd.a(null, strA);
    }

    public final void zzf(Map map) {
        if (map.isEmpty()) {
            int i5 = G6.L.f4523b;
            H6.l.a("Empty paramMap.");
            return;
        }
        zza(map);
        final String strA = this.zzf.a(map);
        G6.L.k(strA);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzoR)).booleanValue() || this.zze) {
            this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd.a(null, strA);
                }
            });
        }
    }

    public final /* synthetic */ void zzg(String str, SharedPreferences sharedPreferences, String str2) {
        this.zzi.set(Fe.c.K(this.zzb, str));
    }
}
