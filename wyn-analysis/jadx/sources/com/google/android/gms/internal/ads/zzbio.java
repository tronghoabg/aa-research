package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class zzbio {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    public zzbio(int i5, String str, Object obj, Object obj2, byte[] bArr) {
        this.zza = i5;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        C0395s.f2489e.f2490a.zza(this);
    }

    public static zzbio zzh(int i5, String str, int i10, int i11) {
        return new zzbik(1, str, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static zzbio zzi(int i5, String str, long j8, long j10) {
        return new zzbil(1, str, Long.valueOf(j8), Long.valueOf(j10));
    }

    public static zzbio zzj(int i5, String str, float f10, float f11) {
        return new zzbim(1, str, Float.valueOf(f10), Float.valueOf(f11));
    }

    public static zzbio zzk(int i5, String str) {
        zzbin zzbinVar = new zzbin(1, "gads:sdk_core_constants:experiment_id", null, null);
        C0395s.f2489e.f2490a.zzb(zzbinVar);
        return zzbinVar;
    }

    public static zzbio zzl(int i5, String str) {
        zzbin zzbinVar = new zzbin(1, "gads:sdk_core_constants_service:experiment_id", null, null);
        C0395s.f2489e.f2490a.zzc(zzbinVar);
        return zzbinVar;
    }

    public abstract Object zza(Bundle bundle);

    public abstract void zzb(SharedPreferences.Editor editor, Object obj);

    public abstract Object zzc(JSONObject jSONObject);

    public abstract Object zzd(SharedPreferences sharedPreferences);

    public final String zze() {
        return this.zzb;
    }

    public final Object zzf() {
        return C0395s.f2489e.f2492c.zzb() ? this.zzd : this.zzc;
    }

    public final Object zzg() {
        return C0395s.f2489e.f2492c.zzd(this);
    }

    public final int zzm() {
        return this.zza;
    }
}
