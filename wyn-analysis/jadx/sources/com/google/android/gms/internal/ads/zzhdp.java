package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhdp extends zziep implements zziga {
    private static final zzhdp zzf;
    private static volatile zzigh zzg;
    private int zza;
    private zzhdm zzb;
    private zzihb zzc;
    private zzifb zzd = zziep.zzbM();
    private zzifa zze = zziep.zzbE();

    static {
        zzhdp zzhdpVar = new zzhdp();
        zzf = zzhdpVar;
        zziep.zzbu(zzhdp.class, zzhdpVar);
    }

    private zzhdp() {
    }

    public static zzhdo zza() {
        return (zzhdo) zzf.zzbn();
    }

    public final /* synthetic */ void zzb(zzhdm zzhdmVar) {
        zzhdmVar.getClass();
        this.zzb = zzhdmVar;
        this.zza |= 1;
    }

    public final /* synthetic */ void zzc(Iterable iterable) {
        zzifa zzifaVar = this.zze;
        if (!zzifaVar.zza()) {
            this.zze = zziep.zzbF(zzifaVar);
        }
        zzicu.zzaW(iterable, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004%", new Object[]{"zza", "zzb", "zzc", "zzd", zzihb.class, "zze"});
        }
        if (iOrdinal == 3) {
            return new zzhdp();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhdo(bArr);
        }
        if (iOrdinal == 5) {
            return zzf;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzg;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhdp.class) {
            try {
                zziekVar = zzg;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzf);
                    zzg = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
