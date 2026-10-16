package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzinm implements zzini {
    private static final Object zza = new Object();
    private volatile zzini zzb;
    private volatile Object zzc = zza;

    private zzinm(zzini zziniVar) {
        this.zzb = zziniVar;
    }

    public static zzini zza(zzini zziniVar) {
        return ((zziniVar instanceof zzinm) || (zziniVar instanceof zzimy)) ? zziniVar : new zzinm(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzini zziniVar = this.zzb;
        if (zziniVar == null) {
            return this.zzc;
        }
        Object objZzb = zziniVar.zzb();
        this.zzc = objZzb;
        this.zzb = null;
        return objZzb;
    }
}
