package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.K0;
import android.os.RemoteException;
import android.os.SystemClock;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzesh extends zzbxk {
    private final String zza;
    private final zzbxi zzb;
    private final zzcgd zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzesh(String str, zzbxi zzbxiVar, zzcgd zzcgdVar, long j8) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzcgdVar;
        this.zza = str;
        this.zzb = zzbxiVar;
        this.zze = j8;
        try {
            jSONObject.put("adapter_version", zzbxiVar.zzf().toString());
            jSONObject.put("sdk_version", zzbxiVar.zzg().toString());
            jSONObject.put(MediationMetaData.KEY_NAME, str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzd(String str, zzcgd zzcgdVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(MediationMetaData.KEY_NAME, str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcq)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                zzcgdVar.zzc(jSONObject);
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzh(String str, int i5) {
        try {
            if (this.zzf) {
                return;
            }
            try {
                JSONObject jSONObject = this.zzd;
                jSONObject.put("signal_error", str);
                zzbio zzbioVar = zzbix.zzcr;
                C0395s c0395s = C0395s.f2489e;
                if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                    C6.n.f1857D.k.getClass();
                    jSONObject.put("latency", SystemClock.elapsedRealtime() - this.zze);
                }
                if (((Boolean) c0395s.f2492c.zzd(zzbix.zzcq)).booleanValue()) {
                    jSONObject.put("signal_error_code", i5);
                }
            } catch (JSONException unused) {
            }
            this.zzc.zzc(this.zzd);
            this.zzf = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb() {
        if (this.zzf) {
            return;
        }
        try {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcq)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final synchronized void zze(String str) throws RemoteException {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            JSONObject jSONObject = this.zzd;
            jSONObject.put("signals", str);
            zzbio zzbioVar = zzbix.zzcr;
            C0395s c0395s = C0395s.f2489e;
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                C6.n.f1857D.k.getClass();
                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.zze);
            }
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzcq)).booleanValue()) {
                jSONObject.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final synchronized void zzf(String str) throws RemoteException {
        zzh(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final synchronized void zzg(K0 k02) throws RemoteException {
        zzh(k02.f2339b, 2);
    }
}
