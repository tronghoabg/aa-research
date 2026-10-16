package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfri extends zziep implements zziga {
    private static final zzfri zzb;
    private static volatile zzigh zzc;
    private String zza = "";

    static {
        zzfri zzfriVar = new zzfri();
        zzb = zzfriVar;
        zziep.zzbu(zzfri.class, zzfriVar);
    }

    private zzfri() {
    }

    @Override // com.google.android.gms.internal.ads.zziep
    public final Object zzdc(zzieo zzieoVar, Object obj, Object obj2) {
        zzigh zziekVar;
        int iOrdinal = zzieoVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziep.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        if (iOrdinal == 3) {
            return new zzfri();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfrh(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzigh zzighVar = zzc;
        if (zzighVar != null) {
            return zzighVar;
        }
        synchronized (zzfri.class) {
            try {
                zziekVar = zzc;
                if (zziekVar == null) {
                    zziekVar = new zziek(zzb);
                    zzc = zziekVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziekVar;
    }
}
