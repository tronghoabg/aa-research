package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhsd extends zziep implements zziga {
    private static final zzhsd zzd;
    private static volatile zzigh zze;
    private int zza;
    private zzhsf zzb;
    private int zzc;

    static {
        zzhsd zzhsdVar = new zzhsd();
        zzd = zzhsdVar;
        zziep.zzbu(zzhsd.class, zzhsdVar);
    }

    private zzhsd() {
    }

    public static zzhsd zzb(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhsd) zziep.zzbT(zzd, zzidlVar, zzidzVar);
    }

    public static zzhsc zzc() {
        return (zzhsc) zzd.zzbn();
    }

    public final zzhsf zza() {
        zzhsf zzhsfVar = this.zzb;
        return zzhsfVar == null ? zzhsf.zzc() : zzhsfVar;
    }

    public final /* synthetic */ void zzd(zzhsf zzhsfVar) {
        zzhsfVar.getClass();
        this.zzb = zzhsfVar;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzhsd();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzhsc(bArr);
        }
        if (iOrdinal == 5) {
            return zzd;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zze;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhsd.class) {
            try {
                zziekVar = zze;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzd);
                    zze = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
