package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzimy implements zzini, zzimt {
    private static final Object zza = new Object();
    private volatile zzini zzb;
    private volatile Object zzc = zza;

    private zzimy(zzini zziniVar) {
        this.zzb = zziniVar;
    }

    public static zzini zza(zzini zziniVar) {
        return zziniVar instanceof zzimy ? zziniVar : new zzimy(zziniVar);
    }

    public static zzimt zzc(zzini zziniVar) {
        if (zziniVar instanceof zzimt) {
            return (zzimt) zziniVar;
        }
        zziniVar.getClass();
        return new zzimy(zziniVar);
    }

    private final synchronized Object zzd() {
        try {
            Object obj = this.zzc;
            Object obj2 = zza;
            if (obj != obj2) {
                return obj;
            }
            Object objZzb = this.zzb.zzb();
            Object obj3 = this.zzc;
            if (obj3 != obj2 && obj3 != objZzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
            }
            this.zzc = objZzb;
            this.zzb = null;
            return objZzb;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        Object obj = this.zzc;
        return obj == zza ? zzd() : obj;
    }
}
