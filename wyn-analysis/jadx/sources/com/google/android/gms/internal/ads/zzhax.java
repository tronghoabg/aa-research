package com.google.android.gms.internal.ads;

import Va.M6;
import java.util.concurrent.ExecutionException;
import ka.AbstractC3256n;

/* loaded from: classes3.dex */
abstract class zzhax extends zzhbw implements Runnable {
    public static final /* synthetic */ int zzd = 0;
    p8.p zza;
    Class zzb;
    Object zzc;

    public zzhax(p8.p pVar, Class cls, Object obj) {
        pVar.getClass();
        this.zza = pVar;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        p8.p pVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        if (((obj == null) || ((pVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = pVar instanceof zzhdh ? ((zzhdh) pVar).zzl() : null;
        } catch (ExecutionException e7) {
            Throwable cause = e7.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(pVar.getClass());
                String strValueOf2 = String.valueOf(e7.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + strValueOf.length() + 19 + 16);
                AbstractC3256n.p(sb2, "Future type ", strValueOf, " threw ", strValueOf2);
                sb2.append(" without a cause");
                cause = new NullPointerException(sb2.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objZzs = th == null ? zzhcf.zzs(pVar) : null;
        if (th == null) {
            zza(objZzs);
            return;
        }
        if (!cls.isInstance(th)) {
            zzk(pVar);
            return;
        }
        try {
            Object objZzf = zzf(obj, th);
            this.zzb = null;
            this.zzc = null;
            zze(objZzf);
        } catch (Throwable th2) {
            try {
                zzhcx.zza(th2);
                zzb(th2);
            } finally {
                this.zzb = null;
                this.zzc = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    public final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    public final String zzd() {
        String strT;
        p8.p pVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String strZzd = super.zzd();
        if (pVar != null) {
            String string = pVar.toString();
            strT = M6.t(new StringBuilder(string.length() + 16), "inputFuture=[", string, "], ");
        } else {
            strT = "";
        }
        if (cls == null || obj == null) {
            if (strZzd != null) {
                return strT.concat(strZzd);
            }
            return null;
        }
        int length = strT.length();
        String string2 = cls.toString();
        int length2 = string2.length();
        String string3 = obj.toString();
        StringBuilder sb2 = new StringBuilder(string3.length() + length + 15 + length2 + 13 + 1);
        AbstractC3256n.p(sb2, strT, "exceptionType=[", string2, "], fallback=[");
        return wg.b.c(sb2, string3, "]");
    }

    public abstract void zze(Object obj);

    public abstract Object zzf(Object obj, Throwable th) throws Exception;
}
