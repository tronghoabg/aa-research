package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhsb extends zziep implements zziga {
    private static final zzhsb zza;
    private static volatile zzigh zzb;

    static {
        zzhsb zzhsbVar = new zzhsb();
        zza = zzhsbVar;
        zziep.zzbu(zzhsb.class, zzhsbVar);
    }

    private zzhsb() {
    }

    public static zzhsb zza(zzidl zzidlVar, zzidz zzidzVar) throws zzifh {
        return (zzhsb) zziep.zzbT(zza, zzidlVar, zzidzVar);
    }

    public static zzhsb zzb() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (iOrdinal == 2) {
            return zziep.zzbv(zza, "\u0000\u0000", null);
        }
        if (iOrdinal == 3) {
            return new zzhsb();
        }
        if (iOrdinal == 4) {
            return new zzhsa(bArr);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzb;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzhsb.class) {
            try {
                zziekVar = zzb;
                if (zziekVar == null) {
                    zziekVar = new zziek(zza);
                    zzb = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
