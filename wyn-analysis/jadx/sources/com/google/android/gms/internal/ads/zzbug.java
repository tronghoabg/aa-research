package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.content.Context;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzbug {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbup zzc;
    private zzbup zzd;

    private static final Context zzd(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final boolean zze(Context context) {
        if (((Boolean) zzbld.zzc.zze()).booleanValue()) {
            return false;
        }
        G6.S sI = U.I(zzd(context));
        return sI.f4561b.toLowerCase(Locale.ROOT).equals("ru");
    }

    public final zzbup zza(Context context, H6.a aVar, zzfqt zzfqtVar) {
        zzbup zzbupVar;
        String str;
        synchronized (this.zzb) {
            try {
                if (this.zzd == null) {
                    Context contextZzd = zzd(context);
                    if (zze(context)) {
                        str = (String) C0395s.f2489e.f2492c.zzd(zzbix.zzc);
                    } else {
                        str = (String) zzblh.zza.zze();
                    }
                    this.zzd = new zzbup(contextZzd, aVar, str, zzfqtVar);
                }
                zzbupVar = this.zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbupVar;
    }

    public final zzbup zzb(Context context, H6.a aVar, zzfqt zzfqtVar) {
        zzbup zzbupVar;
        String str;
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    if (zze(context)) {
                        str = (String) C0395s.f2489e.f2492c.zzd(zzbix.zzc);
                    } else if (((Boolean) zzbld.zzh.zze()).booleanValue()) {
                        str = (String) C0395s.f2489e.f2492c.zzd(zzbix.zza);
                    } else {
                        str = (String) C0395s.f2489e.f2492c.zzd(zzbix.zzb);
                    }
                    this.zzc = new zzbup(zzd(context), aVar, str, zzfqtVar);
                }
                zzbupVar = this.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbupVar;
    }

    public final void zzc() {
        synchronized (this.zza) {
            try {
                zzbup zzbupVar = this.zzc;
                if (zzbupVar != null) {
                    zzbupVar.zzc();
                    this.zzc = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
