package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zziku extends zziep implements zziga {
    private static final zziku zzd;
    private static volatile zzigh zze;
    private int zza;
    private String zzb = "";
    private String zzc = "";

    static {
        zziku zzikuVar = new zziku();
        zzd = zzikuVar;
        zziep.zzbu(zziku.class, zzikuVar);
    }

    private zziku() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zziku();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzikt(bArr);
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
        synchronized (zziku.class) {
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
