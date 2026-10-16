package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdxk {
    private final zzfmc zza;
    private final zzdxh zzb;

    public zzdxk(zzfmc zzfmcVar, zzdxh zzdxhVar) {
        this.zza = zzfmcVar;
        this.zzb = zzdxhVar;
    }

    public final zzfme zza(String str, JSONObject jSONObject) throws zzfln {
        zzbvm zzbvmVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbvmVarZzb = new zzbwk(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbvmVarZzb = new zzbwk(new zzbyb());
            } else {
                zzbvj zzbvjVarZzd = zzd();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzbvmVarZzb = zzbvjVarZzd.zzc(string) ? zzbvjVarZzd.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zzbvjVarZzd.zzd(string) ? zzbvjVarZzd.zzb(string) : zzbvjVarZzd.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e7) {
                        int i5 = G6.L.f4523b;
                        H6.l.d("Invalid custom event.", e7);
                    }
                } else {
                    zzbvmVarZzb = zzbvjVarZzd.zzb(str);
                }
            }
            zzfme zzfmeVar = new zzfme(zzbvmVarZzb);
            this.zzb.zza(str, zzfmeVar);
            return zzfmeVar;
        } catch (Throwable th) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkS)).booleanValue()) {
                this.zzb.zza(str, null);
            }
            throw new zzfln(th);
        }
    }

    public final zzbxi zzb(String str) throws RemoteException {
        zzbxi zzbxiVarZze = zzd().zze(str);
        this.zzb.zzb(str, zzbxiVarZze);
        return zzbxiVarZze;
    }

    public final boolean zzc() {
        return this.zza.zzd() != null;
    }

    public final zzbvj zzd() throws RemoteException {
        zzbvj zzbvjVarZzd = this.zza.zzd();
        if (zzbvjVarZzd != null) {
            return zzbvjVarZzd;
        }
        int i5 = G6.L.f4523b;
        H6.l.f("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
