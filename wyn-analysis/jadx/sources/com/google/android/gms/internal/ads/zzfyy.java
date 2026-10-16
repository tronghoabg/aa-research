package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzfyy implements zzfxt {
    private final Object zza;
    private final zzfyz zzb;
    private final zzfzk zzc;
    private final zzfxq zzd;
    private final boolean zze;

    public zzfyy(Object obj, zzfyz zzfyzVar, zzfzk zzfzkVar, zzfxq zzfxqVar, boolean z2) {
        this.zza = obj;
        this.zzb = zzfyzVar;
        this.zzc = zzfzkVar;
        this.zzd = zzfxqVar;
        this.zze = z2;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzazl zzazlVarZza = zzazm.zza();
        zzazlVarZza.zzd(5);
        zzazlVarZza.zza(zzidl.zzt(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzazm) zzazlVarZza.zzbu()).zzaN(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        Object obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.zza;
        } catch (Exception e7) {
            this.zzd.zzc(2007, System.currentTimeMillis() - jCurrentTimeMillis, e7);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfxt
    public final synchronized String zza(Context context, String str) {
        byte[] bArrZzj;
        try {
            Map mapZzb = this.zzc.zzb();
            mapZzb.put("f", "q");
            mapZzb.put("ctx", context);
            mapZzb.put("aid", null);
            bArrZzj = zzj(null, mapZzb);
            if (this.zze) {
                mapZzb.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxt
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        byte[] bArrZzj;
        try {
            Map mapZzc = this.zzc.zzc();
            mapZzc.put("f", "v");
            mapZzc.put("ctx", context);
            mapZzc.put("aid", null);
            mapZzc.put("view", view);
            mapZzc.put("act", activity);
            bArrZzj = zzj(null, mapZzc);
            if (this.zze) {
                mapZzc.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxt
    public final synchronized String zzc(Context context, String str, String str2, View view, Activity activity) {
        byte[] bArrZzj;
        try {
            Map mapZzd = this.zzc.zzd();
            mapZzd.put("f", "c");
            mapZzd.put("ctx", context);
            mapZzd.put("cs", str2);
            mapZzd.put("aid", null);
            mapZzd.put("view", view);
            mapZzd.put("act", activity);
            bArrZzj = zzj(null, mapZzd);
            if (this.zze) {
                mapZzd.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzi(bArrZzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxt
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfzi {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map mapZze = this.zzc.zze();
            mapZze.put("aid", null);
            mapZze.put("evt", motionEvent);
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, mapZze);
            this.zzd.zzb(Sdk.SDKMetric.SDKMetricType.BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e7) {
            throw new zzfzi(2005, e7);
        }
    }

    public final zzfyz zze() {
        return this.zzb;
    }

    public final synchronized boolean zzf() throws zzfzi {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e7) {
            throw new zzfzi(2001, e7);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", new Class[0]).invoke(obj, new Object[0])).booleanValue();
    }

    public final synchronized void zzg() throws zzfzi {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("close", new Class[0]).invoke(obj, new Object[0]);
            this.zzd.zzb(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e7) {
            throw new zzfzi(2003, e7);
        }
    }

    public final synchronized int zzh() throws zzfzi {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e7) {
            throw new zzfzi(2006, e7);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(obj, new Object[0])).intValue();
    }
}
