package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzbeb extends zziep implements zziga {
    private static final zzbeb zze;
    private static volatile zzigh zzf;
    private int zza;
    private zzbei zzb;
    private zzidl zzc;
    private zzidl zzd;

    static {
        zzbeb zzbebVar = new zzbeb();
        zze = zzbebVar;
        zziep.zzbu(zzbeb.class, zzbebVar);
    }

    private zzbeb() {
        zzidl zzidlVar = zzidl.zza;
        this.zzc = zzidlVar;
        this.zzd = zzidlVar;
    }

    public static zzbeb zzd(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzbeb) zziep.zzbT(zze, zzidlVar, zzidzVar);
    }

    public static zzbeb zze(byte[] bArr, zzidz zzidzVar) throws zzifh {
        return (zzbeb) zziep.zzbV(zze, bArr, zzidzVar);
    }

    public final zzbei zza() {
        zzbei zzbeiVar = this.zzb;
        return zzbeiVar == null ? zzbei.zzj() : zzbeiVar;
    }

    public final zzidl zzb() {
        return this.zzc;
    }

    public final zzidl zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (iOrdinal == 3) {
            return new zzbeb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbea(bArr);
        }
        if (iOrdinal == 5) {
            return zze;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzf;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzbeb.class) {
            try {
                zziekVar = zzf;
                if (zziekVar == null) {
                    zziekVar = new zziek(zze);
                    zzf = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
