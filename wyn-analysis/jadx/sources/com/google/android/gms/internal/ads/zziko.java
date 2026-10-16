package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zziko extends zziep implements zziga {
    private static final zziko zzd;
    private static volatile zzigh zze;
    private int zza;
    private String zzb = "";
    private zzidl zzc = zzidl.zza;

    static {
        zziko zzikoVar = new zziko();
        zzd = zzikoVar;
        zziep.zzbu(zziko.class, zzikoVar);
    }

    private zziko() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (iOrdinal == 3) {
            return new zziko();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzikn(bArr);
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
        synchronized (zziko.class) {
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
