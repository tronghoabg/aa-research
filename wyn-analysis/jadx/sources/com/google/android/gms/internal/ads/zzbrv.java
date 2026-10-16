package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzbrv implements zzate {
    private volatile zzbri zza;
    private final Context zzb;

    public zzbrv(Context context) {
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzate
    public final zzath zza(zzatl zzatlVar) throws zzatu {
        Parcelable.Creator<zzbrj> creator = zzbrj.CREATOR;
        Map mapZzm = zzatlVar.zzm();
        int size = mapZzm.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i5 = 0;
        for (Map.Entry entry : mapZzm.entrySet()) {
            strArr[i5] = (String) entry.getKey();
            strArr2[i5] = (String) entry.getValue();
            i5++;
        }
        zzbrj zzbrjVar = new zzbrj(zzatlVar.zzh(), strArr, strArr2);
        C6.n nVar = C6.n.f1857D;
        nVar.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            zzcgd zzcgdVar = new zzcgd();
            this.zza = new zzbri(this.zzb, nVar.f1879t.j(), new zzbrt(this, zzcgdVar), new zzbru(this, zzcgdVar));
            this.zza.checkAvailabilityAndConnect();
            zzbrr zzbrrVar = new zzbrr(this, zzbrjVar);
            zzhcp zzhcpVar = zzcfy.zza;
            p8.p pVarZzi = zzhcf.zzi(zzhcf.zzj(zzcgdVar, zzbrrVar, zzhcpVar), ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzfA)).intValue(), TimeUnit.MILLISECONDS, zzcfy.zzd);
            pVarZzi.addListener(new zzbrs(this), zzhcpVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) pVarZzi.get();
            nVar.k.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(jElapsedRealtime2);
            sb2.append("ms");
            G6.L.k(sb2.toString());
            zzbrl zzbrlVar = (zzbrl) new zzcbi(parcelFileDescriptor).zza(zzbrl.CREATOR);
            if (zzbrlVar != null) {
                if (zzbrlVar.zza) {
                    throw new zzatu(zzbrlVar.zzb);
                }
                String[] strArr3 = zzbrlVar.zze;
                String[] strArr4 = zzbrlVar.zzf;
                if (strArr3.length == strArr4.length) {
                    HashMap map = new HashMap();
                    for (int i10 = 0; i10 < strArr3.length; i10++) {
                        map.put(strArr3[i10], strArr4[i10]);
                    }
                    return new zzath(zzbrlVar.zzc, zzbrlVar.zzd, map, zzbrlVar.zzg, zzbrlVar.zzh);
                }
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            C6.n.f1857D.k.getClass();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(jElapsedRealtime3);
            sb3.append("ms");
            G6.L.k(sb3.toString());
            return null;
        } catch (Throwable th) {
            C6.n.f1857D.k.getClass();
            long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb4 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 32);
            sb4.append("Http assets remote cache took ");
            sb4.append(jElapsedRealtime4);
            sb4.append("ms");
            G6.L.k(sb4.toString());
            throw th;
        }
    }

    public final /* synthetic */ void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zza.disconnect();
        Binder.flushPendingCommands();
    }

    public final /* synthetic */ zzbri zzc() {
        return this.zza;
    }
}
