package com.google.android.gms.internal.ads;

import D6.C0395s;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzcht {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final boolean zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final long zzm;
    public final long zzn;

    public zzcht(String str) throws JSONException {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.zza = zza(jSONObject, "aggressive_media_codec_release", zzbix.zzaB);
        this.zzb = zzb(jSONObject, "byte_buffer_precache_limit", zzbix.zzn);
        this.zzc = zzb(jSONObject, "exo_cache_buffer_size", zzbix.zzA);
        this.zzd = zzb(jSONObject, "exo_connect_timeout_millis", zzbix.zzj);
        zzbio zzbioVar = zzbix.zzi;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        }
        this.zze = zzb(jSONObject, "exo_read_timeout_millis", zzbix.zzk);
        this.zzf = zzb(jSONObject, "load_check_interval_bytes", zzbix.zzl);
        this.zzg = zzb(jSONObject, "player_precache_limit", zzbix.zzm);
        this.zzh = zzb(jSONObject, "socket_receive_buffer_size", zzbix.zzo);
        this.zzi = zza(jSONObject, "use_cache_data_source", zzbix.zzfr);
        zzb(jSONObject, "min_retry_count", zzbix.zzp);
        this.zzj = zza(jSONObject, "treat_load_exception_as_non_fatal", zzbix.zzr);
        this.zzk = zza(jSONObject, "enable_multiple_video_playback", zzbix.zzcH);
        this.zzl = zza(jSONObject, "use_range_http_data_source", zzbix.zzcJ);
        this.zzm = zzc(jSONObject, "range_http_data_source_high_water_mark", zzbix.zzcK);
        this.zzn = zzc(jSONObject, "range_http_data_source_low_water_mark", zzbix.zzcL);
    }

    private static final boolean zza(JSONObject jSONObject, String str, zzbio zzbioVar) {
        boolean zBooleanValue = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbioVar)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return zBooleanValue;
    }

    private static final int zzb(JSONObject jSONObject, String str, zzbio zzbioVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) C0395s.f2489e.f2492c.zzd(zzbioVar)).intValue();
    }

    private static final long zzc(JSONObject jSONObject, String str, zzbio zzbioVar) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) C0395s.f2489e.f2492c.zzd(zzbioVar)).longValue();
    }
}
