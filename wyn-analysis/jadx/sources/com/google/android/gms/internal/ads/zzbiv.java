package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzbiv implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbiz.zza(new zzguj() { // from class: com.google.android.gms.internal.ads.zzbis
                    @Override // com.google.android.gms.internal.ads.zzguj
                    public final /* synthetic */ Object zza() {
                        return sharedPreferences.getString("flag_configuration", JsonUtils.EMPTY_JSON);
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00af A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #2 {all -> 0x0054, blocks: (B:22:0x0046, B:37:0x0064, B:39:0x006e, B:40:0x0076, B:42:0x007c, B:44:0x008c, B:46:0x00a1, B:50:0x00af, B:52:0x00b3, B:54:0x00c3, B:56:0x00d8, B:59:0x00e4, B:69:0x0123, B:73:0x0130, B:75:0x013e, B:77:0x014c, B:78:0x0153, B:80:0x0161, B:82:0x0165, B:83:0x0168, B:62:0x00f5, B:64:0x0103, B:66:0x010b, B:67:0x0116, B:26:0x004d, B:32:0x005a), top: B:97:0x0046, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4 A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #2 {all -> 0x0054, blocks: (B:22:0x0046, B:37:0x0064, B:39:0x006e, B:40:0x0076, B:42:0x007c, B:44:0x008c, B:46:0x00a1, B:50:0x00af, B:52:0x00b3, B:54:0x00c3, B:56:0x00d8, B:59:0x00e4, B:69:0x0123, B:73:0x0130, B:75:0x013e, B:77:0x014c, B:78:0x0153, B:80:0x0161, B:82:0x0165, B:83:0x0168, B:62:0x00f5, B:64:0x0103, B:66:0x010b, B:67:0x0116, B:26:0x004d, B:32:0x005a), top: B:97:0x0046, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0127 A[Catch: all -> 0x000f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:13:0x0012, B:15:0x0017, B:16:0x0019, B:18:0x002b, B:19:0x002f, B:20:0x0031, B:47:0x00a5, B:48:0x00ac, B:57:0x00dc, B:71:0x0127, B:84:0x016f, B:85:0x0176, B:87:0x0178, B:88:0x017f, B:22:0x0046, B:37:0x0064, B:39:0x006e, B:40:0x0076, B:42:0x007c, B:44:0x008c, B:46:0x00a1, B:50:0x00af, B:52:0x00b3, B:54:0x00c3, B:56:0x00d8, B:59:0x00e4, B:69:0x0123, B:73:0x0130, B:75:0x013e, B:77:0x014c, B:78:0x0153, B:80:0x0161, B:82:0x0165, B:83:0x0168, B:62:0x00f5, B:64:0x0103, B:66:0x010b, B:67:0x0116, B:26:0x004d, B:32:0x005a), top: B:100:0x0009, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0130 A[Catch: all -> 0x0054, TRY_ENTER, TryCatch #2 {all -> 0x0054, blocks: (B:22:0x0046, B:37:0x0064, B:39:0x006e, B:40:0x0076, B:42:0x007c, B:44:0x008c, B:46:0x00a1, B:50:0x00af, B:52:0x00b3, B:54:0x00c3, B:56:0x00d8, B:59:0x00e4, B:69:0x0123, B:73:0x0130, B:75:0x013e, B:77:0x014c, B:78:0x0153, B:80:0x0161, B:82:0x0165, B:83:0x0168, B:62:0x00f5, B:64:0x0103, B:66:0x010b, B:67:0x0116, B:26:0x004d, B:32:0x005a), top: B:97:0x0046, outer: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbiv.zza(android.content.Context):void");
    }

    public final boolean zzb() {
        return this.zzi;
    }

    public final boolean zzc() {
        return this.zzj;
    }

    public final Object zzd(final zzbio zzbioVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                try {
                    if (!this.zza) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbioVar.zzf();
            }
        }
        if (zzbioVar.zzm() != 2) {
            return (zzbioVar.zzm() == 1 && this.zzh.has(zzbioVar.zze())) ? zzbioVar.zzc(this.zzh) : zzbiz.zza(new zzguj() { // from class: com.google.android.gms.internal.ads.zzbiu
                @Override // com.google.android.gms.internal.ads.zzguj
                public final /* synthetic */ Object zza() {
                    return this.zza.zzf(zzbioVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbioVar.zzf() : zzbioVar.zza(bundle);
    }

    public final Object zze(zzbio zzbioVar) {
        return (this.zzd || this.zza) ? zzd(zzbioVar) : zzbioVar.zzf();
    }

    public final /* synthetic */ Object zzf(zzbio zzbioVar) {
        return zzbioVar.zzd(this.zze);
    }
}
