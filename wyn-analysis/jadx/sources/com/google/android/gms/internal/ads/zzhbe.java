package com.google.android.gms.internal.ads;

import Va.M6;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
abstract class zzhbe extends zzhbw implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    p8.p zza;
    Object zzb;

    public zzhbe(p8.p pVar, Object obj) {
        pVar.getClass();
        this.zza = pVar;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p8.p pVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (pVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (pVar.isCancelled()) {
            zzk(pVar);
            return;
        }
        try {
            try {
                Object objZzf = zzf(obj, zzhcf.zzs(pVar));
                this.zzb = null;
                zze(objZzf);
            } catch (Throwable th) {
                try {
                    zzhcx.zza(th);
                    zzb(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e7) {
            zzb(e7);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e10) {
            zzb(e10.getCause());
        } catch (Exception e11) {
            zzb(e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    public final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    public final String zzd() {
        String strT;
        p8.p pVar = this.zza;
        Object obj = this.zzb;
        String strZzd = super.zzd();
        if (pVar != null) {
            String string = pVar.toString();
            strT = M6.t(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strT = "";
        }
        if (obj == null) {
            if (strZzd != null) {
                return strT.concat(strZzd);
            }
            return null;
        }
        int length = strT.length();
        String string2 = obj.toString();
        return AbstractC3256n.h(new StringBuilder(string2.length() + length + 10 + 1), strT, "function=[", string2, "]");
    }

    public abstract void zze(Object obj);

    public abstract Object zzf(Object obj, Object obj2) throws Exception;
}
