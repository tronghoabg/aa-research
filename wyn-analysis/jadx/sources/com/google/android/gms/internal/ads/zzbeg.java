package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzbeg extends zziep implements zziga {
    private static final zzbeg zzf;
    private static volatile zzigh zzg;
    private int zza;
    private zzbek zzb;
    private zzidl zzc = zzidl.zza;
    private long zzd;
    private long zze;

    static {
        zzbeg zzbegVar = new zzbeg();
        zzf = zzbegVar;
        zziep.zzbu(zzbeg.class, zzbegVar);
    }

    private zzbeg() {
    }

    public static zzbeg zzd() {
        return zzf;
    }

    public final zzbek zza() {
        zzbek zzbekVar = this.zzb;
        return zzbekVar == null ? zzbek.zzc() : zzbekVar;
    }

    public final zzidl zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (iOrdinal == 3) {
            return new zzbeg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbef(bArr);
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
        synchronized (zzbeg.class) {
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
