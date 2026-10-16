package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfrx extends zziep implements zziga {
    private static final zzfrx zzc;
    private static volatile zzigh zzd;
    private boolean zza;
    private boolean zzb;

    static {
        zzfrx zzfrxVar = new zzfrx();
        zzc = zzfrxVar;
        zziep.zzbu(zzfrx.class, zzfrxVar);
    }

    private zzfrx() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"zza", "zzb"});
        }
        if (iOrdinal == 3) {
            return new zzfrx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfrw(bArr);
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
        synchronized (zzfrx.class) {
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
