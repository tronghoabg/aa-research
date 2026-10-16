package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfrg extends zziep implements zziga {
    private static final zzfrg zzc;
    private static volatile zzigh zzd;
    private String zza = "";
    private int zzb;

    static {
        zzfrg zzfrgVar = new zzfrg();
        zzc = zzfrgVar;
        zziep.zzbu(zzfrg.class, zzfrgVar);
    }

    private zzfrg() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfrg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfrf(bArr);
        }
        if (iOrdinal == 5) {
            return zzc;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzd;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzfrg.class) {
            try {
                zziekVar = zzd;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzc);
                    zzd = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
