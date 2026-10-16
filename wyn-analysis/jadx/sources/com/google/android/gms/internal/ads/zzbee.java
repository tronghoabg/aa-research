package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzbee extends zziep implements zziga {
    private static final zzbee zzd;
    private static volatile zzigh zze;
    private int zza;
    private zzbeg zzb;
    private zzidl zzc = zzidl.zza;

    static {
        zzbee zzbeeVar = new zzbee();
        zzd = zzbeeVar;
        zziep.zzbu(zzbee.class, zzbeeVar);
    }

    private zzbee() {
    }

    public static zzbee zze() {
        return zzd;
    }

    public final boolean zza() {
        return (this.zza & 1) != 0;
    }

    public final zzbeg zzb() {
        zzbeg zzbegVar = this.zzb;
        return zzbegVar == null ? zzbeg.zzd() : zzbegVar;
    }

    public final boolean zzc() {
        return (this.zza & 2) != 0;
    }

    public final zzidl zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zzbee();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzbed(bArr);
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
        synchronized (zzbee.class) {
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
