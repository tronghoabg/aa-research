package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzime extends zziep implements zziga {
    private static final zzime zzd;
    private static volatile zzigh zze;
    private int zza;
    private String zzb = "";
    private zzifb zzc = zziep.zzbM();

    static {
        zzime zzimeVar = new zzime();
        zzd = zzimeVar;
        zziep.zzbu(zzime.class, zzimeVar);
    }

    private zzime() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zza", "zzb", "zzc", zzimc.class});
        }
        if (iOrdinal == 3) {
            return new zzime();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzimd(bArr);
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
        synchronized (zzime.class) {
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
