package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class zzceh {
    static zzceh zzi;

    public static synchronized zzceh zzb(Context context) {
        try {
            zzceh zzcehVar = zzi;
            if (zzcehVar != null) {
                return zzcehVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbix.zza(applicationContext);
            C6.n nVar = C6.n.f1857D;
            G6.O o7 = (G6.O) nVar.f1868h.zzp();
            o7.n(applicationContext);
            zzceb zzcebVar = new zzceb(null);
            zzcebVar.zza(applicationContext);
            zzcebVar.zzb(nVar.k);
            zzcebVar.zzc(o7);
            zzcebVar.zzd(nVar.f1885z);
            zzceh zzcehVarZze = zzcebVar.zze();
            zzi = zzcehVarZze;
            ((zzcdv) ((zzcec) zzcehVarZze).zzc.zzb()).zza();
            final zzcem zzcemVar = (zzcem) ((zzcec) zzi).zzh.zzb();
            zzbio zzbioVar = zzbix.zzbk;
            C0395s c0395s = C0395s.f2489e;
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                final HashMap mapP = U.P((String) c0395s.f2492c.zzd(zzbix.zzbl));
                Iterator it = mapP.keySet().iterator();
                while (it.hasNext()) {
                    zzcemVar.zzb((String) it.next());
                }
                zzcemVar.zza(new zzcek() { // from class: com.google.android.gms.internal.ads.zzcel
                    @Override // com.google.android.gms.internal.ads.zzcek
                    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str, String str2) {
                        zzcemVar.zzc(mapP, sharedPreferences, str, str2);
                    }
                });
            }
            return zzi;
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract zzcdz zza();
}
